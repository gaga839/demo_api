package com.wocai.jrt.product.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.product.dao.GroupProductDao;
import com.wocai.jrt.product.model.GroupProduct;
import com.wocai.jrt.product.model.GroupProductBean;
import com.wocai.jrt.product.service.spi.GroupProductService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 团队可售产品相关的service业务实现。
 * @author yinlei
 * @date 2015-12-30 14:50:25
 */
@Named
public class GroupProductServiceImpl extends MyBatisServiceImpl<GroupProduct, GroupProductBean, String> implements GroupProductService {
	// 添加了方法后，记得改为private
	protected GroupProductDao groupProductDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<GroupProduct, GroupProductBean, String> groupProductDao) {
		this.baseDao = groupProductDao;
		this.groupProductDao = (GroupProductDao) groupProductDao;
	}
}
