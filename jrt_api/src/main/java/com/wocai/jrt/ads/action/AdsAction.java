package com.wocai.jrt.ads.action;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.wocai.jrt.ads.model.Ads;
import com.wocai.jrt.ads.model.AdsBean;
import com.wocai.jrt.ads.service.spi.AdsService;

/**
 * 广告控制器
 * 
 * @author yinlei
 * @date 2015-8-17 11:46:31
 */
@Controller
@RequestMapping("/ads")
public class AdsAction extends GenericAction<Ads> {
	private static final Logger LOGGER = LoggerFactory.getLogger(AdsAction.class);
	@Inject
	private AdsService adsServiceImpl;

	@ResponseBody
	@RequestMapping("/getAdsList")
	public JsonBean getAdsList(String orgId) {
		JsonBean json = new JsonBean();
		if (StringUtils.isBlank(orgId)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		try {
			LOGGER.info("request ads getAdsList param=[{}]", JSON.toJSONString(orgId));
			AdsBean adsBean = new AdsBean();
			adsBean.setPageSize(5);
			adsBean.setStart(0);
			adsBean.setOrderBy("orders desc");
			List<Integer> values = new ArrayList<Integer>();
			values.add(1);
			values.add(3);
			adsBean.createCriteria().andOrgIdEqualTo(orgId).andPlatformIn(values).andStateEqualTo(true);
			List<Ads> adsList = adsServiceImpl.queryForList(adsBean);
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(adsList);
			return json;
		} catch (Exception e) {
			LOGGER.error("request ads getAdsList error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("获取广告失败");
			return json;
		}
	}
}
