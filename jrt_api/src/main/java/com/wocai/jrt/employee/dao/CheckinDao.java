package com.wocai.jrt.employee.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.employee.model.Checkin;
import com.wocai.jrt.employee.model.CheckinBean;

/**
 * 表checkin的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-08-17 16:11:02
 */
@DaoMapper
public interface CheckinDao extends BaseDao<Checkin, CheckinBean, String> {
	
}