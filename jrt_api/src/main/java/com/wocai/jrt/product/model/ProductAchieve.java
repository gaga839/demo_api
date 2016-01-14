package com.wocai.jrt.product.model;

import java.util.Date;

public class ProductAchieve {
    /**
     * order by 排序语句
     * 对应数据库表字段 product_achieve
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 product_achieve
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 product_achieve
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 product_achieve
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 product_achieve.id
     */
    private String id;

    /**
     * 对应数据库表字段 product_achieve.product_id
     */
    private String productId;

    /**
     * 对应数据库表字段 product_achieve.this_year
     */
    private Double thisYear;

    /**
     * 对应数据库表字段 product_achieve.one_month
     */
    private Double oneMonth;

    /**
     * 对应数据库表字段 product_achieve.six_month
     */
    private Double sixMonth;

    /**
     * 对应数据库表字段 product_achieve.one_year
     */
    private Double oneYear;

    /**
     * 对应数据库表字段 product_achieve.two_year
     */
    private Double twoYear;

    /**
     * 对应数据库表字段 product_achieve.three_year
     */
    private Double threeYear;

    /**
     * 对应数据库表字段 product_achieve.five_year
     */
    private Double fiveYear;

    /**
     * 对应数据库表字段 product_achieve.from_founded
     */
    private Double fromFounded;

    /**
     * 对应数据库表字段 product_achieve.publish_date
     */
    private Date publishDate;

    /**
     * 对应数据库表字段 product_achieve.org_id
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
     * 获得字段 product_achieve.id 的值
     *
     * @return the value of product_achieve.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 product_achieve.id 的值
     *
     * @param id the value for product_achieve.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 product_achieve.product_id 的值
     *
     * @return the value of product_achieve.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 product_achieve.product_id 的值
     *
     * @param productId the value for product_achieve.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获得字段 product_achieve.this_year 的值
     *
     * @return the value of product_achieve.this_year
     */
    public Double getThisYear() {
        return thisYear;
    }

    /**
     * 设置字段 product_achieve.this_year 的值
     *
     * @param thisYear the value for product_achieve.this_year
     */
    public void setThisYear(Double thisYear) {
        this.thisYear = thisYear;
    }

    /**
     * 获得字段 product_achieve.one_month 的值
     *
     * @return the value of product_achieve.one_month
     */
    public Double getOneMonth() {
        return oneMonth;
    }

    /**
     * 设置字段 product_achieve.one_month 的值
     *
     * @param oneMonth the value for product_achieve.one_month
     */
    public void setOneMonth(Double oneMonth) {
        this.oneMonth = oneMonth;
    }

    /**
     * 获得字段 product_achieve.six_month 的值
     *
     * @return the value of product_achieve.six_month
     */
    public Double getSixMonth() {
        return sixMonth;
    }

    /**
     * 设置字段 product_achieve.six_month 的值
     *
     * @param sixMonth the value for product_achieve.six_month
     */
    public void setSixMonth(Double sixMonth) {
        this.sixMonth = sixMonth;
    }

    /**
     * 获得字段 product_achieve.one_year 的值
     *
     * @return the value of product_achieve.one_year
     */
    public Double getOneYear() {
        return oneYear;
    }

    /**
     * 设置字段 product_achieve.one_year 的值
     *
     * @param oneYear the value for product_achieve.one_year
     */
    public void setOneYear(Double oneYear) {
        this.oneYear = oneYear;
    }

    /**
     * 获得字段 product_achieve.two_year 的值
     *
     * @return the value of product_achieve.two_year
     */
    public Double getTwoYear() {
        return twoYear;
    }

    /**
     * 设置字段 product_achieve.two_year 的值
     *
     * @param twoYear the value for product_achieve.two_year
     */
    public void setTwoYear(Double twoYear) {
        this.twoYear = twoYear;
    }

    /**
     * 获得字段 product_achieve.three_year 的值
     *
     * @return the value of product_achieve.three_year
     */
    public Double getThreeYear() {
        return threeYear;
    }

    /**
     * 设置字段 product_achieve.three_year 的值
     *
     * @param threeYear the value for product_achieve.three_year
     */
    public void setThreeYear(Double threeYear) {
        this.threeYear = threeYear;
    }

    /**
     * 获得字段 product_achieve.five_year 的值
     *
     * @return the value of product_achieve.five_year
     */
    public Double getFiveYear() {
        return fiveYear;
    }

    /**
     * 设置字段 product_achieve.five_year 的值
     *
     * @param fiveYear the value for product_achieve.five_year
     */
    public void setFiveYear(Double fiveYear) {
        this.fiveYear = fiveYear;
    }

    /**
     * 获得字段 product_achieve.from_founded 的值
     *
     * @return the value of product_achieve.from_founded
     */
    public Double getFromFounded() {
        return fromFounded;
    }

    /**
     * 设置字段 product_achieve.from_founded 的值
     *
     * @param fromFounded the value for product_achieve.from_founded
     */
    public void setFromFounded(Double fromFounded) {
        this.fromFounded = fromFounded;
    }

    /**
     * 获得字段 product_achieve.publish_date 的值
     *
     * @return the value of product_achieve.publish_date
     */
    public Date getPublishDate() {
        return publishDate;
    }

    /**
     * 设置字段 product_achieve.publish_date 的值
     *
     * @param publishDate the value for product_achieve.publish_date
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * 获得字段 product_achieve.org_id 的值
     *
     * @return the value of product_achieve.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 product_achieve.org_id 的值
     *
     * @param orgId the value for product_achieve.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}