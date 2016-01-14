package com.wocai.jrt.employee.bean;


public class CheckListResBean {
	/**
	 * 员工姓名
	 */
	private String employeeName;
	/**
	 * 员工工号
	 */
	private String employeeNo;
	
	/**
	 * 当天签到次数
	 */
	private Integer signCount;
	/**
	 * 员工头像
	 */
	private String avatar;
	/**
	 * 员工ID
	 */
	private String employeeId;
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeNo() {
		return employeeNo;
	}
	
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public Integer getSignCount() {
		return signCount;
	}

	public void setSignCount(Integer signCount) {
		this.signCount = signCount;
	}
	
}
