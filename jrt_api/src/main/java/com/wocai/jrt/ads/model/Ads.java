package com.wocai.jrt.ads.model;

import java.util.Date;

public class Ads {
    /**
     * order by 排序语句
     * 对应数据库表字段 ads
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 ads
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 ads
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 ads
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 ads.id
     */
    private String id;

    /**
     * 对应数据库表字段 ads.ads_name
     */
    private String adsName;

    /**
     * 对应数据库表字段 ads.thumbnail
     */
    private String thumbnail;

    /**
     * 对应数据库表字段 ads.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 ads.product_id
     */
    private String productId;

    /**
     * 对应数据库表字段 ads.orders
     */
    private Integer orders;

    /**
     * 对应数据库表字段 ads.state
     */
    private Boolean state;

    /**
     * 对应数据库表字段 ads.publish_time
     */
    private Date publishTime;

    /**
     * 对应数据库表字段 ads.platform
     */
    private Integer platform;

    /**
     * 对应数据库表字段 ads.url
     */
    private String url;

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
     * 获得字段 ads.id 的值
     *
     * @return the value of ads.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 ads.id 的值
     *
     * @param id the value for ads.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 ads.ads_name 的值
     *
     * @return the value of ads.ads_name
     */
    public String getAdsName() {
        return adsName;
    }

    /**
     * 设置字段 ads.ads_name 的值
     *
     * @param adsName the value for ads.ads_name
     */
    public void setAdsName(String adsName) {
        this.adsName = adsName;
    }

    /**
     * 获得字段 ads.thumbnail 的值
     *
     * @return the value of ads.thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 设置字段 ads.thumbnail 的值
     *
     * @param thumbnail the value for ads.thumbnail
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 获得字段 ads.org_id 的值
     *
     * @return the value of ads.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 ads.org_id 的值
     *
     * @param orgId the value for ads.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 ads.product_id 的值
     *
     * @return the value of ads.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 ads.product_id 的值
     *
     * @param productId the value for ads.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获得字段 ads.orders 的值
     *
     * @return the value of ads.orders
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置字段 ads.orders 的值
     *
     * @param orders the value for ads.orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获得字段 ads.state 的值
     *
     * @return the value of ads.state
     */
    public Boolean getState() {
        return state;
    }

    /**
     * 设置字段 ads.state 的值
     *
     * @param state the value for ads.state
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * 获得字段 ads.publish_time 的值
     *
     * @return the value of ads.publish_time
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * 设置字段 ads.publish_time 的值
     *
     * @param publishTime the value for ads.publish_time
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * 获得字段 ads.platform 的值
     *
     * @return the value of ads.platform
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * 设置字段 ads.platform 的值
     *
     * @param platform the value for ads.platform
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * 获得字段 ads.url 的值
     *
     * @return the value of ads.url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置字段 ads.url 的值
     *
     * @param url the value for ads.url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}