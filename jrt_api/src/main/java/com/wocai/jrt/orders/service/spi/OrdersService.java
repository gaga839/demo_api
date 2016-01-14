package com.wocai.jrt.orders.service.spi;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.wocai.jrt.employee.bean.GetGroupTotalBean;
import com.wocai.jrt.orders.bean.EmployeeGroupAmountBean;
import com.wocai.jrt.orders.bean.OrderDetailBean;
import com.wocai.jrt.orders.bean.OrdersResBean;
import com.wocai.jrt.orders.bean.OrdersReqBean;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.orders.model.OrdersBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 订单相关的业务service接口。
 * 
 * @author yinlei
 * @date 2015-7-27 19:26:12
 */
public interface OrdersService extends MyBatisService<Orders, OrdersBean, String> {

	/**
	 * 根据投资人id查询投资人交易记录
	 * 
	 * @param Orders
	 *            order
	 * @return List<OrdersBriefBean>
	 */
	public List<OrdersResBean> investor(OrdersReqBean ordersReqBean);

	/**
	 * 根据条件查询检索理财师下所有订单
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return List<OrdersBriefBean>
	 */
	public List<OrdersResBean> factor(OrdersReqBean ordersReqBean);

	/**
	 * 根据定单id获取定单详情信息
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return OrderDetailBean
	 */
	public OrderDetailBean detail(OrdersReqBean ordersReqBean);

	/**
	 * 根据员工id统计该员工下所有订单信息
	 * 
	 * @param OrdersReqBean
	 *            ordersReqBean
	 * @return JsonBean
	 */
	public Map<String, Object> count(OrdersReqBean ordersReqBean);

	/**
	 * 查询团队长下所有下级员工的订单信息
	 * 
	 * @param OrdersReqBean
	 * @return List<OrdersResBean>
	 */
	public List<OrdersResBean> leader(OrdersReqBean ordersReqBean);

	/**
	 * 通过groupId，开始时间，结束时间查询该团队下没个人的业绩
	 * 
	 * @param groupId
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	public List<EmployeeGroupAmountBean> queryEmployeeGroupAmount(String groupId, Date beginDate,
			Date endDate);

	/**
	 * 根据团队队长ID查看团队的投资人的订单
	 * 
	 * @param getMyGroupBean
	 * @return
	 */
	public List<Orders> getMyGroupInvestorOrders(GetGroupTotalBean getGroupTotalBean);
	
	/**
     * 根据条件查询某产品的所有订单
     * @param OrdersReqBean ordersReqBean
     * @return List<OrdersBriefBean>
     */
	public List<OrdersResBean> history(OrdersReqBean ordersReqBean);
	
	/**
	 * 预约转订单成功时,极光推送消息
	 * @author zhangyz
	 * @data 2015年9月7日19:40:34
	 */
	public void createOrderMessage(Orders order);
	
	/**
	 * 确认认购金额时,极光推送消息并短信提醒
	 * @author zhangyz
	 * @data 2015年9月7日19:40:34
	 */
	public void comfirmAmountMessage(Orders order);
	
	public void createContractMessage(String orderId);
	
	public void paymentSucceedMessage(String orderId,Double newPaidAmount);
	
	/**
	 * 订单删除
	 * @param orderId
	 * @return
	 */
	public int deleteOrders(String orderId);
}
