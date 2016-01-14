package com.wocai.jrt.product.model;


public class ProductGrade {
    /**
     * order by 排序语句
     * 对应数据库表字段 product_grade
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 product_grade
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 product_grade
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 product_grade
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 product_grade.id
     */
    private String id;

    /**
     * 对应数据库表字段 product_grade.grade
     */
    private String grade;

    /**
     * 对应数据库表字段 product_grade.sub_scope_start
     */
    private Double subScopeStart;

    /**
     * 对应数据库表字段 product_grade.sub_scope_end
     */
    private Double subScopeEnd;

    /**
     * 对应数据库表字段 product_grade.prospective_earnings
     */
    private String prospectiveEarnings;

    /**
     * 对应数据库表字段 product_grade.product_id
     */
    private String productId;

    /**
     * 对应数据库表字段 product_grade.remark
     */
    private String remark;

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
     * 获得字段 product_grade.id 的值
     *
     * @return the value of product_grade.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 product_grade.id 的值
     *
     * @param id the value for product_grade.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 product_grade.grade 的值
     *
     * @return the value of product_grade.grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置字段 product_grade.grade 的值
     *
     * @param grade the value for product_grade.grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获得字段 product_grade.sub_scope_start 的值
     *
     * @return the value of product_grade.sub_scope_start
     */
    public Double getSubScopeStart() {
        return subScopeStart;
    }

    /**
     * 设置字段 product_grade.sub_scope_start 的值
     *
     * @param subScopeStart the value for product_grade.sub_scope_start
     */
    public void setSubScopeStart(Double subScopeStart) {
        this.subScopeStart = subScopeStart;
    }

    /**
     * 获得字段 product_grade.sub_scope_end 的值
     *
     * @return the value of product_grade.sub_scope_end
     */
    public Double getSubScopeEnd() {
        return subScopeEnd;
    }

    /**
     * 设置字段 product_grade.sub_scope_end 的值
     *
     * @param subScopeEnd the value for product_grade.sub_scope_end
     */
    public void setSubScopeEnd(Double subScopeEnd) {
        this.subScopeEnd = subScopeEnd;
    }

    /**
     * 获得字段 product_grade.prospective_earnings 的值
     *
     * @return the value of product_grade.prospective_earnings
     */
    public String getProspectiveEarnings() {
        return prospectiveEarnings;
    }

    /**
     * 设置字段 product_grade.prospective_earnings 的值
     *
     * @param prospectiveEarnings the value for product_grade.prospective_earnings
     */
    public void setProspectiveEarnings(String prospectiveEarnings) {
        this.prospectiveEarnings = prospectiveEarnings;
    }

    /**
     * 获得字段 product_grade.product_id 的值
     *
     * @return the value of product_grade.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 product_grade.product_id 的值
     *
     * @param productId the value for product_grade.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获得字段 product_grade.remark 的值
     *
     * @return the value of product_grade.remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置字段 product_grade.remark 的值
     *
     * @param remark the value for product_grade.remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}