package com.wocai.jrt.product.model;

public class ProductRelated {
    /**
     * order by 排序语句
     * 对应数据库表字段 product_related
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 product_related
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 product_related
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 product_related
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 product_related.id
     */
    private String id;

    /**
     * 对应数据库表字段 product_related.product_id
     */
    private String productId;

    /**
     * 对应数据库表字段 product_related.ref_product_id
     */
    private String refProductId;

    /**
     * 对应数据库表字段 product_related.org_id
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
     * 获得字段 product_related.id 的值
     *
     * @return the value of product_related.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 product_related.id 的值
     *
     * @param id the value for product_related.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 product_related.product_id 的值
     *
     * @return the value of product_related.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 product_related.product_id 的值
     *
     * @param productId the value for product_related.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获得字段 product_related.ref_product_id 的值
     *
     * @return the value of product_related.ref_product_id
     */
    public String getRefProductId() {
        return refProductId;
    }

    /**
     * 设置字段 product_related.ref_product_id 的值
     *
     * @param refProductId the value for product_related.ref_product_id
     */
    public void setRefProductId(String refProductId) {
        this.refProductId = refProductId;
    }

    /**
     * 获得字段 product_related.org_id 的值
     *
     * @return the value of product_related.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 product_related.org_id 的值
     *
     * @param orgId the value for product_related.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}