package com.wocai.jrt.orders.model;

import java.util.Date;

public class PayTypeAudit {
    /**
     * order by 排序语句
     * 对应数据库表字段 pay_type_audit
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 pay_type_audit
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 pay_type_audit
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 pay_type_audit
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 pay_type_audit.id
     */
    private String id;

    /**
     * 对应数据库表字段 pay_type_audit.audit_name
     */
    private String auditName;

    /**
     * 对应数据库表字段 pay_type_audit.audit_id
     */
    private String auditId;

    /**
     * 对应数据库表字段 pay_type_audit.audit_time
     */
    private Date auditTime;

    /**
     * 对应数据库表字段 pay_type_audit.result
     */
    private Boolean result;

    /**
     * 对应数据库表字段 pay_type_audit.order_id
     */
    private String orderId;

    /**
     * 对应数据库表字段 pay_type_audit.apply_reason
     */
    private String applyReason;

    /**
     * 对应数据库表字段 pay_type_audit.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 pay_type_audit.employee_name
     */
    private String employeeName;

    /**
     * 对应数据库表字段 pay_type_audit.apply_time
     */
    private Date applyTime;

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
     * 获得字段 pay_type_audit.id 的值
     *
     * @return the value of pay_type_audit.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 pay_type_audit.id 的值
     *
     * @param id the value for pay_type_audit.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 pay_type_audit.audit_name 的值
     *
     * @return the value of pay_type_audit.audit_name
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * 设置字段 pay_type_audit.audit_name 的值
     *
     * @param auditName the value for pay_type_audit.audit_name
     */
    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    /**
     * 获得字段 pay_type_audit.audit_id 的值
     *
     * @return the value of pay_type_audit.audit_id
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * 设置字段 pay_type_audit.audit_id 的值
     *
     * @param auditId the value for pay_type_audit.audit_id
     */
    public void setAuditId(String auditId) {
        this.auditId = auditId;
    }

    /**
     * 获得字段 pay_type_audit.audit_time 的值
     *
     * @return the value of pay_type_audit.audit_time
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 设置字段 pay_type_audit.audit_time 的值
     *
     * @param auditTime the value for pay_type_audit.audit_time
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * 获得字段 pay_type_audit.result 的值
     *
     * @return the value of pay_type_audit.result
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * 设置字段 pay_type_audit.result 的值
     *
     * @param result the value for pay_type_audit.result
     */
    public void setResult(Boolean result) {
        this.result = result;
    }

    /**
     * 获得字段 pay_type_audit.order_id 的值
     *
     * @return the value of pay_type_audit.order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置字段 pay_type_audit.order_id 的值
     *
     * @param orderId the value for pay_type_audit.order_id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获得字段 pay_type_audit.apply_reason 的值
     *
     * @return the value of pay_type_audit.apply_reason
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * 设置字段 pay_type_audit.apply_reason 的值
     *
     * @param applyReason the value for pay_type_audit.apply_reason
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    /**
     * 获得字段 pay_type_audit.employee_id 的值
     *
     * @return the value of pay_type_audit.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 pay_type_audit.employee_id 的值
     *
     * @param employeeId the value for pay_type_audit.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 pay_type_audit.employee_name 的值
     *
     * @return the value of pay_type_audit.employee_name
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置字段 pay_type_audit.employee_name 的值
     *
     * @param employeeName the value for pay_type_audit.employee_name
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 获得字段 pay_type_audit.apply_time 的值
     *
     * @return the value of pay_type_audit.apply_time
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * 设置字段 pay_type_audit.apply_time 的值
     *
     * @param applyTime the value for pay_type_audit.apply_time
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
}