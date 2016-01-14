package com.wocai.jrt.news.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.news.model.News;
import com.wocai.jrt.news.model.NewsBean;

/**
 * 表news的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-07-27 11:41:14
 */
@DaoMapper
public interface NewsDao extends BaseDao<News, NewsBean, String> {
}