package com.wocai.jrt.orders.model;

import java.util.Date;

public class Appointment {
    /**
     * order by 排序语句
     * 对应数据库表字段 appointment
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 appointment
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 appointment
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 appointment
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 appointment.id
     */
    private String id;

    /**
     * 对应数据库表字段 appointment.investor_id
     */
    private String investorId;

    /**
     * 对应数据库表字段 appointment.product_id
     */
    private String productId;

    /**
     * 对应数据库表字段 appointment.product_name
     */
    private String productName;

    /**
     * 对应数据库表字段 appointment.product_brief_name
     */
    private String productBriefName;

    /**
     * 对应数据库表字段 appointment.order_amount
     */
    private Double orderAmount;

    /**
     * 对应数据库表字段 appointment.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 appointment.employee_name
     */
    private String employeeName;

    /**
     * 对应数据库表字段 appointment.create_time
     */
    private Date createTime;

    /**
     * 对应数据库表字段 appointment.latest_handle_time
     */
    private Date latestHandleTime;

    /**
     * 对应数据库表字段 appointment.complete_time
     */
    private Date completeTime;

    /**
     * 对应数据库表字段 appointment.allocated
     */
    private Boolean allocated;

    /**
     * 对应数据库表字段 appointment.reserved
     */
    private Boolean reserved;

    /**
     * 对应数据库表字段 appointment.org_id
     */
    private String orgId;

    /**
     * 对应数据库表字段 appointment.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 appointment.opinion
     */
    private String opinion;
    
    /**
     * 预约时间
     */
    private Date appointTime;
    
    public Date getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

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
     * 获得字段 appointment.id 的值
     *
     * @return the value of appointment.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 appointment.id 的值
     *
     * @param id the value for appointment.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 appointment.investor_id 的值
     *
     * @return the value of appointment.investor_id
     */
    public String getInvestorId() {
        return investorId;
    }

    /**
     * 设置字段 appointment.investor_id 的值
     *
     * @param investorId the value for appointment.investor_id
     */
    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    /**
     * 获得字段 appointment.product_id 的值
     *
     * @return the value of appointment.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置字段 appointment.product_id 的值
     *
     * @param productId the value for appointment.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获得字段 appointment.product_name 的值
     *
     * @return the value of appointment.product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置字段 appointment.product_name 的值
     *
     * @param productName the value for appointment.product_name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获得字段 appointment.product_brief_name 的值
     *
     * @return the value of appointment.product_brief_name
     */
    public String getProductBriefName() {
        return productBriefName;
    }

    /**
     * 设置字段 appointment.product_brief_name 的值
     *
     * @param productBriefName the value for appointment.product_brief_name
     */
    public void setProductBriefName(String productBriefName) {
        this.productBriefName = productBriefName;
    }

    /**
     * 获得字段 appointment.order_amount 的值
     *
     * @return the value of appointment.order_amount
     */
    public Double getOrderAmount() {
        return orderAmount;
    }

    /**
     * 设置字段 appointment.order_amount 的值
     *
     * @param orderAmount the value for appointment.order_amount
     */
    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获得字段 appointment.employee_id 的值
     *
     * @return the value of appointment.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 appointment.employee_id 的值
     *
     * @param employeeId the value for appointment.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 appointment.employee_name 的值
     *
     * @return the value of appointment.employee_name
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置字段 appointment.employee_name 的值
     *
     * @param employeeName the value for appointment.employee_name
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 获得字段 appointment.create_time 的值
     *
     * @return the value of appointment.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置字段 appointment.create_time 的值
     *
     * @param createTime the value for appointment.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得字段 appointment.latest_handle_time 的值
     *
     * @return the value of appointment.latest_handle_time
     */
    public Date getLatestHandleTime() {
        return latestHandleTime;
    }

    /**
     * 设置字段 appointment.latest_handle_time 的值
     *
     * @param latestHandleTime the value for appointment.latest_handle_time
     */
    public void setLatestHandleTime(Date latestHandleTime) {
        this.latestHandleTime = latestHandleTime;
    }

    /**
     * 获得字段 appointment.complete_time 的值
     *
     * @return the value of appointment.complete_time
     */
    public Date getCompleteTime() {
        return completeTime;
    }

    /**
     * 设置字段 appointment.complete_time 的值
     *
     * @param completeTime the value for appointment.complete_time
     */
    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    /**
     * 获得字段 appointment.allocated 的值
     *
     * @return the value of appointment.allocated
     */
    public Boolean getAllocated() {
        return allocated;
    }

    /**
     * 设置字段 appointment.allocated 的值
     *
     * @param allocated the value for appointment.allocated
     */
    public void setAllocated(Boolean allocated) {
        this.allocated = allocated;
    }

    /**
     * 获得字段 appointment.reserved 的值
     *
     * @return the value of appointment.reserved
     */
    public Boolean getReserved() {
        return reserved;
    }

    /**
     * 设置字段 appointment.reserved 的值
     *
     * @param reserved the value for appointment.reserved
     */
    public void setReserved(Boolean reserved) {
        this.reserved = reserved;
    }

    /**
     * 获得字段 appointment.org_id 的值
     *
     * @return the value of appointment.org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置字段 appointment.org_id 的值
     *
     * @param orgId the value for appointment.org_id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获得字段 appointment.state 的值
     *
     * @return the value of appointment.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 appointment.state 的值
     *
     * @param state the value for appointment.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 appointment.opinion 的值
     *
     * @return the value of appointment.opinion
     */
    public String getOpinion() {
        return opinion;
    }

    /**
     * 设置字段 appointment.opinion 的值
     *
     * @param opinion the value for appointment.opinion
     */
    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
