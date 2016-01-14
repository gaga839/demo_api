package com.wocai.jrt.customer.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.customer.model.Customer;
import com.wocai.jrt.customer.model.CustomerBean;

/**
 * 表customer的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-24 09:56:21
 */
@DaoMapper
public interface CustomerDao extends BaseDao<Customer, CustomerBean, String> {
}