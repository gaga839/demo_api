package com.wocai.jrt.paper.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.paper.model.Paper;
import com.wocai.jrt.paper.model.PaperBean;

/**
 * 表paper的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-11-09 16:40:04
 */
@DaoMapper
public interface PaperDao extends BaseDao<Paper, PaperBean, String> {
}