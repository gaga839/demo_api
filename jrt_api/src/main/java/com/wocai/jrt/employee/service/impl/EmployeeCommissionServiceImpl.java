package com.wocai.jrt.employee.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.employee.dao.EmployeeCommissionDao;
import com.wocai.jrt.employee.model.EmployeeCommission;
import com.wocai.jrt.employee.model.EmployeeCommissionBean;
import com.wocai.jrt.employee.service.spi.EmployeeCommissionService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 员工产品佣金相关的service业务实现。
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
@Named
public class EmployeeCommissionServiceImpl extends MyBatisServiceImpl<EmployeeCommission, EmployeeCommissionBean, String> implements EmployeeCommissionService {
	// 添加了方法后，记得改为private
	protected EmployeeCommissionDao employeeCommissionDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<EmployeeCommission, EmployeeCommissionBean, String> employeeCommissionDao) {
		this.baseDao = employeeCommissionDao;
		this.employeeCommissionDao = (EmployeeCommissionDao) employeeCommissionDao;
	}
}
