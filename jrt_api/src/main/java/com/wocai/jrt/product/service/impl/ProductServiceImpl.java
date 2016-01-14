package com.wocai.jrt.product.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.product.bean.ProductReqBean;
import com.wocai.jrt.product.bean.ProductResBean;
import com.wocai.jrt.product.dao.ProductDao;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.model.ProductBean;
import com.wocai.jrt.product.service.spi.ProductService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 产品相关的service业务实现。
 * @author yinlei
 * @date 2015-8-10 15:51:44
 */
@Named
public class ProductServiceImpl extends MyBatisServiceImpl<Product, ProductBean, String> implements ProductService {
	
	private ProductDao productDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Product, ProductBean, String> productDao) {
		this.baseDao = productDao;
		this.productDao = (ProductDao) productDao;
	}

	@Override
	public List<ProductResBean> getProductList(ProductReqBean productReqBean) {
		return productDao.getProductList(productReqBean);
	}

	@Override
	public Product getDetail(ProductReqBean productReqBean) {
		return productDao.getDetail(productReqBean);
	}

	@Override
	public boolean isSaleAll(ProductReqBean productReqBean) {
		return productDao.isSaleAll(productReqBean);
	}

	@Override
	public List<ProductResBean> getAllProducts(ProductReqBean productReqBean) {
		return productDao.getAllProducts(productReqBean);
	}
}
