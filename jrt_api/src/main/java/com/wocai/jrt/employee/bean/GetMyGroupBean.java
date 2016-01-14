package com.wocai.jrt.employee.bean;

import java.util.Date;
import java.util.List;

import com.wocai.jrt.employee.model.EmployeeGroup;

public class GetMyGroupBean {

	private String employeeId;// 队长ID
	private String groupId;//团队ID
	private String key;// 关键字,有可能为姓名，工号，手机号
	private Date startDate;// 查询开始时间
	private Date endDate;// 查询结束时间
	private List<EmployeeGroup> employeeGroupList;//查询的团队列表
	private Integer page;
	private Integer pageSize;

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

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<EmployeeGroup> getEmployeeGroupList() {
		return employeeGroupList;
	}

	public void setEmployeeGroupList(List<EmployeeGroup> employeeGroupList) {
		this.employeeGroupList = employeeGroupList;
	}

}
