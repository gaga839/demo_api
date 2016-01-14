package com.wocai.jrt.orders.service.spi;

import java.util.List;
import java.util.Map;

import com.vteba.service.generic.MyBatisService;
import com.wocai.jrt.orders.bean.AppointmentDealReqBean;
import com.wocai.jrt.orders.bean.AppointmentDetailBean;
import com.wocai.jrt.orders.bean.AppointmentReqBean;
import com.wocai.jrt.orders.bean.AppointmentResBean;
import com.wocai.jrt.orders.bean.GroupAppointmentReqBean;
import com.wocai.jrt.orders.bean.OrdersReqBean;
import com.wocai.jrt.orders.bean.OrdersResBean;
import com.wocai.jrt.orders.model.Appointment;
import com.wocai.jrt.orders.model.AppointmentBean;

/**
 * 预约相关的业务service接口。
 * 
 * @author zhangyz
 * @date 2015-7-28 13:33:34
 */
public interface AppointmentService extends MyBatisService<Appointment, AppointmentBean, String> {
	/**
	 * 根据投资人id查询投资人预约记录
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return List<AppointmentResBean>
	 */
	public List<AppointmentResBean> queryList(OrdersReqBean orderReqBean);

	/**
	 * 根据条件查询检索理财师下所有预约订单
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return List<AppointmentResBean>
	 */
	public List<OrdersResBean> queryFactor(OrdersReqBean ordersReqBean);

	/**
	 * 根据预约单id获取预约详情信息
	 * 
	 * @param AppointmentReqBean
	 *            appointmentReqBean
	 * @return List<AppointmentDetailBean>
	 */
	public List<AppointmentDetailBean> detail(AppointmentReqBean appointmentReqBean);

	/**
	 * 根据预约单id、处理类型 处理预约单
	 * 
	 * @param AppointmentDealReqBean
	 *            appointmentDealReqBean
	 * @return AppointmentResBean
	 * @throws Exception
	 */
	public int deal(AppointmentDealReqBean appointmentDealReqBean) throws Exception;

	/**
	 * 根据员工id查询投资人预约记录
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return List<AppointmentResBean>
	 */
	public List<AppointmentResBean> queryEmp(OrdersReqBean ordersReqBean);

	/**
	 * 根据员工id统计该员工的所有预约统计信息
	 * 
	 * @param AppointmentReqBean
	 *            appointmentReqBean
	 * @return JsonBean
	 */
	public Map<String, Object> appointmentCount(AppointmentReqBean appointmentReqBean);

	/**
	 * 查询团队长下所有下级员工的预约信息
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return List<OrdersBriefBean>
	 */
	public List<OrdersResBean> leader(OrdersReqBean ordersReqBean);

	/**
	 * 查询团队下所有的预约，根据团队队长的ID
	 * 
	 * @param groupAppointmentReqBean
	 * @return
	 */
	public List<Appointment> getGroupAppointment(GroupAppointmentReqBean groupAppointmentReqBean);


}
