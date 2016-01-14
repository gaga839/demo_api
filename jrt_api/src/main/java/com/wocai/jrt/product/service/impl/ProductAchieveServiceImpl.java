package com.wocai.jrt.product.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.product.dao.ProductAchieveDao;
import com.wocai.jrt.product.model.ProductAchieve;
import com.wocai.jrt.product.model.ProductAchieveBean;
import com.wocai.jrt.product.service.spi.ProductAchieveService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 产品业绩相关的service业务实现。
 * @author yinlei
 * @date 2015-7-31 11:57:17
 */
@Named
public class ProductAchieveServiceImpl extends MyBatisServiceImpl<ProductAchieve, ProductAchieveBean, String> implements ProductAchieveService {
	
	private ProductAchieveDao productAchieveDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<ProductAchieve, ProductAchieveBean, String> productAchieveDao) {
		this.baseDao = productAchieveDao;
		this.productAchieveDao = (ProductAchieveDao) productAchieveDao;
	}
}
