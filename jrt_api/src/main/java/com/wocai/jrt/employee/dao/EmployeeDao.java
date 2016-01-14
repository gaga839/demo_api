package com.wocai.jrt.employee.dao;

import java.util.List;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.model.EmployeeBean;

/**
 * 表employee的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-08-01 13:00:28
 */
@DaoMapper
public interface EmployeeDao extends BaseDao<Employee, EmployeeBean, String> {
	
	/**
	 * 根据员工id查询其团队长信息
	 * @param employeeId
	 * @return Employee
	 * @author zhangyz
	 */
	Employee getLeader(String employeeId);

	List<Employee> getAgentEmp(Employee employee);
}