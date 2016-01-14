package com.wocai.jrt.product.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.product.dao.ProductGradeDao;
import com.wocai.jrt.product.model.ProductGrade;
import com.wocai.jrt.product.model.ProductGradeBean;
import com.wocai.jrt.product.service.spi.ProductGradeService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 产品评级相关的service业务实现。
 * @author yinlei
 * @date 2015-12-1 13:10:15
 */
@Named
public class ProductGradeServiceImpl extends MyBatisServiceImpl<ProductGrade, ProductGradeBean, String> implements ProductGradeService {
	// 添加了方法后，记得改为private
	protected ProductGradeDao productGradeDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<ProductGrade, ProductGradeBean, String> productGradeDao) {
		this.baseDao = productGradeDao;
		this.productGradeDao = (ProductGradeDao) productGradeDao;
	}
}
