package com.wocai.jrt.device.model;

import java.util.Date;

public class Pos {
    /**
     * order by 排序语句
     * 对应数据库表字段 pos
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 pos
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 pos
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 pos
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 pos.id
     */
    private String id;

    /**
     * 对应数据库表字段 pos.serial_number
     */
    private String serialNumber;

    /**
     * 对应数据库表字段 pos.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 pos.related
     */
    private Integer related;

    /**
     * 对应数据库表字段 pos.hard_code
     */
    private String hardCode;

    /**
     * 对应数据库表字段 pos.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 pos.storage_time
     */
    private Date storageTime;

    /**
     * 对应数据库表字段 pos.collar_time
     */
    private Date collarTime;

    /**
     * 对应数据库表字段 pos.batch_number
     */
    private String batchNumber;

    /**
     * 对应数据库表字段 pos.deleted
     */
    private Boolean deleted;

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
     * 获得字段 pos.id 的值
     *
     * @return the value of pos.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 pos.id 的值
     *
     * @param id the value for pos.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 pos.serial_number 的值
     *
     * @return the value of pos.serial_number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置字段 pos.serial_number 的值
     *
     * @param serialNumber the value for pos.serial_number
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * 获得字段 pos.state 的值
     *
     * @return the value of pos.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 pos.state 的值
     *
     * @param state the value for pos.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 pos.related 的值
     *
     * @return the value of pos.related
     */
    public Integer getRelated() {
        return related;
    }

    /**
     * 设置字段 pos.related 的值
     *
     * @param related the value for pos.related
     */
    public void setRelated(Integer related) {
        this.related = related;
    }

    /**
     * 获得字段 pos.hard_code 的值
     *
     * @return the value of pos.hard_code
     */
    public String getHardCode() {
        return hardCode;
    }

    /**
     * 设置字段 pos.hard_code 的值
     *
     * @param hardCode the value for pos.hard_code
     */
    public void setHardCode(String hardCode) {
        this.hardCode = hardCode;
    }

    /**
     * 获得字段 pos.org_id 的值
     *
     * @return the value of pos.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 pos.org_id 的值
     *
     * @param orgId the value for pos.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 pos.storage_time 的值
     *
     * @return the value of pos.storage_time
     */
    public Date getStorageTime() {
        return storageTime;
    }

    /**
     * 设置字段 pos.storage_time 的值
     *
     * @param storageTime the value for pos.storage_time
     */
    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }

    /**
     * 获得字段 pos.collar_time 的值
     *
     * @return the value of pos.collar_time
     */
    public Date getCollarTime() {
        return collarTime;
    }

    /**
     * 设置字段 pos.collar_time 的值
     *
     * @param collarTime the value for pos.collar_time
     */
    public void setCollarTime(Date collarTime) {
        this.collarTime = collarTime;
    }

    /**
     * 获得字段 pos.batch_number 的值
     *
     * @return the value of pos.batch_number
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * 设置字段 pos.batch_number 的值
     *
     * @param batchNumber the value for pos.batch_number
     */
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * 获得字段 pos.deleted 的值
     *
     * @return the value of pos.deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置字段 pos.deleted 的值
     *
     * @param deleted the value for pos.deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}