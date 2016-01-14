package com.wocai.jrt.about.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

import com.wocai.jrt.about.model.About;
import com.wocai.jrt.about.model.AboutBean;
import com.wocai.jrt.about.service.spi.AboutService;
import com.alibaba.fastjson.JSON;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.StringEditor;

/**
 * 关于我们控制器
 * @author yinlei
 * @date 2015-7-31 10:43:06
 */
@Controller
@RequestMapping("/about")
public class AboutAction extends GenericAction<About> {
	private static final Logger LOGGER = LoggerFactory.getLogger(AboutAction.class);
	@Inject
	private AboutService aboutServiceImpl;
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd"), true));
		binder.registerCustomEditor(String.class, new StringEditor());
	}
	
	/**
	 * 获得关于我们List，Json格式。
	 * @param model 参数
	 * @return 关于我们List
	 */
	@ResponseBody
	@RequestMapping("/getAboutList")
	public JsonBean getAboutList(String orgId) {
		JsonBean json = new JsonBean();
		if (StringUtils.isBlank(orgId)) {
			json.setCode(0);
			json.setMessage("参数不能为空");
			return json;
		}
		try {
			//发送请求的参数 
			LOGGER.info("request about list param=[{}]", JSON.toJSONString(orgId));
			
			//查询数据库
			AboutBean about = new AboutBean();
			about.createCriteria().andOrgIdEqualTo(orgId);
			about.setOrderBy("orders desc");
			about.setPageSize(10);
			about.setPage(0);
			List<About> List = aboutServiceImpl.pagedForList(about);
			
			//封装Json
			json.setCode(1);
			json.setMessage(SUCCESS);
			json.setData(List);
			return json;
		} catch (Exception e) {
			LOGGER.error("request about list error.msg=[{}]", e.getMessage());
			json.setCode(0);
			json.setMessage("获取关于我们信息失败");
			return json;
		}
	}
}
