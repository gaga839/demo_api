package com.wocai.jrt.news.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.news.dao.NewsDao;
import com.wocai.jrt.news.model.News;
import com.wocai.jrt.news.model.NewsBean;
import com.wocai.jrt.news.service.spi.NewsService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 新闻相关的service业务实现。
 * @author yinlei
 * @date 2015-7-27 11:41:13
 */
@Named
public class NewsServiceImpl extends MyBatisServiceImpl<News, NewsBean, String> implements NewsService {
	
	private NewsDao newsDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<News, NewsBean, String> newsDao) {
		this.baseDao = newsDao;
		this.newsDao = (NewsDao) newsDao;
	}
}
