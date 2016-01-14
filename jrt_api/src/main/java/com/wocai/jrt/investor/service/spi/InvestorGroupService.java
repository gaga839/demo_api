package com.wocai.jrt.investor.service.spi;

import com.wocai.jrt.investor.model.InvestorGroup;
import com.wocai.jrt.investor.model.InvestorGroupBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 投资人分组相关的业务service接口。
 * @author yinlei
 * @date 2015-7-24 17:10:45
 */
public interface InvestorGroupService extends MyBatisService<InvestorGroup, InvestorGroupBean, String> {
	/**
     *  根据员工id获取团队model
     * @param id
     * @return InvestorGroup
     */
	public InvestorGroup getByEmployeeId(String id);
}
