package com.wocai.jrt.device.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.device.dao.IpadDao;
import com.wocai.jrt.device.model.Ipad;
import com.wocai.jrt.device.model.IpadBean;
import com.wocai.jrt.device.service.spi.IpadService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * PAD机相关的service业务实现。
 * @author yinlei
 * @date 2015-9-8 14:13:55
 */
@Named
public class IpadServiceImpl extends MyBatisServiceImpl<Ipad, IpadBean, String> implements IpadService {
	// 添加了方法后，记得改为private
	protected IpadDao ipadDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Ipad, IpadBean, String> ipadDao) {
		this.baseDao = ipadDao;
		this.ipadDao = (IpadDao) ipadDao;
	}
}
