package com.wocai.jrt.setup.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.setup.model.Feedback;
import com.wocai.jrt.setup.model.FeedbackReply;
import com.wocai.jrt.setup.service.spi.FeedbackReplyService;
import com.wocai.jrt.setup.service.spi.FeedbackService;
import com.alibaba.fastjson.JSON;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.StringEditor;

/**
 * 反馈回复控制器
 * 
 * @author linbaolu
 * @date 2015-7-30 9:07:00
 */
@Controller
@RequestMapping("/feedbackReply")
public class FeedbackReplyAction extends GenericAction<FeedbackReply> {
	private static final Logger LOGGER = LoggerFactory.getLogger(FeedbackAction.class);

	@Inject
	private FeedbackReplyService feedbackReplyServiceImpl;

	@Inject
	private FeedbackService feedbackServiceImpl;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// 空字符串转换为null
		binder.registerCustomEditor(String.class, new StringEditor());
	}

	/**
	 * 获得反馈回复List，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 反馈回复List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(FeedbackReply model) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request feedbackReply list, feedbackReply=[{}]", JSON.toJSONString(model));

			// 根据investorId查询feedback记录
			List<FeedbackReply> list = feedbackReplyServiceImpl.pagedList(model);
			LOGGER.info("query feedbackReply list success, size=[{}]", list.size());

			// 封装jsonBean
			jsonBean.setCode(1);
			jsonBean.setData(list);
			jsonBean.setMessage(SUCCESS);

		} catch (Exception e) {
			LOGGER.error("request feedbackReply list error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("request feedbackReply list error");
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
	public JsonBean doAdd(FeedbackReply model) {
		JsonBean jsonBean = new JsonBean();

		try {
			// 发起请求的参数
			LOGGER.info("request add feedbackReply, param=[{}]", JSON.toJSONString(model));

			// 添加feedbackReply记录
			model.setId(ObjectId.get().toString());
			model.setReplyTime(new Date());
			int addCount = feedbackReplyServiceImpl.save(model);
			LOGGER.info("add feedbackReply success, addCount=[{}]", addCount);

			// 更新Feedback表标记已回复
			Feedback feedbackParam = new Feedback();
			feedbackParam.setId(model.getFeedbackId());
			feedbackParam.setReply(true);
			int updateCount = feedbackServiceImpl.updateById(feedbackParam);
			LOGGER.info("update feedback success, updateCount=[{}]", updateCount);

			if (addCount == 1 && updateCount == 1) {
				jsonBean.setCode(1);
				jsonBean.setMessage(SUCCESS);
			} else {
				jsonBean.setCode(0);
				jsonBean.setMessage(ERROR);
			}
		} catch (Exception e) {
			LOGGER.error("add feedbackReply error, error=[{}]", e.getMessage());
			jsonBean.setCode(0);
			jsonBean.setMessage("add feedbackReply error");
		}

		return jsonBean;
	}

}
