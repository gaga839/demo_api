package com.wocai.jrt.product.dao;

import java.util.List;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.product.model.FundManager;
import com.wocai.jrt.product.model.FundManagerBean;

/**
 * 表fund_manager的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-12-01 11:25:30
 */
@DaoMapper
public interface FundManagerDao extends BaseDao<FundManager, FundManagerBean, String> {
	List<FundManager> getFunManager(String productId);
}