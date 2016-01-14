package com.wocai.jrt.employee.bean;

public class GroupRanking{
	private String employeeId;
	private String employeeName;
	private int ordersNumber;
	private double ordersAmount;
	private int ranking;

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public int getOrdersNumber() {
		return ordersNumber;
	}

	public void setOrdersNumber(int ordersNumber) {
		this.ordersNumber = ordersNumber;
	}

	public double getOrdersAmount() {
		return ordersAmount;
	}

	public void setOrdersAmount(double ordersAmount) {
		this.ordersAmount = ordersAmount;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
