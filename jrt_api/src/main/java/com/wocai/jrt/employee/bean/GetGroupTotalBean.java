package com.wocai.jrt.employee.bean;

import java.util.Date;

public class GetGroupTotalBean {

	private String employeeId;// 队长ID
	private String groupId;//团队ID
	private String key;// 关键字,有可能为姓名，工号，手机号
	private Date startDate;// 查询开始时间
	private Date endDate;// 查询结束时间
	private Integer page;
	private Integer pageSize;
	private Date startDateOrders;// 查询开始时间
	private Date endDateOrders;// 查询结束时间

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
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

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Date getEndDateOrders() {
		return endDateOrders;
	}

	public void setEndDateOrders(Date endDateOrders) {
		this.endDateOrders = endDateOrders;
	}

	public Date getStartDateOrders() {
		return startDateOrders;
	}

	public void setStartDateOrders(Date startDateOrders) {
		this.startDateOrders = startDateOrders;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
