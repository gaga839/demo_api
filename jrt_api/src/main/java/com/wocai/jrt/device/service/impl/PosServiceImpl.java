package com.wocai.jrt.device.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.device.dao.PosDao;
import com.wocai.jrt.device.model.Pos;
import com.wocai.jrt.device.model.PosBean;
import com.wocai.jrt.device.service.spi.PosService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * POS机相关的service业务实现。
 * @author yinlei
 * @date 2015-9-8 14:13:55
 */
@Named
public class PosServiceImpl extends MyBatisServiceImpl<Pos, PosBean, String> implements PosService {
	// 添加了方法后，记得改为private
	protected PosDao posDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Pos, PosBean, String> posDao) {
		this.baseDao = posDao;
		this.posDao = (PosDao) posDao;
	}
}
