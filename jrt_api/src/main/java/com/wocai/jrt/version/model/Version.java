package com.wocai.jrt.version.model;

import java.util.Date;

public class Version {
    /**
     * order by 排序语句
     * 对应数据库表字段 version
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 version
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 version
     */
    private Integer pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 version
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 version.id
     */
    private String id;

    /**
     * 对应数据库表字段 version.product_softname
     */
    private String productSoftname;

    /**
     * 对应数据库表字段 version.product_serial
     */
    private String productSerial;

    /**
     * 对应数据库表字段 version.version_number
     */
    private String versionNumber;

    /**
     * 对应数据库表字段 version.update_description
     */
    private String updateDescription;

    /**
     * 对应数据库表字段 version.download_url
     */
    private String downloadUrl;

    /**
     * 对应数据库表字段 version.update_time
     */
    private Date updateTime;

    /**
     * 对应数据库表字段 version.update_lowest_version
     */
    private String updateLowestVersion;

    /**
     * 对应数据库表字段 version.tips
     */
    private Boolean tips;

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
     * 设置 pageSize，分页大小
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得 pageSize，分页大小
     */
    public Integer getPageSize() {
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
     * 获得字段 version.id 的值
     *
     * @return the value of version.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 version.id 的值
     *
     * @param id the value for version.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 version.product_softname 的值
     *
     * @return the value of version.product_softname
     */
    public String getProductSoftname() {
        return productSoftname;
    }

    /**
     * 设置字段 version.product_softname 的值
     *
     * @param productSoftname the value for version.product_softname
     */
    public void setProductSoftname(String productSoftname) {
        this.productSoftname = productSoftname;
    }

    /**
     * 获得字段 version.product_serial 的值
     *
     * @return the value of version.product_serial
     */
    public String getProductSerial() {
        return productSerial;
    }

    /**
     * 设置字段 version.product_serial 的值
     *
     * @param productSerial the value for version.product_serial
     */
    public void setProductSerial(String productSerial) {
        this.productSerial = productSerial;
    }

    /**
     * 获得字段 version.version_number 的值
     *
     * @return the value of version.version_number
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * 设置字段 version.version_number 的值
     *
     * @param versionNumber the value for version.version_number
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * 获得字段 version.update_description 的值
     *
     * @return the value of version.update_description
     */
    public String getUpdateDescription() {
        return updateDescription;
    }

    /**
     * 设置字段 version.update_description 的值
     *
     * @param updateDescription the value for version.update_description
     */
    public void setUpdateDescription(String updateDescription) {
        this.updateDescription = updateDescription;
    }

    /**
     * 获得字段 version.download_url 的值
     *
     * @return the value of version.download_url
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * 设置字段 version.download_url 的值
     *
     * @param downloadUrl the value for version.download_url
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * 获得字段 version.update_time 的值
     *
     * @return the value of version.update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置字段 version.update_time 的值
     *
     * @param updateTime the value for version.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获得字段 version.update_lowest_version 的值
     *
     * @return the value of version.update_lowest_version
     */
    public String getUpdateLowestVersion() {
        return updateLowestVersion;
    }

    /**
     * 设置字段 version.update_lowest_version 的值
     *
     * @param updateLowestVersion the value for version.update_lowest_version
     */
    public void setUpdateLowestVersion(String updateLowestVersion) {
        this.updateLowestVersion = updateLowestVersion;
    }

    /**
     * 获得字段 version.tips 的值
     *
     * @return the value of version.tips
     */
    public Boolean getTips() {
        return tips;
    }

    /**
     * 设置字段 version.tips 的值
     *
     * @param tips the value for version.tips
     */
    public void setTips(Boolean tips) {
        this.tips = tips;
    }


	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}
}