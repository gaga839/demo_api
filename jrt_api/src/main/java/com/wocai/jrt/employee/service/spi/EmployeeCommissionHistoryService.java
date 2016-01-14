package com.wocai.jrt.employee.service.spi;

import java.util.Date;

import com.wocai.jrt.employee.model.EmployeeCommissionHistory;
import com.wocai.jrt.employee.model.EmployeeCommissionHistoryBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 员工历史佣金相关的业务service接口。
 * 
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
public interface EmployeeCommissionHistoryService extends
		MyBatisService<EmployeeCommissionHistory, EmployeeCommissionHistoryBean, String> {
	Double getMyCommission(String employeeId, Date beginDate, Date endDate);

	Double getMyDividend(String employeeId, Date beginDate, Date endDate);
	
	Double getGroupCommission(String employeeId, Date beginDate, Date endDate);
}
