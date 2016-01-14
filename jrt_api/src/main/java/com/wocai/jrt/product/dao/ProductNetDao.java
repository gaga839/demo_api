package com.wocai.jrt.product.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.product.model.ProductNet;
import com.wocai.jrt.product.model.ProductNetBean;

/**
 * 表product_net的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-08-07 17:24:44
 */
@DaoMapper
public interface ProductNetDao extends BaseDao<ProductNet, ProductNetBean, String> {
}