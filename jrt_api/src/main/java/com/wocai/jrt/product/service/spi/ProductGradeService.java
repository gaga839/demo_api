package com.wocai.jrt.product.service.spi;

import com.wocai.jrt.product.model.ProductGrade;
import com.wocai.jrt.product.model.ProductGradeBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 产品评级相关的业务service接口。
 * @author yinlei
 * @date 2015-12-1 13:10:15
 */
public interface ProductGradeService extends MyBatisService<ProductGrade, ProductGradeBean, String> {

}
