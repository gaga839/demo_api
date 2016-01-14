package com.wocai.jrt.employee.service.spi;

import java.util.List;

import com.wocai.jrt.employee.bean.CheckHistoryReqBean;
import com.wocai.jrt.employee.bean.CheckHistoryResBean;
import com.wocai.jrt.employee.bean.CheckListReqBean;
import com.wocai.jrt.employee.bean.CheckListResBean;
import com.wocai.jrt.employee.bean.GetMyGroupBean;
import com.wocai.jrt.employee.bean.TrackListReqBean;
import com.wocai.jrt.employee.bean.TrackListResBean;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.model.EmployeeGroup;
import com.wocai.jrt.employee.model.EmployeeGroupBean;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.product.bean.ProductReqBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 理财团队相关的业务service接口。
 * 
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
public interface EmployeeGroupService extends
		MyBatisService<EmployeeGroup, EmployeeGroupBean, String> {
	/**
	 * 根据请求的参数获取对应团队下签到列表
	 * 
	 * @param checkListReqBean
	 * @return List<CheckListResBean>
	 */
	List<CheckListResBean> getCheckListResBean(CheckListReqBean checkListReqBean);

	/**
	 * 根据请求的参数获取对应员工历史签到列表
	 * 
	 * @param checkHistoryReqBean
	 * @return List<Date>
	 */
	List<CheckHistoryResBean> getCheckHistoryResBean(CheckHistoryReqBean checkHistoryReqBean);


	/**
	 * 根据请求的参数获取对应轨迹列表
	 * 
	 * @param trackListReqBean
	 * @return List<TrackListResBean>
	 */
	List<TrackListResBean> getTrackListResBean(TrackListReqBean trackListReqBean);

	/**
	 * 根据团队队长的ID获取该团队的所有队员
	 * 
	 * @param employeeId
	 * @return
	 */
	List<Employee> getMyGroup(GetMyGroupBean getMyGroupBean);
	
	/**
	 * 根据团队队长的ID获取该团队的所有队员额人数
	 * 
	 * @param employeeId
	 * @return
	 */
	Integer getMyGroupCount(GetMyGroupBean getMyGroupBean);

	/**
	 * 根据团队队长ID查询退队下所有的订单
	 * 
	 * @param getMyGroupBean
	 * @return
	 */
	List<Orders> getMyGroupOrder(GetMyGroupBean getMyGroupBean);
	
	EmployeeGroup getEmployeeGroupByEmployeeId(ProductReqBean productReqBean);

	Integer getMyGroupOrderNum(GetMyGroupBean getBean);

	List<EmployeeGroup> getGroupList(String deptId, String orgId);

	List<Employee> getMyGroupMember(GetMyGroupBean getMyGroupBean);
}
