package com.wocai.jrt.paper.model;

import java.util.Date;

public class Question {
    /**
     * order by 排序语句
     * 对应数据库表字段 question
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 question
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 question
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 question
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 question.id
     */
    private String id;

    /**
     * 对应数据库表字段 question.title
     */
    private String title;

    /**
     * 对应数据库表字段 question.no
     */
    private Integer no;

    /**
     * 对应数据库表字段 question.options
     */
    private Boolean options;

    /**
     * 对应数据库表字段 question.unqualified
     */
    private String unqualified;

    /**
     * 对应数据库表字段 question.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 question.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 question.update_time
     */
    private Date updateTime;

    /**
     * 对应数据库表字段 question.paper_id
     */
    private String paperId;

    /**
     * 对应数据库表字段 question.tag
     */
    private Boolean tag;

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
     * 获得字段 question.id 的值
     *
     * @return the value of question.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 question.id 的值
     *
     * @param id the value for question.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 question.title 的值
     *
     * @return the value of question.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置字段 question.title 的值
     *
     * @param title the value for question.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获得字段 question.no 的值
     *
     * @return the value of question.no
     */
    public Integer getNo() {
        return no;
    }

    /**
     * 设置字段 question.no 的值
     *
     * @param no the value for question.no
     */
    public void setNo(Integer no) {
        this.no = no;
    }

    /**
     * 获得字段 question.options 的值
     *
     * @return the value of question.options
     */
    public Boolean getOptions() {
        return options;
    }

    /**
     * 设置字段 question.options 的值
     *
     * @param options the value for question.options
     */
    public void setOptions(Boolean options) {
        this.options = options;
    }

    /**
     * 获得字段 question.unqualified 的值
     *
     * @return the value of question.unqualified
     */
    public String getUnqualified() {
        return unqualified;
    }

    /**
     * 设置字段 question.unqualified 的值
     *
     * @param unqualified the value for question.unqualified
     */
    public void setUnqualified(String unqualified) {
        this.unqualified = unqualified;
    }

    /**
     * 获得字段 question.org_id 的值
     *
     * @return the value of question.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 question.org_id 的值
     *
     * @param orgId the value for question.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 question.create_time 的值
     *
     * @return the value of question.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 question.create_time 的值
     *
     * @param createTime the value for question.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 question.update_time 的值
     *
     * @return the value of question.update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置字段 question.update_time 的值
     *
     * @param updateTime the value for question.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获得字段 question.paper_id 的值
     *
     * @return the value of question.paper_id
     */
    public String getPaperId() {
        return paperId;
    }

    /**
     * 设置字段 question.paper_id 的值
     *
     * @param paperId the value for question.paper_id
     */
    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    /**
     * 获得字段 question.tag 的值
     *
     * @return the value of question.tag
     */
    public Boolean getTag() {
        return tag;
    }

    /**
     * 设置字段 question.tag 的值
     *
     * @param tag the value for question.tag
     */
    public void setTag(Boolean tag) {
        this.tag = tag;
    }
}