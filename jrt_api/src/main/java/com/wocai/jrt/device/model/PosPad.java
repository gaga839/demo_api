package com.wocai.jrt.device.model;

import java.util.Date;

public class PosPad {
    /**
     * order by 排序语句
     * 对应数据库表字段 pos_pad
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 pos_pad
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 pos_pad
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 pos_pad
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 pos_pad.id
     */
    private String id;

    /**
     * 对应数据库表字段 pos_pad.pos_id
     */
    private String posId;

    /**
     * 对应数据库表字段 pos_pad.pad_id
     */
    private String padId;

    /**
     * 对应数据库表字段 pos_pad.end_time
     */
    private Date endTime;

    /**
     * 对应数据库表字段 pos_pad.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 pos_pad.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 pos_pad.binding_time
     */
    private Date bindingTime;

    /**
     * 对应数据库表字段 pos_pad.collar_time
     */
    private Date collarTime;

    /**
     * 对应数据库表字段 pos_pad.allocated_time
     */
    private Date allocatedTime;

    /**
     * 对应数据库表字段 pos_pad.allocated
     */
    private Boolean allocated;

    /**
     * 对应数据库表字段 pos_pad.employee_id
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
     * 获得字段 pos_pad.id 的值
     *
     * @return the value of pos_pad.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 pos_pad.id 的值
     *
     * @param id the value for pos_pad.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 pos_pad.pos_id 的值
     *
     * @return the value of pos_pad.pos_id
     */
    public String getPosId() {
        return posId;
    }

    /**
     * 设置字段 pos_pad.pos_id 的值
     *
     * @param posId the value for pos_pad.pos_id
     */
    public void setPosId(String posId) {
        this.posId = posId;
    }

    /**
     * 获得字段 pos_pad.pad_id 的值
     *
     * @return the value of pos_pad.pad_id
     */
    public String getPadId() {
        return padId;
    }

    /**
     * 设置字段 pos_pad.pad_id 的值
     *
     * @param padId the value for pos_pad.pad_id
     */
    public void setPadId(String padId) {
        this.padId = padId;
    }

    /**
     * 获得字段 pos_pad.end_time 的值
     *
     * @return the value of pos_pad.end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置字段 pos_pad.end_time 的值
     *
     * @param endTime the value for pos_pad.end_time
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获得字段 pos_pad.org_id 的值
     *
     * @return the value of pos_pad.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 pos_pad.org_id 的值
     *
     * @param orgId the value for pos_pad.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 pos_pad.state 的值
     *
     * @return the value of pos_pad.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 pos_pad.state 的值
     *
     * @param state the value for pos_pad.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 pos_pad.binding_time 的值
     *
     * @return the value of pos_pad.binding_time
     */
    public Date getBindingTime() {
        return bindingTime;
    }

    /**
     * 设置字段 pos_pad.binding_time 的值
     *
     * @param bindingTime the value for pos_pad.binding_time
     */
    public void setBindingTime(Date bindingTime) {
        this.bindingTime = bindingTime;
    }

    /**
     * 获得字段 pos_pad.collar_time 的值
     *
     * @return the value of pos_pad.collar_time
     */
    public Date getCollarTime() {
        return collarTime;
    }

    /**
     * 设置字段 pos_pad.collar_time 的值
     *
     * @param collarTime the value for pos_pad.collar_time
     */
    public void setCollarTime(Date collarTime) {
        this.collarTime = collarTime;
    }

    /**
     * 获得字段 pos_pad.allocated_time 的值
     *
     * @return the value of pos_pad.allocated_time
     */
    public Date getAllocatedTime() {
        return allocatedTime;
    }

    /**
     * 设置字段 pos_pad.allocated_time 的值
     *
     * @param allocatedTime the value for pos_pad.allocated_time
     */
    public void setAllocatedTime(Date allocatedTime) {
        this.allocatedTime = allocatedTime;
    }

    /**
     * 获得字段 pos_pad.allocated 的值
     *
     * @return the value of pos_pad.allocated
     */
    public Boolean getAllocated() {
        return allocated;
    }

    /**
     * 设置字段 pos_pad.allocated 的值
     *
     * @param allocated the value for pos_pad.allocated
     */
    public void setAllocated(Boolean allocated) {
        this.allocated = allocated;
    }

    /**
     * 获得字段 pos_pad.employee_id 的值
     *
     * @return the value of pos_pad.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 pos_pad.employee_id 的值
     *
     * @param employeeId the value for pos_pad.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}