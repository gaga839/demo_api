package com.wocai.jrt.product.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.product.model.ProductAchieve;
import com.wocai.jrt.product.model.ProductAchieveBean;

/**
 * 表product_achieve的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-08-07 17:24:44
 */
@DaoMapper
public interface ProductAchieveDao extends BaseDao<ProductAchieve, ProductAchieveBean, String> {
}