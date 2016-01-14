package com.wocai.jrt.setup.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.setup.dao.FeedbackDao;
import com.wocai.jrt.setup.model.Feedback;
import com.wocai.jrt.setup.model.FeedbackBean;
import com.wocai.jrt.setup.service.spi.FeedbackService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 意见反馈相关的service业务实现。
 * @author yinlei
 * @date 2015-9-6 21:20:26
 */
@Named
public class FeedbackServiceImpl extends MyBatisServiceImpl<Feedback, FeedbackBean, String> implements FeedbackService {
	// 添加了方法后，记得改为private
	protected FeedbackDao feedbackDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Feedback, FeedbackBean, String> feedbackDao) {
		this.baseDao = feedbackDao;
		this.feedbackDao = (FeedbackDao) feedbackDao;
	}
}
