package com.wocai.jrt.employee.bean;

import java.util.Date;

public class CheckHistoryReqBean {
	/**
	 * 团队长ID
	 */
	private String employeeId;
	/**
	 * 团队成员ID
	 */
	private String belowEmployeeId;
	/**
	 * 查询起始时间
	 */
	private Date startDate;
	/**
	 * 查询结束时间
	 */
	private Date endDate;
	/**
	 * 分页号
	 */
	private Integer pageNo;
	/**
	 * 分页大小
	 */
	private Integer pageSize = 10;
	private String departmentId;
	
	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getBelowEmployeeId() {
		return belowEmployeeId;
	}
	
	public void setBelowEmployeeId(String belowEmployeeId) {
		this.belowEmployeeId = belowEmployeeId;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Integer getPage() {
		return pageNo;
	}
	
	public void setPage(Integer pageNo) {
		this.pageNo = pageNo;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
