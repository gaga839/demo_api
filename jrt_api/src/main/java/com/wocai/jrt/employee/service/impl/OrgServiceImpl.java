package com.wocai.jrt.employee.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.employee.dao.OrgDao;
import com.wocai.jrt.employee.model.Org;
import com.wocai.jrt.employee.model.OrgBean;
import com.wocai.jrt.employee.service.spi.OrgService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 机构相关的service业务实现。
 * @author yinlei
 * @date 2015-9-8 10:18:19
 */
@Named
public class OrgServiceImpl extends MyBatisServiceImpl<Org, OrgBean, String> implements OrgService {
	// 添加了方法后，记得改为private
	protected OrgDao orgDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Org, OrgBean, String> orgDao) {
		this.baseDao = orgDao;
		this.orgDao = (OrgDao) orgDao;
	}
}
