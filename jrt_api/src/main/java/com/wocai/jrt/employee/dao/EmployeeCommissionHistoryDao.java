package com.wocai.jrt.employee.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.employee.model.EmployeeCommissionHistory;
import com.wocai.jrt.employee.model.EmployeeCommissionHistoryBean;

/**
 * 表employee_commission_history的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * 
 * @date 2015-07-24 11:23:26
 */
@DaoMapper
public interface EmployeeCommissionHistoryDao extends
		BaseDao<EmployeeCommissionHistory, EmployeeCommissionHistoryBean, String> {
	Double getMyCommission(@Param("employeeId") String employeeId,
			@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

	Double getMyDividend(@Param("employeeId") String employeeId,
			@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

	Double getGroupCommission(@Param("groupId") String groupId,
			@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);
}