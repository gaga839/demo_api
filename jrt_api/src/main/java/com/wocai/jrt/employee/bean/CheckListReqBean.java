package com.wocai.jrt.employee.bean;

import java.util.Date;

public class CheckListReqBean {
	/**
	 * 团队长ID
	 */
	private String employeeId;
	/**
	 * 团队id
	 */
	private String departmentId;
	/**
	 * 员工搜索关键字
	 */
	private String employeeSearchKey;
	/**
	 * 上班日期
	 */
	private Date date;
	/**
	 * 页码
	 */
	private Integer pageNo;
	/**
	 * 页大小
	 */
	private Integer pageSize = 10;
	
	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public Date getDate() {
		return date;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeSearchKey() {
		return employeeSearchKey;
	}
	
	public Integer getPage() {
		return pageNo;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeSearchKey(String employeeSearchKey) {
		this.employeeSearchKey = employeeSearchKey;
	}
	
	public void setPage(Integer pageNo) {
		this.pageNo = pageNo;
	}
	
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
