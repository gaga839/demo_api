package com.wocai.jrt.investor.bean;

import java.util.Date;

/**
 * 投资人请求信息bean
 * @author zhangyz
 * @date 2015年7月27日 下午2:14:52
 */
public class InvestorReqBean {
	  /**
	  * 排序值
	  */
	private String orderBy;
	  /**
	  * 投资人id
	  */
		private String investorId;
	 /**
	  * 员工id
	  */
	 private String employeeId;
	 /**
	  * 团队id
	  */
	  private String groupId;
	  /**
	  * 投资人key(姓名、身份证、手机号)
	  */	
	  private String investorKey;
	  /**
	  * 理财师key(姓名、身份证、手机号)
	  */
	  private String employeeKey;
	  /**
	  * 启始查询时间
	  */
	  private Date start;
	   /**
	   * 终止查询时间
	   */
	   private Date end;
	   /**
	   * 页码
	   */
	   private Integer page;
	   /**
	   * 页大小
	   */
	   private Integer pageSize;
	   /**
	    * 手机号码
	    */
	   private String mobile;
	   /**
	    * 身份证号码
	    */
	   private String idCard;
	   /**
	    * 机构id
	    */
	   private String orgId;
	   
	/**
	 * 投资人姓名
	 */
	private String investorName;
	   
	/**
	 *投资人联系方式 
	 */
	private String investorMobile;
	   
	public String getInvestorName() {
		return investorName;
	}
	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	public String getInvestorMobile() {
		return investorMobile;
	}
	public void setInvestorMobile(String investorMobile) {
		this.investorMobile = investorMobile;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getEmployeeKey() {
		return employeeKey;
	}
	public void setEmployeeKey(String employeeKey) {
		this.employeeKey = employeeKey;
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

	public String getInvestorId() {
		return investorId;
	}
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}
	public String getInvestorKey() {
		return investorKey;
	}
	public void setInvestorKey(String investorKey) {
		this.investorKey = investorKey;
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
}
