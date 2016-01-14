package com.wocai.jrt.setup.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.StringEditor;
import com.wocai.jrt.setup.bean.FeedbackResBean;
import com.wocai.jrt.setup.model.Feedback;
import com.wocai.jrt.setup.model.FeedbackReply;
import com.wocai.jrt.setup.service.spi.FeedbackReplyService;
import com.wocai.jrt.setup.service.spi.FeedbackService;

/**
 * 反馈信息控制器
 * 
 * @author linbaolu
 * @date 2015-7-30 9:07:00
 */
@Controller
@RequestMapping("/feedback")
public class FeedbackAction extends GenericAction<Feedback> {
	private static final Logger LOGGER = LoggerFactory.getLogger(FeedbackAction.class);

	@Inject
	private FeedbackService feedbackServiceImpl;

	@Inject
	private FeedbackReplyService feedbackReplyServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// 空字符串转换为null
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 获得反馈信息List，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 反馈信息List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(String investorId) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request feedback list, investorId=[{}]", investorId);

			Feedback feedbackParam = new Feedback();
			feedbackParam.setInvestorId(investorId);
			// feedbackParam.setOrderBy("create_time desc");
			List<Feedback> feedbackList = feedbackServiceImpl.pagedList(feedbackParam);
			LOGGER.info("query feedback list success, size=[{}]", feedbackList.size());

			List<FeedbackResBean> frbList = new ArrayList<FeedbackResBean>();
			if (null != feedbackList) {
				for (Feedback feedback : feedbackList) {
					FeedbackResBean frb = new FeedbackResBean();
					frb.setId(feedback.getId());
					frb.setContent(feedback.getContent());
					frb.setCreateTime(feedback.getCreateTime());
					frb.setType(0);
					frbList.add(frb);
					FeedbackReply feedbackReplyParam = new FeedbackReply();
					feedbackReplyParam.setFeedbackId(feedback.getId());
					FeedbackReply FeedbackReply = feedbackReplyServiceImpl
							.unique(feedbackReplyParam);
					if (null != FeedbackReply) {
						FeedbackResBean _frb = new FeedbackResBean();
						_frb.setId(FeedbackReply.getId());
						_frb.setContent(FeedbackReply.getReplyContent());
						_frb.setCreateTime(FeedbackReply.getReplyTime());
						_frb.setType(1);
						frbList.add(_frb);
					}
				}
			}

			// 封装jsonBean
			jsonBean.setCode(1);
			jsonBean.setData(frbList);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			LOGGER.error("request feedback list error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("request feedback list error");
		}

		return jsonBean;
	}

	/**
	 * 执行实际的新增操作
	 * 
	 * @param model
	 *            要新增的数据
	 * @return 新增页面逻辑视图
	 */
	@ResponseBody
	@RequestMapping("/doAdd")
	public JsonBean doAdd(Feedback model) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request add feedback, param=[{}]", JSON.toJSONString(model));

			// 添加feadback记录
			model.setId(ObjectId.get().toString());
			model.setCreateTime(new Date());
			model.setReply(false);
			model.setSubmitPlatform(false);
			int result = feedbackServiceImpl.save(model);
			LOGGER.info("add feedback success, result=[{}]", result);

			if (result == 1) {
				jsonBean.setCode(1);
				FeedbackResBean frb = new FeedbackResBean();
				frb.setId(model.getId());
				frb.setContent(model.getContent());
				frb.setCreateTime(model.getCreateTime());
				frb.setType(0);
				jsonBean.setData(frb);
				jsonBean.setMessage(SUCCESS);
			} else {
				jsonBean.setCode(0);
				jsonBean.setMessage(ERROR);
			}
		} catch (Exception e) {
			LOGGER.error("add feedback error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("add feedback error");
		}

		return jsonBean;
	}

}
