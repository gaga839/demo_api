package com.wocai.jrt.setup.service.spi;

import com.wocai.jrt.setup.model.FeedbackReply;
import com.wocai.jrt.setup.model.FeedbackReplyBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 意见反馈回复相关的业务service接口。
 * @author yinlei
 * @date 2015-9-6 21:20:26
 */
public interface FeedbackReplyService extends MyBatisService<FeedbackReply, FeedbackReplyBean, String> {

}
