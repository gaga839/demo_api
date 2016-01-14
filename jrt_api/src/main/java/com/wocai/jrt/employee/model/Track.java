package com.wocai.jrt.employee.model;

import java.math.BigDecimal;
import java.util.Date;

public class Track {
    /**
     * order by 排序语句
     * 对应数据库表字段 track
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 track
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 track
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 track
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 track.id
     */
    private String id;

    /**
     * 对应数据库表字段 track.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 track.time
     */
    private Date time;

    /**
     * 对应数据库表字段 track.location
     */
    private String location;

    /**
     * 对应数据库表字段 track.px
     */
    private BigDecimal px;

    /**
     * 对应数据库表字段 track.py
     */
    private BigDecimal py;

    /**
     * 对应数据库表字段 track.org_id
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
     * 获得字段 track.id 的值
     *
     * @return the value of track.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 track.id 的值
     *
     * @param id the value for track.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 track.employee_id 的值
     *
     * @return the value of track.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 track.employee_id 的值
     *
     * @param employeeId the value for track.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 track.time 的值
     *
     * @return the value of track.time
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置字段 track.time 的值
     *
     * @param time the value for track.time
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获得字段 track.location 的值
     *
     * @return the value of track.location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置字段 track.location 的值
     *
     * @param location the value for track.location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获得字段 track.px 的值
     *
     * @return the value of track.px
     */
    public BigDecimal getPx() {
        return px;
    }

    /**
     * 设置字段 track.px 的值
     *
     * @param px the value for track.px
     */
    public void setPx(BigDecimal px) {
        this.px = px;
    }

    /**
     * 获得字段 track.py 的值
     *
     * @return the value of track.py
     */
    public BigDecimal getPy() {
        return py;
    }

    /**
     * 设置字段 track.py 的值
     *
     * @param py the value for track.py
     */
    public void setPy(BigDecimal py) {
        this.py = py;
    }

    /**
     * 获得字段 track.org_id 的值
     *
     * @return the value of track.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 track.org_id 的值
     *
     * @param orgId the value for track.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}