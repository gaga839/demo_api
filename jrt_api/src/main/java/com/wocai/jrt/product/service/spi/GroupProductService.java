package com.wocai.jrt.product.service.spi;

import com.wocai.jrt.product.model.GroupProduct;
import com.wocai.jrt.product.model.GroupProductBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 团队可售产品相关的业务service接口。
 * @author yinlei
 * @date 2015-12-30 14:50:25
 */
public interface GroupProductService extends MyBatisService<GroupProduct, GroupProductBean, String> {

}
