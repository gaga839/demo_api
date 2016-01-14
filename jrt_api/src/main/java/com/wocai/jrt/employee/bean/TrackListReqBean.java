package com.wocai.jrt.employee.bean;

import java.util.Date;

public class TrackListReqBean {
	
	private String employeeId;
	private String belowEmployeeId;
	private Date date;
	
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
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

}
