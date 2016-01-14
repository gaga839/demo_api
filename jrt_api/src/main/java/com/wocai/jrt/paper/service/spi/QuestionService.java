package com.wocai.jrt.paper.service.spi;

import com.wocai.jrt.paper.model.Question;
import com.wocai.jrt.paper.model.QuestionBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 题库题目相关的业务service接口。
 * @author yinlei
 * @date 2015-11-9 16:40:03
 */
public interface QuestionService extends MyBatisService<Question, QuestionBean, String> {

}
