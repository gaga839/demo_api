package com.wocai.jrt.orders.model;

import java.util.Date;

public class PaySerial {
    /**
     * order by 排序语句
     * 对应数据库表字段 pay_serial
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 pay_serial
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 pay_serial
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 pay_serial
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 pay_serial.id
     */
    private String id;

    /**
     * 对应数据库表字段 pay_serial.order_id
     */
    private String orderId;

    /**
     * 对应数据库表字段 pay_serial.pay_amount
     */
    private Double payAmount;

    /**
     * 对应数据库表字段 pay_serial.investor_id
     */
    private String investorId;

    /**
     * 对应数据库表字段 pay_serial.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 pay_serial.pay_time
     */
    private Date payTime;

    /**
     * 对应数据库表字段 pay_serial.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 pay_serial.pay_serial
     */
    private String paySerial;

    /**
     * 对应数据库表字段 pay_serial.bank_deposit
     */
    private String bankDeposit;

    /**
     * 对应数据库表字段 pay_serial.bank_account
     */
    private String bankAccount;

    /**
     * 对应数据库表字段 pay_serial.bank_name
     */
    private String bankName;

    /**
     * 对应数据库表字段 pay_serial.org_id
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
     * 获得字段 pay_serial.id 的值
     *
     * @return the value of pay_serial.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 pay_serial.id 的值
     *
     * @param id the value for pay_serial.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 pay_serial.order_id 的值
     *
     * @return the value of pay_serial.order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置字段 pay_serial.order_id 的值
     *
     * @param orderId the value for pay_serial.order_id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获得字段 pay_serial.pay_amount 的值
     *
     * @return the value of pay_serial.pay_amount
     */
    public Double getPayAmount() {
        return payAmount;
    }

    /**
     * 设置字段 pay_serial.pay_amount 的值
     *
     * @param payAmount the value for pay_serial.pay_amount
     */
    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获得字段 pay_serial.investor_id 的值
     *
     * @return the value of pay_serial.investor_id
     */
    public String getInvestorId() {
        return investorId;
    }

    /**
     * 设置字段 pay_serial.investor_id 的值
     *
     * @param investorId the value for pay_serial.investor_id
     */
    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    /**
     * 获得字段 pay_serial.employee_id 的值
     *
     * @return the value of pay_serial.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 pay_serial.employee_id 的值
     *
     * @param employeeId the value for pay_serial.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 pay_serial.pay_time 的值
     *
     * @return the value of pay_serial.pay_time
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置字段 pay_serial.pay_time 的值
     *
     * @param payTime the value for pay_serial.pay_time
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获得字段 pay_serial.state 的值
     *
     * @return the value of pay_serial.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 pay_serial.state 的值
     *
     * @param state the value for pay_serial.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 pay_serial.pay_serial 的值
     *
     * @return the value of pay_serial.pay_serial
     */
    public String getPaySerial() {
        return paySerial;
    }

    /**
     * 设置字段 pay_serial.pay_serial 的值
     *
     * @param paySerial the value for pay_serial.pay_serial
     */
    public void setPaySerial(String paySerial) {
        this.paySerial = paySerial;
    }

    /**
     * 获得字段 pay_serial.bank_deposit 的值
     *
     * @return the value of pay_serial.bank_deposit
     */
    public String getBankDeposit() {
        return bankDeposit;
    }

    /**
     * 设置字段 pay_serial.bank_deposit 的值
     *
     * @param bankDeposit the value for pay_serial.bank_deposit
     */
    public void setBankDeposit(String bankDeposit) {
        this.bankDeposit = bankDeposit;
    }

    /**
     * 获得字段 pay_serial.bank_account 的值
     *
     * @return the value of pay_serial.bank_account
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 设置字段 pay_serial.bank_account 的值
     *
     * @param bankAccount the value for pay_serial.bank_account
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * 获得字段 pay_serial.bank_name 的值
     *
     * @return the value of pay_serial.bank_name
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置字段 pay_serial.bank_name 的值
     *
     * @param bankName the value for pay_serial.bank_name
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获得字段 pay_serial.org_id 的值
     *
     * @return the value of pay_serial.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 pay_serial.org_id 的值
     *
     * @param orgId the value for pay_serial.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}