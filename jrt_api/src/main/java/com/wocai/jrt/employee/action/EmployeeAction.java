package com.wocai.jrt.employee.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.utils.common.BigDecimalUtils;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.wocai.jrt.device.model.Ipad;
import com.wocai.jrt.device.model.Pos;
import com.wocai.jrt.device.model.PosPad;
import com.wocai.jrt.device.service.spi.IpadService;
import com.wocai.jrt.device.service.spi.PosPadService;
import com.wocai.jrt.device.service.spi.PosService;
import com.wocai.jrt.employee.bean.CheckinReqBean;
import com.wocai.jrt.employee.model.Checkin;
import com.wocai.jrt.employee.model.CheckinBean;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.model.EmployeeGroup;
import com.wocai.jrt.employee.model.GroupMember;
import com.wocai.jrt.employee.model.Org;
import com.wocai.jrt.employee.service.spi.CheckinService;
import com.wocai.jrt.employee.service.spi.EmployeeCommissionHistoryService;
import com.wocai.jrt.employee.service.spi.EmployeeGroupService;
import com.wocai.jrt.employee.service.spi.EmployeeService;
import com.wocai.jrt.employee.service.spi.GroupMemberService;
import com.wocai.jrt.employee.service.spi.OrgService;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.message.model.Message;
import com.wocai.jrt.message.service.spi.MessageService;
import com.wocai.jrt.orders.bean.EmployeeGroupAmountBean;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.orders.model.OrdersBean;
import com.wocai.jrt.orders.service.spi.OrdersService;
import com.wocai.jrt.token.TokenService;
import com.wocai.jrt.utils.MessagePush;

/**
 * 员工控制器
 * 
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
/**
 * @author madequan 哥哥并非浪得虚名
 * @date 2015年7月29日 下午3:10:58
 */
@Controller
@RequestMapping("/employee")
public class EmployeeAction extends GenericAction<Employee> {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeAction.class);

	@Inject
	private EmployeeService employeeServiceImpl;
	@Inject
	private IpadService ipadServiceImpl;
	@Inject
	private PosPadService posPadServiceImpl;
	@Inject
	private PosService posServiceImpl;
	@Inject
	private CheckinService checkinServiceImpl;
	@Inject
	private OrdersService ordersServiceImpl;
	@Inject
	private EmployeeGroupService employeeGroupServiceImpl;
	@Inject
	private GroupMemberService groupMemberServiceImpl;
	@Inject
	private EmployeeCommissionHistoryService employeeCommissionHistoryServiceImpl;
	@Inject
	private TokenService tokenService;
	@Inject
	private MessageService messageServiceImpl;
	@Inject
	private PasswordEncoder bcryptPasswordEncoder;
	@Inject
	private OrgService orgServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd"), true));
	}

	/**
	 * 获取用户名
	 * 
	 * @param serialNumber
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getEmployeeLoginInfo", method = RequestMethod.POST)
	public JsonBean getEmployeeName(String hardCode) {
		JsonBean json = new JsonBean();
		if (StringUtils.isBlank(hardCode)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request employee getEmployeeName param=[{}]", JSON.toJSONString(hardCode));
			Ipad ipad = new Ipad();
			ipad.setHardCode(hardCode);
			ipad.setDeleted(false);
			ipad = ipadServiceImpl.unique(ipad);
			if (null == ipad) {
				json.setCode(-1);
				json.setMessage("未启用");
				return json;
			}
			PosPad posPad = new PosPad();
			posPad.setPadId(ipad.getId());
			posPad = posPadServiceImpl.unique(posPad);
			if (null == posPad) {
				json.setCode(-2);
				json.setMessage("未激活");
				return json;
			}
			Employee employee = new Employee();
			employee.setPosPadId(posPad.getId());
			employee = employeeServiceImpl.unique(employee);
			if (null == employee) {
				json.setCode(-3);
				json.setMessage("未分配");
				return json;
			}
			Map<String, String> result = new HashMap<String, String>();
			result.put("name", employee.getName());
			result.put("employeeNo", employee.getEmployeeNo());
			result.put("avatar", employee.getAvatar());

			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(result);
			return json;
		} catch (Exception e) {
			LOGGER.error("request employee getEmployeeName error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("获取用户名失败");
			return json;
		}
	}

	/**
	 * 登录 还未加入token，请稍后
	 * 
	 * 已加入token。。。
	 * 
	 * @param serialNumber
	 * @param account
	 * @param loginPassword
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public JsonBean login(String hardCode, String employeeNo, String loginPassword) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(hardCode, employeeNo, loginPassword)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request employee login param=[{}]", hardCode + " " + employeeNo
					+ " loginPassword");
			Ipad ipad = new Ipad();
			ipad.setHardCode(hardCode);
			ipad.setDeleted(false);
			ipad = ipadServiceImpl.unique(ipad);
			if (null == ipad) {
				json.setCode(0);
				json.setMessage("该设备还未启用");
				return json;
			}
			PosPad posPad = new PosPad();
			posPad.setPadId(ipad.getId());
			posPad = posPadServiceImpl.unique(posPad);
			if (null == posPad) {
				json.setCode(0);
				json.setMessage("该设备还未激活");
				return json;
			}
			Pos pos = posServiceImpl.get(posPad.getPosId());
			if (pos == null) {
				json.setCode(0);
				json.setMessage("你的POS机呢？");
				return json;
			}
			Employee employee = new Employee();
			employee.setPosPadId(posPad.getId());
			employee = employeeServiceImpl.unique(employee);
			if (null == employee) {
				json.setCode(0);
				json.setMessage("该设备还未分配");
				return json;
			}
			if (!(employeeNo.equals(employee.getEmployeeNo()))) {
				json.setCode(0);
				json.setMessage("工号错误");
				return json;
			}
			if (!(bcryptPasswordEncoder.matches(loginPassword, employee.getLoginPwd()))) {
				json.setCode(0);
				json.setMessage("密码错误");
				return json;
			}
			if (employee.getState() == null || employee.getState() == 0) {
				json.setCode(0);
				json.setMessage("账号已被禁用，如有疑问请联系管理员");
				return json;
			}
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("tokenId", tokenService.getToken(employee.getEmployeeId()));
			result.put("mobile", employee.getMobile());
			result.put("email", employee.getEmail());
			result.put("gender", employee.getGender());
			result.put("department", employee.getDepartment());
			result.put("position", employee.getPosition());
			result.put("employeeId", employee.getEmployeeId());
			result.put("orgId", employee.getOrgId());
			result.put("avatar", employee.getAvatar());
			result.put("name", employee.getName());
			result.put("planner", employee.getPlanner());
			result.put("ipadHardCode", ipad.getHardCode());
			result.put("ipadSerialNumber", ipad.getSerialNumber());
			result.put("posHardCode", pos.getHardCode());
			result.put("posSerialNumber", pos.getSerialNumber());

			Org org = orgServiceImpl.get(employee.getOrgId());
			org.setOrgGroupId(null);
			result.put("org", org);

			// 是否为理财师团队的队长
			EmployeeGroup employeeGroup = new EmployeeGroup();
			employeeGroup.setDeleted(false);
			employeeGroup.setPlannerGroup(true);
			employeeGroup.setEmployeeId(employee.getEmployeeId());
			List<EmployeeGroup> employeeGroupList = employeeGroupServiceImpl
					.queryList(employeeGroup);
			boolean captain = false;
			if (employeeGroupList.size() > 0) {
				captain = true;
			}
			result.put("captain", captain);

			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(result);
			return json;
		} catch (Exception e) {
			LOGGER.error("request employee login error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("登录失败");
			return json;
		}
	}

	/**
	 * 签到
	 * 
	 * @param employeeId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/checkin")
	public JsonBean checkin(CheckinReqBean checkinReqBean) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(checkinReqBean.getEmployeeId())) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request employee checkin param=[{}]", checkinReqBean.getEmployeeId());
			Employee employee = employeeServiceImpl.get(checkinReqBean.getEmployeeId());
			if (null == employee) {
				json.setCode(0);
				json.setMessage("没有该员工");
				return json;
			}

			Investor inv = investorServiceImpl.get(checkinReqBean.getInvestorId());
			if (null == inv) {
				json.setCode(0);
				json.setMessage("没有该客户");
				return json;
			}
			Checkin checkin = new Checkin();
			checkin.setId(ObjectId.get().toString());
			checkin.setEmployeeId(employee.getEmployeeId());
			checkin.setEmployeeName(employee.getName());
			checkin.setOrgId(employee.getOrgId());
			checkin.setSignTime(new Date());
			checkin.setInvestorId(checkinReqBean.getInvestorId());
			checkin.setPx(checkinReqBean.getPx());
			checkin.setPy(checkinReqBean.getPy());
			checkin.setLocation(checkinReqBean.getLocation());
			checkin.setRemark(checkinReqBean.getRemark());
			checkin.setSignDate(new DateTime().toDate());
			int count = checkinServiceImpl.save(checkin);
			if (count <= 0) {
				json.setCode(0);
				json.setMessage("签到失败，请稍后重试");
				return json;
			}
			String employeeId = employee.getEmployeeId();
			Employee emp = employeeServiceImpl.getLeader(employeeId);
			if (null != emp) {
				String leaderId = emp.getEmployeeId();
				// 向团队负责人推送员工签到消息
				Message message = new Message();
				message.setId(ObjectId.get().toString());
				message.setEmployeeId(leaderId);
				message.setSender("机构消息");
				message.setSource("Pad端");
				message.setSkipType(3);
				message.setMessageType(1);
				message.setSkipKey(employeeId);
				message.setType(2);
				message.setCreateTime(new Date());
				message.setState(0);
				message.setOrgId(employee.getOrgId());
				Date date = new Date();
				message.setCreateTime(date);
				message.setMessage(employee.getName() + new SimpleDateFormat("HH:mm").format(date)
						+ "在" + checkinReqBean.getLocation() + "签到");
				int result = messageServiceImpl.doAdd(message);
				if (result == 1) {
					LOGGER.error("message for checkin success");
				} else {
					LOGGER.error("message for checkin error");
				}
				// 极光向接收人推送消息
				MessagePush messagePush = new MessagePush(message.getMessage());
				Set<String> alias = new HashSet<String>();
				alias.add(leaderId);
				messagePush.sendPushAlias(alias);
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			return json;
		} catch (Exception e) {
			json.setCode(0);
			json.setMessage("签到失败");
			LOGGER.error("checkin error message [{}]", e.getMessage());
			return json;
		}
	}

	/**
	 * 签退
	 * 
	 * @param employeeId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/checkOut")
	public JsonBean checkOut(String employeeId) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(employeeId)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request employee checkOut param=[{}]", employeeId);
			Employee employee = employeeServiceImpl.get(employeeId);
			if (null == employee) {
				json.setCode(0);
				json.setMessage("没有该员工");
			}

			// 拿到最新的签到记录
			CheckinBean checkinBean = new CheckinBean();
			DateFormat df = new SimpleDateFormat("yyyyMMdd");
			Date beginDate = df.parse(df.format(new Date()));
			checkinBean.createCriteria().andSignTimeBetween(beginDate, new Date());
			List<Checkin> checkinList = checkinServiceImpl.pagedForList(checkinBean);
			if (checkinList.size() == 0) {
				json.setCode(0);
				json.setMessage("你今天还未签到哟");
				return json;
			}
			Checkin checkin = checkinList.get(0);
			if (null != checkin.getSignOutTime()) {
				json.setCode(0);
				json.setMessage("你已经签退了哟");
				return json;
			}
			// 执行签退
			Checkin checkinOut = new Checkin();
			checkinOut.setId(checkin.getId());
			checkinOut.setSignOutTime(new Date());
			int count = checkinServiceImpl.updateById(checkinOut);
			if (count <= 0) {
				json.setCode(0);
				json.setMessage("签退失败，请稍后重试");
				return json;
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			return json;
		} catch (Exception e) {
			LOGGER.error("request employee checkinOut error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("签退失败");
			return json;
		}
	}

	/**
	 * 是否签到
	 * 
	 * @param employeeId
	 * @return
	 * @throws ParseException
	 */
	private boolean isCheckin(String employeeId) throws ParseException {
		CheckinBean checkinBean = new CheckinBean();
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date beginDate = df.parse(df.format(new Date()));
		checkinBean.createCriteria().andSignTimeBetween(beginDate, new Date());
		List<Checkin> checkinList = checkinServiceImpl.pagedForList(checkinBean);
		if (checkinList.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 个人中心
	 * 
	 * @param employeeId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/personalCenter")
	public JsonBean personalCenter(String employeeId) {
		JsonBean json = new JsonBean();
		if (StringUtils.isBlank(employeeId)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request employee personalCenter, param=[{}]", employeeId);
			Map<String, Object> resultMap = new HashMap<String, Object>();
			// 是否签到
			resultMap.put("isCheckin", isCheckin(employeeId));

			// 今日业绩
			DateFormat df = new SimpleDateFormat("yyyyMMdd");
			Date beginDateT = df.parse(df.format(new Date()));
			Date nowDate = new Date();
			Map<String, Object> todayPerformanceMap = myPerformance(employeeId, beginDateT, nowDate);
			resultMap.put("todayPerformance", todayPerformanceMap);

			// 本月业绩
			DateFormat df2 = new SimpleDateFormat("yyyyMM");
			Date beginDateM = df2.parse(df2.format(new Date()));
			Map<String, Object> thisMonthPerformanceMap = myPerformance(employeeId, beginDateM,
					nowDate);
			resultMap.put("thisMonthPerformance", thisMonthPerformanceMap);

			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(resultMap);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("request employee personalCenter error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("获取个人中心数据失败");
			return json;
		}
	}

	/**
	 * 个人业绩 需求有变，阿西吧
	 * 
	 * @param employeeId
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	private Map<String, Object> myPerformance(String employeeId, Date beginDate, Date endDate) {
		Map<String, Object> performanceMap = new HashMap<String, Object>();
		OrdersBean ordersBean = new OrdersBean();
		ordersBean.createCriteria().andEmployeeIdEqualTo(employeeId).andStateEqualTo(6)
				.andOrderTimeBetween(beginDate, endDate);
		List<Orders> orderList = ordersServiceImpl.queryForList(ordersBean);

		int ordersNumber = 0;
		if (null != orderList) {
			ordersNumber = orderList.size();
		}
		// 交易量（单）
		performanceMap.put("ordersNumber", ordersNumber);

		// 交易金额（万元）
		Double ordersAmount = 0.0;
		for (Orders orders : orderList) {
			if (null != orders.getOrderAmount()) {
				ordersAmount = BigDecimalUtils.add(ordersAmount, orders.getOrderAmount());
			}
		}
		performanceMap.put("ordersAmount", ordersAmount);

		// 交易排行
		// ------查询团队一共有多少人
		GroupMember gm = new GroupMember();
		gm.setEmployeeId(employeeId);
		gm = groupMemberServiceImpl.unique(gm);
		if (null == gm) {
			performanceMap.put("ordersRanking", "1/1");
		} else {
			EmployeeGroup eg = employeeGroupServiceImpl.get(gm.getGroupId());
			int totalPlanner = 1;
			if (null != eg) {
				GroupMember arg0 = new GroupMember();
				arg0.setGroupId(eg.getId());
				List<GroupMember> groupMemberList = groupMemberServiceImpl.queryList(arg0);
				totalPlanner = groupMemberList.size();
			}
			// ------查询团队下每个理财师的交易量
			List<EmployeeGroupAmountBean> employeeGroupAmountList = ordersServiceImpl
					.queryEmployeeGroupAmount(gm.getGroupId(), beginDate, endDate);
			// ------自己在团队中排名
			int myRanking = 1;
			for (EmployeeGroupAmountBean employeeGroupAmountBean : employeeGroupAmountList) {
				if (null != employeeGroupAmountBean.getEmployeeGroupAmount()) {
					if (employeeGroupAmountBean.getEmployeeGroupAmount() > ordersAmount) {
						myRanking++;
					}
				}
			}
			performanceMap.put("ordersRanking", myRanking + "/" + totalPlanner);
		}

		// 交易佣金总额
		Double myCommission = employeeCommissionHistoryServiceImpl.getMyCommission(employeeId,
				beginDate, endDate);
		if (null == myCommission) {
			myCommission = 0.0;
		}
		performanceMap.put("ordersCommission", myCommission);

		// 交易分成佣金（万元）
		Double myDividend = employeeCommissionHistoryServiceImpl.getMyDividend(employeeId,
				beginDate, endDate);
		if (null == myDividend) {
			myDividend = 0.0;
		}
		performanceMap.put("ordersDividendCommission", myDividend);
		return performanceMap;
	}

	/**
	 * 验证工作密码
	 * 
	 * @param employeeId
	 * @param workPassword
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/checkWorkPassword")
	public JsonBean checkWorkPassword(String employeeId, String workPassword) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(employeeId, workPassword)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request employee checkWorkPassword param=[{}]", employeeId);
			Employee employee = employeeServiceImpl.get(employeeId);
			if (null == employee.getEmployeeId()) {
				json.setCode(0);
				json.setMessage("该用户不存在");
				return json;
			}
			if (!(bcryptPasswordEncoder.matches(workPassword, employee.getWorkPwd()))) {
				json.setCode(0);
				json.setMessage("密码错误");
				return json;
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			return json;
		} catch (Exception e) {
			LOGGER.error("request employee checkWorkPassword error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("验证密码失败");
			return json;
		}
	}

	/**
	 * 修改登录密码
	 * 
	 * @param employeeId
	 * @param newLoginPassword
	 * @param oldLoginPassword
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updateLoginPassword")
	public JsonBean updateLoginPassword(String employeeId, String newLoginPassword,
			String oldLoginPassword) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(employeeId, newLoginPassword, oldLoginPassword)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request employee updateLoginPassword param=[{}]", employeeId);
			Employee employee = employeeServiceImpl.get(employeeId);
			if (null == employee.getEmployeeId()) {
				json.setCode(0);
				json.setMessage("该用户不存在");
				return json;
			}
			if (newLoginPassword.equals(oldLoginPassword)) {
				json.setCode(0);
				json.setMessage("输入的密码相同");
				return json;
			}
			if (!(bcryptPasswordEncoder.matches(oldLoginPassword, employee.getLoginPwd()))) {
				json.setCode(0);
				json.setMessage("旧密码错误");
				return json;
			}
			Employee updateEmployee = new Employee();
			updateEmployee.setEmployeeId(employeeId);
			updateEmployee.setLoginPwd(bcryptPasswordEncoder.encode(newLoginPassword));
			int count = employeeServiceImpl.updateById(updateEmployee);
			if (count < 1) {
				json.setCode(0);
				json.setMessage("更新密码错误，请稍后重试");
				return json;
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			return json;
		} catch (Exception e) {
			LOGGER.error("request employee updateLoginPassword error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("修改登录密码失败");
			return json;
		}
	}

	/**
	 * 修改工作密码
	 * 
	 * @param employeeId
	 * @param newWorkPassword
	 * @param oldWorkPassword
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updateWorkPassword")
	public JsonBean updateWorkPassword(String employeeId, String newWorkPassword,
			String oldWorkPassword) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(employeeId, newWorkPassword, oldWorkPassword)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request employee updateWorkPassword param=[{}]", employeeId);
			Employee employee = employeeServiceImpl.get(employeeId);
			if (null == employee.getEmployeeId()) {
				json.setCode(0);
				json.setMessage("该用户不存在");
				return json;
			}
			if (newWorkPassword.equals(oldWorkPassword)) {
				json.setCode(0);
				json.setMessage("输入的密码相同");
				return json;
			}
			if (!(bcryptPasswordEncoder.matches(oldWorkPassword, employee.getWorkPwd()))) {
				json.setCode(0);
				json.setMessage("旧密码错误");
				return json;
			}
			Employee updateEmployee = new Employee();
			updateEmployee.setEmployeeId(employeeId);
			updateEmployee.setWorkPwd((bcryptPasswordEncoder.encode(newWorkPassword)));
			int count = employeeServiceImpl.updateById(updateEmployee);
			if (count < 1) {
				json.setCode(0);
				json.setMessage("更新密码错误，请稍后重试");
				return json;
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			return json;
		} catch (Exception e) {
			LOGGER.error("request employee updateWorkPassword error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("修改工作密码失败");
			return json;
		}
	}

	/**
	 * 获取除了我以外的所有人
	 * 
	 * @param employeeId
	 * @param newWorkPassword
	 * @param oldWorkPassword
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getAgentEmpList")
	public JsonBean getAgentEmp(String employeeId, String orgId, String key) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyBlank(employeeId, orgId)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}
		try {
			LOGGER.info("request employee getAgentEmp param=[{}]", employeeId);
			Employee employee = new Employee();
			employee.setEmployeeId(employeeId);
			employee.setOrgId(orgId);
			if (null != key) {
				employee.setName(key);
			}
			List<Employee> employeeList = employeeServiceImpl.getAgentEmp(employee);
			json.setCode(1);
			json.setData(employeeList);
			json.setMessage(SUCCESS);
			return json;
		} catch (Exception e) {
			LOGGER.error("request employee getAgentEmpList error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage(ERROR);
			return json;
		}
	}
}
