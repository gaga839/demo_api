package com.wocai.jrt.setup.model;

import java.util.Date;

public class FeedbackReply {
    /**
     * order by 排序语句
     * 对应数据库表字段 feedback_reply
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 feedback_reply
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 feedback_reply
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 feedback_reply
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 feedback_reply.id
     */
    private String id;

    /**
     * 对应数据库表字段 feedback_reply.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 feedback_reply.reply_content
     */
    private String replyContent;

    /**
     * 对应数据库表字段 feedback_reply.reply_time
     */
    private Date replyTime;

    /**
     * 对应数据库表字段 feedback_reply.feedback_id
     */
    private String feedbackId;

    /**
     * 对应数据库表字段 feedback_reply.org_id
     */
    private String orgId;

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
     * 获得字段 feedback_reply.id 的值
     *
     * @return the value of feedback_reply.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 feedback_reply.id 的值
     *
     * @param id the value for feedback_reply.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 feedback_reply.employee_id 的值
     *
     * @return the value of feedback_reply.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 feedback_reply.employee_id 的值
     *
     * @param employeeId the value for feedback_reply.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 feedback_reply.reply_content 的值
     *
     * @return the value of feedback_reply.reply_content
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * 设置字段 feedback_reply.reply_content 的值
     *
     * @param replyContent the value for feedback_reply.reply_content
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    /**
     * 获得字段 feedback_reply.reply_time 的值
     *
     * @return the value of feedback_reply.reply_time
     */
    public Date getReplyTime() {
        return replyTime;
    }

    /**
     * 设置字段 feedback_reply.reply_time 的值
     *
     * @param replyTime the value for feedback_reply.reply_time
     */
    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    /**
     * 获得字段 feedback_reply.feedback_id 的值
     *
     * @return the value of feedback_reply.feedback_id
     */
    public String getFeedbackId() {
        return feedbackId;
    }

    /**
     * 设置字段 feedback_reply.feedback_id 的值
     *
     * @param feedbackId the value for feedback_reply.feedback_id
     */
    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * 获得字段 feedback_reply.org_id 的值
     *
     * @return the value of feedback_reply.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 feedback_reply.org_id 的值
     *
     * @param orgId the value for feedback_reply.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}