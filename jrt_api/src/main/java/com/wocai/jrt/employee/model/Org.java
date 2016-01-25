package com.wocai.jrt.employee.model;

import java.util.Date;

public class Org {
	/**
	 * order by 排序语句 对应数据库表字段 org
	 */
	private String orderBy;

	/**
	 * 分页开始记录 对应数据库表字段 org
	 */
	private Integer start;

	/**
	 * 分页大小 对应数据库表字段 org
	 */
	private int pageSize = 10;

	/**
	 * 是否去重 对应数据库表字段 org
	 */
	private boolean distinct;

	/**
	 * 对应数据库表字段 org.id
	 */
	private String id;

	/**
	 * 对应数据库表字段 org.org_code
	 */
	private String orgCode;

	/**
	 * 对应数据库表字段 org.name
	 */
	private String name;

	/**
	 * 对应数据库表字段 org.brief_name
	 */
	private String briefName;

	/**
	 * 对应数据库表字段 org.state
	 */
	private Integer state;

	/**
	 * 对应数据库表字段 org.org_group_id
	 */
	private String orgGroupId;

	/**
	 * 对应数据库表字段 org.summary
	 */
	private String summary;

	/**
	 * 对应数据库表字段 org.address
	 */
	private String address;

	/**
	 * 对应数据库表字段 org.contact
	 */
	private String contact;

	/**
	 * 对应数据库表字段 org.mobile
	 */
	private String mobile;

	/**
	 * 对应数据库表字段 org.email
	 */
	private String email;

	/**
	 * 对应数据库表字段 org.create_time
	 */
	private Date createTime;

	/**
	 * 对应数据库表字段 org.end_time
	 */
	private Date endTime;

	/**
	 * 对应数据库表字段 org.device_number
	 */
	private Integer deviceNumber;

	/**
	 * 对应数据库表字段 org.remark
	 */
	private String remark;

	/**
	 * 对应数据库表字段 org.bank_customer_no
	 */
	private String bankCustomerNo;

	/**
	 * 对应数据库表字段 org.bank_terminal_no
	 */
	private String bankTerminalNo;

	private String riskDisclosure;

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
	 * 获得字段 org.id 的值
	 *
	 * @return the value of org.id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置字段 org.id 的值
	 *
	 * @param id
	 *            the value for org.id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获得字段 org.org_code 的值
	 *
	 * @return the value of org.org_code
	 */
	public String getOrgCode() {
		return orgCode;
	}

	/**
	 * 设置字段 org.org_code 的值
	 *
	 * @param orgCode
	 *            the value for org.org_code
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/**
	 * 获得字段 org.name 的值
	 *
	 * @return the value of org.name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置字段 org.name 的值
	 *
	 * @param name
	 *            the value for org.name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获得字段 org.brief_name 的值
	 *
	 * @return the value of org.brief_name
	 */
	public String getBriefName() {
		return briefName;
	}

	/**
	 * 设置字段 org.brief_name 的值
	 *
	 * @param briefName
	 *            the value for org.brief_name
	 */
	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}

	/**
	 * 获得字段 org.state 的值
	 *
	 * @return the value of org.state
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * 设置字段 org.state 的值
	 *
	 * @param state
	 *            the value for org.state
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 获得字段 org.org_group_id 的值
	 *
	 * @return the value of org.org_group_id
	 */
	public String getOrgGroupId() {
		return orgGroupId;
	}

	/**
	 * 设置字段 org.org_group_id 的值
	 *
	 * @param orgGroupId
	 *            the value for org.org_group_id
	 */
	public void setOrgGroupId(String orgGroupId) {
		this.orgGroupId = orgGroupId;
	}

	/**
	 * 获得字段 org.summary 的值
	 *
	 * @return the value of org.summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * 设置字段 org.summary 的值
	 *
	 * @param summary
	 *            the value for org.summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * 获得字段 org.address 的值
	 *
	 * @return the value of org.address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置字段 org.address 的值
	 *
	 * @param address
	 *            the value for org.address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获得字段 org.contact 的值
	 *
	 * @return the value of org.contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * 设置字段 org.contact 的值
	 *
	 * @param contact
	 *            the value for org.contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * 获得字段 org.mobile 的值
	 *
	 * @return the value of org.mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 设置字段 org.mobile 的值
	 *
	 * @param mobile
	 *            the value for org.mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 获得字段 org.email 的值
	 *
	 * @return the value of org.email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置字段 org.email 的值
	 *
	 * @param email
	 *            the value for org.email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获得字段 org.create_time 的值
	 *
	 * @return the value of org.create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置字段 org.create_time 的值
	 *
	 * @param createTime
	 *            the value for org.create_time
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获得字段 org.end_time 的值
	 *
	 * @return the value of org.end_time
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 设置字段 org.end_time 的值
	 *
	 * @param endTime
	 *            the value for org.end_time
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获得字段 org.device_number 的值
	 *
	 * @return the value of org.device_number
	 */
	public Integer getDeviceNumber() {
		return deviceNumber;
	}

	/**
	 * 设置字段 org.device_number 的值
	 *
	 * @param deviceNumber
	 *            the value for org.device_number
	 */
	public void setDeviceNumber(Integer deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	/**
	 * 获得字段 org.remark 的值
	 *
	 * @return the value of org.remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置字段 org.remark 的值
	 *
	 * @param remark
	 *            the value for org.remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获得字段 org.bank_customer_no 的值
	 *
	 * @return the value of org.bank_customer_no
	 */
	public String getBankCustomerNo() {
		return bankCustomerNo;
	}

	/**
	 * 设置字段 org.bank_customer_no 的值
	 *
	 * @param bankCustomerNo
	 *            the value for org.bank_customer_no
	 */
	public void setBankCustomerNo(String bankCustomerNo) {
		this.bankCustomerNo = bankCustomerNo;
	}

	/**
	 * 获得字段 org.bank_terminal_no 的值
	 *
	 * @return the value of org.bank_terminal_no
	 */
	public String getBankTerminalNo() {
		return bankTerminalNo;
	}

	/**
	 * 设置字段 org.bank_terminal_no 的值
	 *
	 * @param bankTerminalNo
	 *            the value for org.bank_terminal_no
	 */
	public void setBankTerminalNo(String bankTerminalNo) {
		this.bankTerminalNo = bankTerminalNo;
	}

	public String getRiskDisclosure() {
		return riskDisclosure;
	}

	public void setRiskDisclosure(String riskDisclosure) {
		this.riskDisclosure = riskDisclosure;
	}

}