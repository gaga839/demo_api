package com.wocai.jrt.message.dao;

import java.util.List;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.message.bean.MessageReqBean;
import com.wocai.jrt.message.model.Message;
import com.wocai.jrt.message.model.MessageBean;

/**
 * 表message的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-07-30 11:41:23
 */
@DaoMapper
public interface MessageDao extends BaseDao<Message, MessageBean, String> {
	
	/**
     * 消息记录插入数据库
     * @param Message message
     * @return int
     */
	int doAdd(Message message);
	
	/**
	 * 获得通知List，Json格式。
	 * @param model 参数
	 * @return 通知List
	 */
	List<Message> queryLogList(MessageReqBean messageReqBean);
	
	/**
     * 将消息标记为已读
     * @param Message message
     * @return JsonBean
     */
	int markRead(Message message);
}