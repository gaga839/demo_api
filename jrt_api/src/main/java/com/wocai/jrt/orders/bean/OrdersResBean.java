package com.wocai.jrt.orders.bean;

import java.util.Date;

/**
 * 订单简要信息bean
 * @author zhangyz
 * @date 2015年7月27日 下午2:14:52
 */
public class OrdersResBean {
	 /**
     * 订单id/预约id
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
     * 下单时间
     */
	 private Date orderTime;
	 /**
	  * 完成时间
	  */
	 private Date latestHandleTime;
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
	 private String briefName;	
	 /**
     * 产品简称
     */
	 private String productName;	
	 /**
	  * 订单金额
	  */
	 private Double orderAmount;
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
	 /**
	  * 佣金比例
	  */
	private Double commission;
	
	
	public String getBriefName() {
		return briefName;
	}
	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}
	public Date getLatestHandleTime() {
		return latestHandleTime;
	}
	public void setLatestHandleTime(Date latestHandleTime) {
		this.latestHandleTime = latestHandleTime;
	}
	public Date getCompleteTime() {
		return completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}
	public Double getCommission() {
		return commission;
	}
	public void setCommission(Double commission) {
		this.commission = commission;
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
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
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
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	 public String getInvestorName() {
		return investorName;
	}
	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	} 
	
}

