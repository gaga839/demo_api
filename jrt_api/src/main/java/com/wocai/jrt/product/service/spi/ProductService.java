package com.wocai.jrt.product.service.spi;

import java.util.List;

import com.vteba.service.generic.MyBatisService;
import com.wocai.jrt.product.bean.ProductReqBean;
import com.wocai.jrt.product.bean.ProductResBean;
import com.wocai.jrt.product.model.Product;
import com.wocai.jrt.product.model.ProductBean;

/**
 * 产品相关的业务service接口。
 * @author yinlei
 * @date 2015-8-10 15:51:44
 */
public interface ProductService extends MyBatisService<Product, ProductBean, String> {
	List<ProductResBean> getProductList(ProductReqBean productReqBean);
	Product getDetail(ProductReqBean productReqBean);
	boolean isSaleAll(ProductReqBean productReqBean);
	List<ProductResBean> getAllProducts(ProductReqBean productReqBean);
}
