package com.wocai.jrt.device.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.device.dao.PosPadDao;
import com.wocai.jrt.device.model.PosPad;
import com.wocai.jrt.device.model.PosPadBean;
import com.wocai.jrt.device.service.spi.PosPadService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 设备相关的service业务实现。
 * @author yinlei
 * @date 2015-9-8 14:13:54
 */
@Named
public class PosPadServiceImpl extends MyBatisServiceImpl<PosPad, PosPadBean, String> implements PosPadService {
	// 添加了方法后，记得改为private
	protected PosPadDao posPadDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<PosPad, PosPadBean, String> posPadDao) {
		this.baseDao = posPadDao;
		this.posPadDao = (PosPadDao) posPadDao;
	}
}
