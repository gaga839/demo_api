package com.wocai.jrt.orders.action;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.service.spi.EmployeeService;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.message.model.Message;
import com.wocai.jrt.message.service.spi.MessageService;
import com.wocai.jrt.orders.bean.AppointmentDealReqBean;
import com.wocai.jrt.orders.bean.AppointmentDetailBean;
import com.wocai.jrt.orders.bean.AppointmentReqBean;
import com.wocai.jrt.orders.bean.AppointmentResBean;
import com.wocai.jrt.orders.bean.OrdersReqBean;
import com.wocai.jrt.orders.bean.OrdersResBean;
import com.wocai.jrt.orders.model.Appointment;
import com.wocai.jrt.orders.service.spi.AppointmentService;
import com.wocai.jrt.utils.MessagePush;
import com.wocai.jrt.utils.SmsUtils;

/**
 * 预约控制器
 * @author zhangyz
 * @date 2015-7-28 13:33:34
 */
@Controller
@RequestMapping("/appointment")
public class AppointmentAction extends GenericAction<Appointment> {
	@Inject
	private AppointmentService appointmentServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private EmployeeService employeeServiceImpl;
	@Inject
	private MessageService messageServiceImpl;
	
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
     * 根据投资人id查询投资人预约记录
     * @param OrdersReqBean ordersReqBean
     * @return JsonBean
     */
    @ResponseBody
    @RequestMapping("/queryList")
    public JsonBean queryList(OrdersReqBean ordersReqBean){
    	JsonBean bean = new JsonBean();
    	if (StringUtils.isBlank(ordersReqBean.getInvestorId())) {
    		bean.setMessage("param's investorId(id) cannot be null.");
    		return bean;
    	}
    	try {
    		LOGGER.info("request appointment  queryList, param=[{}]", JSON.toJSONString(ordersReqBean));
    		Date date = ordersReqBean.getEnd();
    		if (date!=null) {
				ordersReqBean.setEnd(new DateTime(date).minusHours(-23)
						.minusMinutes(-59).minusSeconds(-59).toDate());
			}
    		Integer i = ordersReqBean.getPage();
			if ( i != null) {
				ordersReqBean.setPage(i*ordersReqBean.getPageSize());
			}
			ordersReqBean.setOrderBy("FIELD(a.state,0,1,3,2) asc ,a.appoint_time desc");
        	List<AppointmentResBean> list = appointmentServiceImpl.queryList(ordersReqBean);
    		bean.setCode(1);
    		bean.setMessage("获取预约记录成功");
    		bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("request appointment  queryList error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("获取预约记录失败");
		}
    	return bean;
    }
    
    /**
     * 根据员工id查询投资人预约记录
     * @param OrdersReqBean ordersReqBean
     * @return JsonBean
     */
    @ResponseBody
    @RequestMapping("/queryEmp")
    public JsonBean queryEmp(OrdersReqBean ordersReqBean){
    	JsonBean bean = new JsonBean();
    	if (StringUtils.isBlank(ordersReqBean.getEmployeeId())) {
    		bean.setMessage("param's EmployeeId(id) cannot be null.");
    		return bean;
    	}
    	try {
    		LOGGER.info("request appointment  queryEmp list, param=[{}]", JSON.toJSONString(ordersReqBean));
        	List<AppointmentResBean> list = appointmentServiceImpl.queryEmp(ordersReqBean);
    		bean.setCode(1);
    		bean.setMessage("获取客户预约记录成功");
    		bean.setData(list);
		} catch (Exception e) {
			LOGGER.error("request appointment  queryEmp list.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("获取客户预约记录失败");
		}
    	return bean;
    }
    
    /**
     * 根据条件查询检索理财师下所有预约订单
     * @param OrdersReqBean ordersReqBean
     * @return JsonBean
     */
    @ResponseBody
    @RequestMapping("/factor")
    public JsonBean factor(OrdersReqBean ordersReqBean)
    {
    	JsonBean bean = new JsonBean();
    	if (StringUtils.isBlank(ordersReqBean.getEmployeeId())) {
    		bean.setMessage("param's employeeId(id) cannot be null.");
    		return bean;
    	}
    	try {
    		LOGGER.info("request appointment  list ByFactor, param=[{}]", JSON.toJSONString(ordersReqBean));
    		if (ordersReqBean.getEnd() != null) {
    			ordersReqBean.setEnd(new DateTime(ordersReqBean.getEnd()).minusHours(-23).minusMinutes(-59).minusSeconds(-59).toDate());
			}
    		Integer i = ordersReqBean.getPage();
			if (i != null) {
				ordersReqBean.setPage(i * ordersReqBean.getPageSize());
			}
			Date date = ordersReqBean.getEnd();
    		if (date!=null) {
    			ordersReqBean.setEnd(new DateTime(date).minusHours(-23)
						.minusMinutes(-59).minusSeconds(-59).toDate());
			}
    		ordersReqBean.setOrderBy("FIELD(a.state,0,1,3,2) asc ,a.appoint_time desc");
	    	List<OrdersResBean> list = appointmentServiceImpl.queryFactor(ordersReqBean);
	    	bean.setCode(1);
	    	bean.setData(list);
			bean.setMessage("按条件查询理财师下预约订单成功");
    	} catch (Exception e) {
			LOGGER.error("request appointment list ByFactor error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("按条件查询理财师下预约订单失败");
		}
    	return bean;
    }
    
    /**
     * 根据预约单id获取预约详情信息
     * @param id 预约单id
     * @return JsonBean
     */
    @ResponseBody
    @RequestMapping("/detail")
    public JsonBean detail(AppointmentReqBean appointmentReqBean)
    {
    	JsonBean bean = new JsonBean();
    	if (StringUtils.isBlank(appointmentReqBean.getAppointmentId())) {
    		bean.setMessage("param's appointmentId(id) cannot be null.");
    		return bean;
    	}
    	try {
    		LOGGER.info("request appointment Detail list, param=[{}]", JSON.toJSONString(appointmentReqBean));
	    	List<AppointmentDetailBean> list = appointmentServiceImpl.detail(appointmentReqBean);
	    	bean.setCode(1);
	    	bean.setData(list);
			bean.setMessage("查询预约订单详情成功");
    	} catch (Exception e) {
			LOGGER.error("request appointment Detail error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("查询预约订单详情失败");
		}
    	return bean;
    }
    
    /**
     * 根据预约单id、处理类型 处理预约单
     * @param AppointmentDealReqBean appointmentDealReqBean
     * @return JsonBean
     */
    @ResponseBody
    @RequestMapping("/deal")
    public JsonBean deal(AppointmentDealReqBean appointmentDealReqBean)
    {
    	JsonBean bean = new JsonBean();
    	String appoId = appointmentDealReqBean.getAppointmentId();
    	if (StringUtils.isBlank(appoId)) {
    		bean.setCode(0);
    		bean.setMessage("param's appointmentId cannot be null.");
    		return bean;
    	}
    	if (StringUtils.isBlank(appointmentDealReqBean.getEmployeeId())) {
    		bean.setCode(0);
    		bean.setMessage("param's getEmployeeId cannot be null.");
    		return bean;
    	}
    	try {
    		Appointment appointment = appointmentServiceImpl.get(appoId);
    		if(appointment == null){
				bean.setCode(0);
				bean.setMessage("该预约单不存在.");
				return bean;
			}
			Investor investor = investorServiceImpl.get(appointment.getInvestorId());
			if(investor == null){
				bean.setCode(0);
				bean.setMessage("预约单所属投资人不存在.");
				return bean;
			}
    		String belongEmpId = investor.getEmployeeId();
			if(belongEmpId!= null && !belongEmpId.equals(appointmentDealReqBean.getEmployeeId())){
    			bean.setCode(0);
				bean.setMessage("该投资人为其他理财师的客户，请为该投资人重新分配理财师。");
				return bean;
    		}
    		LOGGER.info("request appointmentDeal , param=[{}]", JSON.toJSONString(appointmentDealReqBean));
    		int i = appointmentServiceImpl.deal(appointmentDealReqBean);
    		if (i==0) {
    			bean.setCode(0);
    			bean.setMessage("分配预约订单失败:该订单不存在或理财师不存在");
    			return bean;
			}
    		else {
    			bean.setCode(1);
    			bean.setMessage("分配预约订单成功");
			}
	    	bean.setData(i);
	    	//分配预约单成功时向理财师发送消息
			String receiveId = appointmentDealReqBean.getEmployeeId();
			Employee emp = employeeServiceImpl.get(receiveId);
			if (null != receiveId) {
				//保存预约分配消息日志
				Message message = new Message();
				message.setId(ObjectId.get().toString());
				message.setEmployeeId(receiveId);
				message.setSender("机构消息");
				message.setSource("Pad端");
				message.setSkipType(2);
				message.setMessageType(1);
				message.setSkipKey(appointmentDealReqBean.getAppointmentId());
				message.setType(2);
				message.setState(0);
				message.setOrgId(emp.getOrgId());
				Date date = new Date();
				message.setCreateTime(date);
				String msg = "有个预约单（投资人："+investor.getName()+"）已经分配给你，请及时跟进";
				message.setMessage(msg);
				LOGGER.info("request send message to employee , param=[{}]", JSON.toJSONString(message));
				int result = messageServiceImpl.doAdd(message);
				if(result == 1){
					LOGGER.error("message for checkin success");
				}else{
					LOGGER.error("message for checkin error");
					return null;
				}
				//极光向接收人推送消息
	    		MessagePush messagePush = new MessagePush(msg,"机构消息");
	    		Set<String> alias = new HashSet<String>();
	    		alias.add(receiveId);
	    		messagePush.sendPushAlias(alias);
	    		//向接收人发送短信
	    		SmsUtils.send(emp.getMobile(),msg);
			}
    	} catch (Exception e) {
    		e.printStackTrace();
			LOGGER.error("request appointmentDeal error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("分配预约订单失败");
		}
    	return bean;
    }
    
    /**
     * 取消预约
     * @param appointmentDealReqBean
     * @return
     */
    @ResponseBody
    @RequestMapping("/cancel")
    public JsonBean cancel(AppointmentDealReqBean appointmentDealReqBean){
    	JsonBean bean = new JsonBean();
    	if (StringUtils.isBlank(appointmentDealReqBean.getAppointmentId())) {
    		bean.setCode(0);
    		bean.setMessage("param's appointmentId cannot be null.");
    		return bean;
    	}
    	try{
    		LOGGER.info("request appointmentCancel, param=[{}]", JSON.toJSONString(appointmentDealReqBean));
    		Appointment app = new Appointment();
    		app.setId(appointmentDealReqBean.getAppointmentId());
    		app.setCompleteTime(new Date());
    		app.setState(2);
    		int i = appointmentServiceImpl.updateById(app);
    		if (i==0) {
    			bean.setMessage("取消预约单失败:该预约单可能不存在");
    			bean.setCode(0);
    	    	bean.setData(i);
			}
    		else {
    			bean.setMessage("取消预约单成功");
    			bean.setCode(1);
    	    	bean.setData(i);
			}
    	}catch(Exception e){
    		LOGGER.error("request appointmentCancel error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("取消预约单失败");
    	}
		return bean;
    }
    
    /**
     *  根据员工id统计该员工下所有预约统计信息
     * @param  AppointmentReqBean ordersReqBean
     * @return JsonBean
     */
    @ResponseBody
    @RequestMapping("/count")
    public JsonBean count( AppointmentReqBean appointmentReqBean)
    {
    	JsonBean bean = new JsonBean();
    	if (StringUtils.isBlank(appointmentReqBean.getEmployeeId())) {
    		bean.setMessage("param's EmployeeId cannot be null.");
    		return bean;
    	}
    	try {
    		LOGGER.info("request appointmentsCount , param=[{}]", JSON.toJSONString(appointmentReqBean));
    		if (appointmentReqBean.getEnd() != null) {
    			appointmentReqBean.setEnd(new DateTime(appointmentReqBean.getEnd()).minusHours(-23).minusMinutes(-59).minusSeconds(-59).toDate());
			}
    		Map<String,Object> list = appointmentServiceImpl.appointmentCount(appointmentReqBean);
	    	bean.setCode(1);
			bean.setMessage("统计该员工下预约统计信息成功");
			bean.setData(list);
    	} catch (Exception e) {
			LOGGER.error("request appointmentCount error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("统计该员工下预约统计信息失败");
		}
    	return bean;
    }
    
    /**
     * 查询团队长下所有下级员工的预约信息
     * @param Id 员工id
     * @return JsonBean
     */
    @ResponseBody
    @RequestMapping("/leader")
    public JsonBean leader(OrdersReqBean ordersReqBean)
    {
    	JsonBean bean = new JsonBean();
    	if (StringUtils.isBlank(ordersReqBean.getOrgId())||StringUtils.isBlank(ordersReqBean.getGroupId())) {
    		bean.setCode(0);
    		bean.setMessage("param's groupId or orgId cannot be null.");
    		LOGGER.info("param's groupId or orgId cannot be null , param=[{}]", JSON.toJSONString(ordersReqBean));
    		return bean;
    	}
    	try {
    		LOGGER.info("request investorDetailList , param=[{}]", JSON.toJSONString(ordersReqBean));
    		Integer i = ordersReqBean.getPage();
			if (i != null) {
				ordersReqBean.setPage(i * ordersReqBean.getPageSize());
			}
    		Date date = ordersReqBean.getEnd();
    		if (date!=null) {
				ordersReqBean.setEnd(new DateTime(date).minusHours(-23)
						.minusMinutes(-59).minusSeconds(-59).toDate());
			}
    		ordersReqBean.setOrderBy("FIELD(a.state,0,1,3,2) asc ,appoint_time desc ");
	    	List<OrdersResBean> list = appointmentServiceImpl.leader(ordersReqBean);
	    	bean.setCode(1);
			bean.setMessage("查询团队长下预约信息成功");
			bean.setData(list);
    	} catch (Exception e) {
			LOGGER.error("investor investorDetailList error.msg=[{}]", e.getMessage());
			bean.setCode(0);
			bean.setMessage("查询团队长下预约信息失败");
		}
    	return bean;
    }

}
