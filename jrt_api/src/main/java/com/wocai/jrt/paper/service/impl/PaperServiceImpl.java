package com.wocai.jrt.paper.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.paper.dao.PaperDao;
import com.wocai.jrt.paper.model.Paper;
import com.wocai.jrt.paper.model.PaperBean;
import com.wocai.jrt.paper.service.spi.PaperService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 测评试卷相关的service业务实现。
 * @author yinlei
 * @date 2015-11-9 16:40:03
 */
@Named
public class PaperServiceImpl extends MyBatisServiceImpl<Paper, PaperBean, String> implements PaperService {
	// 添加了方法后，记得改为private
	protected PaperDao paperDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Paper, PaperBean, String> paperDao) {
		this.baseDao = paperDao;
		this.paperDao = (PaperDao) paperDao;
	}
}
