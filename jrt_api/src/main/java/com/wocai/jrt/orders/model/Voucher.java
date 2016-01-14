package com.wocai.jrt.orders.model;

import java.util.Date;

public class Voucher {
    /**
     * order by 排序语句
     * 对应数据库表字段 voucher
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 voucher
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 voucher
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 voucher
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 voucher.id
     */
    private String id;

    /**
     * 对应数据库表字段 voucher.file_path
     */
    private String filePath;

    /**
     * 对应数据库表字段 voucher.order_id
     */
    private String orderId;

    /**
     * 对应数据库表字段 voucher.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 voucher.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 voucher.employee_id
     */
    private String employeeId;

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
     * 获得字段 voucher.id 的值
     *
     * @return the value of voucher.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 voucher.id 的值
     *
     * @param id the value for voucher.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 voucher.file_path 的值
     *
     * @return the value of voucher.file_path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置字段 voucher.file_path 的值
     *
     * @param filePath the value for voucher.file_path
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获得字段 voucher.order_id 的值
     *
     * @return the value of voucher.order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置字段 voucher.order_id 的值
     *
     * @param orderId the value for voucher.order_id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获得字段 voucher.create_time 的值
     *
     * @return the value of voucher.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 voucher.create_time 的值
     *
     * @param createTime the value for voucher.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 voucher.org_id 的值
     *
     * @return the value of voucher.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 voucher.org_id 的值
     *
     * @param orgId the value for voucher.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 voucher.employee_id 的值
     *
     * @return the value of voucher.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 voucher.employee_id 的值
     *
     * @param employeeId the value for voucher.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}