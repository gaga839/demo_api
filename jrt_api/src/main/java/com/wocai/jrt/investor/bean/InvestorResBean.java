package com.wocai.jrt.investor.bean;

import java.util.Date;

/**
 * 投资人返回信息bean
 * @author zhangyz
 * @date 2015年7月27日 下午2:14:52
 */
public class InvestorResBean {
	 /**
     * 投资人id
     */
	private String id;
	 /**
     * 员工id
     */
	private String employeeId;
	 /**
     * 员工姓名
     */
	private String employeeName;
	 /**
     * 机构id
     */
	private String orgId;
	 /**
     * 投资人姓名
     */
	private String name;
	 /**
     * 投资人手机号
     */
	private String mobile;
	 /**
     * 投资人头像
     */
	private String avatar;
	 /**
     * 投资人成交量
     */
	private Integer turnover;
	 /**
     * 投资人成交额
     */
	private Double amount;
	 /**
     * 投资人注册时间
     */
	private Date registerTime;
	 /**
     * 邮箱
     */
	private String email;
	 /**
     * 性别
     */
	private Integer gender;
	/**
     * 身份证号
     */
	private String idcard;
	/**
     * 公司
     */
	private String company;
	/**
     * 出生日期
     */
	private Date birthday;
	/**
     * 详细地址
     */
	private String address;
	/**
	 * 风险测评是否通过
	 */
	private Boolean riskPass;  
	
	/**
	 * 风险测评时间
	 */
	private Date evaluationTime;
	
	
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Integer getTurnover() {
		return turnover;
	}
	public void setTurnover(Integer turnover) {
		this.turnover = turnover;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Boolean getRiskPass() {
		return riskPass;
	}
	public void setRiskPass(Boolean riskPass) {
		this.riskPass = riskPass;
	}
	public Date getEvaluationTime() {
		return evaluationTime;
	}
	public void setEvaluationTime(Date evaluationTime) {
		this.evaluationTime = evaluationTime;
	}

	
}
