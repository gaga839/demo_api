package com.wocai.jrt.product.model;

import java.util.Date;

public class ProductNet {
    /**
     * order by 排序语句
     * 对应数据库表字段 product_net
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 product_net
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 product_net
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 product_net
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 product_net.id
     */
    private String id;

    /**
     * 对应数据库表字段 product_net.product_id
     */
    private String productId;

    /**
     * 对应数据库表字段 product_net.date
     */
    private Date date;

    /**
     * 对应数据库表字段 product_net.cumulative_net
     */
    private Double cumulativeNet;

    /**
     * 对应数据库表字段 product_net.unit_net
     */
    private Double unitNet;

    /**
     * 对应数据库表字段 product_net.org_id
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
     * 获得字段 product_net.id 的值
     *
     * @return the value of product_net.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 product_net.id 的值
     *
     * @param id the value for product_net.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 product_net.product_id 的值
     *
     * @return the value of product_net.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 product_net.product_id 的值
     *
     * @param productId the value for product_net.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获得字段 product_net.date 的值
     *
     * @return the value of product_net.date
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置字段 product_net.date 的值
     *
     * @param date the value for product_net.date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获得字段 product_net.cumulative_net 的值
     *
     * @return the value of product_net.cumulative_net
     */
    public Double getCumulativeNet() {
        return cumulativeNet;
    }

    /**
     * 设置字段 product_net.cumulative_net 的值
     *
     * @param cumulativeNet the value for product_net.cumulative_net
     */
    public void setCumulativeNet(Double cumulativeNet) {
        this.cumulativeNet = cumulativeNet;
    }

    /**
     * 获得字段 product_net.unit_net 的值
     *
     * @return the value of product_net.unit_net
     */
    public Double getUnitNet() {
        return unitNet;
    }

    /**
     * 设置字段 product_net.unit_net 的值
     *
     * @param unitNet the value for product_net.unit_net
     */
    public void setUnitNet(Double unitNet) {
        this.unitNet = unitNet;
    }

    /**
     * 获得字段 product_net.org_id 的值
     *
     * @return the value of product_net.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 product_net.org_id 的值
     *
     * @param orgId the value for product_net.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}