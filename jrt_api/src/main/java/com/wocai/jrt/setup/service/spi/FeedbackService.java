package com.wocai.jrt.setup.service.spi;

import com.wocai.jrt.setup.model.Feedback;
import com.wocai.jrt.setup.model.FeedbackBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 意见反馈相关的业务service接口。
 * @author yinlei
 * @date 2015-9-6 21:20:26
 */
public interface FeedbackService extends MyBatisService<Feedback, FeedbackBean, String> {

}
