package com.wocai.jrt.employee.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.employee.model.Track;
import com.wocai.jrt.employee.model.TrackBean;

/**
 * 表track的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-07-27 10:31:04
 */
@DaoMapper
public interface TrackDao extends BaseDao<Track, TrackBean, String> {
}