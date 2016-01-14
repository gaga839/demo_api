package com.wocai.jrt.orders.bean;

import java.util.Date;

/**
 * 订单查询请求参数bean
 * @author zhangyz
 * @date 2015年7月28日 上午9:40:47
 */
public class OrdersReqBean {
	/**
     * 排序值
     */
	private String orderBy;
	/**
     * 订单id
     */
	private String orderId;
	/**
     * 机构id
     */
	private String orgId;
	/**
	 * 产品id
	 */
	private String productId;
	 /**
     * 员工id
     */
	private String employeeId;
	 /**
     * 投资人id
     */
	private String investorId;
	 /**
     * 投资人姓名、身份证、手机号
     */
	private String investorKey;
	 /**
     * 员工姓名、工号、手机号
     */
	private String employeeKey;
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
     * 团队id
     */
	private String groupId;
	 /**
     * 是否删除
     */
	private Boolean deleted;
	
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	public String getInvestorId() {
		return investorId;
	}
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}
	public String getEmployeeKey() {
		return employeeKey;
	}
	public void setEmployeeKey(String employeeKey) {
		this.employeeKey = employeeKey;
	}
	
}
