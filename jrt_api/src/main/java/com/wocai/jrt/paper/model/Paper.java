package com.wocai.jrt.paper.model;

import java.util.Date;

public class Paper {
    /**
     * order by 排序语句
     * 对应数据库表字段 paper
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 paper
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 paper
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 paper
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 paper.id
     */
    private String id;

    /**
     * 对应数据库表字段 paper.title
     */
    private String title;

    /**
     * 对应数据库表字段 paper.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 paper.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 paper.current
     */
    private Boolean current;

    /**
     * 对应数据库表字段 paper.year
     */
    private String year;

    /**
     * 对应数据库表字段 paper.qualified
     */
    private String qualified;

    /**
     * 对应数据库表字段 paper.unqualified
     */
    private String unqualified;

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
     * 获得字段 paper.id 的值
     *
     * @return the value of paper.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 paper.id 的值
     *
     * @param id the value for paper.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 paper.title 的值
     *
     * @return the value of paper.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置字段 paper.title 的值
     *
     * @param title the value for paper.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获得字段 paper.create_time 的值
     *
     * @return the value of paper.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 paper.create_time 的值
     *
     * @param createTime the value for paper.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 paper.org_id 的值
     *
     * @return the value of paper.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 paper.org_id 的值
     *
     * @param orgId the value for paper.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 paper.current 的值
     *
     * @return the value of paper.current
     */
    public Boolean getCurrent() {
        return current;
    }

    /**
     * 设置字段 paper.current 的值
     *
     * @param current the value for paper.current
     */
    public void setCurrent(Boolean current) {
        this.current = current;
    }

    /**
     * 获得字段 paper.year 的值
     *
     * @return the value of paper.year
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置字段 paper.year 的值
     *
     * @param year the value for paper.year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获得字段 paper.qualified 的值
     *
     * @return the value of paper.qualified
     */
    public String getQualified() {
        return qualified;
    }

    /**
     * 设置字段 paper.qualified 的值
     *
     * @param qualified the value for paper.qualified
     */
    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    /**
     * 获得字段 paper.unqualified 的值
     *
     * @return the value of paper.unqualified
     */
    public String getUnqualified() {
        return unqualified;
    }

    /**
     * 设置字段 paper.unqualified 的值
     *
     * @param unqualified the value for paper.unqualified
     */
    public void setUnqualified(String unqualified) {
        this.unqualified = unqualified;
    }
}