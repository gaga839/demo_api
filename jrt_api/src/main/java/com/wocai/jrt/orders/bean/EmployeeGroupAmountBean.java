package com.wocai.jrt.orders.bean;

public class EmployeeGroupAmountBean {
	private String employeeId;//理财师ID
	private Double employeeGroupAmount;//理财师的交易金额

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Double getEmployeeGroupAmount() {
		return employeeGroupAmount;
	}

	public void setEmployeeGroupAmount(Double employeeGroupAmount) {
		this.employeeGroupAmount = employeeGroupAmount;
	}
}
