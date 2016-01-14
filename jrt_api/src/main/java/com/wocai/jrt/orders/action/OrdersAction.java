package com.wocai.jrt.orders.action;

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
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.utils.common.BigDecimalUtils;
import com.vteba.utils.id.Ids;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.device.model.PosPad;
import com.wocai.jrt.device.service.spi.PosPadService;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.service.spi.EmployeeService;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.orders.bean.AssignReqBean;
import com.wocai.jrt.orders.bean.OrdersReqBean;
import com.wocai.jrt.orders.bean.OrdersResBean;
import com.wocai.jrt.orders.model.Appointment;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.orders.model.Voucher;
import com.wocai.jrt.orders.service.spi.AppointmentService;
import com.wocai.jrt.orders.service.spi.OrdersService;
import com.wocai.jrt.orders.service.spi.VoucherService;
import com.wocai.jrt.product.model.GroupProduct;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.model.ProductGrade;
import com.wocai.jrt.product.service.spi.GroupProductService;
import com.wocai.jrt.product.service.spi.ProductGradeService;
import com.wocai.jrt.product.service.spi.ProductService;
import com.wocai.jrt.utils.MyFileUtils;

/**
 * 订单控制器
 * 
 * @author zhangyz
 * @date 2015-7-27 19:26:12
 */
@Controller
@RequestMapping("/orders")
public class OrdersAction extends GenericAction<Orders> {
	@Inject
	private OrdersService ordersServiceImpl;
	@Inject
	private ProductService productServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private ProductGradeService productGradeServiceImpl;

	@Inject
	private AppointmentService appointmentServiceImpl;
	@Inject
	private EmployeeService employeeServiceImpl;
	@Inject
	private PosPadService posPadServiceImpl;
	@Inject
	private VoucherService voucherServiceImpl;
	@Inject
	private GroupProductService groupProductServiceImpl;

	private static final Logger LOGGER = LoggerFactory.getLogger(OrdersAction.class);

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
	 * 根据投资人id查询投资人交易记录
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/investor")
	public JsonBean investor(OrdersReqBean ordersReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(ordersReqBean.getInvestorId())) {
			bean.setCode(0);
			bean.setMessage("param's InvestorId(id) cannot be null.");
			return bean;
		}
		try {
			Date date = ordersReqBean.getEnd();
			if (date != null) {
				ordersReqBean.setEnd(new DateTime(date).minusHours(-23).minusMinutes(-59)
						.minusSeconds(-59).toDate());
			}
			Integer i = ordersReqBean.getPage();
			if (i != null) {
				ordersReqBean.setPage(i * ordersReqBean.getPageSize());
			}
			ordersReqBean.setOrderBy("order_time desc");
			LOGGER.info("request investor order list , param=[{}]",
					JSON.toJSONString(ordersReqBean));
			List<OrdersResBean> list = ordersServiceImpl.investor(ordersReqBean);
			bean.setCode(1);
			bean.setMessage("获取投资人交易记录成功");
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("request investor orderList error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("获取投资人交易记录失败");
		}
		return bean;
	}

	/**
	 * 根据条件查询检索理财师下所有订单
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/factor")
	public JsonBean factor(OrdersReqBean ordersReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(ordersReqBean.getEmployeeId())) {
			bean.setMessage("param's EmployeeId(id) cannot be null.");
			return bean;
		}
		try {
			LOGGER.info("request OrdersByFactor list, param=[{}]", JSON.toJSONString(ordersReqBean));
			Date date = ordersReqBean.getEnd();
			if (date != null) {
				ordersReqBean.setEnd(new DateTime(date).minusHours(-23).minusMinutes(-59)
						.minusSeconds(-59).toDate());
			}
			Integer i = ordersReqBean.getPage();
			if (i != null) {
				ordersReqBean.setPage(i * ordersReqBean.getPageSize());
			}
			ordersReqBean.setDeleted(false);
			ordersReqBean.setOrderBy("order_time desc");
			List<OrdersResBean> list = ordersServiceImpl.factor(ordersReqBean);
			bean.setCode(1);
			bean.setMessage("按条件查询理财师下订单成功");
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("request OrdersByFactor error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("按条件查询理财师下订单失败");
		}
		return bean;
	}

	/**
	 * 根据订单id获取定单详情信息
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/detail")
	public JsonBean detail(OrdersReqBean ordersReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(ordersReqBean.getOrderId())) {
			bean.setMessage("param's orderId(id) cannot be null.");
			return bean;
		}
		try {
			LOGGER.info("request order Detail list, param=[{}]", JSON.toJSONString(ordersReqBean));
			Map<String, Object> map = new HashMap<String, Object>();
			// 获取订单信息
			Orders order = ordersServiceImpl.get(ordersReqBean.getOrderId());
			if (order == null) {
				bean.setCode(0);
				bean.setMessage("订单不存在");
				return bean;
			}
			//查询并写入选择收益档次信息
			if(StringUtils.isNotBlank(order.getGradeId())){
				ProductGrade pg = productGradeServiceImpl.get(order.getGradeId());
				order.setProductGrade(pg.getGrade());
				order.setProspectiveEarnings(pg.getProspectiveEarnings());
				order.setSubScopeStart(pg.getSubScopeStart());
				order.setSubScopeEnd(pg.getSubScopeEnd());
				order.setRemark(pg.getRemark());
			}
			
			//查询并写入代理人信息
			if(StringUtils.isNotBlank(order.getAgentId())){
				Employee e = employeeServiceImpl.get(order.getAgentId());
				order.setAgentName(e.getName());
			}
			// 获取订单支付凭证
			Voucher voucher = new Voucher();
			voucher.setOrderId(ordersReqBean.getOrderId());
			List<String> listVoucher = voucherServiceImpl.getVoucherList(voucher);
			order.setVoucherList(listVoucher);
			// 获取产品信息
			Product product = productServiceImpl.get(order.getProductId());
			// 获取投资人信息
			Investor investor = investorServiceImpl.get(order.getInvestorId());
			map.put("order", order);
			map.put("product", product);
			map.put("investor", investor);
			bean.setCode(1);
			bean.setData(map);
			bean.setMessage("获取订单详情信息成功");
		} catch (Exception e) {
			LOGGER.error("request order Detail error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("获取订单详情信息失败");
		}
		return bean;
	}

	/**
	 * 根据员工id统计该员工下所有订单信息
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/count")
	public JsonBean count(OrdersReqBean ordersReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(ordersReqBean.getEmployeeId())) {
			bean.setMessage("param's EmployeeId cannot be null.");
			return bean;
		}
		try {
			LOGGER.info("request ordersCount , param=[{}]", JSON.toJSONString(ordersReqBean));
			Date date = ordersReqBean.getEnd();
			if (date != null) {
				ordersReqBean.setEnd(new DateTime(date).minusHours(-23).minusMinutes(-59)
						.minusSeconds(-59).toDate());
			}
			Map<String, Object> list = ordersServiceImpl.count(ordersReqBean);
			bean.setCode(1);
			bean.setMessage("统计该员工下订单信息成功");
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("request ordersCount error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("统计该员工下订单信息失败");
		}
		return bean;
	}

	/**
	 * 查询团队长下所有下级员工的订单信息
	 * 
	 * @param Id
	 *            员工id
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/leader")
	public JsonBean leader(OrdersReqBean ordersReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(ordersReqBean.getOrgId())
				|| StringUtils.isBlank(ordersReqBean.getGroupId())) {
			bean.setCode(0);
			bean.setMessage("param's groupId or orgId cannot be null.");
			return bean;
		}
		try {
			LOGGER.info("request leader order list , param=[{}]", JSON.toJSONString(ordersReqBean));
			Integer i = ordersReqBean.getPage();
			if (i != null) {
				ordersReqBean.setPage(i * ordersReqBean.getPageSize());
			}
			Date date = ordersReqBean.getEnd();
			if (date != null) {
				ordersReqBean.setEnd(new DateTime(date).minusHours(-23).minusMinutes(-59)
						.minusSeconds(-59).toDate());
			}
			ordersReqBean.setOrderBy("order_time desc");
			List<OrdersResBean> list = ordersServiceImpl.leader(ordersReqBean);
			bean.setCode(1);
			bean.setMessage("查询团队长下订单信息成功");
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("investor leader order list error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("查询团队长下订单信息失败");
		}
		return bean;
	}

	/***
	 * 上传文件 用@RequestParam注解来指定表单上的file为MultipartFile
	 * 
	 * @param file
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/downloadFile")
	public JsonBean downloadFile(String filePath, HttpServletResponse response) {
		JsonBean jsonBean = new JsonBean();
		try {
			// 发起请求的参数
			LOGGER.info("request file download, url=[{}]", filePath);

			MyFileUtils.downloadFile(filePath, response);

			// 封装jsonBean
			jsonBean.setCode(1);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("下载失败！");
			LOGGER.error("download file error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	/**
	 * 根据条件查询检索某产品的所有订单
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return JsonBean
	 */
	@ResponseBody
	@RequestMapping("/history")
	public JsonBean history(OrdersReqBean ordersReqBean) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isBlank(ordersReqBean.getProductId())) {
			bean.setMessage("param's ProductId(id) cannot be null.");
			return bean;
		}
		try {
			LOGGER.info("request OrdersByProduct list, param=[{}]",
					JSON.toJSONString(ordersReqBean));

			if (ordersReqBean.getPage() != null) {
				ordersReqBean.setPage(ordersReqBean.getPage() * ordersReqBean.getPageSize());
			}
			if (ordersReqBean.getEnd() != null) {
				ordersReqBean.setEnd(new DateTime(ordersReqBean.getEnd()).minusHours(-23)
						.minusMinutes(-59).minusSeconds(-59).toDate());
			}
			List<OrdersResBean> list = ordersServiceImpl.history(ordersReqBean);
			if (null != list) {
				for (OrdersResBean orb : list) {
					if (!orb.getEmployeeId().equals(ordersReqBean.getEmployeeId())) {
						String investorName = orb.getInvestorName();
						orb.setInvestorName(investorName.toCharArray()[0] + "**");
					}
				}
			}
			bean.setCode(1);
			bean.setMessage("按条件查询某产品的所有订单成功");
			bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("request OrdersByProduct error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("按条件查询某产品的所有订单失败");
		}
		return bean;
	}

	/***
	 * 
	 * 预约转订单的接口
	 */
	@ResponseBody
	@RequestMapping("/appo2Order")
	public JsonBean appo2Order(String appointmentId, Double orderAmount) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request appo2Order, appointmentId=[{}]", appointmentId);

			Appointment appointment = appointmentServiceImpl.get(appointmentId);

			// 判断入参的合法性
			if (StringUtils.isBlank(appointmentId) || appointment == null) {
				jsonBean.setCode(0);
				jsonBean.setMessage("预约id不能为空或预约不存在！");
				LOGGER.error(
						"parameter is error,caused by null parameter/no appointment, appointmentId=[{}]",
						appointmentId);
				return jsonBean;
			}

			// 已经是预定的话，无法转订单
			if (appointment.getReserved()) {
				jsonBean.setCode(0);
				jsonBean.setMessage("已经预定，无法转订单！");
				LOGGER.error(
						"parameter is error,caused by the appointment is formated, appointmentId=[{}]",
						appointmentId);
				return jsonBean;
			}

			// pos_pad未分配
			PosPad posPadParam = new PosPad();
			posPadParam.setEmployeeId(appointment.getEmployeeId());
			PosPad posPad = null;
			try {
				posPad = posPadServiceImpl.unique(posPadParam);
				if (null == posPad) {
					jsonBean.setCode(0);
					jsonBean.setMessage("设备未分配！");
					LOGGER.error("pos_pad is not allocated");
					return jsonBean;
				}
			} catch (Exception e) {
				jsonBean.setCode(0);
				jsonBean.setMessage("设备未分配！");
				LOGGER.error("pos_pad is not allocated, error=[{}]", e.getMessage());
				return jsonBean;
			}

			// 查询购买的产品详情
			String productId = appointment.getProductId();
			Product product = productServiceImpl.get(productId);

			// 查询理财师详情
			Employee employee = employeeServiceImpl.get(appointment.getEmployeeId());

			// 转订单
			Orders order = new Orders();
			order.setId(ObjectId.get().toString());
			order.setOrderId(product.getProductCode().toUpperCase() + Ids.get().toString());
			order.setInvestorId(appointment.getInvestorId());
			order.setProductId(product.getId());
			order.setProductName(product.getProductName());
			order.setProductBriefName(product.getBriefName());
			order.setSubFee(product.getSubFee());
			order.setHandlingFee(product.getHandlingFee());
			if (null == orderAmount) {
				Double appOrderAmount = appointment.getOrderAmount();
				// 锁定份额，修改状态
				if (null != appOrderAmount && appOrderAmount >= product.getSubStart()
						&& appOrderAmount <= product.getAvailable()) {
					Product productParam = new Product();
					productParam.setId(productId);
					productParam.setAvailable(BigDecimalUtils.subtract(product.getAvailable(),
							appOrderAmount));
					productServiceImpl.updateById(productParam);
					order.setOrderAmount(appOrderAmount);
				}
			} else {
				// 锁定份额，修改状态
				if (orderAmount >= product.getSubStart() && orderAmount <= product.getAvailable()) {
					Product productParam = new Product();
					productParam.setId(productId);
					productParam.setAvailable(BigDecimalUtils.subtract(product.getAvailable(),
							orderAmount));
					productServiceImpl.updateById(productParam);
					order.setOrderAmount(orderAmount);
				}
			}

			order.setEmployeeId(employee.getEmployeeId());
			order.setEmployeeName(employee.getName());
			order.setOrderTime(new Date());
			order.setOrgId(employee.getOrgId());
			order.setState(2);// 1已支付2未支付3已赎回4部分支付5已取消6已完成

			order.setPosId(posPad.getPosId());
			order.setPadId(posPad.getPadId());
			ordersServiceImpl.save(order);

			Appointment appoParam = new Appointment();
			appoParam.setId(appointmentId);
			appoParam.setReserved(true);
			appoParam.setState(3);// 0未处理1 已处理 2已取消 3转订单
			appoParam.setCompleteTime(new Date());
			appointmentServiceImpl.updateById(appoParam);
			// 预约转订单成功时,极光推送消息
			try {
				ordersServiceImpl.createOrderMessage(order);
			} catch (Exception e) {
				LOGGER.error("send jiguang error, error=[{}]", e.getMessage());
			}

			// 封装jsonBean
			jsonBean = getOrder(order.getOrderId());

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("转订单失败！");
			LOGGER.error("request appo2Order error, error=[{}]", e.getMessage());
		}

		return jsonBean;
	}

	private JsonBean getOrder(String orderId) {
		JsonBean bean = new JsonBean();

		Map<String, Object> map = new HashMap<String, Object>();
		// 获取订单信息
		Orders order = ordersServiceImpl.get(orderId);
		// 获取产品信息
		Product product = productServiceImpl.get(order.getProductId());
		// 获取投资人信息
		Investor investor = investorServiceImpl.get(order.getInvestorId());
		map.put("order", order);
		map.put("product", product);
		map.put("investor", investor);
		bean.setCode(1);
		bean.setData(map);
		bean.setMessage("获取定单详情信息成功");
		return bean;
	}

	/***
	 * 
	 * 取消订单
	 */
	@ResponseBody
	@RequestMapping("/cancelOrder")
	public JsonBean cancelOrder(String orderId) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request cancelOrder, orderId=[{}]", orderId);

			// 判断入参的合法性
			if (StringUtils.isBlank(orderId)) {
				jsonBean.setCode(0);
				jsonBean.setMessage("订单id不能为空！");
				LOGGER.error("orderId is required, orderId=[{}]", orderId);
				return jsonBean;
			}

			Orders orderParam = new Orders();
			orderParam.setOrderId(orderId);
			Orders order = ordersServiceImpl.unique(orderParam);

			// 判断入参的合法性
			if (order.getState() != 2) {
				jsonBean.setCode(0);
				jsonBean.setMessage("订单为未支付时才能取消！");
				LOGGER.error("order can not cancel, state=[{}]", order.getState());
				return jsonBean;
			}

			Double orderAmount = order.getOrderAmount();
			String productId = order.getProductId();
			Product product = productServiceImpl.get(productId);

			// 释放份额，修改状态
			if (null != orderAmount) {
				Product productParam = new Product();
				productParam.setId(productId);
				productParam.setAvailable(BigDecimalUtils.add(product.getAvailable(), orderAmount));
				productServiceImpl.updateById(productParam);
			}

			Orders condition = new Orders();
			condition.setOrderId(orderId);
			Orders orderData = new Orders();
			orderData.setState(5);// 已取消
			ordersServiceImpl.updateBulks(orderData, condition);

			// 封装jsonBean
			jsonBean.setCode(1);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("取消订单失败！");
			LOGGER.error("request appo2Order error, error=[{}]", e.getMessage());

		}

		return jsonBean;
	}
	
	@ResponseBody
	@RequestMapping("/assign")
	public JsonBean assign(AssignReqBean assignReqBean){
		JsonBean json = new JsonBean();
		// 判断入参的合法性
		if (null == assignReqBean.getAssign()) {
			json.setCode(0);
			json.setMessage("操作类型不能为空！");
			LOGGER.error("操作类型为空");
			return json;
		}
		if (StringUtils.isBlank(assignReqBean.getOrderId())) {
			json.setCode(0);
			json.setMessage("订单id不能为空！");
			LOGGER.error("orderId is required");
			return json;
		}
		
		Orders order = ordersServiceImpl.get(assignReqBean.getOrderId());
		if(null == order){
			json.setCode(0);
			json.setMessage("订单id无效！");
			LOGGER.error("orderId is required");
			return json;
		}
		
		if(assignReqBean.getAssign().equals(1)){
			if (StringUtils.isBlank(assignReqBean.getEmployeeId())) {
				json.setCode(0);
				json.setMessage("指派理财师id不能为空！");
				LOGGER.error("employeeId is required");
				return json;
			}
			if(null == employeeServiceImpl.get(assignReqBean.getEmployeeId())) {
				json.setCode(0);
				json.setMessage("指派理财师id无效！");
				LOGGER.error("指派理财师id无效");
				return json;
			}
			order.setAgentId(assignReqBean.getEmployeeId());
			int result = ordersServiceImpl.updateById(order);
			if (1 == result) {
				json.setCode(1);
				json.setMessage("指派成功");
				LOGGER.info("指派成功");
				return json;
			} else {
				json.setCode(0);
				json.setMessage("指派失败");
				LOGGER.info("指派失败");
				return json;
			}
		}
		
		if(assignReqBean.getAssign().equals(2)){
			order.setAgentId("");
			int result = ordersServiceImpl.updateById(order);
			if (1 == result) {
				json.setCode(1);
				json.setMessage("取消指派成功");
				LOGGER.info("取消指派成功");
				return json;
			} else {
				json.setCode(0);
				json.setMessage("取消指派失败");
				LOGGER.info("取消指派失败");
				return json;
			}
		}
		
		json.setCode(0);
		json.setMessage("操作类型无效");
		LOGGER.error("操作类型无效");
		
		return json;
	}

	/***
	 * 
	 * 新增一个空订单
	 */
	@ResponseBody
	@RequestMapping("/addBlankOrder")
	public JsonBean addBlankOrder(String productId, String investorId, String employeeId) {
		JsonBean jsonBean = new JsonBean();
		// 发起请求的参数
		LOGGER.info("request addBlankOrder, productId=[{}], investorId=[{}], employeeId=[{}]",
				productId, investorId, employeeId);
		// 判断入参
		if (StringUtils.isAnyBlank(productId, investorId, employeeId)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("参数不完整");
			return jsonBean;
		}
		try {
			// 检查员工
			Employee employee = employeeServiceImpl.get(employeeId);
			if (null == employee) {
				jsonBean.setCode(0);
				jsonBean.setMessage("员工不存在！");
				return jsonBean;
			}
			PosPad posPad = posPadServiceImpl.get(employee.getPosPadId());
			if (null == posPad) {
				jsonBean.setCode(0);
				jsonBean.setMessage("你的设备呢？");
				return jsonBean;
			}
			// 检查投资人
			Investor investor = investorServiceImpl.get(investorId);
			if (null == investor) {
				jsonBean.setCode(0);
				jsonBean.setMessage("投资人不存在！");
				return jsonBean;
			}
			if (!employee.getEmployeeId().equals(investor.getEmployeeId())) {
				jsonBean.setCode(0);
				jsonBean.setMessage("该投资不是您的客户！");
				return jsonBean;
			}
			// 检查产品
			Product product = productServiceImpl.get(productId);
			if (null == product) {
				jsonBean.setCode(0);
				jsonBean.setMessage("产品不存在！");
				return jsonBean;
			}
			GroupProduct groupProduct = new GroupProduct();
			groupProduct.setGroupId(employee.getDeptId());
			groupProduct.setProductId(productId);
			groupProduct = groupProductServiceImpl.unique(groupProduct);
			if (null == groupProduct) {
				jsonBean.setCode(0);
				jsonBean.setMessage("您没有售卖该产品的权限！");
				return jsonBean;
			}
			// 生成空订单
			Orders orders = new Orders();
			orders.setId(ObjectId.get().toString());
			orders.setOrderId(ObjectId.get().toString());
			orders.setInvestorId(investorId);
			orders.setProductId(productId);
			orders.setOrgId(employee.getOrgId());
			orders.setProductName(product.getProductName());
			orders.setProductBriefName(product.getBriefName());
			orders.setEmployeeId(employeeId);
			orders.setEmployeeName(employee.getName());
			orders.setOrderTime(new Date());
	
			orders.setPosId(posPad.getPosId());
			orders.setPadId(posPad.getPadId());
			orders.setState(2);
			int result = ordersServiceImpl.save(orders);
			// 返回订单详情
			if (result == 1) {
				Map<String, Object> map = new HashMap<String, Object>();
				// Orders order = ordersServiceImpl.get(orders.getId());
				map.put("order", orders);
//				map.put("product", product);
//				map.put("investor", investor);
				jsonBean.setCode(1);
				jsonBean.setData(map);
				jsonBean.setMessage(SUCCESS);
			} else {
				jsonBean.setCode(0);
				jsonBean.setMessage("新增订单失败！");
			}
		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage(ERROR);
			LOGGER.error("request addBlankOrder error, error=[{}]", e.getMessage());
		}
		return jsonBean;
	}
	
	/**
	 * 删除订单
	 */
	@ResponseBody
	@RequestMapping("/deleteOrders")
	public JsonBean deleteOrders(String orderId) {
		JsonBean jsonBean = new JsonBean();
		// 发起请求的参数
		LOGGER.info("request deleteOrders, orderId=[{}]",orderId);
		// 判断入参
		if (StringUtils.isAnyBlank(orderId)) {
			jsonBean.setCode(0);
			jsonBean.setMessage("参数错误");
			return jsonBean;
		}
		try {
			Orders o = ordersServiceImpl.get(orderId);
			if(o==null){
				jsonBean.setCode(0);
				jsonBean.setMessage("订单不存在.");
				return jsonBean;
			}
			Double orderAmount = o.getOrderAmount();
			String productId = o.getProductId();
			Product product = productServiceImpl.get(productId);
			int result = ordersServiceImpl.deleteOrders(orderId);
			if(result == 1){
				jsonBean.setCode(1);
				jsonBean.setMessage("删除订单成功.");
				// 取消的订单不用释放份额，未支付的订单需要释放份额
				if(o.getState() != 5){
					if (null != orderAmount) {
						Product productParam = new Product();
						productParam.setId(o.getProductId());
						productParam.setAvailable(BigDecimalUtils.add(product.getAvailable(), orderAmount));
						productServiceImpl.updateById(productParam);
					}
				}
			}else{
				jsonBean.setCode(0);
				jsonBean.setMessage("删除订单失败.");
			}
		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage(ERROR);
			LOGGER.error("request deleteOrders error, error=[{}]", e.getMessage());
		}
		return jsonBean;
	}
}
