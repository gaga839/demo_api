package com.wocai.jrt.orders.service.impl;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.vteba.utils.common.BigDecimalUtils;
import com.vteba.utils.id.ObjectId;
import com.wocai.jrt.customer.model.Customer;
import com.wocai.jrt.customer.service.spi.CustomerService;
import com.wocai.jrt.employee.bean.GetGroupTotalBean;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.service.spi.EmployeeService;
import com.wocai.jrt.investor.bean.InvestorCountBean;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.message.model.Message;
import com.wocai.jrt.message.service.spi.MessageService;
import com.wocai.jrt.orders.bean.EmployeeGroupAmountBean;
import com.wocai.jrt.orders.bean.EmployeeGroupAmountReqBean;
import com.wocai.jrt.orders.bean.OrderDetailBean;
import com.wocai.jrt.orders.bean.OrdersCountBean;
import com.wocai.jrt.orders.bean.OrdersReqBean;
import com.wocai.jrt.orders.bean.OrdersResBean;
import com.wocai.jrt.orders.bean.SortClass;
import com.wocai.jrt.orders.dao.OrdersDao;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.orders.model.OrdersBean;
import com.wocai.jrt.orders.service.spi.OrdersService;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.service.spi.ProductService;
import com.wocai.jrt.utils.DateUtils;
import com.wocai.jrt.utils.MessagePush;
import com.wocai.jrt.utils.SmsUtils;

/**
 * 订单相关的service业务实现。
 * 
 * @author zhangyz
 * @date 2015-7-27 19:26:12
 */
@Named
public class OrdersServiceImpl extends MyBatisServiceImpl<Orders, OrdersBean, String> implements
		OrdersService {

	private OrdersDao ordersDao;

	@Inject
	private EmployeeService employeeServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private MessageService messageServiceImpl;
	@Inject
	private ProductService productServiceImpl;
	@Inject
	private CustomerService customerServiceImpl;

	private static final Logger LOGGER = LoggerFactory.getLogger(OrdersServiceImpl.class);

	@Override
	@Inject
	public void setBaseDao(BaseDao<Orders, OrdersBean, String> ordersDao) {
		this.baseDao = ordersDao;
		this.ordersDao = (OrdersDao) ordersDao;
	}

	/**
	 * 根据投资人id查询投资人交易记录
	 * 
	 * @param Orders
	 *            order
	 * @return List<OrdersResBean>
	 */
	@Override
	public List<OrdersResBean> investor(OrdersReqBean ordersReqBean) {
		List<OrdersResBean> ordersList = ordersDao.investor(ordersReqBean);
		return ordersList;
	}

	/**
	 * 根据条件查询检索理财师下所有订单
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return List<OrdersResBean>
	 */
	@Override
	public List<OrdersResBean> factor(OrdersReqBean ordersReqBean) {
		List<OrdersResBean> ordersList = ordersDao.factor(ordersReqBean);
		return ordersList;
	}

	/**
	 * 根据定单id获取定单详情信息
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return OrderDetailBean
	 */
	@Override
	public OrderDetailBean detail(OrdersReqBean ordersReqBean) {
		OrderDetailBean detailBean = ordersDao.detail(ordersReqBean);
		return detailBean;
	}

	/**
	 * 根据员工id统计该员工下订单信息
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return JsonBean
	 */
	@Override
	public Map<String, Object> count(OrdersReqBean ordersReqBean) {
		// 按条件查询订单信息
		List<OrdersResBean> Orderslist = ordersDao.count(ordersReqBean);
		OrdersReqBean bean = new OrdersReqBean();
		bean.setEmployeeId(ordersReqBean.getEmployeeId());
		// 该员工所有订单信息
		List<OrdersResBean> allOrderslist = ordersDao.count(bean);
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
		Map<String, Object> map = new HashMap<String, Object>();
		List<OrdersCountBean> listday = new ArrayList<OrdersCountBean>(), liststate = new ArrayList<OrdersCountBean>();

		// 按日期统计所有订单
		Map<String, Integer> allOrdersMap = new HashMap<String, Integer>();
		// 按日期统计所有成交订单
		Map<String, Integer> turnoverOrdersMap = new HashMap<String, Integer>();
		// 按日期统计所有订单bean
		List<InvestorCountBean> allOrdersResultlist = new ArrayList<InvestorCountBean>();
		// 按日期统计所有成交订单bean
		List<InvestorCountBean> turnoverOrdersResultlist = new ArrayList<InvestorCountBean>();
		// 3日订单统计
		OrdersCountBean gridThreeDay = new OrdersCountBean("近3日");
		// 7日订单统计
		OrdersCountBean gridSevenDay = new OrdersCountBean("近7日");
		// 30日订单统计
		OrdersCountBean gridThirtyDay = new OrdersCountBean("近30日");
		// 60日订单统计
		OrdersCountBean gridSixtyDay = new OrdersCountBean("近60日");
		// 90日订单统计
		OrdersCountBean gridNintyDay = new OrdersCountBean("近90日");
		// 所有订单统计
		OrdersCountBean gridAllState = new OrdersCountBean("总订单");
		// 成交订单统计
		OrdersCountBean gridTurnState = new OrdersCountBean("成交订单");
		// 待支付订单统计
		OrdersCountBean gridPayState = new OrdersCountBean("待支付订单");
		// 已赎回订单统计
		OrdersCountBean gridBackState = new OrdersCountBean("已赎回订单");
		// 撤销订单统计
		OrdersCountBean gridCancelState = new OrdersCountBean("撤单订单");
		String dateString;
		Integer stateInteger;
		Date date = new Date();
		Date orderDate;
		int days;
		try {
			for (OrdersResBean oBean : Orderslist) {
				orderDate = oBean.getOrderTime();
				dateString = sdFormat.format(orderDate);
				stateInteger = oBean.getState();
				/* 按日期统计订单 */
				if (dateString != null) {
					// 所有订单统计
					if (allOrdersMap.containsKey(dateString)) {
						allOrdersMap.put(dateString, 1 + allOrdersMap.get(dateString));
					} else {
						allOrdersMap.put(dateString, 1);
					}
					// 统计已完成订单(成交订单)
					if (6 == stateInteger) {
						if (turnoverOrdersMap.containsKey(dateString)) {
							turnoverOrdersMap
									.put(dateString, 1 + turnoverOrdersMap.get(dateString));
						} else {
							turnoverOrdersMap.put(dateString, 1);
						}
					}
				}
			}

			// 所有订单统计数据封装到bean中
			Iterator<?> it = allOrdersMap.entrySet().iterator();
			try {
				while (it.hasNext()) {
					InvestorCountBean tempbean = new InvestorCountBean();
					Entry<?, ?> entry = (Entry<?, ?>) it.next();
					tempbean.setCount(Integer.parseInt(entry.getValue().toString()));
					tempbean.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(entry.getKey()
							.toString()));
					allOrdersResultlist.add(tempbean);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 已完成订单统计数据封装到bean中
			Iterator<?> it2 = turnoverOrdersMap.entrySet().iterator();
			try {
				while (it2.hasNext()) {
					InvestorCountBean tempbean = new InvestorCountBean();
					Entry<?, ?> entry = (Entry<?, ?>) it2.next();
					tempbean.setCount(Integer.parseInt(entry.getValue().toString()));
					tempbean.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(entry.getKey()
							.toString()));
					turnoverOrdersResultlist.add(tempbean);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 所有订单、已完成订单统计List按时间升序排列
			Collections.sort(allOrdersResultlist, new SortClass());
			Collections.sort(turnoverOrdersResultlist, new SortClass());
			for (OrdersResBean order : allOrderslist) {
				orderDate = order.getOrderTime();
				stateInteger = order.getState();
				Double commission = order.getCommission();
				Double orderAmount = order.getOrderAmount();
				if (commission == null) {
					commission = 0D;
				}
				if (orderAmount == null) {
					orderAmount = 0D;
				}
				// 1已支付2未支付3已赎回4部分支付5已取消6已完成
				// 总订单
				gridAllState.setAmount(gridAllState.getAmount() + 1);
				gridAllState.setTurnover(DoubleFormat(gridAllState.getTurnover() + orderAmount));
				gridAllState.setOncession(DoubleFormat(gridAllState.getOncession()
						+ BigDecimalUtils.multiply(orderAmount, commission)));// 计算佣金
				if (6 == stateInteger) {
					gridTurnState.setAmount(gridTurnState.getAmount() + 1);
					gridTurnState.setTurnover(DoubleFormat(gridTurnState.getTurnover()
							+ orderAmount));
					gridTurnState.setOncession(DoubleFormat(gridTurnState.getOncession()
							+ BigDecimalUtils.multiply(orderAmount, commission)));// 计算佣金
				} else if (2 == stateInteger) {
					gridPayState.setAmount(gridPayState.getAmount() + 1);
					gridPayState
							.setTurnover(DoubleFormat(gridPayState.getTurnover() + orderAmount));
					gridPayState.setOncession(DoubleFormat(gridPayState.getOncession()
							+ BigDecimalUtils.multiply(orderAmount, commission)));// 计算佣金
				} else if (3 == stateInteger) {
					gridBackState.setAmount(gridBackState.getAmount() + 1);
					gridBackState.setTurnover(DoubleFormat(gridBackState.getTurnover()
							+ orderAmount));
					gridBackState.setOncession(DoubleFormat(gridBackState.getOncession()
							+ BigDecimalUtils.multiply(orderAmount, commission)));// 计算佣金
				} else if (5 == stateInteger) {
					gridCancelState.setAmount(gridCancelState.getAmount() + 1);
					gridCancelState.setTurnover(DoubleFormat(gridCancelState.getTurnover()
							+ orderAmount));
					gridCancelState.setOncession(DoubleFormat(gridCancelState.getOncession()
							+ BigDecimalUtils.multiply(orderAmount, commission)));// 计算佣金
				}
				// 按成交天数统计订单
				days = DateUtils.countDays(orderDate, date);
				if (stateInteger == 6) {
					if (days <= 3) {
						gridThreeDay.setAmount(gridThreeDay.getAmount() + 1);
						gridThreeDay.setTurnover(DoubleFormat(gridThreeDay.getTurnover()
								+ orderAmount));
						gridThreeDay.setOncession(DoubleFormat(gridThreeDay.getOncession()
								+ BigDecimalUtils.multiply(orderAmount, commission)));// 计算佣金
					}
					if (days <= 7) {
						gridSevenDay.setAmount(gridSevenDay.getAmount() + 1);
						gridSevenDay.setTurnover(DoubleFormat(gridSevenDay.getTurnover()
								+ orderAmount));
						gridSevenDay.setOncession(DoubleFormat(gridSevenDay.getOncession()
								+ BigDecimalUtils.multiply(orderAmount, commission)));// 计算佣金
					}
					if (days <= 30) {
						gridThirtyDay.setAmount(gridThirtyDay.getAmount() + 1);
						gridThirtyDay.setTurnover(DoubleFormat(gridThirtyDay.getTurnover()
								+ orderAmount));
						gridThirtyDay.setOncession(DoubleFormat(gridThirtyDay.getOncession()
								+ BigDecimalUtils.multiply(orderAmount, commission)));// 计算佣金
					}
					if (days <= 60) {
						gridSixtyDay.setAmount(gridSixtyDay.getAmount() + 1);
						gridSixtyDay.setTurnover(DoubleFormat(gridSixtyDay.getTurnover()
								+ orderAmount));
						gridSixtyDay.setOncession(DoubleFormat(gridSixtyDay.getOncession()
								+ BigDecimalUtils.multiply(orderAmount, commission)));// 计算佣金
					}
					if (days <= 90) {
						gridNintyDay.setAmount(gridNintyDay.getAmount() + 1);
						gridNintyDay.setTurnover(DoubleFormat(gridNintyDay.getTurnover()
								+ orderAmount));
						gridNintyDay.setOncession(DoubleFormat(gridNintyDay.getOncession()
								+ BigDecimalUtils.multiply(orderAmount, commission)));// 计算佣金
					}
				}

			}
		} catch (Exception e) {
			e.getMessage();
			LOGGER.error("count ordersCount error.msg=[{}]", e.getMessage());
		}
		listday.add(gridThreeDay);
		listday.add(gridSevenDay);
		listday.add(gridThirtyDay);
		listday.add(gridSixtyDay);
		listday.add(gridNintyDay);
		liststate.add(gridAllState);
		liststate.add(gridTurnState);
		liststate.add(gridBackState);
		liststate.add(gridPayState);
		liststate.add(gridCancelState);
		map.put("allOrders", allOrdersResultlist);
		map.put("turnoverOrders", turnoverOrdersResultlist);
		map.put("gridWithDay", listday);
		map.put("gridWithState", liststate);
		return map;
	}

	// Double格式化
	public Double DoubleFormat(Double d) {
		DecimalFormat dbFormat = new DecimalFormat("#.00");
		return Double.parseDouble(dbFormat.format(d));
	}

	/**
	 * 查询团队长下所有下级员工的订单信息
	 * 
	 * @param InvestorReqBean
	 * @return List<OrdersResBean>
	 */
	@Override
	public List<OrdersResBean> leader(OrdersReqBean ordersReqBean) {
		List<OrdersResBean> ordersResBeans = ordersDao.leader(ordersReqBean);
		return ordersResBeans;
	}

	/**
	 * 根据条件查询某产品的所有订单
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return List<OrdersBriefBean>
	 */
	public List<OrdersResBean> history(OrdersReqBean ordersReqBean) {
		List<OrdersResBean> ordersResBeans = ordersDao.history(ordersReqBean);
		return ordersResBeans;
	}

	@Override
	public List<EmployeeGroupAmountBean> queryEmployeeGroupAmount(String groupId, Date beginDate,
			Date endDate) {
		EmployeeGroupAmountReqBean bean = new EmployeeGroupAmountReqBean();
		bean.setGroupId(groupId);
		bean.setBeginDate(beginDate);
		bean.setEndDate(endDate);
		return ordersDao.queryEmployeeGroupAmount(bean);
	}

	@Override
	public List<Orders> getMyGroupInvestorOrders(GetGroupTotalBean getMyGroupBean) {
		return ordersDao.getMyGroupInvestorOrders(getMyGroupBean);

	}

	/**
	 * 预约转订单成功或者生成订单时,极光推送消息; 生成订单时向投后APP用户推送消息
	 * 
	 * @author zhangyz
	 * @data 2015年9月7日19:40:34
	 */
	public void createOrderMessage(Orders order) {
		LOGGER.info("message for createOrderMessage task begin");
		// 生成订单成功时向团队负责人发送消息
		String employeeId = order.getEmployeeId();
		if (order == null || StringUtils.isBlank(employeeId)) {
			LOGGER.error("message for createOrderMessage error due to params is not completely");
			return;
		}
		try {
			// 向投后APP用户推送消息
			LOGGER.info("send message for createOrderMessage to custormer  begin InvestorId :[{}]",order.getInvestorId());
			Customer customer = new Customer();
			Date date = new Date();
			Investor investor = investorServiceImpl.get(order.getInvestorId());
			customer.setMobile(investor.getMobile());
			List<Customer> cusList = customerServiceImpl.pagedList(customer);
			Product p = productServiceImpl.get(order.getProductId());
			if (cusList.size() == 1) {
				Customer cus = cusList.get(0);
				// 向投后APP用户推送消息
				Message messageLog = new Message();
				messageLog.setId(ObjectId.get().toString());
				messageLog.setSender("投后消息");
				messageLog.setSource("机构后台");
				messageLog.setType(3);
				messageLog.setState(0);
				messageLog.setSkipKey(order.getOrderId());
				messageLog.setSkipType(1);
				messageLog.setOrgId(investor.getOrgId());
				messageLog.setBusinessType(2);
				messageLog.setCustomerId(cus.getId());
				messageLog.setCreateTime(date);
				messageLog.setSendTime(DateFormatUtils.format(date, "yyyy-MM-dd"));
				String msgEmp = "尊敬的" + cus.getName() + "，您正在购买的" + p.getBriefName()
						+ "，点击查看详情";
				messageLog.setMessage(msgEmp);
				// 保存投后用户消息日志
				int res = messageServiceImpl.doAdd(messageLog);
				if (res == 1) {
					LOGGER.info("save message for customer at createOrderMessage success");
				} else {
					LOGGER.error("save message for customer at createOrderMessage error");
				}
				// 向投后APP用户发送推送消息 (别名为投后用户id,组别为机构id)
				MessagePush messageCusPush = new MessagePush(msgEmp, "投后消息", messageServiceImpl.getUnReadNum(investor.getOrgId(),cus.getId()));
				messageCusPush.sendCusPushTag(investor.getOrgId(), cus.getId());
				LOGGER.info("send createOrderMessage message for customer [{}] result :"
						+ cus.getName());
			}
			Employee emp = employeeServiceImpl.getLeader(employeeId);
			String leaderId = emp.getEmployeeId();
			if (null != emp) {
				// 向团队负责人推送投资人订单生成消息,团队长不能为空
				Message message = new Message();
				message.setId(ObjectId.get().toString());
				message.setEmployeeId(leaderId);
				message.setSender("机构消息");
				message.setSource("Pad端");
				message.setSkipType(1);
				message.setSkipKey(order.getOrderId());
				message.setMessageType(3);
				message.setType(2);
				message.setState(0);
				message.setOrgId(emp.getOrgId());
				message.setCreateTime(date);
				String msg = order.getEmployeeName() + ",有一笔新订单（编号:" + order.getOrderId() + ")生成";
				message.setMessage(msg);
				LOGGER.info("message for createOrderMessage, param=[{}]",
						JSON.toJSONString(message));
				int result = messageServiceImpl.doAdd(message);
				if (result == 1) {
					LOGGER.error("message for createOrderMessage success");
				} else {
					LOGGER.error("message for createOrderMessage error");
				}
				// 极光向接收人推送消息
				MessagePush messagePush = new MessagePush(msg);
				Set<String> alias = new HashSet<String>();
				alias.add(leaderId);
				messagePush.sendPushAlias(alias);
			}
		} catch (Exception e) {
			LOGGER.error("message for createOrderMessage error" + e.getMessage());
		}
	}

	/**
	 * 确认认购金额时,极光推送消息并短信提醒
	 * 
	 * @author zhangyz
	 * @data 2015年9月7日19:40:34
	 */
	@Override
	public void comfirmAmountMessage(Orders order) {
		try {
			// 向理财师推送投资人订单生成消息
			Message message = new Message();
			message.setId(ObjectId.get().toString());
			String employeeId = order.getEmployeeId();
			message.setEmployeeId(employeeId);
			message.setSender("机构消息");
			message.setSource("Pad端");
			message.setSkipType(1);
			message.setMessageType(3);
			message.setSkipKey(order.getOrderId());
			message.setType(2);
			message.setState(0);
			message.setOrgId(order.getOrgId());
			Date date = new Date();
			message.setCreateTime(date);
			Investor investor = investorServiceImpl.get(order.getInvestorId());
			Product product = productServiceImpl.get(order.getProductId());
			Employee emp = employeeServiceImpl.get(order.getEmployeeId());
			if (investor == null || product == null || order == null || emp == null) {
				LOGGER.error("message for comfirmAmountMessage error due to params is not completely");
				return;
			}
			String msg = emp.getName() + "," + product.getBriefName() + ",新增一笔新订单（编号:"
					+ order.getOrderId() + "),请联系您的投资人 " + investor.getName() + " 尽快付款,逾期订单会被取消.";
			message.setMessage(msg);
			LOGGER.info("message for comfirmAmountMessage, param=[{}]", JSON.toJSONString(message));
			int result = messageServiceImpl.doAdd(message);
			if (result == 1) {
				LOGGER.error("message for comfirmAmountMessage success");
			} else {
				LOGGER.error("message for comfirmAmountMessage error");
				return;
			}
			// 极光向理财师推送消息
			MessagePush messagePush = new MessagePush(msg);
			Set<String> alias = new HashSet<String>();
			alias.add(employeeId);
			messagePush.sendPushAlias(alias);
			// 向理财师发送短信
			SmsUtils.send(emp.getMobile(), msg);
		} catch (Exception e) {
			LOGGER.error("message for comfirmAmountMessage error" + e.getMessage());
		}
	}

	/**
	 * Pad端投资人签订合同成功,消息推送投后APP用户
	 */
	public void createContractMessage(String orderId) {
		LOGGER.info("save message for customer at createContractMessage begin");
		try {
			if(orderId == null){
				LOGGER.error("save message for customer at createContractMessage error due to OrderId is null");
			}
			Orders o = new Orders();
			o.setOrderId(orderId);
			List<Orders> oList = ordersDao.pagedList(o);
			Product product = null;
			if(oList.size() == 1){
				product = productServiceImpl.get(oList.get(0).getProductId());
			}
			if (product != null) {
				Orders order = oList.get(0);
				// 获取该机构下所有的投后APP用户
				String orgId = product.getOrgId();
				Investor investor = investorServiceImpl.get(order.getInvestorId());
				Customer customer = new Customer();
				customer.setMobile(investor.getMobile());
				List<Customer> cusListTmp = customerServiceImpl.pagedList(customer);
				if (cusListTmp.size() == 1) {
					Customer cus = cusListTmp.get(0);
					// 向投后APP用户推送消息
					Message message = new Message();
					message.setId(ObjectId.get().toString());
					message.setSender("投后消息");
					message.setSource("机构后台");
					message.setType(3);
					message.setState(0);
					message.setSkipKey(order.getOrderId());
					message.setSkipType(1);
					message.setOrgId(orgId);
					message.setBusinessType(2);
					message.setCustomerId(cus.getId());
					Date date = new Date();
					message.setCreateTime(date);
					message.setSendTime(DateFormatUtils.format(date, "yyyy-MM-dd"));
					String msgEmp = "尊敬的" + cus.getName() + "，您正购买的" + product.getBriefName()
							+ "完成合同签订步骤，点击查看详情";
					message.setMessage(msgEmp);
					// 保存投后用户消息日志
					int res = messageServiceImpl.doAdd(message);
					if (res == 1) {
						LOGGER.info("save message for customer at createContractMessage success");
					} else {
						LOGGER.error("save message for customer at createContractMessage error");
						return;
					}
					// 向投后APP用户发送推送消息 (别名为投后用户id,组别为机构id)
					LOGGER.info("send createContractMessage message for customer  param :[{}]"
							+ cus.getId()+";"+orgId);
					MessagePush messageCusPush = new MessagePush(msgEmp, "投后消息", messageServiceImpl.getUnReadNum(orgId,cus.getId()));
					messageCusPush.sendCusPushTag(orgId, cus.getId());
				}
			}else{
				LOGGER.error("save message for customer at createContractMessage error due to product is null");
			}
		} catch (Exception e) {
			LOGGER.error("send createContractMessage message for customer error :[{}]:"
					,e.getMessage());
		}
		
	}
	
	/**
	 * Pad端pos机刷卡支付成功,向投后APP用户推送消息
	 */
	@Override
	public void paymentSucceedMessage(String orderId,Double newPaidAmount) {
		LOGGER.info("save message for customer at paymentSucceedMessage task begin");
		try {
			if(orderId == null){
				LOGGER.error("save message for customer at createContractMessage error due to OrderId is null");
			}
			Orders o = new Orders();
			o.setOrderId(orderId);
			List<Orders> oList = ordersDao.pagedList(o);
			Product product = null;
			if(oList.size() == 1){
				product = productServiceImpl.get(oList.get(0).getProductId());
			}
			if (product != null) {
				Orders order = oList.get(0);
				// 获取该机构下的投后APP用户
				String orgId = product.getOrgId();
				Investor investor = investorServiceImpl.get(order.getInvestorId());
				Customer customer = new Customer();
				customer.setMobile(investor.getMobile());
				List<Customer> cusListTmp = customerServiceImpl.pagedList(customer);
				NumberFormat nf = new DecimalFormat("####.##");
				if (cusListTmp.size() == 1) {
					Customer cus = cusListTmp.get(0);
					// 向投后APP用户推送消息
					Message message = new Message();
					message.setId(ObjectId.get().toString());
					message.setSender("投后消息");
					message.setSource("机构后台");
					message.setType(3);
					message.setState(0);
					message.setSkipKey(order.getOrderId());
					message.setSkipType(1);
					message.setOrgId(orgId);
					message.setBusinessType(2);
					message.setCustomerId(cus.getId());
					Date date = new Date();
					message.setCreateTime(date);
					message.setSendTime(DateFormatUtils.format(date, "yyyy-MM-dd"));
					String msgEmp = "尊敬的"+cus.getName()+"，您为购买的"+product.getBriefName()+"成功支付了"+nf.format(newPaidAmount)+"元，点击查看详情";
					message.setMessage(msgEmp);
					// 保存投后用户消息日志
					int res = messageServiceImpl.doAdd(message);
					if (res == 1) {
						LOGGER.info("save message for customer at paymentSucceedMessage success");
					} else {
						LOGGER.error("save message for customer at paymentSucceedMessage error");
						return;
					}
					// 向投后APP用户发送推送消息 (别名为投后用户id,组别为机构id)
					LOGGER.info("send paymentSucceedMessage message for customer [{}] param :"
							,cus.getId()+";"+orgId);
					MessagePush messageCusPush = new MessagePush(msgEmp, "投后消息", messageServiceImpl.getUnReadNum(orgId,cus.getId()));
					messageCusPush.sendCusPushTag(orgId, cus.getId());
				}
			}else{
				LOGGER.error("save message for customer at paymentSucceedMessage error due to product is null");
			}
		} catch (Exception e) {
			LOGGER.info("send paymentSucceedMessage message for customer  error :[{}]:"
					,e.getMessage());
		}
	}
	
	/**
	 * 订单删除
	 */
	@Override
	public int deleteOrders(String orderId) {
		return ordersDao.deleteOrders(orderId);
	}
}
