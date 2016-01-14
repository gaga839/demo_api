package com.wocai.jrt.employee.bean;

import java.util.Date;

public class CheckinReqBean {
	/**
	 * 员工ID
	 */
	public String employeeId;
	/**
	 * 签到时间
	 */
	public Date signTime;
	/**
	 * 地址
	 */
	public String location;
	/**
	 * 客户ID
	 */
	public String investorId;
	/**
	 * 备注
	 */
	public String remark;
	/**
	 * px
	 */
	public Double px;
	/**
	 * py
	 */
	public Double py;

	public Double getPx() {
		return px;
	}

	public void setPx(Double px) {
		this.px = px;
	}

	public Double getPy() {
		return py;
	}

	public void setPy(Double py) {
		this.py = py;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Date getSignTime() {
		return signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInvestorId() {
		return investorId;
	}

	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
