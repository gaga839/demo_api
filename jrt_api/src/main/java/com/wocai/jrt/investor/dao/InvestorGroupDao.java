package com.wocai.jrt.investor.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.investor.model.InvestorGroup;
import com.wocai.jrt.investor.model.InvestorGroupBean;

/**
 * 表investor_group的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-07-24 17:10:45
 */
@DaoMapper
public interface InvestorGroupDao extends BaseDao<InvestorGroup, InvestorGroupBean, String> {
	 /**
     *  查询团队长下所有下级员工的客户信息
     * @param InvestorReqBean
     * @return List<InvestorResBean>
     */
	public InvestorGroup getByEmployeeId(String id);
}
