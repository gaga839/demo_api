package com.wocai.jrt.setup.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.setup.model.FeedbackReply;
import com.wocai.jrt.setup.model.FeedbackReplyBean;

/**
 * 表feedback_reply的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-09-06 21:20:26
 */
@DaoMapper
public interface FeedbackReplyDao extends BaseDao<FeedbackReply, FeedbackReplyBean, String> {
}