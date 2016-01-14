package com.wocai.jrt.product.model;

import java.util.Date;

public class GroupProduct {
    /**
     * order by 排序语句
     * 对应数据库表字段 group_product
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 group_product
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 group_product
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 group_product
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 group_product.id
     */
    private String id;

    /**
     * 对应数据库表字段 group_product.group_id
     */
    private String groupId;

    /**
     * 对应数据库表字段 group_product.product_id
     */
    private String productId;

    /**
     * 对应数据库表字段 group_product.product_name
     */
    private String productName;

    /**
     * 对应数据库表字段 group_product.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 group_product.brief_name
     */
    private String briefName;

    /**
     * 对应数据库表字段 group_product.product_code
     */
    private String productCode;

    /**
     * 对应数据库表字段 group_product.type
     */
    private String type;

    /**
     * 对应数据库表字段 group_product.create_time
     */
    private Date createTime;

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
     * 获得字段 group_product.id 的值
     *
     * @return the value of group_product.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 group_product.id 的值
     *
     * @param id the value for group_product.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 group_product.group_id 的值
     *
     * @return the value of group_product.group_id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 设置字段 group_product.group_id 的值
     *
     * @param groupId the value for group_product.group_id
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 获得字段 group_product.product_id 的值
     *
     * @return the value of group_product.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 group_product.product_id 的值
     *
     * @param productId the value for group_product.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获得字段 group_product.product_name 的值
     *
     * @return the value of group_product.product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置字段 group_product.product_name 的值
     *
     * @param productName the value for group_product.product_name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获得字段 group_product.org_id 的值
     *
     * @return the value of group_product.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 group_product.org_id 的值
     *
     * @param orgId the value for group_product.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 group_product.brief_name 的值
     *
     * @return the value of group_product.brief_name
     */
    public String getBriefName() {
        return briefName;
    }

    /**
     * 设置字段 group_product.brief_name 的值
     *
     * @param briefName the value for group_product.brief_name
     */
    public void setBriefName(String briefName) {
        this.briefName = briefName;
    }

    /**
     * 获得字段 group_product.product_code 的值
     *
     * @return the value of group_product.product_code
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置字段 group_product.product_code 的值
     *
     * @param productCode the value for group_product.product_code
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * 获得字段 group_product.type 的值
     *
     * @return the value of group_product.type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置字段 group_product.type 的值
     *
     * @param type the value for group_product.type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获得字段 group_product.create_time 的值
     *
     * @return the value of group_product.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 group_product.create_time 的值
     *
     * @param createTime the value for group_product.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}