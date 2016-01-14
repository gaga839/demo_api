package com.wocai.jrt.message.bean;

import java.util.Date;
/**
 * 通知请求参数bean
 * @author zhangyz
 * @date 2015-7-30 13:22:09
 */
public class MessageReqBean {
	/**
	 * 排序字段
	 */
	 private String orderBy;
	 /**
	 * 发送人
	 */
	 private String sender;
	 /**
	 * 接收人列表
	 */
	 private String receiver;
	 /**
	 * 发送内容
	 */
	 private String message; 
	 /**
	 * 创建时间
	 */
	 private Date createTime;
	 /**
	 * 机构id
	 */
	 private String orgId;
	 /**
	 * 消息类型
	 */
	 private Integer type;
	 /**
	 * PAD端消息类型
	 */
	 private Integer messageType;
	 /**
	 * 员工id
	 */
	 private String employeeId;
	 /**
	 * 投后用户id
	 */
	 private String customerId;
	/**
	 * 已读未读状态
	 */
	 private Integer state;
	 /**
	 * 页码
	 */
	 private Integer page;
	 /**
	 * 页大小
	 */
	private Integer pageSize;
	 
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getMessageType() {
		return messageType;
	}
	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	 
}
