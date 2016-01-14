package com.wocai.jrt.product.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.about.model.About;
import com.wocai.jrt.about.service.spi.AboutService;
import com.wocai.jrt.employee.model.EmployeeGroup;
import com.wocai.jrt.employee.service.spi.EmployeeGroupService;
import com.wocai.jrt.product.bean.ProductReqBean;
import com.wocai.jrt.product.bean.ProductResBean;
import com.wocai.jrt.product.model.FundManager;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.model.ProductGrade;
import com.wocai.jrt.product.service.spi.FundManagerService;
import com.wocai.jrt.product.service.spi.ProductGradeService;
import com.wocai.jrt.product.service.spi.ProductService;

/**
 * 产品控制器
 * 
 * @author linbaolu
 * @date 2015-8-10 15:51:44
 */
@Controller
@RequestMapping("/product")
public class ProductAction extends GenericAction<Product> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductAction.class);

	private static Map<String, List<String>> productIdMap = new HashMap<String, List<String>>();

	@Inject
	private ProductService productServiceImpl;

	@Inject
	private EmployeeGroupService employeeGroupServiceImpl;

	@Inject
	private ProductGradeService productGradeServiceImpl;

	@Inject
	private AboutService aboutServiceImpl;

	@Inject
	private FundManagerService fundManagerServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(int.class, new IntEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 获得我的产品List/订购列表，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 产品List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(ProductReqBean productReqBean) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数,以后直接用AOP代替
			LOGGER.info("request product list, param=[{}]", JSON.toJSONString(productReqBean));

			// employeeId必传
			String employeeId = productReqBean.getEmployeeId();
			if (StringUtils.isBlank(employeeId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("理财师id不能为空！");
				LOGGER.error("employeeId is required, employeeId = [{}]", employeeId);
				return jsonBean;
			}

			// 销售类型是非必传的，但一旦传入必将在以下范围之内
			Integer saleType = productReqBean.getSaleType();
			if (null != saleType) {

				// PAD端：调整说明：
				// 0.最新上线修改为发行中，产品审核状态为已审核通过，状态为募集中的产品。
				// 1.热销产品修改为已发行，产品审核状态为已审核通过，状态为募集完成的产品
				// 2.即将上线修改为拟发行，产品审核状态为已审核通过，状态为即将上线的产品。拟发行产品不可认购，产品合同和佣金选填。

				if (saleType != 0 && saleType != 1 && saleType != 2) {
					jsonBean.setCode(0);
					jsonBean.setMessage("saleType取值范围为：{0,1,2,null}");
					LOGGER.error(
							"saleType error, its value range is {0,1,2,null}, saleType = [{}]",
							saleType);
					return jsonBean;
				}
			}

			// 判断组或以上各级父部门是否被删除，判断是否为理财师团队
			EmployeeGroup employeeGroup = null;
			try {
				employeeGroup = employeeGroupServiceImpl
						.getEmployeeGroupByEmployeeId(productReqBean);

				if (null == employeeGroup) {
					jsonBean.setCode(0);
					jsonBean.setMessage("理财师不在任何一个团队中！");
					LOGGER.error("employee is not exist any group, employeeId = [{}]", employeeId);
					return jsonBean;
				}
			} catch (Exception e) {
				jsonBean.setCode(0);
				jsonBean.setMessage("理财师属于多个团队错误！");
				LOGGER.error("employee exist in multi group error, msg = [{}]", e.getMessage());
				return jsonBean;
			}

			if (employeeGroup.getDeleted()) {
				jsonBean.setCode(0);
				jsonBean.setMessage("理财师团队被删除！");
				LOGGER.error("employee group is deleted or not planner group, employeeId = [{}]",
						employeeId);
				return jsonBean;
			}

			// 存续期限（单位：月份），就是投资期限，统一用这个字段，存续期限是非必传的，一旦传入必须在以下范围内
			Integer duration = productReqBean.getDuration();
			if (null != duration) {
				switch (duration) {
				case 0:
					productReqBean.setStartDuration(null);
					productReqBean.setEndDuration(5);
					break;
				case 1:
					productReqBean.setStartDuration(6);
					productReqBean.setEndDuration(11);
					break;
				case 2:
					productReqBean.setStartDuration(12);
					productReqBean.setEndDuration(23);
					break;
				case 3:
					productReqBean.setStartDuration(24);
					productReqBean.setEndDuration(null);
					break;
				default:
					jsonBean.setCode(0);
					jsonBean.setMessage("存续期限/投资期限错误，取值范围 {0,1,2,3,null}");
					LOGGER.error(
							"duration error, its value range is {0,1,2,3,null}, duration = [{}]",
							duration);
					return jsonBean;
				}
			}

			// 对分页进行转换
			Integer page = productReqBean.getPage();
			if (null != page) {
				productReqBean.setPage(page * productReqBean.getPageSize());
			}

			List<ProductResBean> list = null;
			if (employeeGroup.getSaleAll()) {

				// 如果是可售全部产品，则查询全部产品
				list = productServiceImpl.getAllProducts(productReqBean);
				LOGGER.info("query product list success, size=[{}]", list.size());
			} else {

				// 否则按照条件查询，group_list里的有关产品
				list = productServiceImpl.getProductList(productReqBean);
				LOGGER.info("query product list success, size=[{}]", list.size());
			}

			// 封装jsonBean，返回结果
			jsonBean.setCode(1);
			jsonBean.setData(list);
			jsonBean.setMessage(SUCCESS);

			// 缓存产品id
			if (null != list) {
				List<String> productIdList = productIdMap.get(employeeId);
				if (null == productIdList) {
					productIdList = new ArrayList<String>();
				}

				for (ProductResBean prb : list) {
					if (!productIdList.contains(prb.getId())) {
						productIdList.add(prb.getId());
					}
				}

				productIdMap.put(employeeId, productIdList);
				LOGGER.info("add productIdList to map success, employeeId = [{}], size=[{}]",
						list.size());
			}

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("获取产品列表失败！");
			LOGGER.error("fetch product list error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	/**
	 * 获得我的产品详情，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 产品List
	 */
	@ResponseBody
	@RequestMapping("/detail")
	public JsonBean detail(ProductReqBean productReqBean) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request product detail, param=[{}]", JSON.toJSONString(productReqBean));

			// 产品id是必传的，员工id可传可不传，要看你是否需要返回产品佣金
			String productId = productReqBean.getProductId();
			String employeeId = productReqBean.getEmployeeId();
			if (StringUtils.isAnyBlank(productId, employeeId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品id/理财师id不能为空！");
				LOGGER.error(
						"productId/employeeId is required, productId = [{}], employeeId = [{}]",
						productId, employeeId);
				return jsonBean;
			}

			// 查询产品详情
			Product product = productServiceImpl.getDetail(productReqBean);
			LOGGER.info("query product detail success, productId=[{}]", product.getId());

			// 获取产品档次列表
			ProductGrade productGrade = new ProductGrade();
			productGrade.setProductId(productId);
			List<ProductGrade> productGradeList = productGradeServiceImpl.pagedList(productGrade);
			LOGGER.info("query productGradeList success, size=[{}]", productGradeList.size());

			// 封装产品档次到产品里
			product.setProductGradeList(productGradeList);

			// 判断employee有没有权限销售
			product.setSale(checkSalible(productId, employeeId, product));

			// 封装jsonBean
			jsonBean.setCode(1);
			jsonBean.setData(product);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("获取产品详情失败！");
			LOGGER.error("fetch product detail error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	private boolean checkSalible(String productId, String employeeId, Product product) {
		try {
			List<String> productIdList = productIdMap.get(employeeId);

			// 理财师拥有卖的权限
			if (productIdList.contains(productId)) {
				Date now = new Date();
				Date recruitStartTime = product.getRecruitStartTime();
				Date recruitEndTime = new DateTime(product.getRecruitEndTime()).minusHours(-23)
						.minusMinutes(-59).minusSeconds(-59).toDate();

				// 当前时间在认购期内
				if (now.getTime() >= recruitStartTime.getTime()
						&& now.getTime() <= recruitEndTime.getTime()) {

					// 可用份额必须大于起购份额，即要充足
					if (product.getAvailable() >= product.getSubStart()) {
						return true;
					}
				}
			}

		} catch (Exception e) {
			LOGGER.error("checkSalible error, error=[{}]", e.getMessage());
		}
		
		return false;
	}

	/**
	 * 获得我的产品详情，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 产品List
	 */
	@ResponseBody
	@RequestMapping("/about")
	public JsonBean about(ProductReqBean productReqBean) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request product detail, param=[{}]", JSON.toJSONString(productReqBean));

			// 产品id是必传的，员工id可传可不传，要看你是否需要返回产品佣金
			String productId = productReqBean.getProductId();
			if (StringUtils.isAnyBlank(productId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品id必传！");
				LOGGER.error("productId is required, productId = [{}]", productId);
				return jsonBean;
			}

			// 获取关于页
			About about = aboutServiceImpl.getAbout(productId);
			if (null != about) {
				LOGGER.info("get about success, aboutId=[{}]", about.getId());
			}

			// 获取产品经理
			List<FundManager> funManagerList = fundManagerServiceImpl.getFunManager(productId);
			if (null != funManagerList) {
				LOGGER.info("get funManagerList success, size=[{}]", funManagerList.size());
			}

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("about", about);
			map.put("funManagerList", funManagerList);

			// 封装jsonBean
			jsonBean.setCode(1);
			jsonBean.setData(map);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("获取关于页面失败！");
			LOGGER.error("fetch about detail error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	/***
	 * 
	 * 获取产品档次列表
	 */
	@ResponseBody
	@RequestMapping("/getProductGradeList")
	public JsonBean getProductGradeList(String productId) {
		JsonBean jsonBean = new JsonBean();
		// 发起请求的参数
		LOGGER.info("request getProductGrade, productId=[{}]", productId);
		// 判断入参
		if (StringUtils.isAnyBlank(productId)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("参数不完整");
			return jsonBean;
		}
		try {
			// 判断产品
			Product product = productServiceImpl.get(productId);
			if (null == product) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品不存在!");
				return jsonBean;
			}
			// 获取产品档次
			ProductGrade productGrade = new ProductGrade();
			productGrade.setProductId(productId);
			List<ProductGrade> productGradeList = productGradeServiceImpl.queryList(productGrade);
			jsonBean.setCode(1);
			jsonBean.setData(productGradeList);
			jsonBean.setMessage(SUCCESS);
		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage(ERROR);
			LOGGER.error("request getProductGrade error, error=[{}]", e.getMessage());
		}
		return jsonBean;
	}

}
