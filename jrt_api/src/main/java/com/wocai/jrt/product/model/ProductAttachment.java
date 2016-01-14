package com.wocai.jrt.product.model;

import java.util.Date;

public class ProductAttachment {
    /**
     * order by 排序语句
     * 对应数据库表字段 product_attachment
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 product_attachment
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 product_attachment
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 product_attachment
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 product_attachment.id
     */
    private String id;

    /**
     * 对应数据库表字段 product_attachment.product_id
     */
    private String productId;

    /**
     * 对应数据库表字段 product_attachment.file_path
     */
    private String filePath;

    /**
     * 对应数据库表字段 product_attachment.file_name
     */
    private String fileName;

    /**
     * 对应数据库表字段 product_attachment.file_type
     */
    private String fileType;

    /**
     * 对应数据库表字段 product_attachment.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 product_attachment.create_time
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
     * 获得字段 product_attachment.id 的值
     *
     * @return the value of product_attachment.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 product_attachment.id 的值
     *
     * @param id the value for product_attachment.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 product_attachment.product_id 的值
     *
     * @return the value of product_attachment.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 product_attachment.product_id 的值
     *
     * @param productId the value for product_attachment.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获得字段 product_attachment.file_path 的值
     *
     * @return the value of product_attachment.file_path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置字段 product_attachment.file_path 的值
     *
     * @param filePath the value for product_attachment.file_path
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获得字段 product_attachment.file_name 的值
     *
     * @return the value of product_attachment.file_name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置字段 product_attachment.file_name 的值
     *
     * @param fileName the value for product_attachment.file_name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获得字段 product_attachment.file_type 的值
     *
     * @return the value of product_attachment.file_type
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * 设置字段 product_attachment.file_type 的值
     *
     * @param fileType the value for product_attachment.file_type
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * 获得字段 product_attachment.org_id 的值
     *
     * @return the value of product_attachment.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 product_attachment.org_id 的值
     *
     * @param orgId the value for product_attachment.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 product_attachment.create_time 的值
     *
     * @return the value of product_attachment.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 product_attachment.create_time 的值
     *
     * @param createTime the value for product_attachment.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}