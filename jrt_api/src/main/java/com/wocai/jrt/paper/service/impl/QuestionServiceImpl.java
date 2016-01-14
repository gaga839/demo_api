package com.wocai.jrt.paper.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.paper.dao.QuestionDao;
import com.wocai.jrt.paper.model.Question;
import com.wocai.jrt.paper.model.QuestionBean;
import com.wocai.jrt.paper.service.spi.QuestionService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 题库题目相关的service业务实现。
 * @author yinlei
 * @date 2015-11-9 16:40:03
 */
@Named
public class QuestionServiceImpl extends MyBatisServiceImpl<Question, QuestionBean, String> implements QuestionService {
	// 添加了方法后，记得改为private
	protected QuestionDao questionDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Question, QuestionBean, String> questionDao) {
		this.baseDao = questionDao;
		this.questionDao = (QuestionDao) questionDao;
	}
}
