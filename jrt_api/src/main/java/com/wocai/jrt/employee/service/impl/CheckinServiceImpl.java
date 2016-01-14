package com.wocai.jrt.employee.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.employee.dao.CheckinDao;
import com.wocai.jrt.employee.model.Checkin;
import com.wocai.jrt.employee.model.CheckinBean;
import com.wocai.jrt.employee.service.spi.CheckinService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 签到相关的service业务实现。
 * @author yinlei
 * @date 2015-8-17 16:11:01
 */
@Named
public class CheckinServiceImpl extends MyBatisServiceImpl<Checkin, CheckinBean, String> implements CheckinService {
	// 添加了方法后，记得改为private
	protected CheckinDao checkinDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Checkin, CheckinBean, String> checkinDao) {
		this.baseDao = checkinDao;
		this.checkinDao = (CheckinDao) checkinDao;
	}
}
