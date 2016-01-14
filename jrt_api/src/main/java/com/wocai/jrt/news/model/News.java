package com.wocai.jrt.news.model;

import java.util.Date;

public class News {
    /**
     * order by 排序语句
     * 对应数据库表字段 news
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 news
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 news
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 news
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 news.id
     */
    private String id;

    /**
     * 对应数据库表字段 news.title
     */
    private String title;

    /**
     * 对应数据库表字段 news.source
     */
    private String source;

    /**
     * 对应数据库表字段 news.thumbnail
     */
    private String thumbnail;

    /**
     * 对应数据库表字段 news.info
     */
    private String info;

    /**
     * 对应数据库表字段 news.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 news.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 news.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 news.enabled
     */
    private Boolean enabled;

    /**
     * 对应数据库表字段 news.orders
     */
    private Integer orders;

    /**
     * 对应数据库表字段 news.type
     */
    private Integer type;

    /**
     * 对应数据库表字段 news.content
     */
    private String content;

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
     * 获得字段 news.id 的值
     *
     * @return the value of news.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 news.id 的值
     *
     * @param id the value for news.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 news.title 的值
     *
     * @return the value of news.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置字段 news.title 的值
     *
     * @param title the value for news.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获得字段 news.source 的值
     *
     * @return the value of news.source
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置字段 news.source 的值
     *
     * @param source the value for news.source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获得字段 news.thumbnail 的值
     *
     * @return the value of news.thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 设置字段 news.thumbnail 的值
     *
     * @param thumbnail the value for news.thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 获得字段 news.info 的值
     *
     * @return the value of news.info
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置字段 news.info 的值
     *
     * @param info the value for news.info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获得字段 news.state 的值
     *
     * @return the value of news.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 news.state 的值
     *
     * @param state the value for news.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 news.org_id 的值
     *
     * @return the value of news.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 news.org_id 的值
     *
     * @param orgId the value for news.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 news.create_time 的值
     *
     * @return the value of news.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 news.create_time 的值
     *
     * @param createTime the value for news.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 news.enabled 的值
     *
     * @return the value of news.enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置字段 news.enabled 的值
     *
     * @param enabled the value for news.enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获得字段 news.orders 的值
     *
     * @return the value of news.orders
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置字段 news.orders 的值
     *
     * @param orders the value for news.orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获得字段 news.type 的值
     *
     * @return the value of news.type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置字段 news.type 的值
     *
     * @param type the value for news.type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获得字段 news.content 的值
     *
     * @return the value of news.content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置字段 news.content 的值
     *
     * @param content the value for news.content
     */
    public void setContent(String content) {
        this.content = content;
    }
}