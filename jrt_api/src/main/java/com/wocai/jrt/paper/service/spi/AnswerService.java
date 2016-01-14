package com.wocai.jrt.paper.service.spi;

import com.wocai.jrt.paper.model.Answer;
import com.wocai.jrt.paper.model.AnswerBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 投资人测评答案相关的业务service接口。
 * @author yinlei
 * @date 2015-11-9 16:40:03
 */
public interface AnswerService extends MyBatisService<Answer, AnswerBean, String> {

}
