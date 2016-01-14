package com.wocai.jrt.employee.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.inject.Inject;

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
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.wocai.jrt.employee.bean.CheckHistoryReqBean;
import com.wocai.jrt.employee.bean.CheckHistoryResBean;
import com.wocai.jrt.employee.bean.CheckListReqBean;
import com.wocai.jrt.employee.bean.CheckListResBean;
import com.wocai.jrt.employee.bean.GetGroupTotalBean;
import com.wocai.jrt.employee.bean.GetMyGroupBean;
import com.wocai.jrt.employee.bean.GroupRanking;
import com.wocai.jrt.employee.bean.GroupRankingComparator;
import com.wocai.jrt.employee.bean.GroupRankingReqBean;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.model.EmployeeGroup;
import com.wocai.jrt.employee.service.spi.EmployeeCommissionHistoryService;
import com.wocai.jrt.employee.service.spi.EmployeeGroupService;
import com.wocai.jrt.employee.service.spi.EmployeeService;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.model.InvestorBean;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.orders.bean.GroupAppointmentReqBean;
import com.wocai.jrt.orders.model.Appointment;
import com.wocai.jrt.orders.model.AppointmentBean;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.orders.model.OrdersBean;
import com.wocai.jrt.orders.service.spi.AppointmentService;
import com.wocai.jrt.orders.service.spi.OrdersService;

/**
 * 理财团队控制器
 * 
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
@Controller
@RequestMapping("/employeeGroup")
public class EmployeeGroupAction extends GenericAction<EmployeeGroup> {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeGroupAction.class);

	@Inject
	private EmployeeGroupService employeeGroupServiceImpl;
	@Inject
	private EmployeeCommissionHistoryService employeeCommissionHistoryServiceImpl;
	@Inject
	private AppointmentService appointmentServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private OrdersService ordersServiceImpl;
	@Inject
	private EmployeeService employeeServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd"), true));
	}

	/**
	 * 获取团队总览
	 * 
	 * @param employeeId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getGroupTotal")
	public JsonBean getGroupTotal(String employeeId,String groupId) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(employeeId,groupId)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request employeeGroup getGroupTotal, param=[{}]",
					JSON.toJSONString(groupId));
			EmployeeGroup employeeGroup = employeeGroupServiceImpl.get(groupId);
			if (null == employeeGroup) {
				json.setCode(0);
				json.setMessage("团队不存在");
				return json;
			}
			if (employeeGroup.getDeleted()) {
				json.setCode(0);
				json.setMessage("团队已经被删除");
				return json;
			}
			
			Map<String, Object> resultMap = new HashMap<String, Object>();
			// 昨日业绩
			DateFormat dfY = new SimpleDateFormat("yyyyMMdd");
			Date nowDate = new Date();
			Date beginDateY = dfY.parse(dfY.format(nowDate.getTime() - 1000 * 60 * 60 * 24));// 昨日业绩开始时间
			Date endDateY = dfY.parse(dfY.format(nowDate.getTime() - 1));// 昨日业绩结束时间

			Map<String, Object> yesterdayPerformanceMap = groupPerformance(employeeId,groupId, beginDateY,
					endDateY);
			resultMap.put("yesterdayPerformance", yesterdayPerformanceMap);
			// 本月业绩
			DateFormat dfM = new SimpleDateFormat("yyyyMM");
			Date beginDateM = dfM.parse(dfM.format(nowDate));// 本月业绩开始时间

			Map<String, Object> thisMonthPerformanceMap = groupPerformance(employeeId,groupId, beginDateM,
					nowDate);
			resultMap.put("thisMonthPerformance", thisMonthPerformanceMap);
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(resultMap);
			return json;
		} catch (Exception e) {
			LOGGER.error("request employeeGroup getGroupTotal, errorMsg=[{}].", e);
			json.setCode(0);
			json.setMessage("获取团队总览失败");
			return json;
		}
	}

	/**
	 * 统计一些团队总览的数据
	 * 
	 * @param employeeId
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	private Map<String, Object> groupPerformance(String employeeId,String groupId, Date beginDate, Date endDate) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		// Champion
		GetMyGroupBean getBean = new GetMyGroupBean();
		getBean.setGroupId(groupId);
		getBean.setEndDate(endDate);
		getBean.setStartDate(beginDate);
		// ------获取团队下所有人的订单
		List<Orders> ordersList = employeeGroupServiceImpl.getMyGroupOrder(getBean);
		// ------把每个人的订单拿出来放入单独的列表,乘机把每个人的成交金额统计了 :-D
		Map<String, List<Orders>> employeeOrdersMap = new HashMap<String, List<Orders>>();
		Map<String, Double> employeeOrdersAmountMap = new HashMap<String, Double>();
		for (Orders orders : ordersList) {
			if (null == employeeOrdersMap.get(orders.getEmployeeId())) {
				List<Orders> employeeList = new LinkedList<Orders>();
				employeeList.add(orders);
				employeeOrdersMap.put(orders.getEmployeeId(), employeeList);

				Double ordersAmount = 0.0;
				if (null != orders.getOrderAmount()) {
					ordersAmount = BigDecimalUtils.add(ordersAmount, orders.getOrderAmount());
				}
				employeeOrdersAmountMap.put(orders.getEmployeeId(), ordersAmount);
			} else {
				List<Orders> employeeList = employeeOrdersMap.get(orders.getEmployeeId());
				employeeList.add(orders);
				employeeOrdersMap.put(orders.getEmployeeId(), employeeList);
				Double ordersAmount = 0.0;
				if (null != orders.getOrderAmount()) {
					ordersAmount = BigDecimalUtils.add(employeeOrdersAmountMap.get(orders.getEmployeeId()),
							orders.getOrderAmount());
				}
				employeeOrdersAmountMap.put(orders.getEmployeeId(),ordersAmount);
			}
		}
		// ------根据每个人的成交金额算出冠军
		Double championOrdersAmount = 0.0;
		String championEmployeeId = "";
		for (Entry<String, Double> entry : employeeOrdersAmountMap.entrySet()) {
			if (entry.getValue() > championOrdersAmount) {
				championOrdersAmount = entry.getValue();
				championEmployeeId = entry.getKey();
			}
		}

		Map<String, Object> championMap = new HashMap<String, Object>();
		if (null != employeeOrdersMap.get(championEmployeeId)) {
			championMap.put("employeeName", employeeOrdersMap.get(championEmployeeId).get(0)
					.getEmployeeName());// 理财师
			championMap.put("ordersNumber", employeeOrdersMap.get(championEmployeeId).size());// 成交数
		} else {
			championMap.put("employeeName", "");
			championMap.put("ordersNumber", 0);
		}

		championMap.put("ordersAmount", championOrdersAmount);// 成交金额
		resultMap.put("champion", championMap);
		// Orders
		Double groupOrdersAmount = 0.0;
		for (Orders orders : ordersList) {
			if (null != orders.getOrderAmount()) {
				groupOrdersAmount = BigDecimalUtils.add(groupOrdersAmount, orders.getOrderAmount());
			}
		}
		int ordersNumberDeal = 0;
		for (Orders orders : ordersList) {
			if (null != orders.getState() && orders.getState() == 6) {
				ordersNumberDeal++;
			}
		}
		Double myDividend = employeeCommissionHistoryServiceImpl.getGroupCommission(groupId,
				beginDate, endDate);
		if (null == myDividend) {
			myDividend = 0.0;
		}
		Map<String, Object> ordersMap = new HashMap<String, Object>();
		// 统计订单数，这个要求和其他的不一样
		Integer i = employeeGroupServiceImpl.getMyGroupOrderNum(getBean);
		ordersMap.put("ordersNumber", null==i?0:i);// 订单数,这个只要是不是取消的都算
		ordersMap.put("ordersAmount", groupOrdersAmount);// 成交金额
		ordersMap.put("ordersNumberDeal", ordersNumberDeal);// 成交数
		ordersMap.put("ordersDividendCommission", myDividend);// 分成佣金
		resultMap.put("orders", ordersMap);//
		// Appointment
		GroupAppointmentReqBean groupAppointmentReqBean = new GroupAppointmentReqBean();
		groupAppointmentReqBean.setBeginDate(beginDate);
		groupAppointmentReqBean.setEndDate(endDate);
		groupAppointmentReqBean.setGroupId(groupId);
		List<Appointment> appointmentList = appointmentServiceImpl
				.getGroupAppointment(groupAppointmentReqBean);
		int appointmentNumberToDeal = 0;
		for (Appointment appointment : appointmentList) {
			if (null != appointment.getState() && appointment.getState() == 0) {
				appointmentNumberToDeal++;
			}
		}
		Map<String, Object> appointmentMap = new HashMap<String, Object>();
		appointmentMap.put("appointmentNumber", appointmentList.size());// 预约数
		appointmentMap.put("appointmentNumberToDeal", appointmentNumberToDeal);// 待处理数
		resultMap.put("appointment", appointmentMap);
		// Investor
		GetMyGroupBean getMyGroupBean = new GetMyGroupBean();
		getMyGroupBean.setGroupId(groupId);
		getMyGroupBean.setStartDate(beginDate);
		getMyGroupBean.setEndDate(endDate);
		List<Investor> investorList = investorServiceImpl.getMyGroupInvestor(getMyGroupBean);
		
		GetGroupTotalBean getGroupTotalBean = new GetGroupTotalBean();
		getGroupTotalBean.setGroupId(groupId);
		getGroupTotalBean.setStartDate(beginDate);
		getGroupTotalBean.setEndDate(endDate);
		getGroupTotalBean.setStartDateOrders(beginDate);
		getGroupTotalBean.setEndDateOrders(endDate);
		List<Orders> addInverstorOrdersList = ordersServiceImpl
				.getMyGroupInvestorOrders(getGroupTotalBean);
		Map<String, Object> investorMap = new HashMap<String, Object>();
		investorMap.put("addInverstor", investorList.size());// 投资人新增
		investorMap.put("addInverstorOrders", addInverstorOrdersList.size());// 新增投资人下单数
		resultMap.put("investor", investorMap);
		return resultMap;
	}

	/**
	 * 根据团队队长ID和查询条件获取队员信息
	 * 
	 * @param getMyGroupBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getMyGroupMember")
	public JsonBean getMyGroupMember(GetMyGroupBean getMyGroupBean) {
		JsonBean json = new JsonBean();
		if (StringUtils.isBlank(getMyGroupBean.getEmployeeId())) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}
		
		try {
			List<Employee> myGroupList = employeeGroupServiceImpl.getMyGroupMember(getMyGroupBean);
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(myGroupList);
			return json;
		} catch (Exception e) {
			LOGGER.error("get record error, errorMsg=[{}].", e);
			json.setCode(0);
			json.setMessage("获取团队人员失败");
			return json;
		}
	}

	/**
	 * 获取理财师的成就
	 * 
	 * @param employeeId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getEmployeeAchievement")
	public JsonBean getEmployeeAchievement(String employeeId) {
		JsonBean json = new JsonBean();
		if (StringUtils.isBlank(employeeId)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			// 昨日业绩
			DateFormat dfY = new SimpleDateFormat("yyyyMMdd");
			Date nowDate = new Date();
			Date beginDateY = dfY.parse(dfY.format(nowDate.getTime() - 1000 * 60 * 60 * 24));// 昨日业绩开始时间
			Date endDateY = dfY.parse(dfY.format(nowDate.getTime() - 1));// 昨日业绩结束时间

			OrdersBean ordersBean = new OrdersBean();
			ordersBean.createCriteria().andEmployeeIdEqualTo(employeeId).andStateEqualTo(6).andPayTimeBetween(beginDateY, endDateY);// 查询条件
			List<Orders> ordersList = ordersServiceImpl.queryForList(ordersBean);
			resultMap.put("yesterdayPerformanceNumber", ordersList.size());
			double yesterdayPerformanceAmount = 0.0;
			for (Orders orders : ordersList) {
				yesterdayPerformanceAmount = BigDecimalUtils.add(orders.getOrderAmount(),
						yesterdayPerformanceAmount);
			}
			resultMap.put("yesterdayPerformanceAmount", yesterdayPerformanceAmount);

			// 本月业绩
			DateFormat dfM = new SimpleDateFormat("yyyyMM");
			Date beginDateM = dfM.parse(dfM.format(nowDate));// 本月业绩开始时间
			ordersBean.clear();
			ordersBean.createCriteria().andEmployeeIdEqualTo(employeeId).andStateEqualTo(6)
					.andPayTimeBetween(beginDateM, new Date());
			ordersList = ordersServiceImpl.queryForList(ordersBean);
			resultMap.put("thisMonthPerformanceNumber", ordersList.size());
			double thisMonthPerformanceAmount = 0.0;
			for (Orders orders : ordersList) {
				thisMonthPerformanceAmount = BigDecimalUtils.add(orders.getOrderAmount(),
						thisMonthPerformanceAmount);
			}
			resultMap.put("thisMonthPerformanceAmount", thisMonthPerformanceAmount);

			// 总业绩
			ordersBean.clear();
			ordersBean.createCriteria().andEmployeeIdEqualTo(employeeId).andStateEqualTo(6);
			ordersList = ordersServiceImpl.queryForList(ordersBean);
			resultMap.put("allPerformanceNumber", ordersList.size());
			double allPerformanceAmount = 0.0;
			for (Orders orders : ordersList) {
				allPerformanceAmount = BigDecimalUtils.add(orders.getOrderAmount(),
						allPerformanceAmount);
			}
			resultMap.put("allPerformanceAmount", allPerformanceAmount);

			// 总预约数
			AppointmentBean appointmentBean = new AppointmentBean();
			appointmentBean.createCriteria().andEmployeeIdEqualTo(employeeId);
			int appointment = appointmentServiceImpl.count(appointmentBean);
			resultMap.put("appointment", appointment);

			// 总投资人数
			InvestorBean investorBean = new InvestorBean();
			investorBean.createCriteria().andEmployeeIdEqualTo(employeeId).andDeletedEqualTo(false);
			int investorNumber = investorServiceImpl.count(investorBean);
			resultMap.put("investorNumber", investorNumber);

			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(resultMap);
			return json;
		} catch (Exception e) {
			LOGGER.error("get record error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage("获取队员业绩失败");
			return json;
		}
	}

	/**
	 * 获取日排行
	 * 
	 * @param employeeId
	 * @param beginDate
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/dayRanking")
	public JsonBean dayRanking(GroupRankingReqBean reqBean) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(reqBean.getGroupId())) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			if (null == reqBean.getBeginDate()) {
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				reqBean.setBeginDate(df.parse(df.format(new Date())));
			}

			DateTime endDate = new DateTime(reqBean.getBeginDate());
			endDate = endDate.plusDays(1).plusMillis(-1);
			reqBean.setEndDate(endDate.toDate());
			List<GroupRanking> groupRankingList = rankingList(reqBean.getGroupId(),
					reqBean.getBeginDate(), endDate.toDate());

			int start = 0, end = groupRankingList.size();
			if (reqBean.getPage() != null && reqBean.getPageSize() != null) {
				start = reqBean.getPage() * reqBean.getPageSize();
				end = (reqBean.getPage() + 1) * reqBean.getPageSize();
			}
			if (end > groupRankingList.size()) {
				end = groupRankingList.size();
			}

			List<GroupRanking> resultList = new ArrayList<GroupRanking>();
			for (int i = start; i < end; i++) {
				resultList.add(groupRankingList.get(i));
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(resultList);
			return json;
		} catch (Exception e) {
			LOGGER.error("get dayRanking error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage("获取日排行失败");
			return json;
		}
	}

	/**
	 * 获取月排行
	 * 
	 * @param employeeId
	 * @param beginDate
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/monthRanking")
	public JsonBean monthRanking(GroupRankingReqBean reqBean) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(reqBean.getGroupId())) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM");
			if (null == reqBean.getBeginDate()) {
				reqBean.setBeginDate(df.parse(df.format(new Date())));
			} else {
				reqBean.setBeginDate(df.parse(df.format(reqBean.getBeginDate())));
			}

			DateTime endDate = new DateTime(reqBean.getBeginDate());
			endDate = endDate.plusMonths(1).plusMinutes(-1);
			List<GroupRanking> groupRankingList = rankingList(reqBean.getGroupId(),
					reqBean.getBeginDate(), endDate.toDate());

			int start = 0, end = groupRankingList.size();
			if (reqBean.getPage() != null && reqBean.getPageSize() != null) {
				start = reqBean.getPage() * reqBean.getPageSize();
				end = (reqBean.getPage() + 1) * reqBean.getPageSize();
			}
			if (end > groupRankingList.size()) {
				end = groupRankingList.size();
			}

			List<GroupRanking> resultList = new ArrayList<GroupRanking>();
			for (int i = start; i < end; i++) {
				resultList.add(groupRankingList.get(i));
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(resultList);
			return json;
		} catch (Exception e) {
			LOGGER.error("get monthRanking error, errorMsg=[{}].", e.getMessage());
			json.setCode(0);
			json.setMessage("获取月排行失败");
			return json;
		}
	}

	/**
	 * 根据队长的ID获取团队队员都额排行
	 * 
	 * @param employeeId
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	private List<GroupRanking> rankingList(String groupId, Date beginDate, Date endDate) {
		// Champion
		GetMyGroupBean getBean = new GetMyGroupBean();
		getBean.setGroupId(groupId);
		getBean.setEndDate(endDate);
		getBean.setStartDate(beginDate);
		// ------获取团队下所有人的订单
		List<Orders> ordersList = employeeGroupServiceImpl.getMyGroupOrder(getBean);
		// ------把每个人的订单拿出来放入单独的列表,乘机把每个人的成交金额统计了 :-D
		Map<String, List<Orders>> employeeOrdersMap = new HashMap<String, List<Orders>>();
		Map<String, Double> employeeOrdersAmountMap = new HashMap<String, Double>();
		for (Orders orders : ordersList) {
			if (null == employeeOrdersMap.get(orders.getEmployeeId())) {
				List<Orders> employeeList = new LinkedList<Orders>();
				employeeList.add(orders);
				employeeOrdersMap.put(orders.getEmployeeId(), employeeList);
				Double ordersAmount = 0.0;
				if (null != orders.getPaidAmount()) {
					ordersAmount = BigDecimalUtils.add(ordersAmount, orders.getOrderAmount());
				}
				employeeOrdersAmountMap.put(orders.getEmployeeId(), ordersAmount);
			} else {
				List<Orders> employeeList = employeeOrdersMap.get(orders.getEmployeeId());
				employeeList.add(orders);
				employeeOrdersMap.put(orders.getEmployeeId(), employeeList);
				employeeOrdersAmountMap.put(orders.getEmployeeId(),
						BigDecimalUtils.add(employeeOrdersAmountMap.get(orders.getEmployeeId()),
								orders.getOrderAmount()));
			}
		}
		List<GroupRanking> resultList = new LinkedList<GroupRanking>();
		for (Map.Entry<String, List<Orders>> entry : employeeOrdersMap.entrySet()) {
			GroupRanking gr = new GroupRanking();
			gr.setEmployeeId(entry.getKey());
			gr.setOrdersNumber(entry.getValue().size());
			gr.setEmployeeName(entry.getValue().get(0).getEmployeeName());
			gr.setOrdersAmount(employeeOrdersAmountMap.get(entry.getKey()));
			resultList.add(gr);
		}
		Collections.sort(resultList, new GroupRankingComparator());
		for (int i = 0; i < resultList.size(); i++) {
			resultList.get(i).setRanking(i + 1);
		}
		return resultList;
	}

	/**
	 * 团队签到列表
	 * 
	 * @param model
	 *            参数
	 * @return list
	 */
	@ResponseBody
	@RequestMapping("/groupCheckinList")
	public JsonBean groupCheckinList(CheckListReqBean checkListReqBean) {
		JsonBean json = new JsonBean();

		if (StringUtils.isBlank(checkListReqBean.getDepartmentId())) {
			LOGGER.info("params is null");
			json.setCode(0);
			json.setMessage("理财师团队id不能为空");
			return json;
		}
		try {
			// 发起请求的参数
			LOGGER.info("request group check list, param=[{}]", JSON.toJSONString(checkListReqBean));

			// 查询数据库
			if (null == checkListReqBean.getPage()) {
				checkListReqBean.setPage(0);
			} else {
				int page = checkListReqBean.getPage();
				if (0 != page) {
					checkListReqBean.setPage(page * checkListReqBean.getPageSize());
				}
			}
			List<CheckListResBean> list = employeeGroupServiceImpl
					.getCheckListResBean(checkListReqBean);

			// 封装jsonBean
			json.setCode(1);
			json.setData(list);
			json.setMessage(SUCCESS);
			LOGGER.info("query group check list, size=[{}]", list.size());

		} catch (Exception e) {
			LOGGER.error("fetch group check list error, error=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("fetch group check list error");
		}

		return json;
	}

	/**
	 * 成员签到历史记录
	 * 
	 * @param model
	 *            参数
	 * @return list
	 */
	@ResponseBody
	@RequestMapping("/checkinHistory")
	public JsonBean checkinHistory(CheckHistoryReqBean checkHistoryReqBean) {
		JsonBean json = new JsonBean();

		if (StringUtils.isAnyBlank(checkHistoryReqBean.getDepartmentId(),
				checkHistoryReqBean.getBelowEmployeeId())) {
			LOGGER.info("params is null");
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			Employee emp = new Employee();
			// 发起请求的参数
			LOGGER.info("request check history list, param=[{}]",
					JSON.toJSONString(checkHistoryReqBean));

			// 查询数据库
			if (null == checkHistoryReqBean.getPage()) {
				checkHistoryReqBean.setPage(0);
			} else {
				int page = checkHistoryReqBean.getPage();
				if (0 != page) {
					checkHistoryReqBean.setPage(page * checkHistoryReqBean.getPageSize());
				}
			}
			Date endDate = checkHistoryReqBean.getEndDate();
			if (endDate != null) {
				DateTime date = new DateTime(endDate);
				date = date.plusDays(1).minusMillis(1);
				checkHistoryReqBean.setEndDate(date.toDate());
			}
			List<CheckHistoryResBean> signHistroyList = employeeGroupServiceImpl
					.getCheckHistoryResBean(checkHistoryReqBean);
			// 查询员工头像
			emp = employeeServiceImpl.get(checkHistoryReqBean.getBelowEmployeeId());

			// 封装jsonBean
			map.put("histroy", signHistroyList);
			map.put("avatar", emp.getAvatar());
			map.put("employeeName", emp.getName());
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(map);
		} catch (Exception e) {
			LOGGER.error("fetch group check history error, error=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("fetch group check history error");
		}

		return json;
	}

	/**
	 * 获取团队列表
	 * 
	 * @param employeeId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getGroupList")
	public JsonBean getGroupList(String employeeId) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(employeeId)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request employeeGroup getGroupTotal, param=[{}]",
					JSON.toJSONString(employeeId));
			Employee employee = employeeServiceImpl.get(employeeId);
			if (null == employee) {
				json.setCode(0);
				json.setMessage("员工不存在");
				return json;
			}
			if (null==employee.getDeptId()) {
				json.setCode(0);
				json.setMessage("员工没有部门");
				return json;
			}
			List<EmployeeGroup> groupList = employeeGroupServiceImpl.getGroupList(employee.getDeptId(),employee.getOrgId());
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(groupList);
			return json;
		} catch (Exception e) {
			LOGGER.error("request employeeGroup getGroupTotal, errorMsg=[{}].", e);
			json.setCode(0);
			json.setMessage("获取团队列表失败");
			return json;
		}
	}
}
