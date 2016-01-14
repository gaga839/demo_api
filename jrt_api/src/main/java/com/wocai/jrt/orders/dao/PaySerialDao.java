package com.wocai.jrt.orders.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.orders.bean.EmployeeGroupAmountBean;
import com.wocai.jrt.orders.model.PaySerial;
import com.wocai.jrt.orders.model.PaySerialBean;

/**
 * 表pay_serial的MyBatis Dao Mapper。 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * 
 * @date 2015-07-27 19:32:13
 */
@DaoMapper
public interface PaySerialDao extends BaseDao<PaySerial, PaySerialBean, String> {
	int getOrdersNumber(@Param("employeeId") String employeeId, @Param("beginDate") Date beginDate,
			@Param("endDate") Date endDate);

	Double getOrdersAmount(@Param("employeeId") String employeeId,
			@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

	Double getOrdersMost(@Param("employeeId") String employeeId,
			@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);

	List<EmployeeGroupAmountBean> queryEmployeeGroupAmountList(
			@Param("employeeId") String employeeId, @Param("beginDate") Date beginDate,
			@Param("endDate") Date endDate);

}