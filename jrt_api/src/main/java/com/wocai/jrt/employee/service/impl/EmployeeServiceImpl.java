package com.wocai.jrt.employee.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.employee.dao.EmployeeDao;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.model.EmployeeBean;
import com.wocai.jrt.employee.service.spi.EmployeeService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 员工相关的service业务实现。
 * @author yinlei
 * @date 2015-8-1 13:00:27
 */
@Named
public class EmployeeServiceImpl extends MyBatisServiceImpl<Employee, EmployeeBean, String> implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Employee, EmployeeBean, String> employeeDao) {
		this.baseDao = employeeDao;
		this.employeeDao = (EmployeeDao) employeeDao;
	}
	
	/**
	 * 根据员工id查询其团队长信息
	 * @param employeeId
	 * @return Employee
	 * @author zhangyz
	 */
	@Override
	public Employee getLeader(String employeeId) {
		return employeeDao.getLeader(employeeId);
	}

	@Override
	public List<Employee> getAgentEmp(Employee employee) {
		return employeeDao.getAgentEmp(employee);
	}
}
