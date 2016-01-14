package com.wocai.jrt.news.service.spi;

import com.wocai.jrt.news.model.News;
import com.wocai.jrt.news.model.NewsBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 新闻相关的业务service接口。
 * @author yinlei
 * @date 2015-7-27 11:41:13
 */
public interface NewsService extends MyBatisService<News, NewsBean, String> {

}
