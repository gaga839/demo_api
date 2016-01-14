package com.wocai.jrt.employee.model;

import java.util.Date;

public class Checkin {
    /**
     * order by 排序语句
     * 对应数据库表字段 checkin
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 checkin
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 checkin
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 checkin
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 checkin.id
     */
    private String id;

    /**
     * 对应数据库表字段 checkin.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 checkin.employee_name
     */
    private String employeeName;

    /**
     * 对应数据库表字段 checkin.sign_time
     */
    private Date signTime;

    /**
     * 对应数据库表字段 checkin.sign_out_time
     */
    private Date signOutTime;

    /**
     * 对应数据库表字段 checkin.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 checkin.px
     */
    private Double px;

    /**
     * 对应数据库表字段 checkin.py
     */
    private Double py;

    /**
     * 对应数据库表字段 checkin.location
     */
    private String location;

    /**
     * 对应数据库表字段 checkin.investor_id
     */
    private String investorId;

    /**
     * 对应数据库表字段 checkin.remark
     */
    private String remark;

    /**
     * 对应数据库表字段 checkin.sign_date
     */
    private Date signDate;

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
    public void setPage(Integer start) {
        this.start = start;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getPage() {
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
     * 获得字段 checkin.id 的值
     *
     * @return the value of checkin.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 checkin.id 的值
     *
     * @param id the value for checkin.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 checkin.employee_id 的值
     *
     * @return the value of checkin.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 checkin.employee_id 的值
     *
     * @param employeeId the value for checkin.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 checkin.employee_name 的值
     *
     * @return the value of checkin.employee_name
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置字段 checkin.employee_name 的值
     *
     * @param employeeName the value for checkin.employee_name
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 获得字段 checkin.sign_time 的值
     *
     * @return the value of checkin.sign_time
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * 设置字段 checkin.sign_time 的值
     *
     * @param signTime the value for checkin.sign_time
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * 获得字段 checkin.sign_out_time 的值
     *
     * @return the value of checkin.sign_out_time
     */
    public Date getSignOutTime() {
        return signOutTime;
    }

    /**
     * 设置字段 checkin.sign_out_time 的值
     *
     * @param signOutTime the value for checkin.sign_out_time
     */
    public void setSignOutTime(Date signOutTime) {
        this.signOutTime = signOutTime;
    }

    /**
     * 获得字段 checkin.org_id 的值
     *
     * @return the value of checkin.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 checkin.org_id 的值
     *
     * @param orgId the value for checkin.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 checkin.px 的值
     *
     * @return the value of checkin.px
     */
    public Double getPx() {
        return px;
    }

    /**
     * 设置字段 checkin.px 的值
     *
     * @param px the value for checkin.px
     */
    public void setPx(Double px) {
        this.px = px;
    }

    /**
     * 获得字段 checkin.py 的值
     *
     * @return the value of checkin.py
     */
    public Double getPy() {
        return py;
    }

    /**
     * 设置字段 checkin.py 的值
     *
     * @param py the value for checkin.py
     */
    public void setPy(Double py) {
        this.py = py;
    }

    /**
     * 获得字段 checkin.location 的值
     *
     * @return the value of checkin.location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置字段 checkin.location 的值
     *
     * @param location the value for checkin.location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获得字段 checkin.investor_id 的值
     *
     * @return the value of checkin.investor_id
     */
    public String getInvestorId() {
        return investorId;
    }

    /**
     * 设置字段 checkin.investor_id 的值
     *
     * @param investorId the value for checkin.investor_id
     */
    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    /**
     * 获得字段 checkin.remark 的值
     *
     * @return the value of checkin.remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置字段 checkin.remark 的值
     *
     * @param remark the value for checkin.remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获得字段 checkin.sign_date 的值
     *
     * @return the value of checkin.sign_date
     */
    public Date getSignDate() {
        return signDate;
    }

    /**
     * 设置字段 checkin.sign_date 的值
     *
     * @param signDate the value for checkin.sign_date
     */
    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }
}