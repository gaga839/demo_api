package com.wocai.jrt.product.dao;

import java.util.List;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.product.bean.ProductReqBean;
import com.wocai.jrt.product.bean.ProductResBean;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.model.ProductBean;

/**
 * 表product的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-08-10 15:51:45
 */
@DaoMapper
public interface ProductDao extends BaseDao<Product, ProductBean, String> {
	List<ProductResBean> getProductList(ProductReqBean productReqBean);
	Product getDetail(ProductReqBean productReqBean);
	boolean isSaleAll(ProductReqBean productReqBean);
	List<ProductResBean> getAllProducts(ProductReqBean productReqBean);
}