package com.wocai.jrt.product.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.product.model.ProductGrade;
import com.wocai.jrt.product.model.ProductGradeBean;

/**
 * 表product_grade的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-12-01 13:10:16
 */
@DaoMapper
public interface ProductGradeDao extends BaseDao<ProductGrade, ProductGradeBean, String> {
}