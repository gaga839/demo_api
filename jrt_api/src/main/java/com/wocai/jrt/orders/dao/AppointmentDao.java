package com.wocai.jrt.orders.dao;

import java.util.List;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
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
 * 表appointment的MyBatis Dao Mapper。 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * 
 * @date 2015-07-28 13:33:35
 */
@DaoMapper
public interface AppointmentDao extends BaseDao<Appointment, AppointmentBean, String> {
	/**
	 * 根据投资人id查询投资人预约记录
	 * 
	 * @param OrdersReqBean
	 *            orderReqBean
	 * @return List<OrdersResBean>
	 */
	public List<AppointmentResBean> queryList(OrdersReqBean orderReqBean);

	/**
	 * 根据条件查询检索理财师下所有订单
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return List<OrdersBriefBean>
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
	 * 根据model处理预约单
	 * 
	 * @param AppointmentReqBean
	 *            appointmentReqBean
	 * @return AppointmentResBean
	 */
	public int deal(AppointmentDealReqBean appointmentDealReqBean);

	/**
	 * 根据员工id查询投资人预约记录
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return List<AppointmentResBean>
	 */
	public List<AppointmentResBean> queryEmp(OrdersReqBean orderReqBean);

	/**
	 * 查询团队长下所有下级员工的预约信息
	 * 
	 * @param OrdersReqBean
	 * @return List<OrdersResBean>
	 */
	public List<OrdersResBean> leader(OrdersReqBean ordersReqBean);

	/**
	 * 查询团队下所有的预约信息，根据队长的ID
	 * 
	 * @param groupAppointmentReqBean
	 * @return
	 */
	public List<Appointment> getGroupAppointment(GroupAppointmentReqBean groupAppointmentReqBean);

	/**
     *  根据员工id统计该员工下所有预约信息
     * @param  OrdersReqBean ordersReqBean
     * @return JsonBean
     */
	public List<AppointmentResBean> appointmentCount(AppointmentReqBean appointmentReqBean);
	
}
