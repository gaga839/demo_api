package com.wocai.jrt.message.service.impl;


import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wocai.jrt.message.bean.MessageReqBean;
import com.wocai.jrt.message.dao.MessageDao;
import com.wocai.jrt.message.model.Message;
import com.wocai.jrt.message.model.MessageBean;
import com.wocai.jrt.message.service.spi.MessageService;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 通知相关的service业务实现。
 * @author zhangyz
 * @date 2015-7-30 11:41:22
 */
@Named
public class MessageServiceImpl extends MyBatisServiceImpl<Message, MessageBean, String> implements MessageService {
	
	private MessageDao messageDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageServiceImpl.class);
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Message, MessageBean, String> messageDao) {
		this.baseDao = messageDao;
		this.messageDao = (MessageDao) messageDao;
	}
	
	/**
     * 消息记录插入数据库
     * @param Message message
     * @return int
     */
	@Override
	public int doAdd(Message message) {
		int i = messageDao.doAdd(message);
		return i;
	}
	/**
	 * 获得通知List，Json格式。
	 * @param model 参数
	 * @return 通知List
	 */
	@Override
	public List<Message> queryLogList(MessageReqBean messageReqBean) {
		List<Message> list = messageDao.queryLogList(messageReqBean);
		return list;
	}
	
	 /**
     * 将消息标记为已读
     * @param Message message
     * @return JsonBean
     */
	@Override
	public int markRead(Message message) {
		int i = messageDao.markRead(message);
		return i;
	}
	
	/**
	 * 获取未读消息条数
	 * @param orgId
	 * @param customerId
	 * @return
	 */
	@Override
	public int getUnReadNum(String orgId,String customerId){
		int  systemNum = 0;
		try {
			if(StringUtils.isAnyBlank(orgId,customerId)){
				LOGGER.error("get  UnRead MessageLog Num  param is null");
				return 0;
			}
			MessageReqBean msg = new MessageReqBean();
			msg.setCustomerId(customerId);
			msg.setOrgId(orgId);
			msg.setState(0);
			systemNum = this.queryLogList(msg).size();
		} catch (Exception e) {
			LOGGER.error("get  UnRead MessageLog Num  error,[{}] :"+e.getMessage());
		}
		return systemNum;
	}
}
