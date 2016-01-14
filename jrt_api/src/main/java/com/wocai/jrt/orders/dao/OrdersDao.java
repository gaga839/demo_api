package com.wocai.jrt.orders.dao;

import java.util.List;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.employee.bean.GetGroupTotalBean;
import com.wocai.jrt.orders.bean.EmployeeGroupAmountBean;
import com.wocai.jrt.orders.bean.EmployeeGroupAmountReqBean;
import com.wocai.jrt.orders.bean.OrderDetailBean;
import com.wocai.jrt.orders.bean.OrdersReqBean;
import com.wocai.jrt.orders.bean.OrdersResBean;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.orders.model.OrdersBean;

/**
 * 表orders的MyBatis Dao Mapper。 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * 
 * @date 2015-07-27 19:26:13
 */
@DaoMapper
public interface OrdersDao extends BaseDao<Orders, OrdersBean, String> {

	/**
	 * 根据投资人id查询投资人交易记录
	 * 
	 * @param Orders
	 *            order
	 * @return List<Orders>
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
	public List<OrdersResBean> count(OrdersReqBean ordersReqBean);

	/**
	 * 查询团队长下所有下级员工的订单信息
	 * 
	 * @param OrdersReqBean
	 * @return List<OrdersResBean>
	 */
	public List<OrdersResBean> leader(OrdersReqBean ordersReqBean);

	/**
	 * 根据团队ID，查询团队下所有人的交易金额
	 * 
	 * @param employeeGroupAmountreqBean
	 * @return
	 */
	public List<EmployeeGroupAmountBean> queryEmployeeGroupAmount(
			EmployeeGroupAmountReqBean employeeGroupAmountReqBean);

	/**
	 * 根据团队队长ID查看团队的投资人的订单
	 * 
	 * @param getMyGroupBean
	 * @return
	 */
	public List<Orders> getMyGroupInvestorOrders(GetGroupTotalBean getMyGroupBean);
	/**
     * 根据条件查询某产品的所有订单
     * @param OrdersReqBean ordersReqBean
     * @return List<OrdersBriefBean>
     */
	public List<OrdersResBean> history(OrdersReqBean ordersReqBean);
	
	/**
	 * 订单删除
	 * @param orderId
	 * @return
	 */
	public int deleteOrders(String orderId);
	
}
