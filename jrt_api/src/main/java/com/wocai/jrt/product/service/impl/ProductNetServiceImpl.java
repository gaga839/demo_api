package com.wocai.jrt.product.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.product.dao.ProductNetDao;
import com.wocai.jrt.product.model.ProductNet;
import com.wocai.jrt.product.model.ProductNetBean;
import com.wocai.jrt.product.service.spi.ProductNetService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 产品净值相关的service业务实现。
 * @author yinlei
 * @date 2015-7-31 11:57:17
 */
@Named
public class ProductNetServiceImpl extends MyBatisServiceImpl<ProductNet, ProductNetBean, String> implements ProductNetService {
	
	private ProductNetDao productNetDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<ProductNet, ProductNetBean, String> productNetDao) {
		this.baseDao = productNetDao;
		this.productNetDao = (ProductNetDao) productNetDao;
	}
}
