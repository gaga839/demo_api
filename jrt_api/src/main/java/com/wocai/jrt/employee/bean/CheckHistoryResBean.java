package com.wocai.jrt.employee.bean;

import java.util.Date;

public class CheckHistoryResBean {
	/**
	 * 地点
	 */
	private String location;
	/**
	 * 地点
	 */
	private Double px;
	/**
	 * 地点
	 */
	private Double py;
	/**
	 * 签到时间
	 */
	private Date signTime;
	/**
	 * 员工姓名
	 */
	private String investorName;
	/**
	 * 投资人手机号
	 */
	private String investorMobile;
	/**
	 * 理财师公司名
	 */
	private String investorCompany;

	public String getInvestorCompany() {
		return investorCompany;
	}

	public void setInvestorCompany(String investorCompany) {
		this.investorCompany = investorCompany;
	}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getSignTime() {
		return signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getInvestorMobile() {
		return investorMobile;
	}

	public void setInvestorMobile(String investorMobile) {
		this.investorMobile = investorMobile;
	}

	public String getInvestorName() {
		return investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
}
