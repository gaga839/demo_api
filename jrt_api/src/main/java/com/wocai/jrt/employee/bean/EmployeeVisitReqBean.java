package com.wocai.jrt.employee.bean;

import java.util.Date;

/**
 * 联系记录请求bean
 * @author zhangyz
 * @date 2015年8月7日 下午8:59:41
 */
public class EmployeeVisitReqBean {

    /**
     * 分页开始记录
     */
    private Integer page;

    /**
     * 分页大小
     */
    private Integer pageSize = 10;

    /**
     * 对应数据库表字段 employee_visit.id
     */
    private String id;

    /**
     * 对应数据库表字段 employee_visit.employee_id
     */
    private String employeeId;

    /**
     * 对应数据库表字段 employee_visit.employee_name
     */
    private String employeeName;

    /**
     * 对应数据库表字段 employee_visit.investor_id
     */
    private String investorId;

    /**
     * 对应数据库表字段 employee_visit.visit_time
     */
    private Date visitTime;

    /**
     * 对应数据库表字段 employee_visit.title
     */
    private String title;

    /**
     * 对应数据库表字段 employee_visit.type
     */
    private Integer type;

    /**
     * 对应数据库表字段 employee_visit.content
     */
    private String content;
    
    /**
     * 对应数据库表字段 employee_visit.order_id
     */
    private String orderId;
    
    /**
     * 查询起始时间
     */
    private Date start;
    
    /**
     * 查询截止时间
     */
    private Date end;
    
    /**
     * 预约单id
     */
    private String subId;
    /**
    * 排序值
    */
   private String orderBy;
  
	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getInvestorId() {
		return investorId;
	}

	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}

	public Date getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
}
