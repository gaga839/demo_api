package com.wocai.jrt.orders.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 预约订单详情查询返回参数bean
 * @author zhangyz
 * @date 2015年7月28日 上午9:40:47
 */
public class AppointmentDetailBean {
	 /**
     * 预约单id
     */
	 private String  id;
	 /**
     * 机构id
     */
	 private String  orgId;
	 /**
     * 机构名称
     */
	 private String  orgName;
	 /**
     * 投资人id
     */
	 private String  investorId;
	 /**
     * 投资人姓名
     */
	 private String  investorName;
	 /**
     * 理财师姓名
     */
	 private String employeeId;
	 /**
     * 理财师姓名
     */
	 private String employeeName;
	 /**
     * 性别
     */
	 private Integer  gender;
	 /**
     * 手机号码
     */
	 private String  mobile;
	 /**
     * 出生日期
     */
	 private Date  birthday;
	 /**
     * 身份证号
     */
	 private String  idCard; 
	 /**
     * 身份证类型
     */
	 private String  idType; 
	 /**
     * 公司
     */
	 private String  company;
	 /**
     * 邮箱
     */
	 private String  email;
	 /**
     * 产品id
     */
	 private String  productId;
	 /**
     * 产品名
     */
	 private String  productName;
	 /**
     * 产品简称
     */
	 private String  briefName;
	 /**
     * 产品缩略图
     */
	 private String  thumbnail;
	 /**
     * 基金规模
     */
	 private BigDecimal  scale; 
	 /**
     *可买金额
     */
	 private BigDecimal  available; 
	 /**
     *投资门槛 
     */
	 private BigDecimal  subStart; 
	 /**
     *存续期限 
     */
	 private String  duration;
	 /**
	  * 预期收益
	  */
	 private String prospectiveEarnings;
	 /**
     *基金投向
     */
	 private String  fundInvest; 
	 /**
     * 完成时间
     */
	private Date completeTime;
	 /**
     * 创建时间
     */
	private Date createTime;
	 /**
     * 最晚处理时间
     */
	private Date latestHandleTime;
	/**
	 * 预约单状态
	 */
	private Integer state;
	 /**
     * 预约时间
     */
	 private Date appointTime;
	 /**
	  * 订单金额
	  */
	 private BigDecimal orderAmount;
	 
	 
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getBriefName() {
		return briefName;
	}
	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public BigDecimal getAvailable() {
		return available;
	}
	public void setAvailable(BigDecimal available) {
		this.available = available;
	}
	public Date getAppointTime() {
		return appointTime;
	}
	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getProspectiveEarnings() {
		return prospectiveEarnings;
	}
	public void setProspectiveEarnings(String prospectiveEarnings) {
		this.prospectiveEarnings = prospectiveEarnings;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getInvestorId() {
		return investorId;
	}
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}
	public String getInvestorName() {
		return investorName;
	}
	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public BigDecimal getScale() {
		return scale;
	}
	public void setScale(BigDecimal scale) {
		this.scale = scale;
	}
	public BigDecimal getSubStart() {
		return subStart;
	}
	public void setSubStart(BigDecimal subStart) {
		this.subStart = subStart;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getFundInvest() {
		return fundInvest;
	}
	public void setFundInvest(String fundInvest) {
		this.fundInvest = fundInvest;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLatestHandleTime() {
		return latestHandleTime;
	}
	public void setLatestHandleTime(Date latestHandleTime) {
		this.latestHandleTime = latestHandleTime;
	}
	
}
