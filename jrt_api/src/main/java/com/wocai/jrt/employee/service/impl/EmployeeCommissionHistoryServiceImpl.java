package com.wocai.jrt.employee.service.impl;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.employee.dao.EmployeeCommissionHistoryDao;
import com.wocai.jrt.employee.model.EmployeeCommissionHistory;
import com.wocai.jrt.employee.model.EmployeeCommissionHistoryBean;
import com.wocai.jrt.employee.service.spi.EmployeeCommissionHistoryService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 员工历史佣金相关的service业务实现。
 * 
 * @author yinlei
 * @date 2015-7-24 11:23:25
 */
@Named
public class EmployeeCommissionHistoryServiceImpl extends
		MyBatisServiceImpl<EmployeeCommissionHistory, EmployeeCommissionHistoryBean, String>
		implements EmployeeCommissionHistoryService {
	// 添加了方法后，记得改为private
	protected EmployeeCommissionHistoryDao employeeCommissionHistoryDao;

	@Override
	@Inject
	public void setBaseDao(
			BaseDao<EmployeeCommissionHistory, EmployeeCommissionHistoryBean, String> employeeCommissionHistoryDao) {
		this.baseDao = employeeCommissionHistoryDao;
		this.employeeCommissionHistoryDao = (EmployeeCommissionHistoryDao) employeeCommissionHistoryDao;
	}

	@Override
	public Double getMyCommission(String employeeId, Date beginDate, Date endDate) {
		return employeeCommissionHistoryDao.getMyCommission(employeeId, beginDate, endDate);
	}

	@Override
	public Double getMyDividend(String employeeId, Date beginDate, Date endDate) {
		return employeeCommissionHistoryDao.getMyDividend(employeeId, beginDate, endDate);
	}

	@Override
	public Double getGroupCommission(String groupId, Date beginDate, Date endDate) {
		return employeeCommissionHistoryDao.getGroupCommission(groupId,beginDate,endDate);
	}
}
