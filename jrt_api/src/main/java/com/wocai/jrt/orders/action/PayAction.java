package com.wocai.jrt.orders.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.orders.model.PaySerial;
import com.wocai.jrt.orders.service.spi.PaySerialService;

/**
 * 支付回调控制器
 * 
 * @author linbaolu
 * @date 2015-7-27 19:26:12
 */
@Controller
@RequestMapping("/pay")
public class PayAction extends GenericAction<PaySerial> {
	private static final Logger LOGGER = LoggerFactory.getLogger(PayAction.class);

	@Inject
	private PaySerialService paySerialServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss"), true));
		binder.registerCustomEditor(int.class, new IntEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 执行实际的新增操作
	 * 
	 * @param model
	 *            要新增的数据
	 * @return 新增页面逻辑视图
	 */
	@ResponseBody
	@RequestMapping("/callback")
	public JsonBean callback(PaySerial paySerial, String tokenId) {
		JsonBean jsonBean = null;

		try {
			// 发起请求的参数,以后直接用AOP代替
			LOGGER.info("request payCallback, param=[{}]", JSON.toJSONString(paySerial));

			jsonBean = paySerialServiceImpl.callback(paySerial, tokenId);

			LOGGER.info("request payCallback, jsonBean=[{}]", JSON.toJSONString(jsonBean));
			
			if (jsonBean.getCode() == 1) {
				jsonBean.setMessage("回调成功！");
				LOGGER.info("request payCallback success");
			}

		} catch (Exception e) {
			jsonBean.setCode(0);
			jsonBean.setMessage("回调失败！");
			LOGGER.error("request payCallback error,msg = [{}]", e.getMessage());
		}

		return jsonBean;
	}

}
