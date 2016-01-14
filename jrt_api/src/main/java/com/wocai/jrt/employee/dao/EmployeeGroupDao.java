package com.wocai.jrt.employee.dao;

import java.util.List;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
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

/**
 * 表employee_group的MyBatis Dao Mapper。 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * 
 * @date 2015-07-24 11:23:26
 */
@DaoMapper
public interface EmployeeGroupDao extends BaseDao<EmployeeGroup, EmployeeGroupBean, String> {
	List<CheckListResBean> getCheckListResBean(CheckListReqBean checkListReqBean);

	List<CheckHistoryResBean> getCheckHistoryResBean(CheckHistoryReqBean checkHistoryReqBean);

	List<TrackListResBean> getTrackListResBean(TrackListReqBean trackListReqBean);

	List<Employee> getMyGroup(GetMyGroupBean getMyGroupBean);
	
	int getMyGroupCount(GetMyGroupBean getMyGroupBean);

	List<Orders> getMyGroupOrder(GetMyGroupBean getMyGroupBean);
	
	EmployeeGroup getEmployeeGroupByEmployeeId(ProductReqBean productReqBean);

	Integer getMyGroupOrderNum(GetMyGroupBean getBean);

	List<Employee> getMyGroupMember(GetMyGroupBean getMyGroupBean);
}
