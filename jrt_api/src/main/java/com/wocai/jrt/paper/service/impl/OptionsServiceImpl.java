package com.wocai.jrt.paper.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.paper.dao.OptionsDao;
import com.wocai.jrt.paper.model.Options;
import com.wocai.jrt.paper.model.OptionsBean;
import com.wocai.jrt.paper.service.spi.OptionsService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 题目选项相关的service业务实现。
 * @author yinlei
 * @date 2015-11-9 16:40:03
 */
@Named
public class OptionsServiceImpl extends MyBatisServiceImpl<Options, OptionsBean, String> implements OptionsService {
	// 添加了方法后，记得改为private
	protected OptionsDao optionsDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Options, OptionsBean, String> optionsDao) {
		this.baseDao = optionsDao;
		this.optionsDao = (OptionsDao) optionsDao;
	}
}
