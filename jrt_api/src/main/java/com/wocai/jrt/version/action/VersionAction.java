package com.wocai.jrt.version.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.version.model.Version;
import com.wocai.jrt.version.model.VersionBean;
import com.wocai.jrt.version.service.spi.VersionService;
import com.alibaba.fastjson.JSON;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.StringEditor;

/**
 * 版本控制器
 * 
 * @author yinlei
 * @date 2015-7-28 14:06:14
 */
@Controller
@RequestMapping("/version")
public class VersionAction extends GenericAction<Version> {
	private static final Logger LOGGER = LoggerFactory.getLogger(VersionAction.class);
	@Inject
	private VersionService versionServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd"), true));
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 返回最新版本信息
	 * 
	 * @param 无
	 * @return model
	 */
	@ResponseBody
	@RequestMapping("/getNewest")
	public JsonBean getNewest(String productSerial, String versionNumber) {
		JsonBean json = new JsonBean();

		// 验证参数
		if (StringUtils.isAnyBlank(productSerial, versionNumber)) {
			LOGGER.info("params is null");
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}

		// 获取最新版本
		try {
			LOGGER.info("request about list param=[{}]", JSON.toJSONString(versionNumber));
			Version versionNewest = null;
			Map<String, Object> map = new HashMap<String, Object>();
			VersionBean versionBean = new VersionBean();
			Date date = new Date();
			versionBean.setOrderBy("update_time desc");
			versionBean.createCriteria().andProductSerialEqualTo(productSerial)
					.andUpdateTimeLessThanOrEqualTo(date);
			try {
				versionNewest = versionServiceImpl.pagedForList(versionBean).get(0);
			} catch (Exception e) {
				json.setCode(0);
				json.setMessage("找不到该产品对应版本信息，如有疑问，请联系管理员！");
				return json;
			}
			if(versionNewest == null){
				json.setCode(0);
				json.setMessage("找不到该产品对应版本信息，如有疑问，请联系管理员！");
				return json;
			}
			LOGGER.info("request about list param=[{}]", JSON.toJSONString(versionNewest));
			// 判断当前版本是否为最近版本
			// 封装json
			if (1 == versionCompareTo(versionNumber, versionNewest.getVersionNumber())) {
				json.setCode(0);
				json.setMessage("已是最新版本，如有疑问，请联系管理员！");
				return json;
			}
			if (true == versionNewest.getTips()) {
				map.put("update", true);
			} else {
				map.put("update", false);
			}
			if (-1 == versionCompareTo(versionNumber, versionNewest.getUpdateLowestVersion())) {
				map.put("forceUpdate", true);
			} else {
				map.put("forceUpdate", false);
			}
			map.put("detail", versionNewest);
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(map);
		} catch (Exception e) {
			LOGGER.error("fetch versionNewest error, error=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("fetch versionNewest error");
		}
		return json;

	}

	private int versionCompareTo(String v1, String v2) {
		String[] a1 = v1.split("\\.");
		String[] a2 = v2.split("\\.");
		int minLength = a1.length >= a2.length ? a2.length : a1.length;
		for (int i = 0; i < minLength;i++) {
			if (1 == Integer.compare(Integer.parseInt(a1[i]), Integer.parseInt(a2[i]))) {
				return 1;
			} else if(-1 == Integer.compare(Integer.parseInt(a1[i]), Integer.parseInt(a2[i]))){
				return -1;
			}
		}
		if (a1.length >= a2.length) {
			return 1;
		} else {
			return -1;
		}
	}
}