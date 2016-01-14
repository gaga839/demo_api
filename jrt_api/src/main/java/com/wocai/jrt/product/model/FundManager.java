package com.wocai.jrt.product.model;

import java.util.Date;

public class FundManager {
    /**
     * order by 排序语句
     * 对应数据库表字段 fund_manager
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 fund_manager
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 fund_manager
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 fund_manager
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 fund_manager.id
     */
    private String id;

    /**
     * 对应数据库表字段 fund_manager.avatar
     */
    private String avatar;

    /**
     * 对应数据库表字段 fund_manager.name
     */
    private String name;

    /**
     * 对应数据库表字段 fund_manager.mobile
     */
    private String mobile;

    /**
     * 对应数据库表字段 fund_manager.gender
     */
    private Integer gender;

    /**
     * 对应数据库表字段 fund_manager.fund_number
     */
    private Integer fundNumber;

    /**
     * 对应数据库表字段 fund_manager.deleted
     */
    private Boolean deleted;

    /**
     * 对应数据库表字段 fund_manager.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 fund_manager.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 fund_manager.summary
     */
    private String summary;

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
     * 获得字段 fund_manager.id 的值
     *
     * @return the value of fund_manager.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 fund_manager.id 的值
     *
     * @param id the value for fund_manager.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 fund_manager.avatar 的值
     *
     * @return the value of fund_manager.avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置字段 fund_manager.avatar 的值
     *
     * @param avatar the value for fund_manager.avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获得字段 fund_manager.name 的值
     *
     * @return the value of fund_manager.name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字段 fund_manager.name 的值
     *
     * @param name the value for fund_manager.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得字段 fund_manager.mobile 的值
     *
     * @return the value of fund_manager.mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置字段 fund_manager.mobile 的值
     *
     * @param mobile the value for fund_manager.mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获得字段 fund_manager.gender 的值
     *
     * @return the value of fund_manager.gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置字段 fund_manager.gender 的值
     *
     * @param gender the value for fund_manager.gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获得字段 fund_manager.fund_number 的值
     *
     * @return the value of fund_manager.fund_number
     */
    public Integer getFundNumber() {
        return fundNumber;
    }

    /**
     * 设置字段 fund_manager.fund_number 的值
     *
     * @param fundNumber the value for fund_manager.fund_number
     */
    public void setFundNumber(Integer fundNumber) {
        this.fundNumber = fundNumber;
    }

    /**
     * 获得字段 fund_manager.deleted 的值
     *
     * @return the value of fund_manager.deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置字段 fund_manager.deleted 的值
     *
     * @param deleted the value for fund_manager.deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 获得字段 fund_manager.org_id 的值
     *
     * @return the value of fund_manager.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 fund_manager.org_id 的值
     *
     * @param orgId the value for fund_manager.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 fund_manager.create_time 的值
     *
     * @return the value of fund_manager.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 fund_manager.create_time 的值
     *
     * @param createTime the value for fund_manager.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 fund_manager.summary 的值
     *
     * @return the value of fund_manager.summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置字段 fund_manager.summary 的值
     *
     * @param summary the value for fund_manager.summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}