package com.wocai.jrt.news.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.model.NewsParameter;
import com.wocai.jrt.news.model.News;
import com.wocai.jrt.news.service.spi.NewsService;
import com.alibaba.fastjson.JSON;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 新闻控制器
 * 
 * @author yinlei
 * @date 2015-7-27 11:41:13
 */
@Controller
@RequestMapping("/news")
public class NewsAction extends GenericAction<News> {
	private static final Logger LOGGER = LoggerFactory.getLogger(NewsAction.class);
	@Inject
	private NewsService newsServiceImpl;

	@ResponseBody
	@RequestMapping("/getNewsList")
	public JsonBean getNewsList(NewsParameter newsParameter) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyEmpty(newsParameter.getOrgId(), newsParameter.getPage() + "",
				newsParameter.getPageSize() + "")) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}
		try {
			LOGGER.info("request news getNewsList param=[{}]", JSON.toJSONString(newsParameter));
			News news = new News();
			news.setOrgId(newsParameter.getOrgId());
			news.setState(1);
			news.setStart(newsParameter.getPage()*newsParameter.getPageSize());
			news.setPageSize(newsParameter.getPageSize());
			news.setOrderBy("orders desc");
			List<News> newsList = newsServiceImpl.queryList(news);
			List<Map<String, Object>> resultMap = new ArrayList<Map<String, Object>>();
			for (News newsTemp : newsList) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("id", newsTemp.getId());
				map.put("title", newsTemp.getTitle());
				map.put("info", newsTemp.getInfo());
				map.put("source", newsTemp.getSource());
				map.put("thumbnail", newsTemp.getThumbnail());
				map.put("createTime", newsTemp.getCreateTime());
				map.put("type", newsTemp.getType());
				resultMap.add(map);
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(resultMap);
			return json;
		} catch (Exception e) {
			LOGGER.error("request news getNewsList error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("获取新闻失败");
			return json;
		}
	}

	@ResponseBody
	@RequestMapping("/getThisNews")
	public JsonBean getThisNews(String newsId) {
		JsonBean json = new JsonBean();
		if (StringUtils.isAnyEmpty(newsId)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}
		try {
			LOGGER.info("request news getThisNews param=[{}]", JSON.toJSONString(newsId));
			News news = newsServiceImpl.get(newsId);
			if (null == news) {
				json.setCode(0);
				json.setMessage("没有这条新闻");
				return json;
			}
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(news);
			return json;
		} catch (Exception e) {
			LOGGER.error("request news getThisNews error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("获取新闻详情失败");
			return json;
		}
	}
}
