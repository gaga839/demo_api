package com.wocai.jrt.investor.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.cache.redis.RedisService;
import com.vteba.tx.jdbc.sequence.HexademicalKeyGenerator;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.employee.bean.EmployeeVisitReqBean;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.service.spi.EmployeeService;
import com.wocai.jrt.employee.service.spi.EmployeeVisitService;
import com.wocai.jrt.investor.bean.InvestorCountBean;
import com.wocai.jrt.investor.bean.InvestorReqBean;
import com.wocai.jrt.investor.bean.InvestorResBean;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.orders.bean.AppointmentResBean;
import com.wocai.jrt.orders.bean.OrdersReqBean;
import com.wocai.jrt.orders.bean.OrdersResBean;
import com.wocai.jrt.orders.service.spi.AppointmentService;
import com.wocai.jrt.orders.service.spi.OrdersService;
import com.wocai.jrt.utils.MyFileUtils;
import com.wocai.jrt.utils.SmsUtils;
import com.wocai.jrt.utils.SmsVerificationUtils;

/**
 * 投资人控制器
 * 
 * @author zhangyz
 * @date 2015-7-24 17:10:45
 */
@Controller
@RequestMapping("/investor")
public class InvestorAction extends GenericAction<Investor> {
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private EmployeeVisitService employeeVisitServiceImpl;
	@Inject
	private EmployeeService employeeServiceImpl;
	@Inject
	private OrdersService ordersServiceImpl;
	@Inject
	private AppointmentService appointmentServiceImpl;
	@Inject
	private RedisService<String, String> redisService;// 存放短信验证码
	@Inject
	private HexademicalKeyGenerator hexademicalKeyGenerator;


	private static final Logger LOGGER = LoggerFactory.getLogger(InvestorAction.class);

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd"), true));
		binder.registerCustomEditor(int.class, new IntEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 执行实际的新增投资人操作
	 * 
	 * @param model
	 *            要新增的数据
	 * @return 新增页面逻辑视图
	 */
	@ResponseBody
	@RequestMapping("/doAdd")
	public JsonBean doAdd(Investor model) {
		return investorServiceImpl.doAddInvestor(model); 
	}


	/**
	 * 投资人信息逻辑删除
	 * 
	 * @param investorId
	 *            要删除的投资人ID
	 */
	@ResponseBody
	@RequestMapping("/deleteLogic")
	public JsonBean deleteLogic(@RequestParam("investorId") String investorId) {
		int result;
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(investorId)) {
			bean.setMessage("param's investorId(id) cannot be null.");
			return bean;
		}
		try {
			result = investorServiceImpl.deleteLogic(investorId);
			if (result == 1) {
				bean.setMessage(SUCCESS);
			} else {
				LOGGER.error("investor deleteLogic error");
				bean.setCode(1);
				bean.setMessage(ERROR);
			}
		} catch (Exception e) {
			LOGGER.error("investor deleteLogic error,msg=[{}].", e.getMessage());
			bean.setCode(1);
			bean.setMessage("逻辑删除投资人失败");
		}
		return bean;
	}

	/**
	 * 根据员工id查询该员工下所有客户列表信息
	 * 
	 * @param InvestorReqBean
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/queryList")
	public JsonBean queryList(InvestorReqBean investorReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(investorReqBean.getEmployeeId())) {
			bean.setMessage("param's investorId(id) cannot be null.");
			return bean;
		}
		try {
			LOGGER.info("request investorByFactor , param=[{}]", JSON.toJSONString(investorReqBean));
			investorReqBean.setOrderBy("register_time desc");
			List<InvestorResBean> list = investorServiceImpl.queryList(investorReqBean);
			bean.setCode(1);
			bean.setMessage("获取员工下所有客户列表成功");
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("investor investorList error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("获取员工下所有客户列表失败");
		}
		return bean;
	}

	/**
	 * 根据投资人(姓名、身份证、联系电话)、在指定注册时间内来查询客户列表信息
	 * 
	 * @param InvestorReqBean
	 *            investorReqBean
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/factor")
	public JsonBean factor(InvestorReqBean investorReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(investorReqBean.getEmployeeId())) {
			bean.setMessage("param's investorId(id) cannot be null.");
			return bean;
		}
		try {
			LOGGER.info("request investorByFactor , param=[{}]", JSON.toJSONString(investorReqBean));
			Date date = investorReqBean.getEnd();
			if (date != null) {
				investorReqBean.setEnd(new DateTime(date).minusHours(-23).minusMinutes(-59)
						.minusSeconds(-59).toDate());
			}
			Integer i = investorReqBean.getPage();
			if (i != null) {
				investorReqBean.setPage(i * investorReqBean.getPageSize());
			}
			investorReqBean.setOrderBy("register_time desc");
			List<InvestorResBean> list = investorServiceImpl.factor(investorReqBean);
			bean.setCode(1);
			bean.setMessage("按指定条件查询客户列表信息成功");
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("investor investorByFactor error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("按指定条件查询客户列表信息失败");
		}
		return bean;
	}

	/**
	 * 根据员工id统计该员工下所有投资人信息
	 * 
	 * @param InvestorReqBean
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/count")
	public JsonBean count(InvestorReqBean investorReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(investorReqBean.getEmployeeId())) {
			bean.setMessage("param's EmployeeId(id) cannot be null.");
			return bean;
		}
		try {
			LOGGER.info("request investorCount , param=[{}]", JSON.toJSONString(investorReqBean));
			if (investorReqBean.getEnd() != null) {
				investorReqBean.setEnd(new DateTime(investorReqBean.getEnd()).minusHours(-23)
						.minusMinutes(-59).minusSeconds(-59).toDate());
			}
			List<InvestorCountBean> list = investorServiceImpl.count(investorReqBean);
			bean.setCode(1);
			bean.setMessage("统计该员工下投资人信息成功");
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("request investorCount error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("统计该员工下投资人信息失败");
		}
		return bean;
	}

	/**
	 * 根据投资人id查询投资人详情页信息（包括基本信息、联系记录、订单记录、预约记录）
	 * 
	 * @author zhangyz
	 * @param InvestorReqBean
	 *            investorReqBean
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/detail")
	public JsonBean detail(InvestorReqBean investorReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(investorReqBean.getInvestorId())) {
			bean.setMessage("param's investorId(id) cannot be null.");
			return bean;
		}
		try {
			LOGGER.info("request investorDetailList , param=[{}]",
					JSON.toJSONString(investorReqBean));
			Map<String, Object> map = new HashMap<String, Object>();
			// 投资人基本信息
			Investor investor = investorServiceImpl.get(investorReqBean.getInvestorId());
			if(investor != null){
				String investorId = investorReqBean.getInvestorId();
				map.put("baseInfo", investor);
				// 理财师信息
				Employee employee = employeeServiceImpl.get(investor.getEmployeeId());
				map.put("employee", employee);
				// 投资人联系记录(只取十条)
				EmployeeVisitReqBean modelVisit = new EmployeeVisitReqBean();
				modelVisit.setInvestorId(investorId);
				modelVisit.setPage(0);
				modelVisit.setPageSize(10);
				modelVisit.setOrderBy("visit_time desc");
				map.put("relations", employeeVisitServiceImpl.queryVisitList(modelVisit));
				// 投资人订单(只取五条)
				OrdersReqBean ordersReqBean = new OrdersReqBean();
				ordersReqBean.setInvestorId(investorId);
				ordersReqBean.setPage(0);
				ordersReqBean.setPageSize(5);
				ordersReqBean.setOrderBy("order_time desc");
				List<OrdersResBean> orderlist = ordersServiceImpl.investor(ordersReqBean);
				map.put("orders", orderlist);
				// 投资人预约单(只取五条)
				OrdersReqBean appointmentBean = new OrdersReqBean();
				appointmentBean.setInvestorId(investorId);
				appointmentBean.setOrderBy(" FIELD(a.state,0,1,3,2) asc ,a.appoint_time desc");
				appointmentBean.setPage(0);
				appointmentBean.setPageSize(5);
				List<AppointmentResBean> appointmentlist = appointmentServiceImpl
						.queryList(appointmentBean);
				map.put("appointments", appointmentlist);
				bean.setCode(1);
				bean.setMessage("查询投资人详情页信息成功");
				bean.setData(map);
			}else{
				bean.setCode(0);
				bean.setMessage("查询投资人详情页信息失败了。");
			}
		} catch (Exception e) {
			LOGGER.error("investor investorDetailList error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("查询投资人详情页信息失败");
		}
		return bean;
	}

	/**
	 * 根据检索条件查询投资人所有详情信息
	 * 
	 * @author zhangyz
	 * @param InvestorReqBean
	 *            investorReqBean
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/getDetail")
	public JsonBean getDetail(InvestorReqBean investorReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isAnyBlank(investorReqBean.getInvestorKey(),
				investorReqBean.getEmployeeId(), investorReqBean.getOrgId())) {
			bean.setCode(0);
			bean.setMessage("参数错误");
			return bean;
		}
		try {
			LOGGER.info("request investorDetailList , param=[{}]",
					JSON.toJSONString(investorReqBean));
			//查询机构下该投资人是否存在
			String employeeId = investorReqBean.getEmployeeId();
			investorReqBean.setEmployeeId(null);
			List<Investor> investorList = investorServiceImpl.getDeatilInfo(investorReqBean);
			if(investorList.size() == 0){
				bean.setCode(0);
				bean.setMessage("对不起，投资人不存在");
				return bean;
			}
			if(investorList.size() == 1 && !employeeId.equals(investorList.get(0).getEmployeeId())){
				bean.setCode(0);
				bean.setMessage("对不起该投资人属于其它理财师，请联系团队长进行协调");
				return bean;
			}else if(investorList.size() == 1 && employeeId.equals(investorList.get(0).getEmployeeId())){
				bean.setCode(1);
				bean.setMessage("查询投资人详情信息成功");
				bean.setData(investorList);
				return bean;
			}else{
				investorReqBean.setEmployeeId(employeeId);
				List<Investor> resultList = investorServiceImpl.getDeatilInfo(investorReqBean);
				bean.setCode(1);
				bean.setMessage("查询投资人详情信息成功");
				bean.setData(resultList);
			}
		} catch (Exception e) {
			LOGGER.error("investor investorDetailList error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("查询投资人详情信息失败");
		}
		return bean;
	}

	/**
	 * 查询团队长下所有下级员工的客户信息
	 * 
	 * @param Id
	 *            员工id
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/leader")
	public JsonBean leader(InvestorReqBean investorReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(investorReqBean.getGroupId())||StringUtils.isBlank(investorReqBean.getOrgId())) {
			bean.setCode(0);
			bean.setMessage("param's groupId  or orgId cannot be null.");
			return bean;
		}
		try {
			LOGGER.info("request investorDetailList , param=[{}]",
					JSON.toJSONString(investorReqBean));
			// 查询团队所有下级员工的客户信息
			Integer i = investorReqBean.getPage();
			if (i != null) {
				investorReqBean.setPage(i * investorReqBean.getPageSize());
			}
			Date date = investorReqBean.getEnd();
			if (date != null) {
				investorReqBean.setEnd(new DateTime(date).minusHours(-23).minusMinutes(-59)
						.minusSeconds(-59).toDate());
			}
			investorReqBean.setOrderBy("register_time desc");
			List<InvestorResBean> list = investorServiceImpl.leader(investorReqBean);
			bean.setCode(1);
			bean.setMessage("查询团队长下投资人信息成功");
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("investor investorDetailList error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("查询团队长下投资人信息失败");
		}
		return bean;
	}

	@ResponseBody
	@RequestMapping("/addInvestorFormOrder")
	public JsonBean addInvestorFormOrder(Investor model, String authCode) {
		JsonBean jsonBean = new JsonBean();
		try {
			String mobile = model.getMobile();

			LOGGER.info("request addInvestorFormOrder, mobile=[{}]", mobile);
			if (null == mobile) {
				boolean result = SmsVerificationUtils.check(redisService, mobile,
						SmsVerificationUtils.INVESTOR_AUTH, authCode);
				if (result) {
					return doAdd(model);
				} else {
					jsonBean.setCode(0);
					jsonBean.setMessage("authCode is not currect");
				}
			}

		} catch (Exception e) {
			LOGGER.error("addInvestorFormOrder error.msg=[{}]", e.getMessage());
		}
		jsonBean.setCode(0);
		jsonBean.setMessage("other error");
		return jsonBean;
	}

	/***
	 * 下载头像img
	 * 
	 * @param path
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/downImg")
	public JsonBean downImg(String path, HttpServletResponse response) {
		JsonBean jsonBean = new JsonBean();
		try {
			// 发起请求的参数
			LOGGER.info("download img , url=[{}]", path);
			MyFileUtils.downloadFile(path, response);
			jsonBean.setCode(1);
			jsonBean.setMessage("下载头像成功!");
		} catch (Exception e) {
			LOGGER.error("download img error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("下载头像失败!");
		}
		return jsonBean;
	}
	
	/**
	 * 发送邀请码
	 * 
	 * @param model
	 *            查询参数，携带ID
	 * @return 投资人详情页
	 */
	@ResponseBody
	@RequestMapping("/sendInvitationCode")
	public JsonBean sendInvitationCode(String id) {
		JsonBean json = new JsonBean();
		try {
			Investor model = new Investor();
			model = investorServiceImpl.get(id);
			if (null == model) {
				json.setCode(0);
				json.setMessage("投资人不存在！");
				return json;
			}
			String invitationCode = model.getInvitationCode();
			if (null == invitationCode) {
				// 更新投资人邀请码
				invitationCode = hexademicalKeyGenerator.next();
				//invitationCode = "axib";
				// 保存投资人邀请码
				Investor paramT = new Investor();
				paramT.setId(id);
				paramT.setInvitationCode(invitationCode);
				investorServiceImpl.updateById(paramT);
			}
			// 发送短信给投资人
			String mobile = model.getMobile();
			if (null != mobile) {
				String content = "邀请码：" + invitationCode;
				String result = SmsUtils.send(mobile, content);
				if (result.startsWith("true")) {
					json.setCode(1);
					json.setMessage("邀请码发送成功！");
				} else {
					json.setCode(0);
					json.setMessage(result);
				}
			} else {
				json.setCode(0);
				json.setMessage("投资人没有电话号码！");
			}
		} catch (Exception e) {
			LOGGER.error("sendInvitationCode error, msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("发送邀请码失败！");
		}
		return json;
	}
	
	/**
	 * 快速生成订单理财师选择
	 * @param employeeId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/quickList")
	public JsonBean quickList(InvestorReqBean investorReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(investorReqBean.getEmployeeId())) {
			bean.setMessage("param's employeeId(id) cannot be null.");
			return bean;
		}
		try {
			Integer i = investorReqBean.getPage();
			if (i != null) {
				investorReqBean.setPage(i * investorReqBean.getPageSize());
			}
			LOGGER.info("request investorByFactor , param=[{}]", JSON.toJSONString(investorReqBean));
			investorReqBean.setOrderBy("register_time desc");
			List<InvestorResBean> list = investorServiceImpl.fecthList(investorReqBean);
			bean.setCode(1);
			bean.setMessage("获取员工下所有客户列表成功");
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("investor investorList error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("获取员工下所有客户列表失败");
		}
		return bean;
	}
}
