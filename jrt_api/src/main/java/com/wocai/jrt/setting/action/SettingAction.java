package com.wocai.jrt.setting.action;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.wocai.jrt.product.action.ProductAchieveAction;
import com.wocai.jrt.setting.model.Setting;
import com.wocai.jrt.setting.service.spi.SettingService;

/**
 * 系统设置控制器
 * 
 * @author yinlei
 * @date 2015-12-8 10:11:46
 */
@Controller
@RequestMapping("/setting")
public class SettingAction extends GenericAction<Setting> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductAchieveAction.class);

	@Inject
	private SettingService settingServiceImpl;

	/**
	 * 获取设置项
	 * 
	 * @param model
	 *            要新增的数据
	 * @return 新增页面逻辑视图
	 */
	@ResponseBody
	@RequestMapping("/get")
	public JsonBean get(String keyName, String orgId) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isAnyBlank(keyName, orgId)) {
			bean.setCode(0);
			bean.setMessage("参数不完整！");
			return bean;
		}
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			// 先找机构单独设置
			Setting setting = new Setting();
			setting.setKeyName(keyName);
			setting.setFlag(false);
			setting.setOrgId(orgId);
			Setting getSetting = settingServiceImpl.unique(setting);
			if (null == getSetting) {
				// 单独设置没有，再找全局设置
				setting = new Setting();
				setting.setFlag(true);
				setting.setKeyName(keyName);
				getSetting = settingServiceImpl.unique(setting);
				if (null == getSetting) {
					bean.setCode(0);
					bean.setData(null);
					bean.setMessage("键值不存在！");
				} else {
					bean.setCode(1);
					map.put("keyValue", getSetting.getKeyValue());
					bean.setData(map);
					bean.setMessage(SUCCESS);
				}
			} else {
				bean.setCode(1);
				map.put("keyValue", getSetting.getKeyValue());
				bean.setData(map);
				bean.setMessage(SUCCESS);
			}
		} catch (Exception e) {
			LOGGER.error("get record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage(ERROR);
		}
		return bean;
	}
	
	/**
	 * 获取设置项
	 * 
	 * @param model
	 *            要新增的数据
	 * @return 新增页面逻辑视图
	 */
	@ResponseBody
	@RequestMapping("/getList")
	public JsonBean getList(String orgId,String keyNames) {
		JsonBean bean = new JsonBean();
		if (StringUtils.isAnyBlank(orgId,keyNames)) {
			bean.setCode(0);
			bean.setMessage("参数不完整！");
			return bean;
		}
		try {
			Map<String, String> map = new HashMap<String, String>();
			String[] keyName = keyNames.split(",");
			for (String key : keyName) {
				String keyValue = null;
				// 先找机构单独设置
				Setting setting = new Setting();
				setting.setKeyName(key);
				setting.setFlag(false);
				setting.setOrgId(orgId);
				Setting getSetting = settingServiceImpl.unique(setting);
				if (null == getSetting) {
					// 单独设置没有，再找全局设置
					setting = new Setting();
					setting.setFlag(true);
					setting.setKeyName(key);
					getSetting = settingServiceImpl.unique(setting);
					if (null != getSetting) {
						keyValue = getSetting.getKeyValue();
					}
				} else {
					keyValue = getSetting.getKeyValue();
				}
				map.put(key, keyValue);
			}
			bean.setCode(1);
			bean.setMessage(SUCCESS);
			bean.setData(map);
		} catch (Exception e) {
			LOGGER.error("get record error, errorMsg=[{}].", e.getMessage());
			bean.setCode(0);
			bean.setMessage(ERROR);
		}
		return bean;
	}
}
