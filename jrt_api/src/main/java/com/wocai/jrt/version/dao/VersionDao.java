package com.wocai.jrt.version.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.version.model.Version;
import com.wocai.jrt.version.model.VersionBean;

/**
 * 表version的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-07-28 14:06:16
 */
@DaoMapper
public interface VersionDao extends BaseDao<Version, VersionBean, String> {
}