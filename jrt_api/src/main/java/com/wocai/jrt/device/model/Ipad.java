package com.wocai.jrt.device.model;

import java.util.Date;

public class Ipad {
    /**
     * order by 排序语句
     * 对应数据库表字段 ipad
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 ipad
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 ipad
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 ipad
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 ipad.id
     */
    private String id;

    /**
     * 对应数据库表字段 ipad.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 ipad.hard_code
     */
    private String hardCode;

    /**
     * 对应数据库表字段 ipad.sim
     */
    private String sim;

    /**
     * 对应数据库表字段 ipad.serial_number
     */
    private String serialNumber;

    /**
     * 对应数据库表字段 ipad.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 ipad.related
     */
    private Integer related;

    /**
     * 对应数据库表字段 ipad.storage_time
     */
    private Date storageTime;

    /**
     * 对应数据库表字段 ipad.collar_time
     */
    private Date collarTime;

    /**
     * 对应数据库表字段 ipad.batch_number
     */
    private String batchNumber;

    /**
     * 对应数据库表字段 ipad.deleted
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
     * 获得字段 ipad.id 的值
     *
     * @return the value of ipad.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 ipad.id 的值
     *
     * @param id the value for ipad.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 ipad.org_id 的值
     *
     * @return the value of ipad.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 ipad.org_id 的值
     *
     * @param orgId the value for ipad.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 ipad.hard_code 的值
     *
     * @return the value of ipad.hard_code
     */
    public String getHardCode() {
        return hardCode;
    }

    /**
     * 设置字段 ipad.hard_code 的值
     *
     * @param hardCode the value for ipad.hard_code
     */
    public void setHardCode(String hardCode) {
        this.hardCode = hardCode;
    }

    /**
     * 获得字段 ipad.sim 的值
     *
     * @return the value of ipad.sim
     */
    public String getSim() {
        return sim;
    }

    /**
     * 设置字段 ipad.sim 的值
     *
     * @param sim the value for ipad.sim
     */
    public void setSim(String sim) {
        this.sim = sim;
    }

    /**
     * 获得字段 ipad.serial_number 的值
     *
     * @return the value of ipad.serial_number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置字段 ipad.serial_number 的值
     *
     * @param serialNumber the value for ipad.serial_number
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * 获得字段 ipad.state 的值
     *
     * @return the value of ipad.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 ipad.state 的值
     *
     * @param state the value for ipad.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 ipad.related 的值
     *
     * @return the value of ipad.related
     */
    public Integer getRelated() {
        return related;
    }

    /**
     * 设置字段 ipad.related 的值
     *
     * @param related the value for ipad.related
     */
    public void setRelated(Integer related) {
        this.related = related;
    }

    /**
     * 获得字段 ipad.storage_time 的值
     *
     * @return the value of ipad.storage_time
     */
    public Date getStorageTime() {
        return storageTime;
    }

    /**
     * 设置字段 ipad.storage_time 的值
     *
     * @param storageTime the value for ipad.storage_time
     */
    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }

    /**
     * 获得字段 ipad.collar_time 的值
     *
     * @return the value of ipad.collar_time
     */
    public Date getCollarTime() {
        return collarTime;
    }

    /**
     * 设置字段 ipad.collar_time 的值
     *
     * @param collarTime the value for ipad.collar_time
     */
    public void setCollarTime(Date collarTime) {
        this.collarTime = collarTime;
    }

    /**
     * 获得字段 ipad.batch_number 的值
     *
     * @return the value of ipad.batch_number
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * 设置字段 ipad.batch_number 的值
     *
     * @param batchNumber the value for ipad.batch_number
     */
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * 获得字段 ipad.deleted 的值
     *
     * @return the value of ipad.deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置字段 ipad.deleted 的值
     *
     * @param deleted the value for ipad.deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}