package com.wocai.jrt.customer.service.spi;

import com.wocai.jrt.customer.model.Customer;
import com.wocai.jrt.customer.model.CustomerBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 投后用户相关的业务service接口。
 * @author yinlei
 * @date 2015-11-24 9:56:20
 */
public interface CustomerService extends MyBatisService<Customer, CustomerBean, String> {

}
