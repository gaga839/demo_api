package com.wocai.jrt.investor.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.investor.dao.InvestorGroupDao;
import com.wocai.jrt.investor.model.InvestorGroup;
import com.wocai.jrt.investor.model.InvestorGroupBean;
import com.wocai.jrt.investor.service.spi.InvestorGroupService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 投资人分组相关的service业务实现。
 * @author yinlei
 * @date 2015-7-24 17:10:45
 */
@Named
public class InvestorGroupServiceImpl extends MyBatisServiceImpl<InvestorGroup, InvestorGroupBean, String> implements InvestorGroupService {
	
	private InvestorGroupDao investorGroupDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<InvestorGroup, InvestorGroupBean, String> investorGroupDao) {
		this.baseDao = investorGroupDao;
		this.investorGroupDao = (InvestorGroupDao) investorGroupDao;
	}
	
	/**
     *  根据员工id获取团队model
     * @param id
     * @return InvestorGroup
     */
	@Override
	public InvestorGroup getByEmployeeId(String id) {
		InvestorGroup investorGroup = investorGroupDao.getByEmployeeId(id);
		return investorGroup;
	}
}
