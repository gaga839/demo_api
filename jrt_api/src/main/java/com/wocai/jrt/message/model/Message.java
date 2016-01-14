package com.wocai.jrt.message.model;

import java.util.Date;

public class Message {
    /**
     * order by 排序语句
     * 对应数据库表字段 message
     */
    private String orderBy;
    
    /**
     * 分页开始记录
     * 对应数据库表字段 message
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 message
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 message
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 message.id
     */
    private String id;

    /**
     * 对应数据库表字段 message.message
     */
    private String message;

    /**
     * 对应数据库表字段 message.sender
     */
    private String sender;

    /**
     * 对应数据库表字段 message.receiver
     */
    private String receiver;

    /**
     * 对应数据库表字段 message.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 message.type
     */
    private Integer type;

    /**
     * 对应数据库表字段 message.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 message.org_id
     */
    private String orgId;
    /**
     * 员工id
     */
    private String employeeId;
    /**
     * 发送时间
     */
    private String sendTime;
    /**
     * 跳转类型
     */
    private Integer skipType;
    /**
     * 跳转关键值
     */
    private String skipKey;
    /**
     * 业务类型
     */
    private Integer businessType;
    /**
     * 消息来源
     */
    private String  source;
    /**
     * 对应数据库表字段 message.type
     */
    private Integer messageType;
    
    //投后用户id
    private String customerId;
    
    public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Integer getMessageType() {
		return messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Integer getSkipType() {
		return skipType;
	}

	public void setSkipType(Integer skipType) {
		this.skipType = skipType;
	}

	public String getSkipKey() {
		return skipKey;
	}

	public void setSkipKey(String skipKey) {
		this.skipKey = skipKey;
	}

	public Integer getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	/**
     * 设置 order by 排序语句
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 获得 order by 排序语句
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 设置 start，分页开始记录
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 设置 pageSize，分页大小
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得 pageSize，分页大小
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置 distinct，是否去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获得 distinct，是否去重
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得字段 message.id 的值
     *
     * @return the value of message.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 message.id 的值
     *
     * @param id the value for message.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 message.message 的值
     *
     * @return the value of message.message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置字段 message.message 的值
     *
     * @param message the value for message.message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获得字段 message.sender 的值
     *
     * @return the value of message.sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * 设置字段 message.sender 的值
     *
     * @param sender the value for message.sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * 获得字段 message.receiver 的值
     *
     * @return the value of message.receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置字段 message.receiver 的值
     *
     * @param receiver the value for message.receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * 获得字段 message.state 的值
     *
     * @return the value of message.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 message.state 的值
     *
     * @param state the value for message.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 message.type 的值
     *
     * @return the value of message.type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置字段 message.type 的值
     *
     * @param type the value for message.type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获得字段 message.create_time 的值
     *
     * @return the value of message.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 message.create_time 的值
     *
     * @param createTime the value for message.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 message.org_id 的值
     *
     * @return the value of message.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 message.org_id 的值
     *
     * @param orgId the value for message.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}