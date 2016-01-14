package com.wocai.jrt.employee.model;

import java.util.Date;

public class EmployeeCommissionHistory {
	/**
	 * order by 排序语句 对应数据库表字段 employee_commission_history
	 */
	private String orderBy;

	/**
	 * 分页开始记录 对应数据库表字段 employee_commission_history
	 */
	private Integer start;

	/**
	 * 分页大小 对应数据库表字段 employee_commission_history
	 */
	private int pageSize = 10;

	/**
	 * 是否去重 对应数据库表字段 employee_commission_history
	 */
	private boolean distinct;

	/**
	 * 对应数据库表字段 employee_commission_history.id
	 */
	private String id;

	/**
	 * 对应数据库表字段 employee_commission_history.order_id
	 */
	private String orderId;

	/**
	 * 对应数据库表字段 employee_commission_history.product_id
	 */
	private String productId;

	/**
	 * 对应数据库表字段 employee_commission_history.commission_rate
	 */
	private Double commissionRate;

	/**
	 * 对应数据库表字段 employee_commission_history.commission
	 */
	private Double commission;

	/**
	 * 对应数据库表字段 employee_commission_history.employee_id
	 */
	private String employeeId;

	/**
	 * 对应数据库表字段 employee_commission_history.create_time
	 */
	private Date createTime;

	/**
	 * 对应数据库表字段 employee_commission_history.dividend_rate
	 */
	private Double dividendRate;

	/**
	 * 对应数据库表字段 employee_commission_history.dividend
	 */
	private Double dividend;

	private Integer state;

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
	 * 获得字段 employee_commission_history.id 的值
	 *
	 * @return the value of employee_commission_history.id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置字段 employee_commission_history.id 的值
	 *
	 * @param id
	 *            the value for employee_commission_history.id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获得字段 employee_commission_history.order_id 的值
	 *
	 * @return the value of employee_commission_history.order_id
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * 设置字段 employee_commission_history.order_id 的值
	 *
	 * @param orderId
	 *            the value for employee_commission_history.order_id
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * 获得字段 employee_commission_history.product_id 的值
	 *
	 * @return the value of employee_commission_history.product_id
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * 设置字段 employee_commission_history.product_id 的值
	 *
	 * @param productId
	 *            the value for employee_commission_history.product_id
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * 获得字段 employee_commission_history.commission_rate 的值
	 *
	 * @return the value of employee_commission_history.commission_rate
	 */
	public Double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * 设置字段 employee_commission_history.commission_rate 的值
	 *
	 * @param commissionRate
	 *            the value for employee_commission_history.commission_rate
	 */
	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = commissionRate;
	}

	/**
	 * 获得字段 employee_commission_history.commission 的值
	 *
	 * @return the value of employee_commission_history.commission
	 */
	public Double getCommission() {
		return commission;
	}

	/**
	 * 设置字段 employee_commission_history.commission 的值
	 *
	 * @param commission
	 *            the value for employee_commission_history.commission
	 */
	public void setCommission(Double commission) {
		this.commission = commission;
	}

	/**
	 * 获得字段 employee_commission_history.employee_id 的值
	 *
	 * @return the value of employee_commission_history.employee_id
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * 设置字段 employee_commission_history.employee_id 的值
	 *
	 * @param employeeId
	 *            the value for employee_commission_history.employee_id
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * 获得字段 employee_commission_history.create_time 的值
	 *
	 * @return the value of employee_commission_history.create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置字段 employee_commission_history.create_time 的值
	 *
	 * @param createTime
	 *            the value for employee_commission_history.create_time
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获得字段 employee_commission_history.dividend_rate 的值
	 *
	 * @return the value of employee_commission_history.dividend_rate
	 */
	public Double getDividendRate() {
		return dividendRate;
	}

	/**
	 * 设置字段 employee_commission_history.dividend_rate 的值
	 *
	 * @param dividendRate
	 *            the value for employee_commission_history.dividend_rate
	 */
	public void setDividendRate(Double dividendRate) {
		this.dividendRate = dividendRate;
	}

	/**
	 * 获得字段 employee_commission_history.dividend 的值
	 *
	 * @return the value of employee_commission_history.dividend
	 */
	public Double getDividend() {
		return dividend;
	}

	/**
	 * 设置字段 employee_commission_history.dividend 的值
	 *
	 * @param dividend
	 *            the value for employee_commission_history.dividend
	 */
	public void setDividend(Double dividend) {
		this.dividend = dividend;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}