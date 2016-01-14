package com.wocai.jrt.orders.bean;

import java.math.BigDecimal;
import java.util.Date;

public class AppointmentResBean {
	 /**
     * 预约单id
     */
	 private String id;
	 /**
     * 投资人id
     */
	 private String investorId;
	 /**
	 * 投资人姓名
     */
	 private String investorName;
	 /**
	 * 投资人头像
     */
	 private String avatar;
	/**
     * 最晚处理时间
     */
	 private Date latestHandleTime;
	 /**
     * 预约时间
     */
	 private Date appointTime;
	 /**
     * 创建时间
     */
	 private Date createTime;
	 /**
     * 完成时间
     */
	 private Date completeTime;
	 /**
     * 订单状态
     */
	 private Integer state;
	 /**
     * 产品id
     */
	 private String productId;
	 /**
     * 产品名称
     */
	 private String productName;	
	 /**
     * 产品简称
     */
	 private String briefName;
	 /**
	  * 订单金额
	  */
	 private BigDecimal orderAmount;
	 /**
	  * 机构id
	  */
	 private String orgId;
	 /**
	  * 员工id
	  */
	 private String employeeId;
	 /**
	  * 员工姓名
	  */
	 private String employeeName;
	 
	public String getBriefName() {
		return briefName;
	}
	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}
	public Date getAppointTime() {
		return appointTime;
	}
	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInvestorId() {
		return investorId;
	}
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}
	public String getInvestorName() {
		return investorName;
	}
	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	public Date getLatestHandleTime() {
		return latestHandleTime;
	}
	public void setLatestHandleTime(Date latestHandleTime) {
		this.latestHandleTime = latestHandleTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCompleteTime() {
		return completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	 
	 
}
