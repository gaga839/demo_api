package com.wocai.jrt.employee.service.spi;

import com.wocai.jrt.employee.model.EmployeeCommission;
import com.wocai.jrt.employee.model.EmployeeCommissionBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 员工产品佣金相关的业务service接口。
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
public interface EmployeeCommissionService extends MyBatisService<EmployeeCommission, EmployeeCommissionBean, String> {

}
