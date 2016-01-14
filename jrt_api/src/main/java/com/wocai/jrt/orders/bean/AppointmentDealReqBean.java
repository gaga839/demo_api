package com.wocai.jrt.orders.bean;

import java.util.Date;
/**
 * 预约订单处理请求参数bean
 * @author zhangyz
 * @date 2015年7月28日 上午9:40:47
 */
public class AppointmentDealReqBean {
	/**
	 * 预约单id/预约id
	 */
	private String appointmentId;
	 /**
     * 处理类型
     * 1 取消预约 2 分配预约 3 购买(购买成功后将预约单状态设置为已处理)
     * 预约处理类型
     * 0.未处理1.取消2.已处理3.转订单
     */
	private String dealType;
	 /**
     * 员工id
     */
	private String employeeId;
	 /**
     * 员工姓名
     */
	private String employeeName;
	 /**
     * 完成时间
     */
	private Date completeTime;
	/**
	 * 投资人姓名
	 */
	private String investorName;
	/**
	 * 机构id
	 */
	private String orgId;
	
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getInvestorName() {
		return investorName;
	}
	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	public String getDealType() {
		return dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
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
	public Date getCompleteTime() {
		return completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	
}
