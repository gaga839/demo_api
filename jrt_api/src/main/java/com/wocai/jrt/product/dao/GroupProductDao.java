package com.wocai.jrt.product.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.product.model.GroupProduct;
import com.wocai.jrt.product.model.GroupProductBean;

/**
 * 表group_product的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-12-30 14:50:26
 */
@DaoMapper
public interface GroupProductDao extends BaseDao<GroupProduct, GroupProductBean, String> {
}