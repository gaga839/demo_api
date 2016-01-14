package com.wocai.jrt.employee.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.employee.bean.CheckHistoryReqBean;
import com.wocai.jrt.employee.bean.CheckHistoryResBean;
import com.wocai.jrt.employee.bean.CheckListReqBean;
import com.wocai.jrt.employee.bean.CheckListResBean;
import com.wocai.jrt.employee.bean.GetMyGroupBean;
import com.wocai.jrt.employee.bean.TrackListReqBean;
import com.wocai.jrt.employee.bean.TrackListResBean;
import com.wocai.jrt.employee.dao.EmployeeGroupDao;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.model.EmployeeGroup;
import com.wocai.jrt.employee.model.EmployeeGroupBean;
import com.wocai.jrt.employee.service.spi.EmployeeGroupService;
import com.wocai.jrt.orders.model.Orders;
import com.wocai.jrt.product.bean.ProductReqBean;

/**
 * 理财团队相关的service业务实现。
 * 
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
/**
 * @author madequan 听哥的没错
 * @date 2015年7月31日 下午8:20:56
 */
/**
 * @author madequan 听哥的没错
 * @date 2015年7月31日 下午8:20:57
 */
@Named
public class EmployeeGroupServiceImpl extends
		MyBatisServiceImpl<EmployeeGroup, EmployeeGroupBean, String> implements
		EmployeeGroupService {
	// 添加了方法后，记得改为private
	protected EmployeeGroupDao employeeGroupDao;
	
	@Inject
	private EmployeeServiceImpl employeeServicel;

	private List<EmployeeGroup> employeeGroupList;

	@Override
	@Inject
	public void setBaseDao(BaseDao<EmployeeGroup, EmployeeGroupBean, String> employeeGroupDao) {
		this.baseDao = employeeGroupDao;
		this.employeeGroupDao = (EmployeeGroupDao) employeeGroupDao;
	}

	/**
	 * 根据请求的参数获取对应团队下签到列表
	 * 
	 * @param checkListReqBean
	 * @return List<CheckListResBean>
	 */
	@Override
	public List<CheckListResBean> getCheckListResBean(CheckListReqBean checkListReqBean) {
		return employeeGroupDao.getCheckListResBean(checkListReqBean);
	}

	/**
	 * 根据请求的参数获取对应员工历史签到列表
	 * 
	 * @param checkHistoryReqBean
	 * @return List<Date>
	 */
	@Override
	public List<CheckHistoryResBean> getCheckHistoryResBean(CheckHistoryReqBean checkHistoryReqBean) {
		return employeeGroupDao.getCheckHistoryResBean(checkHistoryReqBean);
	}

	/**
	 * 根据请求的参数获取对应轨迹列表
	 * 
	 * @param trackListReqBean
	 * @return List<TrackListResBean>
	 */
	@Override
	public List<TrackListResBean> getTrackListResBean(TrackListReqBean trackListReqBean) {
		return employeeGroupDao.getTrackListResBean(trackListReqBean);
	}

	@Override
	public List<Employee> getMyGroup(GetMyGroupBean getMyGroupBean) {
		return employeeGroupDao.getMyGroup(getMyGroupBean);
	}

	@Override
	public List<Orders> getMyGroupOrder(GetMyGroupBean getMyGroupBean) {
		return employeeGroupDao.getMyGroupOrder(getMyGroupBean);
	}

	@Override
	public Integer getMyGroupCount(GetMyGroupBean getMyGroupBean) {
		return employeeGroupDao.getMyGroupCount(getMyGroupBean);
	}

	@Override
	public EmployeeGroup getEmployeeGroupByEmployeeId(ProductReqBean productReqBean) {
		return employeeGroupDao.getEmployeeGroupByEmployeeId(productReqBean);
	}

	@Override
	public Integer getMyGroupOrderNum(GetMyGroupBean getBean) {
		return employeeGroupDao.getMyGroupOrderNum(getBean);
	}

	@Override
	public List<EmployeeGroup> getGroupList(String deptId,String orgId) {
		EmployeeGroup employeeGroup = new EmployeeGroup();
		employeeGroup.setOrgId(orgId);
		List<EmployeeGroup> employeeGroupListAll = employeeGroupDao.queryList(employeeGroup);
		employeeGroupList = new ArrayList<EmployeeGroup>();
		for (EmployeeGroup employeeGroup2 : employeeGroupListAll) {
			if (employeeGroup2.getId().equals(deptId)) {
				employeeGroupList.add(employeeGroup2);
				resolve(deptId,employeeGroupListAll);
			}
		}
		List<EmployeeGroup> result = new ArrayList<EmployeeGroup>();
		for (EmployeeGroup employeeGroup3 : employeeGroupList) {
			if (employeeGroup3.getPlannerGroup()) {
				result.add(employeeGroup3);
			}
		}
		return result;
	}

	private void resolve(String deptId,List<EmployeeGroup> employeeGroupListAll) {
		for (EmployeeGroup employeeGroup : employeeGroupListAll) {
			if (employeeGroup.getParent().equals(deptId)) {
				employeeGroupList.add(employeeGroup);
				resolve(employeeGroup.getId(), employeeGroupListAll);
			}
		}
	}

	@Override
	public List<Employee> getMyGroupMember(GetMyGroupBean getMyGroupBean) {
		Employee employee = employeeServicel.get(getMyGroupBean.getEmployeeId());
		if (null == getMyGroupBean.getGroupId()) {
			//递归算出所有的部门
			EmployeeGroup employeeGroup = new EmployeeGroup();
			employeeGroup.setOrgId(employee.getOrgId());
			List<EmployeeGroup> employeeGroupListAll = employeeGroupDao.queryList(employeeGroup);
			employeeGroupList = new ArrayList<EmployeeGroup>();
			for (EmployeeGroup employeeGroup2 : employeeGroupListAll) {
				if (employeeGroup2.getId().equals(employee.getDeptId())) {
					employeeGroupList.add(employeeGroup2);
					resolve(employee.getDeptId(),employeeGroupListAll);
				}
			}
			getMyGroupBean.setEmployeeGroupList(employeeGroupList);
		}
		//根据部门找出所有的理财师
		if (null != getMyGroupBean.getEndDate()) {
			getMyGroupBean.setEndDate(new Date(getMyGroupBean.getEndDate().getTime() + 24 * 60 * 60
					* 1000 - 1));
		}
		if (getMyGroupBean.getKey() != null) {
			getMyGroupBean.setKey(getMyGroupBean.getKey() + "%");
		}
		List<Employee> myGroupListAll = employeeGroupDao.getMyGroupMember(getMyGroupBean);
		//平级的不要
		EmployeeGroup employeeGroup = employeeGroupDao.get(employee.getDeptId());
		List<Employee> myGroupList = new ArrayList<Employee>();
		if (employee.getEmployeeId().equals(employeeGroup.getEmployeeId())) {
			//是队长，去掉自己
			for (Employee employee2 : myGroupListAll) {
				if(!(employee2.getEmployeeId().equals(employee.getEmployeeId()))){
					myGroupList.add(employee2);
				}
			}
		} else {
			//不是队长，直接去掉所有
			for (Employee employee2 : myGroupListAll) {
				if(!(employee2.getDeptId().equals(employee.getDeptId()))){
					myGroupList.add(employee2);
				}
			}
		}
		return myGroupList;
	}
}