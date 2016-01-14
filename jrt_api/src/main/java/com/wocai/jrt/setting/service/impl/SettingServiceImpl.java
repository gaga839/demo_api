package com.wocai.jrt.setting.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.setting.dao.SettingDao;
import com.wocai.jrt.setting.model.Setting;
import com.wocai.jrt.setting.model.SettingBean;
import com.wocai.jrt.setting.service.spi.SettingService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 系统设置相关的service业务实现。
 * @author yinlei
 * @date 2015-12-8 10:50:07
 */
@Named
public class SettingServiceImpl extends MyBatisServiceImpl<Setting, SettingBean, String> implements SettingService {
	// 添加了方法后，记得改为private
	protected SettingDao settingDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Setting, SettingBean, String> settingDao) {
		this.baseDao = settingDao;
		this.settingDao = (SettingDao) settingDao;
	}
}
