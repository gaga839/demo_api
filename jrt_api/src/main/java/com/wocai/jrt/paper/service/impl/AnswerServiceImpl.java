package com.wocai.jrt.paper.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.paper.dao.AnswerDao;
import com.wocai.jrt.paper.model.Answer;
import com.wocai.jrt.paper.model.AnswerBean;
import com.wocai.jrt.paper.service.spi.AnswerService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 投资人测评答案相关的service业务实现。
 * @author yinlei
 * @date 2015-11-9 16:40:03
 */
@Named
public class AnswerServiceImpl extends MyBatisServiceImpl<Answer, AnswerBean, String> implements AnswerService {
	// 添加了方法后，记得改为private
	protected AnswerDao answerDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Answer, AnswerBean, String> answerDao) {
		this.baseDao = answerDao;
		this.answerDao = (AnswerDao) answerDao;
	}
}
