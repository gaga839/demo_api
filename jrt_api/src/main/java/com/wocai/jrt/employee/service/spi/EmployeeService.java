package com.wocai.jrt.employee.service.spi;

import java.util.List;

import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.model.EmployeeBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 员工相关的业务service接口。
 * @author yinlei
 * @date 2015-8-1 13:00:27
 */
public interface EmployeeService extends MyBatisService<Employee, EmployeeBean, String> {
	
	/**
	 * 根据员工id查询其团队长信息
	 * @param employeeId
	 * @return Employee
	 * @author zhangyz
	 */
	Employee getLeader(String employeeId);

	List<Employee> getAgentEmp(Employee employee);

}
