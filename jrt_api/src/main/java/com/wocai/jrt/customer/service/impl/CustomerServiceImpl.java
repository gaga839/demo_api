package com.wocai.jrt.customer.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.customer.dao.CustomerDao;
import com.wocai.jrt.customer.model.Customer;
import com.wocai.jrt.customer.model.CustomerBean;
import com.wocai.jrt.customer.service.spi.CustomerService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 投后用户相关的service业务实现。
 * @author yinlei
 * @date 2015-11-24 9:56:20
 */
@Named
public class CustomerServiceImpl extends MyBatisServiceImpl<Customer, CustomerBean, String> implements CustomerService {
	// 添加了方法后，记得改为private
	protected CustomerDao customerDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Customer, CustomerBean, String> customerDao) {
		this.baseDao = customerDao;
		this.customerDao = (CustomerDao) customerDao;
	}
}
