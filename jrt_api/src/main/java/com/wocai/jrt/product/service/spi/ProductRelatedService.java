package com.wocai.jrt.product.service.spi;

import java.util.List;

import com.vteba.service.generic.MyBatisService;
import com.wocai.jrt.product.bean.ProductResBean;
import com.wocai.jrt.product.model.ProductRelated;
import com.wocai.jrt.product.model.ProductRelatedBean;

/**
 * 产品的相关产品相关的业务service接口。
 * @author yinlei
 * @date 2015-7-31 11:57:17
 */
public interface ProductRelatedService extends MyBatisService<ProductRelated, ProductRelatedBean, String> {
	List<ProductResBean> getProductRelatedList(ProductRelated productRelated);
}
