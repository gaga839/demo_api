package com.wocai.jrt.device.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.device.model.Pos;
import com.wocai.jrt.device.model.PosBean;

/**
 * 表pos的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-09-08 14:13:55
 */
@DaoMapper
public interface PosDao extends BaseDao<Pos, PosBean, String> {
}