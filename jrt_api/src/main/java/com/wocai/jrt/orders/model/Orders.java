package com.wocai.jrt.orders.model;

import java.util.Date;
import java.util.List;

public class Orders {
	/**
	 * order by 排序语句 对应数据库表字段 orders
	 */
	private String orderBy;

	/**
	 * 分页开始记录 对应数据库表字段 orders
	 */
	private Integer start;

	/**
	 * 分页大小 对应数据库表字段 orders
	 */
	private int pageSize = 10;

	/**
	 * 是否去重 对应数据库表字段 orders
	 */
	private boolean distinct;

	/**
	 * 对应数据库表字段 orders.id
	 */
	private String id;

	/**
	 * 对应数据库表字段 orders.order_id
	 */
	private String orderId;

	/**
	 * 对应数据库表字段 orders.investor_id
	 */
	private String investorId;

	/**
	 * 对应数据库表字段 orders.product_id
	 */
	private String productId;

	/**
	 * 对应数据库表字段 orders.product_name
	 */
	private String productName;

	/**
	 * 对应数据库表字段 orders.product_brief_name
	 */
	private String productBriefName;

	/**
	 * 对应数据库表字段 orders.order_amount
	 */
	private Double orderAmount;

	/**
	 * 对应数据库表字段 orders.employee_id
	 */
	private String employeeId;

	/**
	 * 对应数据库表字段 orders.employee_name
	 */
	private String employeeName;

	/**
	 * 对应数据库表字段 orders.order_time
	 */
	private Date orderTime;

	/**
	 * 对应数据库表字段 orders.pay_time
	 */
	private Date payTime;

	/**
	 * 对应数据库表字段 orders.pad_id
	 */
	private String padId;

	/**
	 * 对应数据库表字段 orders.pos_id
	 */
	private String posId;

	/**
	 * 对应数据库表字段 orders.org_id
	 */
	private String orgId;

	/**
	 * 对应数据库表字段 orders.paid_amount
	 */
	private Double paidAmount;

	/**
	 * 对应数据库表字段 orders.idcard_front
	 */
	private String idcardFront;

	/**
	 * 对应数据库表字段 orders.idcard_back
	 */
	private String idcardBack;

	/**
	 * 对应数据库表字段 orders.contact_sign_manager
	 */
	private String contactSignManager;

	/**
	 * 对应数据库表字段 orders.contact_sign_user
	 */
	private String contactSignUser;

	/**
	 * 对应数据库表字段 orders.pay_sign_manager
	 */
	private String paySignManager;

	/**
	 * 对应数据库表字段 orders.pay_sign_user
	 */
	private String paySignUser;

	/**
	 * 对应数据库表字段 orders.video_user
	 */
	private String videoUser;

	/**
	 * 对应数据库表字段 orders.video_manager
	 */
	private String videoManager;

	/**
	 * 对应数据库表字段 orders.state
	 */
	private Integer state;

	/**
	 * 对应数据库表字段 orders.bank_deposit
	 */
	private String bankDeposit;

	/**
	 * 对应数据库表字段 orders.bank_account
	 */
	private String bankAccount;

	/**
	 * 对应数据库表字段 orders.bank_name
	 */
	private String bankName;

	private String contactFileWithSign;

	// 手续费：
	private Double handlingFee;
	// 认购/申购费：
	private Double subFee;
	// 订单总额：
	private Double orderAllAmount;
	// 合同编号
	private String contactNum;
	// 订单类型
	private Integer type;
	// 是否上传凭证
	private Boolean uploadVoucher;
	// 支付凭证审核状态
	private Integer auditState;
	// 是否线下支付
	private Boolean offlinePay;
	// 支付方式
	private Integer payMethod;
	// 线下支付申请审核状态
	private Integer offlineAudit;
	// 订单支付凭证
	private List<String> voucherList;
	// 风险揭示书
	private String riskDisclosure;
	// 银行卡图片
	private String bankCard;

	/**
	 * 产品档次id
	 */
	private String gradeId;
	private String productGrade;
	private Double subScopeStart;
	private Double subScopeEnd;
	private String prospectiveEarnings;
	private String remark;

	/**
	 * 代理人ID
	 */
	private String agentId;

	private String agentName;

	private Boolean deleted;

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getGradeId() {
		return gradeId;
	}

	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}

	public String getProductGrade() {
		return productGrade;
	}

	public void setProductGrade(String productGrade) {
		this.productGrade = productGrade;
	}

	public Double getSubScopeStart() {
		return subScopeStart;
	}

	public void setSubScopeStart(Double subScopeStart) {
		this.subScopeStart = subScopeStart;
	}

	public Double getSubScopeEnd() {
		return subScopeEnd;
	}

	public void setSubScopeEnd(Double subScopeEnd) {
		this.subScopeEnd = subScopeEnd;
	}

	public String getProspectiveEarnings() {
		return prospectiveEarnings;
	}

	public void setProspectiveEarnings(String prospectiveEarnings) {
		this.prospectiveEarnings = prospectiveEarnings;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<String> getVoucherList() {
		return voucherList;
	}

	public void setVoucherList(List<String> voucherList) {
		this.voucherList = voucherList;
	}

	/**
	 * 设置 order by 排序语句
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	/**
	 * 获得 order by 排序语句
	 */
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * 设置 start，分页开始记录
	 */
	public void setStart(Integer start) {
		this.start = start;
	}

	/**
	 * 获得 start，分页开始记录
	 */
	public Integer getStart() {
		return start;
	}

	/**
	 * 设置 pageSize，分页大小
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 获得 pageSize，分页大小
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * 设置 distinct，是否去重
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * 获得 distinct，是否去重
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * 获得字段 orders.id 的值
	 *
	 * @return the value of orders.id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置字段 orders.id 的值
	 *
	 * @param id
	 *            the value for orders.id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获得字段 orders.order_id 的值
	 *
	 * @return the value of orders.order_id
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * 设置字段 orders.order_id 的值
	 *
	 * @param orderId
	 *            the value for orders.order_id
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * 获得字段 orders.investor_id 的值
	 *
	 * @return the value of orders.investor_id
	 */
	public String getInvestorId() {
		return investorId;
	}

	/**
	 * 设置字段 orders.investor_id 的值
	 *
	 * @param investorId
	 *            the value for orders.investor_id
	 */
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}

	/**
	 * 获得字段 orders.product_id 的值
	 *
	 * @return the value of orders.product_id
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * 设置字段 orders.product_id 的值
	 *
	 * @param productId
	 *            the value for orders.product_id
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * 获得字段 orders.product_name 的值
	 *
	 * @return the value of orders.product_name
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 设置字段 orders.product_name 的值
	 *
	 * @param productName
	 *            the value for orders.product_name
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 获得字段 orders.product_brief_name 的值
	 *
	 * @return the value of orders.product_brief_name
	 */
	public String getProductBriefName() {
		return productBriefName;
	}

	/**
	 * 设置字段 orders.product_brief_name 的值
	 *
	 * @param productBriefName
	 *            the value for orders.product_brief_name
	 */
	public void setProductBriefName(String productBriefName) {
		this.productBriefName = productBriefName;
	}

	/**
	 * 获得字段 orders.order_amount 的值
	 *
	 * @return the value of orders.order_amount
	 */
	public Double getOrderAmount() {
		return orderAmount;
	}

	/**
	 * 设置字段 orders.order_amount 的值
	 *
	 * @param orderAmount
	 *            the value for orders.order_amount
	 */
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	/**
	 * 获得字段 orders.employee_id 的值
	 *
	 * @return the value of orders.employee_id
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * 设置字段 orders.employee_id 的值
	 *
	 * @param employeeId
	 *            the value for orders.employee_id
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * 获得字段 orders.employee_name 的值
	 *
	 * @return the value of orders.employee_name
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * 设置字段 orders.employee_name 的值
	 *
	 * @param employeeName
	 *            the value for orders.employee_name
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * 获得字段 orders.order_time 的值
	 *
	 * @return the value of orders.order_time
	 */
	public Date getOrderTime() {
		return orderTime;
	}

	/**
	 * 设置字段 orders.order_time 的值
	 *
	 * @param orderTime
	 *            the value for orders.order_time
	 */
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * 获得字段 orders.pay_time 的值
	 *
	 * @return the value of orders.pay_time
	 */
	public Date getPayTime() {
		return payTime;
	}

	/**
	 * 设置字段 orders.pay_time 的值
	 *
	 * @param payTime
	 *            the value for orders.pay_time
	 */
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	/**
	 * 获得字段 orders.pad_id 的值
	 *
	 * @return the value of orders.pad_id
	 */
	public String getPadId() {
		return padId;
	}

	/**
	 * 设置字段 orders.pad_id 的值
	 *
	 * @param padId
	 *            the value for orders.pad_id
	 */
	public void setPadId(String padId) {
		this.padId = padId;
	}

	/**
	 * 获得字段 orders.pos_id 的值
	 *
	 * @return the value of orders.pos_id
	 */
	public String getPosId() {
		return posId;
	}

	/**
	 * 设置字段 orders.pos_id 的值
	 *
	 * @param posId
	 *            the value for orders.pos_id
	 */
	public void setPosId(String posId) {
		this.posId = posId;
	}

	/**
	 * 获得字段 orders.org_id 的值
	 *
	 * @return the value of orders.org_id
	 */
	public String getOrgId() {
		return orgId;
	}

	/**
	 * 设置字段 orders.org_id 的值
	 *
	 * @param orgId
	 *            the value for orders.org_id
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	/**
	 * 获得字段 orders.paid_amount 的值
	 *
	 * @return the value of orders.paid_amount
	 */
	public Double getPaidAmount() {
		return paidAmount;
	}

	/**
	 * 设置字段 orders.paid_amount 的值
	 *
	 * @param paidAmount
	 *            the value for orders.paid_amount
	 */
	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}

	/**
	 * 获得字段 orders.idcard_front 的值
	 *
	 * @return the value of orders.idcard_front
	 */
	public String getIdcardFront() {
		return idcardFront;
	}

	/**
	 * 设置字段 orders.idcard_front 的值
	 *
	 * @param idcardFront
	 *            the value for orders.idcard_front
	 */
	public void setIdcardFront(String idcardFront) {
		this.idcardFront = idcardFront;
	}

	/**
	 * 获得字段 orders.idcard_back 的值
	 *
	 * @return the value of orders.idcard_back
	 */
	public String getIdcardBack() {
		return idcardBack;
	}

	/**
	 * 设置字段 orders.idcard_back 的值
	 *
	 * @param idcardBack
	 *            the value for orders.idcard_back
	 */
	public void setIdcardBack(String idcardBack) {
		this.idcardBack = idcardBack;
	}

	/**
	 * 获得字段 orders.contact_sign_manager 的值
	 *
	 * @return the value of orders.contact_sign_manager
	 */
	public String getContactSignManager() {
		return contactSignManager;
	}

	/**
	 * 设置字段 orders.contact_sign_manager 的值
	 *
	 * @param contactSignManager
	 *            the value for orders.contact_sign_manager
	 */
	public void setContactSignManager(String contactSignManager) {
		this.contactSignManager = contactSignManager;
	}

	/**
	 * 获得字段 orders.contact_sign_user 的值
	 *
	 * @return the value of orders.contact_sign_user
	 */
	public String getContactSignUser() {
		return contactSignUser;
	}

	/**
	 * 设置字段 orders.contact_sign_user 的值
	 *
	 * @param contactSignUser
	 *            the value for orders.contact_sign_user
	 */
	public void setContactSignUser(String contactSignUser) {
		this.contactSignUser = contactSignUser;
	}

	/**
	 * 获得字段 orders.pay_sign_manager 的值
	 *
	 * @return the value of orders.pay_sign_manager
	 */
	public String getPaySignManager() {
		return paySignManager;
	}

	/**
	 * 设置字段 orders.pay_sign_manager 的值
	 *
	 * @param paySignManager
	 *            the value for orders.pay_sign_manager
	 */
	public void setPaySignManager(String paySignManager) {
		this.paySignManager = paySignManager;
	}

	/**
	 * 获得字段 orders.pay_sign_user 的值
	 *
	 * @return the value of orders.pay_sign_user
	 */
	public String getPaySignUser() {
		return paySignUser;
	}

	/**
	 * 设置字段 orders.pay_sign_user 的值
	 *
	 * @param paySignUser
	 *            the value for orders.pay_sign_user
	 */
	public void setPaySignUser(String paySignUser) {
		this.paySignUser = paySignUser;
	}

	/**
	 * 获得字段 orders.video_user 的值
	 *
	 * @return the value of orders.video_user
	 */
	public String getVideoUser() {
		return videoUser;
	}

	/**
	 * 设置字段 orders.video_user 的值
	 *
	 * @param videoUser
	 *            the value for orders.video_user
	 */
	public void setVideoUser(String videoUser) {
		this.videoUser = videoUser;
	}

	/**
	 * 获得字段 orders.video_manager 的值
	 *
	 * @return the value of orders.video_manager
	 */
	public String getVideoManager() {
		return videoManager;
	}

	/**
	 * 设置字段 orders.video_manager 的值
	 *
	 * @param videoManager
	 *            the value for orders.video_manager
	 */
	public void setVideoManager(String videoManager) {
		this.videoManager = videoManager;
	}

	/**
	 * 获得字段 orders.state 的值
	 *
	 * @return the value of orders.state
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * 设置字段 orders.state 的值
	 *
	 * @param state
	 *            the value for orders.state
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 获得字段 orders.bank_deposit 的值
	 *
	 * @return the value of orders.bank_deposit
	 */
	public String getBankDeposit() {
		return bankDeposit;
	}

	/**
	 * 设置字段 orders.bank_deposit 的值
	 *
	 * @param bankDeposit
	 *            the value for orders.bank_deposit
	 */
	public void setBankDeposit(String bankDeposit) {
		this.bankDeposit = bankDeposit;
	}

	/**
	 * 获得字段 orders.bank_account 的值
	 *
	 * @return the value of orders.bank_account
	 */
	public String getBankAccount() {
		return bankAccount;
	}

	/**
	 * 设置字段 orders.bank_account 的值
	 *
	 * @param bankAccount
	 *            the value for orders.bank_account
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	/**
	 * 获得字段 orders.bank_name 的值
	 *
	 * @return the value of orders.bank_name
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 设置字段 orders.bank_name 的值
	 *
	 * @param bankName
	 *            the value for orders.bank_name
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getContactFileWithSign() {
		return contactFileWithSign;
	}

	public void setContactFileWithSign(String contactFileWithSign) {
		this.contactFileWithSign = contactFileWithSign;
	}

	public Double getHandlingFee() {
		return handlingFee;
	}

	public void setHandlingFee(Double handlingFee) {
		this.handlingFee = handlingFee;
	}

	public Double getSubFee() {
		return subFee;
	}

	public void setSubFee(Double subFee) {
		this.subFee = subFee;
	}

	public Double getOrderAllAmount() {
		return orderAllAmount;
	}

	public void setOrderAllAmount(Double orderAllAmount) {
		this.orderAllAmount = orderAllAmount;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Boolean getUploadVoucher() {
		return uploadVoucher;
	}

	public void setUploadVoucher(Boolean uploadVoucher) {
		this.uploadVoucher = uploadVoucher;
	}

	public Integer getAuditState() {
		return auditState;
	}

	public void setAuditState(Integer auditState) {
		this.auditState = auditState;
	}

	public Boolean getOfflinePay() {
		return offlinePay;
	}

	public void setOfflinePay(Boolean offlinePay) {
		this.offlinePay = offlinePay;
	}

	public Integer getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}

	public Integer getOfflineAudit() {
		return offlineAudit;
	}

	public void setOfflineAudit(Integer offlineAudit) {
		this.offlineAudit = offlineAudit;
	}

	public String getRiskDisclosure() {
		return riskDisclosure;
	}

	public void setRiskDisclosure(String riskDisclosure) {
		this.riskDisclosure = riskDisclosure;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

}
