package com.wocai.jrt.employee.model;

import java.util.Date;

public class EmployeeVisit {
    /**
     * order by 排序语句
     * 对应数据库表字段 employee_visit
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 employee_visit
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 employee_visit
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 employee_visit
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 employee_visit.id
     */
    private String id;

    /**
     * 对应数据库表字段 employee_visit.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 employee_visit.employee_name
     */
    private String employeeName;

    /**
     * 对应数据库表字段 employee_visit.investor_id
     */
    private String investorId;

    /**
     * 对应数据库表字段 employee_visit.visit_time
     */
    private Date visitTime;

    /**
     * 对应数据库表字段 employee_visit.title
     */
    private String title;

    /**
     * 对应数据库表字段 employee_visit.type
     */
    private Integer type;

    /**
     * 对应数据库表字段 employee_visit.content
     */
    private String content;
    
    /**
     * 对应数据库表字段 employee_visit.order_id
     */
    private String orderId;
    /**
     * 预约单id 
     */
    private String subId;
    
    public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
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
     * 获得字段 employee_visit.id 的值
     *
     * @return the value of employee_visit.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 employee_visit.id 的值
     *
     * @param id the value for employee_visit.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 employee_visit.employee_id 的值
     *
     * @return the value of employee_visit.employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置字段 employee_visit.employee_id 的值
     *
     * @param employeeId the value for employee_visit.employee_id
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获得字段 employee_visit.employee_name 的值
     *
     * @return the value of employee_visit.employee_name
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置字段 employee_visit.employee_name 的值
     *
     * @param employeeName the value for employee_visit.employee_name
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 获得字段 employee_visit.investor_id 的值
     *
     * @return the value of employee_visit.investor_id
     */
    public String getInvestorId() {
        return investorId;
    }

    /**
     * 设置字段 employee_visit.investor_id 的值
     *
     * @param investorId the value for employee_visit.investor_id
     */
    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    /**
     * 获得字段 employee_visit.visit_time 的值
     *
     * @return the value of employee_visit.visit_time
     */
    public Date getVisitTime() {
        return visitTime;
    }

    /**
     * 设置字段 employee_visit.visit_time 的值
     *
     * @param visitTime the value for employee_visit.visit_time
     */
    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    /**
     * 获得字段 employee_visit.title 的值
     *
     * @return the value of employee_visit.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置字段 employee_visit.title 的值
     *
     * @param title the value for employee_visit.title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获得字段 employee_visit.type 的值
     *
     * @return the value of employee_visit.type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置字段 employee_visit.type 的值
     *
     * @param type the value for employee_visit.type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获得字段 employee_visit.content 的值
     *
     * @return the value of employee_visit.content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置字段 employee_visit.content 的值
     *
     * @param content the value for employee_visit.content
     */
    public void setContent(String content) {
        this.content = content;
    }

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
    
}