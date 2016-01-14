package com.wocai.jrt.setup.model;

import java.util.Date;

public class Feedback {
    /**
     * order by 排序语句
     * 对应数据库表字段 feedback
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 feedback
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 feedback
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 feedback
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 feedback.id
     */
    private String id;

    /**
     * 对应数据库表字段 feedback.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 feedback.content
     */
    private String content;

    /**
     * 对应数据库表字段 feedback.investor_id
     */
    private String investorId;

    /**
     * 对应数据库表字段 feedback.source
     */
    private String source;

    /**
     * 对应数据库表字段 feedback.reply
     */
    private Boolean reply;

    /**
     * 对应数据库表字段 feedback.submit_platform
     */
    private Boolean submitPlatform;

    /**
     * 对应数据库表字段 feedback.org_id
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
     * 获得字段 feedback.id 的值
     *
     * @return the value of feedback.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 feedback.id 的值
     *
     * @param id the value for feedback.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 feedback.create_time 的值
     *
     * @return the value of feedback.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 feedback.create_time 的值
     *
     * @param createTime the value for feedback.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 feedback.content 的值
     *
     * @return the value of feedback.content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置字段 feedback.content 的值
     *
     * @param content the value for feedback.content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获得字段 feedback.investor_id 的值
     *
     * @return the value of feedback.investor_id
     */
    public String getInvestorId() {
        return investorId;
    }

    /**
     * 设置字段 feedback.investor_id 的值
     *
     * @param investorId the value for feedback.investor_id
     */
    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    /**
     * 获得字段 feedback.source 的值
     *
     * @return the value of feedback.source
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置字段 feedback.source 的值
     *
     * @param source the value for feedback.source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获得字段 feedback.reply 的值
     *
     * @return the value of feedback.reply
     */
    public Boolean getReply() {
        return reply;
    }

    /**
     * 设置字段 feedback.reply 的值
     *
     * @param reply the value for feedback.reply
     */
    public void setReply(Boolean reply) {
        this.reply = reply;
    }

    /**
     * 获得字段 feedback.submit_platform 的值
     *
     * @return the value of feedback.submit_platform
     */
    public Boolean getSubmitPlatform() {
        return submitPlatform;
    }

    /**
     * 设置字段 feedback.submit_platform 的值
     *
     * @param submitPlatform the value for feedback.submit_platform
     */
    public void setSubmitPlatform(Boolean submitPlatform) {
        this.submitPlatform = submitPlatform;
    }

    /**
     * 获得字段 feedback.org_id 的值
     *
     * @return the value of feedback.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 feedback.org_id 的值
     *
     * @param orgId the value for feedback.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}