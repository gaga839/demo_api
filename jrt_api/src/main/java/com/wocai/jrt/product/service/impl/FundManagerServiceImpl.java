package com.wocai.jrt.product.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.product.dao.FundManagerDao;
import com.wocai.jrt.product.model.FundManager;
import com.wocai.jrt.product.model.FundManagerBean;
import com.wocai.jrt.product.service.spi.FundManagerService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 基金经理相关的service业务实现。
 * @author yinlei
 * @date 2015-12-1 11:25:30
 */
@Named
public class FundManagerServiceImpl extends MyBatisServiceImpl<FundManager, FundManagerBean, String> implements FundManagerService {
	// 添加了方法后，记得改为private
	protected FundManagerDao fundManagerDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<FundManager, FundManagerBean, String> fundManagerDao) {
		this.baseDao = fundManagerDao;
		this.fundManagerDao = (FundManagerDao) fundManagerDao;
	}

	@Override
	public List<FundManager> getFunManager(String productId) {
		return fundManagerDao.getFunManager(productId);
	}
}
