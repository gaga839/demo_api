package com.wocai.jrt.setup.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.setup.dao.FeedbackReplyDao;
import com.wocai.jrt.setup.model.FeedbackReply;
import com.wocai.jrt.setup.model.FeedbackReplyBean;
import com.wocai.jrt.setup.service.spi.FeedbackReplyService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 意见反馈回复相关的service业务实现。
 * @author yinlei
 * @date 2015-9-6 21:20:26
 */
@Named
public class FeedbackReplyServiceImpl extends MyBatisServiceImpl<FeedbackReply, FeedbackReplyBean, String> implements FeedbackReplyService {
	// 添加了方法后，记得改为private
	protected FeedbackReplyDao feedbackReplyDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<FeedbackReply, FeedbackReplyBean, String> feedbackReplyDao) {
		this.baseDao = feedbackReplyDao;
		this.feedbackReplyDao = (FeedbackReplyDao) feedbackReplyDao;
	}
}
