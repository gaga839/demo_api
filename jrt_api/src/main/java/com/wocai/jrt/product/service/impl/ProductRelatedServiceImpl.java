package com.wocai.jrt.product.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.product.bean.ProductResBean;
import com.wocai.jrt.product.dao.ProductRelatedDao;
import com.wocai.jrt.product.model.ProductRelated;
import com.wocai.jrt.product.model.ProductRelatedBean;
import com.wocai.jrt.product.service.spi.ProductRelatedService;

/**
 * 产品的相关产品相关的service业务实现。
 * @author yinlei
 * @date 2015-7-31 11:57:17
 */
@Named
public class ProductRelatedServiceImpl extends MyBatisServiceImpl<ProductRelated, ProductRelatedBean, String> implements ProductRelatedService {
	
	private ProductRelatedDao productRelatedDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<ProductRelated, ProductRelatedBean, String> productRelatedDao) {
		this.baseDao = productRelatedDao;
		this.productRelatedDao = (ProductRelatedDao) productRelatedDao;
	}

	@Override
	public List<ProductResBean> getProductRelatedList(ProductRelated productRelated) {
		return productRelatedDao.getProductRelatedList(productRelated);
	}
}
