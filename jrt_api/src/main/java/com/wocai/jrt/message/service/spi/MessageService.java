package com.wocai.jrt.message.service.spi;


import java.util.List;

import com.wocai.jrt.message.bean.MessageReqBean;
import com.wocai.jrt.message.model.Message;
import com.wocai.jrt.message.model.MessageBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 通知相关的业务service接口。
 * @author yinlei
 * @date 2015-7-30 11:41:22
 */
public interface MessageService extends MyBatisService<Message, MessageBean, String> {
	/**
     * 消息记录插入数据库
     * @param Message message
     * @return int
     */
	public int doAdd(Message message);
	
	/**
	 * 获得通知List，Json格式。
	 * @param model 参数
	 * @return 通知List
	 */
	public List<Message> queryLogList(MessageReqBean messageReqBean);
	
	 /**
     * 将消息标记为已读
     * @param Message message
     * @return JsonBean
     */
	public int markRead(Message message);

	int getUnReadNum(String orgId, String customerId);
}
