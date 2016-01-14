package com.wocai.jrt.employee.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.employee.model.Org;
import com.wocai.jrt.employee.model.OrgBean;

/**
 * 表org的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-09-08 10:18:20
 */
@DaoMapper
public interface OrgDao extends BaseDao<Org, OrgBean, String> {
}