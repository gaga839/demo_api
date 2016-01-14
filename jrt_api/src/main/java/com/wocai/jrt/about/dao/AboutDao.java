package com.wocai.jrt.about.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.about.model.About;
import com.wocai.jrt.about.model.AboutBean;

/**
 * 表about的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-07-31 10:43:06
 */
@DaoMapper
public interface AboutDao extends BaseDao<About, AboutBean, String> {
	About getAbout(String productId);
}