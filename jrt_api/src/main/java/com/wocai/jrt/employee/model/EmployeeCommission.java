package com.wocai.jrt.employee.model;

import java.math.BigDecimal;
import java.util.Date;

public class EmployeeCommission {
    /**
     * order by 排序语句
     * 对应数据库表字段 employee_commission
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 employee_commission
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 employee_commission
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 employee_commission
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 employee_commission.id
     */
    private String id;

    /**
     * 对应数据库表字段 employee_commission.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 employee_commission.product_id
     */
    private String productId;

    /**
     * 对应数据库表字段 employee_commission.commission_rate
     */
    private BigDecimal commissionRate;

    /**
     * 对应数据库表字段 employee_commission.commission
     */
    private BigDecimal commission;

    /**
     * 对应数据库表字段 employee_commission.dividend_rate
     */
    private BigDecimal dividendRate;

    /**
     * 对应数据库表字段 employee_commission.dividend
     */
    private BigDecimal dividend;

    /**
     * 对应数据库表字段 employee_commission.group_id
     */
    private String groupId;

    /**
     * 对应数据库表字段 employee_commission.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 employee_commission.org_id
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
     * 获得字段 employee_commission.id 的值
     *
     * @return the value of employee_commission.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 employee_commission.id 的值
     *
     * @param id the value for employee_commission.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 employee_commission.employee_id 的值
     *
     * @return the value of employee_commission.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 employee_commission.employee_id 的值
     *
     * @param employeeId the value for employee_commission.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 employee_commission.product_id 的值
     *
     * @return the value of employee_commission.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 employee_commission.product_id 的值
     *
     * @param productId the value for employee_commission.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获得字段 employee_commission.commission_rate 的值
     *
     * @return the value of employee_commission.commission_rate
     */
    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    /**
     * 设置字段 employee_commission.commission_rate 的值
     *
     * @param commissionRate the value for employee_commission.commission_rate
     */
    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * 获得字段 employee_commission.commission 的值
     *
     * @return the value of employee_commission.commission
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * 设置字段 employee_commission.commission 的值
     *
     * @param commission the value for employee_commission.commission
     */
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    /**
     * 获得字段 employee_commission.dividend_rate 的值
     *
     * @return the value of employee_commission.dividend_rate
     */
    public BigDecimal getDividendRate() {
        return dividendRate;
    }

    /**
     * 设置字段 employee_commission.dividend_rate 的值
     *
     * @param dividendRate the value for employee_commission.dividend_rate
     */
    public void setDividendRate(BigDecimal dividendRate) {
        this.dividendRate = dividendRate;
    }

    /**
     * 获得字段 employee_commission.dividend 的值
     *
     * @return the value of employee_commission.dividend
     */
    public BigDecimal getDividend() {
        return dividend;
    }

    /**
     * 设置字段 employee_commission.dividend 的值
     *
     * @param dividend the value for employee_commission.dividend
     */
    public void setDividend(BigDecimal dividend) {
        this.dividend = dividend;
    }

    /**
     * 获得字段 employee_commission.group_id 的值
     *
     * @return the value of employee_commission.group_id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 设置字段 employee_commission.group_id 的值
     *
     * @param groupId the value for employee_commission.group_id
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 获得字段 employee_commission.create_time 的值
     *
     * @return the value of employee_commission.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 employee_commission.create_time 的值
     *
     * @param createTime the value for employee_commission.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 employee_commission.org_id 的值
     *
     * @return the value of employee_commission.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 employee_commission.org_id 的值
     *
     * @param orgId the value for employee_commission.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}