package com.wocai.jrt.product.service.spi;

import com.wocai.jrt.product.model.ProductNet;
import com.wocai.jrt.product.model.ProductNetBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 产品净值相关的业务service接口。
 * @author yinlei
 * @date 2015-7-31 11:57:17
 */
public interface ProductNetService extends MyBatisService<ProductNet, ProductNetBean, String> {

}
