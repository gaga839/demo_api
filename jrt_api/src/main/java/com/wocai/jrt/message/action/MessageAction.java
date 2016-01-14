package com.wocai.jrt.message.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.service.spi.EmployeeService;
import com.wocai.jrt.message.bean.MessageReqBean;
import com.wocai.jrt.message.model.Message;
import com.wocai.jrt.message.service.spi.MessageService;
import com.wocai.jrt.utils.MessagePush;
import com.alibaba.fastjson.JSON;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.vteba.web.editer.DoubleEditor;
import com.vteba.web.editer.IntEditor;
import com.vteba.web.editer.LongEditor;
import com.vteba.web.editer.StringEditor;

/**
 * 通知控制器
 * @author zhangyz
 * @date 2015-7-30 11:41:22
 */
@Controller
@RequestMapping("/message")
public class MessageAction extends GenericAction<Message> {
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageAction.class);
	@Inject
	private MessageService messageServiceImpl;
	@Inject
	private EmployeeService employeeServiceImpl;
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(
				"yyyy-MM-dd"), true));
		binder.registerCustomEditor(int.class, new IntEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(String.class, new StringEditor());
	}
	
	/**
	 * 获得通知List，Json格式。
	 * @param model 参数
	 * @return 通知List
	 */
	@ResponseBody
	@RequestMapping("/queryList")
	public JsonBean queryList(MessageReqBean messageReqBean) {
		JsonBean bean = new JsonBean();
		try {
			if (StringUtils.isBlank(messageReqBean.getEmployeeId())) {
	    		bean.setCode(0);
	    		bean.setMessage("员工id不能为空");
				return bean;
			}
			Integer i = messageReqBean.getPage();
			if ( i != null) {
				messageReqBean.setPage(i*messageReqBean.getPageSize());
			}
			messageReqBean.setOrderBy("create_time desc");
			LOGGER.info("request message log  list, param=[{}]", JSON.toJSONString(messageReqBean));
			List<Message> list = messageServiceImpl.queryLogList(messageReqBean);
			bean.setCode(1);
			bean.setData(list);
			bean.setMessage("消息内容查询成功");
		} catch (Exception e) {
			LOGGER.error("get message log  list error, errorMsg=[{}].", e.getMessage());			
			bean.setCode(0);
			bean.setMessage("消息内容查询失败");
		}
		return bean;
	}
	  
    /**
     * 新增消息到message_log表中
     * @param MessageReqBean messageReqBean
     * @return JsonBean
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(MessageReqBean messageReqBean) {
    	Message model = new Message();
    	JsonBean bean = new JsonBean();
    	if (StringUtils.isBlank(messageReqBean.getMessage())) {
    		bean.setCode(0);
    		bean.setMessage("消息内容不能为空");
			return bean;
		}
    	if (StringUtils.isBlank(messageReqBean.getSender())) {
    		bean.setCode(0);
    		bean.setMessage("发送人不能为空");
			return bean;
		}
    	if (StringUtils.isBlank(messageReqBean.getOrgId())) {
    		bean.setCode(0);
    		bean.setMessage("机构id不能为空");
			return bean;
		}
    	if (StringUtils.isBlank(messageReqBean.getReceiver())) {
    		bean.setCode(0);
    		bean.setMessage("接收人不能为空");
			return bean;
		}
    	Employee sender = employeeServiceImpl.get(messageReqBean.getSender());
    	if(sender == null){
    		bean.setCode(0);
            bean.setMessage("发送人不存在");
            return bean;
    	}
    	String employeeName = sender.getName();
    	model.setMessage("来自【"+employeeName+"】的消息："+messageReqBean.getMessage());
    	model.setSender(messageReqBean.getSender());
    	model.setType(messageReqBean.getType());//
    	model.setState(0);//1为已读0为未读
    	model.setOrgId(messageReqBean.getOrgId());
    	model.setCreateTime(new Date());
    	model.setSource("Pad端");
    	model.setMessageType(1);
    	String[] listString = messageReqBean.getReceiver().split(",");
    	int result =0;
    	Set<String> setString = new HashSet<String>();
    	LOGGER.info("request message log  batch doAdd, param=[{}]", JSON.toJSONString(messageReqBean));
    	try {
    		for (String str : listString) {
        		model.setId(ObjectId.get().toString());
        		model.setEmployeeId(str);
        		//将每条消息记录存入数据库
        		int i = messageServiceImpl.doAdd(model);
        		setString.add(str);
        		result = result + i;
    		}
    		//向所有接收人发送消息
    		MessagePush messagePush = new MessagePush(model.getMessage());
    		messagePush.sendPushAlias(setString);
		} catch (Exception e) {
			 bean.setCode(0);
	         bean.setMessage("消息保存失败");
	         LOGGER.error("request message log  batch doAdd error, errorMsg=[{}].", e.getMessage());		
		}
    	 if (result == listString.length) {
    		 	bean.setCode(1);
    		 	bean.setData(result);
	            bean.setMessage("消息保存成功");
        } else if (result < listString.length && result!= 0) {
        		bean.setCode(1);
        		bean.setData(result);
        		bean.setMessage("部分消息保存成功");
		} else if(result == 0){
            bean.setCode(0);
            bean.setMessage("消息保存失败");
        }
        return bean;
    }
    
    /**
     * 将消息标记为已读
     * @param Message message
     * @return JsonBean
     */
    @ResponseBody
    @RequestMapping("/markRead")
    public JsonBean markRead(Message message) {
    	JsonBean bean = new JsonBean();
    	try {
    		if (StringUtils.isBlank(message.getId())) {
        		bean.setCode(0);
        		bean.setMessage("消息id不能为空");
    			return bean;
    		}
        	//将这条消息标记为已读
    		LOGGER.info("request message log  markRead, param=[{}]", JSON.toJSONString(message));
    		int i = messageServiceImpl.markRead(message);
    		bean.setCode(1);
    		bean.setData(i);
    		bean.setMessage("消息状态更新成功");
		} catch (Exception e) {
			bean.setCode(0);
    		bean.setMessage("消息状态更新失败");
    		LOGGER.error("request message log  markRead error, errorMsg=[{}].", e.getMessage());		
		}
    	return bean;
    }
}
