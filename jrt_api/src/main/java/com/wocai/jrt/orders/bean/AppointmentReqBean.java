package com.wocai.jrt.orders.bean;

import java.util.Date;

/**
 * 预约单查询请求参数bean
 * @author zhangyz
 * @date 2015年7月28日 上午9:40:47
 */
public class AppointmentReqBean {
	 /**
     * 预约订单id
     */
	private String appointmentId;
	 /**
	  * 机构id
	  */
	 private String orgId;
	 /**
     * 投资人id
     */
	private String investorId;
	 /**
     * 员工id
     */
	private String employeeId;
	 /**
     * 员工姓名
     */
	private String employeeName;
	/**
     * 产品id
     */
	private String productId;
	/**
     * 产品名称
     */
	private String productName;
	 /**
     * 投资人姓名、身份证、手机号
     */
	private String investorKey;
	 /**
     * 产品名称、代码
     */
	private String productKey;
	 /**
     * 订单状态
     */
	private String state;
	 /**
     * 下单启始时间
     */
	private Date  start;
	 /**
     * 下单终止时间
     */
	private Date  end;
	 /**
     * 页码
     */
	private Integer page;
	 /**
     * 页大小
     */
	private Integer pageSize;
	/**
     * 投资人姓名
     */
	private String investorName;
	/**
     * 投资人手机号
     */
	private String mobile;
	/**
	 * 预约时间
	 */
	private Date appointTime;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 证件号
	 */
	private String idcard;
	/**
	 * 证件类型
	 */
	private String idType;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 公司
	 */
	private String company;
	/**
	 * 公司
	 */
	private String address;
	/**
	 * 预约金额
	 */
	private String orderAmount;
	
	
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getInvestorName() {
		return investorName;
	}
	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getAppointTime() {
		return appointTime;
	}
	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getInvestorId() {
		return investorId;
	}
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getInvestorKey() {
		return investorKey;
	}
	public void setInvestorKey(String investorKey) {
		this.investorKey = investorKey;
	}
	public String getProductKey() {
		return productKey;
	}
	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	
}
