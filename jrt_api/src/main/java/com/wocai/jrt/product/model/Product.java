package com.wocai.jrt.product.model;

import java.util.Date;
import java.util.List;

public class Product {
	/**
	 * order by 排序语句 对应数据库表字段 product
	 */
	private String orderBy;

	/**
	 * 分页开始记录 对应数据库表字段 product
	 */
	private Integer start;

	/**
	 * 分页大小 对应数据库表字段 product
	 */
	private int pageSize = 10;

	/**
	 * 是否去重 对应数据库表字段 product
	 */
	private boolean distinct;

	/**
	 * 对应数据库表字段 product.id
	 */
	private String id;

	/**
	 * 对应数据库表字段 product.product_name
	 */
	private String productName;

	/**
	 * 对应数据库表字段 product.brief_name
	 */
	private String briefName;

	/**
	 * 对应数据库表字段 product.product_code
	 */
	private String productCode;

	/**
	 * 对应数据库表字段 product.income_type
	 */
	private String incomeType;

	/**
	 * 对应数据库表字段 product.type
	 */
	private String type;

	/**
	 * 对应数据库表字段 product.scale
	 */
	private Double scale;

	/**
	 * 对应数据库表字段 product.recruit_start_time
	 */
	private Date recruitStartTime;

	/**
	 * 对应数据库表字段 product.recruit_end_time
	 */
	private Date recruitEndTime;

	/**
	 * 对应数据库表字段 product.fund_raising
	 */
	private String fundRaising;

	/**
	 * 对应数据库表字段 product.duration
	 */
	private Integer duration;

	/**
	 * 对应数据库表字段 product.under_writer
	 */
	private String underWriter;

	/**
	 * 对应数据库表字段 product.invest_limit
	 */
	private String investLimit;

	/**
	 * 对应数据库表字段 product.prospective_earnings
	 */
	private String prospectiveEarnings;

	/**
	 * 对应数据库表字段 product.fund_invest
	 */
	private String fundInvest;

	/**
	 * 对应数据库表字段 product.default_commission_set
	 */
	private Boolean defaultCommissionSet;

	/**
	 * 对应数据库表字段 product.default_dividend
	 */
	private Double defaultDividend;

	/**
	 * 对应数据库表字段 product.default_commission
	 */
	private Double defaultCommission;

	private Double dividendRate;// 提成比例
	private Double commissionRate;// 佣金比例

	/**
	 * 对应数据库表字段 product.operation_mode
	 */
	private String operationMode;

	/**
	 * 对应数据库表字段 product.fund_manager
	 */
	private String fundManager;

	/**
	 * 对应数据库表字段 product.fund_trustee
	 */
	private String fundTrustee;

	/**
	 * 对应数据库表字段 product.sub_fee
	 */
	private Double subFee;

	/**
	 * 对应数据库表字段 product.manage_fee
	 */
	private Double manageFee;

	/**
	 * 对应数据库表字段 product.sub_start
	 */
	private Double subStart;

	/**
	 * 对应数据库表字段 product.increase_amount
	 */
	private Double increaseAmount;

	/**
	 * 对应数据库表字段 product.open_cycle
	 */
	private String openCycle;

	/**
	 * 对应数据库表字段 product.open_date
	 */
	private String openDate;

	/**
	 * 对应数据库表字段 product.buy_fee
	 */
	private Double buyFee;

	/**
	 * 对应数据库表字段 product.redeem_fee
	 */
	private Double redeemFee;

	/**
	 * 对应数据库表字段 product.income_divide
	 */
	private String incomeDivide;

	/**
	 * 对应数据库表字段 product.risk_control
	 */
	private String riskControl;

	/**
	 * 对应数据库表字段 product.consult_phone
	 */
	private String consultPhone;

	/**
	 * 对应数据库表字段 product.bank_deposit
	 */
	private String bankDeposit;

	/**
	 * 对应数据库表字段 product.bank_name
	 */
	private String bankName;

	/**
	 * 对应数据库表字段 product.bank_account
	 */
	private String bankAccount;

	/**
	 * 对应数据库表字段 product.thumbnail
	 */
	private String thumbnail;

	/**
	 * 对应数据库表字段 product.org_id
	 */
	private String orgId;

	/**
	 * 对应数据库表字段 product.remark
	 */
	private String remark;

	/**
	 * 对应数据库表字段 product.state
	 */
	private Integer state;

	/**
	 * 对应数据库表字段 product.available
	 */
	private Double available;

	/**
	 * 对应数据库表字段 product.create_time
	 */
	private Date createTime;

	/**
	 * 对应数据库表字段 product.contact_file
	 */
	private String contactFile;

	/**
	 * 对应数据库表字段 product.orders
	 */
	private Integer orders;

	/**
	 * 对应数据库表字段 product.handling_fee
	 */
	private Double handlingFee;

	/**
	 * 对应数据库表字段 product.level
	 */
	private String level;

	/**
	 * 对应数据库表字段 product.invest_scope
	 */
	private String investScope;

	private String orgBriefName;

	private List<ProductGrade> productGradeList;

	private boolean sale = true;

	private String contactPrefix;

	private String contactNum;

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
	 * 获得字段 product.id 的值
	 *
	 * @return the value of product.id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置字段 product.id 的值
	 *
	 * @param id
	 *            the value for product.id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获得字段 product.product_name 的值
	 *
	 * @return the value of product.product_name
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 设置字段 product.product_name 的值
	 *
	 * @param productName
	 *            the value for product.product_name
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 获得字段 product.brief_name 的值
	 *
	 * @return the value of product.brief_name
	 */
	public String getBriefName() {
		return briefName;
	}

	/**
	 * 设置字段 product.brief_name 的值
	 *
	 * @param briefName
	 *            the value for product.brief_name
	 */
	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}

	/**
	 * 获得字段 product.product_code 的值
	 *
	 * @return the value of product.product_code
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * 设置字段 product.product_code 的值
	 *
	 * @param productCode
	 *            the value for product.product_code
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * 获得字段 product.income_type 的值
	 *
	 * @return the value of product.income_type
	 */
	public String getIncomeType() {
		return incomeType;
	}

	/**
	 * 设置字段 product.income_type 的值
	 *
	 * @param incomeType
	 *            the value for product.income_type
	 */
	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	/**
	 * 获得字段 product.type 的值
	 *
	 * @return the value of product.type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置字段 product.type 的值
	 *
	 * @param type
	 *            the value for product.type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获得字段 product.scale 的值
	 *
	 * @return the value of product.scale
	 */
	public Double getScale() {
		return scale;
	}

	/**
	 * 设置字段 product.scale 的值
	 *
	 * @param scale
	 *            the value for product.scale
	 */
	public void setScale(Double scale) {
		this.scale = scale;
	}

	/**
	 * 获得字段 product.recruit_start_time 的值
	 *
	 * @return the value of product.recruit_start_time
	 */
	public Date getRecruitStartTime() {
		return recruitStartTime;
	}

	/**
	 * 设置字段 product.recruit_start_time 的值
	 *
	 * @param recruitStartTime
	 *            the value for product.recruit_start_time
	 */
	public void setRecruitStartTime(Date recruitStartTime) {
		this.recruitStartTime = recruitStartTime;
	}

	/**
	 * 获得字段 product.recruit_end_time 的值
	 *
	 * @return the value of product.recruit_end_time
	 */
	public Date getRecruitEndTime() {
		return recruitEndTime;
	}

	/**
	 * 设置字段 product.recruit_end_time 的值
	 *
	 * @param recruitEndTime
	 *            the value for product.recruit_end_time
	 */
	public void setRecruitEndTime(Date recruitEndTime) {
		this.recruitEndTime = recruitEndTime;
	}

	/**
	 * 获得字段 product.fund_raising 的值
	 *
	 * @return the value of product.fund_raising
	 */
	public String getFundRaising() {
		return fundRaising;
	}

	/**
	 * 设置字段 product.fund_raising 的值
	 *
	 * @param fundRaising
	 *            the value for product.fund_raising
	 */
	public void setFundRaising(String fundRaising) {
		this.fundRaising = fundRaising;
	}

	/**
	 * 获得字段 product.duration 的值
	 *
	 * @return the value of product.duration
	 */
	public Integer getDuration() {
		return duration;
	}

	/**
	 * 设置字段 product.duration 的值
	 *
	 * @param duration
	 *            the value for product.duration
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * 获得字段 product.under_writer 的值
	 *
	 * @return the value of product.under_writer
	 */
	public String getUnderWriter() {
		return underWriter;
	}

	/**
	 * 设置字段 product.under_writer 的值
	 *
	 * @param underWriter
	 *            the value for product.under_writer
	 */
	public void setUnderWriter(String underWriter) {
		this.underWriter = underWriter;
	}

	/**
	 * 获得字段 product.invest_limit 的值
	 *
	 * @return the value of product.invest_limit
	 */
	public String getInvestLimit() {
		return investLimit;
	}

	/**
	 * 设置字段 product.invest_limit 的值
	 *
	 * @param investLimit
	 *            the value for product.invest_limit
	 */
	public void setInvestLimit(String investLimit) {
		this.investLimit = investLimit;
	}

	/**
	 * 获得字段 product.prospective_earnings 的值
	 *
	 * @return the value of product.prospective_earnings
	 */
	public String getProspectiveEarnings() {
		return prospectiveEarnings;
	}

	/**
	 * 设置字段 product.prospective_earnings 的值
	 *
	 * @param prospectiveEarnings
	 *            the value for product.prospective_earnings
	 */
	public void setProspectiveEarnings(String prospectiveEarnings) {
		this.prospectiveEarnings = prospectiveEarnings;
	}

	/**
	 * 获得字段 product.fund_invest 的值
	 *
	 * @return the value of product.fund_invest
	 */
	public String getFundInvest() {
		return fundInvest;
	}

	/**
	 * 设置字段 product.fund_invest 的值
	 *
	 * @param fundInvest
	 *            the value for product.fund_invest
	 */
	public void setFundInvest(String fundInvest) {
		this.fundInvest = fundInvest;
	}

	/**
	 * 获得字段 product.default_commission_set 的值
	 *
	 * @return the value of product.default_commission_set
	 */
	public Boolean getDefaultCommissionSet() {
		return defaultCommissionSet;
	}

	/**
	 * 设置字段 product.default_commission_set 的值
	 *
	 * @param defaultCommissionSet
	 *            the value for product.default_commission_set
	 */
	public void setDefaultCommissionSet(Boolean defaultCommissionSet) {
		this.defaultCommissionSet = defaultCommissionSet;
	}

	/**
	 * 获得字段 product.default_dividend 的值
	 *
	 * @return the value of product.default_dividend
	 */
	public Double getDefaultDividend() {
		return defaultDividend;
	}

	/**
	 * 设置字段 product.default_dividend 的值
	 *
	 * @param defaultDividend
	 *            the value for product.default_dividend
	 */
	public void setDefaultDividend(Double defaultDividend) {
		this.defaultDividend = defaultDividend;
	}

	/**
	 * 获得字段 product.default_commission 的值
	 *
	 * @return the value of product.default_commission
	 */
	public Double getDefaultCommission() {
		return defaultCommission;
	}

	/**
	 * 设置字段 product.default_commission 的值
	 *
	 * @param defaultCommission
	 *            the value for product.default_commission
	 */
	public void setDefaultCommission(Double defaultCommission) {
		this.defaultCommission = defaultCommission;
	}

	/**
	 * 获得字段 product.operation_mode 的值
	 *
	 * @return the value of product.operation_mode
	 */
	public String getOperationMode() {
		return operationMode;
	}

	/**
	 * 设置字段 product.operation_mode 的值
	 *
	 * @param operationMode
	 *            the value for product.operation_mode
	 */
	public void setOperationMode(String operationMode) {
		this.operationMode = operationMode;
	}

	/**
	 * 获得字段 product.fund_manager 的值
	 *
	 * @return the value of product.fund_manager
	 */
	public String getFundManager() {
		return fundManager;
	}

	/**
	 * 设置字段 product.fund_manager 的值
	 *
	 * @param fundManager
	 *            the value for product.fund_manager
	 */
	public void setFundManager(String fundManager) {
		this.fundManager = fundManager;
	}

	/**
	 * 获得字段 product.fund_trustee 的值
	 *
	 * @return the value of product.fund_trustee
	 */
	public String getFundTrustee() {
		return fundTrustee;
	}

	/**
	 * 设置字段 product.fund_trustee 的值
	 *
	 * @param fundTrustee
	 *            the value for product.fund_trustee
	 */
	public void setFundTrustee(String fundTrustee) {
		this.fundTrustee = fundTrustee;
	}

	/**
	 * 获得字段 product.sub_fee 的值
	 *
	 * @return the value of product.sub_fee
	 */
	public Double getSubFee() {
		return subFee;
	}

	/**
	 * 设置字段 product.sub_fee 的值
	 *
	 * @param subFee
	 *            the value for product.sub_fee
	 */
	public void setSubFee(Double subFee) {
		this.subFee = subFee;
	}

	/**
	 * 获得字段 product.manage_fee 的值
	 *
	 * @return the value of product.manage_fee
	 */
	public Double getManageFee() {
		return manageFee;
	}

	/**
	 * 设置字段 product.manage_fee 的值
	 *
	 * @param manageFee
	 *            the value for product.manage_fee
	 */
	public void setManageFee(Double manageFee) {
		this.manageFee = manageFee;
	}

	/**
	 * 获得字段 product.sub_start 的值
	 *
	 * @return the value of product.sub_start
	 */
	public Double getSubStart() {
		return subStart;
	}

	/**
	 * 设置字段 product.sub_start 的值
	 *
	 * @param subStart
	 *            the value for product.sub_start
	 */
	public void setSubStart(Double subStart) {
		this.subStart = subStart;
	}

	/**
	 * 获得字段 product.increase_amount 的值
	 *
	 * @return the value of product.increase_amount
	 */
	public Double getIncreaseAmount() {
		return increaseAmount;
	}

	/**
	 * 设置字段 product.increase_amount 的值
	 *
	 * @param increaseAmount
	 *            the value for product.increase_amount
	 */
	public void setIncreaseAmount(Double increaseAmount) {
		this.increaseAmount = increaseAmount;
	}

	/**
	 * 获得字段 product.open_cycle 的值
	 *
	 * @return the value of product.open_cycle
	 */
	public String getOpenCycle() {
		return openCycle;
	}

	/**
	 * 设置字段 product.open_cycle 的值
	 *
	 * @param openCycle
	 *            the value for product.open_cycle
	 */
	public void setOpenCycle(String openCycle) {
		this.openCycle = openCycle;
	}

	/**
	 * 获得字段 product.open_date 的值
	 *
	 * @return the value of product.open_date
	 */
	public String getOpenDate() {
		return openDate;
	}

	/**
	 * 设置字段 product.open_date 的值
	 *
	 * @param openDate
	 *            the value for product.open_date
	 */
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	/**
	 * 获得字段 product.buy_fee 的值
	 *
	 * @return the value of product.buy_fee
	 */
	public Double getBuyFee() {
		return buyFee;
	}

	/**
	 * 设置字段 product.buy_fee 的值
	 *
	 * @param buyFee
	 *            the value for product.buy_fee
	 */
	public void setBuyFee(Double buyFee) {
		this.buyFee = buyFee;
	}

	/**
	 * 获得字段 product.redeem_fee 的值
	 *
	 * @return the value of product.redeem_fee
	 */
	public Double getRedeemFee() {
		return redeemFee;
	}

	/**
	 * 设置字段 product.redeem_fee 的值
	 *
	 * @param redeemFee
	 *            the value for product.redeem_fee
	 */
	public void setRedeemFee(Double redeemFee) {
		this.redeemFee = redeemFee;
	}

	/**
	 * 获得字段 product.income_divide 的值
	 *
	 * @return the value of product.income_divide
	 */
	public String getIncomeDivide() {
		return incomeDivide;
	}

	/**
	 * 设置字段 product.income_divide 的值
	 *
	 * @param incomeDivide
	 *            the value for product.income_divide
	 */
	public void setIncomeDivide(String incomeDivide) {
		this.incomeDivide = incomeDivide;
	}

	/**
	 * 获得字段 product.risk_control 的值
	 *
	 * @return the value of product.risk_control
	 */
	public String getRiskControl() {
		return riskControl;
	}

	/**
	 * 设置字段 product.risk_control 的值
	 *
	 * @param riskControl
	 *            the value for product.risk_control
	 */
	public void setRiskControl(String riskControl) {
		this.riskControl = riskControl;
	}

	/**
	 * 获得字段 product.consult_phone 的值
	 *
	 * @return the value of product.consult_phone
	 */
	public String getConsultPhone() {
		return consultPhone;
	}

	/**
	 * 设置字段 product.consult_phone 的值
	 *
	 * @param consultPhone
	 *            the value for product.consult_phone
	 */
	public void setConsultPhone(String consultPhone) {
		this.consultPhone = consultPhone;
	}

	/**
	 * 获得字段 product.bank_deposit 的值
	 *
	 * @return the value of product.bank_deposit
	 */
	public String getBankDeposit() {
		return bankDeposit;
	}

	/**
	 * 设置字段 product.bank_deposit 的值
	 *
	 * @param bankDeposit
	 *            the value for product.bank_deposit
	 */
	public void setBankDeposit(String bankDeposit) {
		this.bankDeposit = bankDeposit;
	}

	/**
	 * 获得字段 product.bank_name 的值
	 *
	 * @return the value of product.bank_name
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 设置字段 product.bank_name 的值
	 *
	 * @param bankName
	 *            the value for product.bank_name
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * 获得字段 product.bank_account 的值
	 *
	 * @return the value of product.bank_account
	 */
	public String getBankAccount() {
		return bankAccount;
	}

	/**
	 * 设置字段 product.bank_account 的值
	 *
	 * @param bankAccount
	 *            the value for product.bank_account
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	/**
	 * 获得字段 product.thumbnail 的值
	 *
	 * @return the value of product.thumbnail
	 */
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * 设置字段 product.thumbnail 的值
	 *
	 * @param thumbnail
	 *            the value for product.thumbnail
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	/**
	 * 获得字段 product.org_id 的值
	 *
	 * @return the value of product.org_id
	 */
	public String getOrgId() {
		return orgId;
	}

	/**
	 * 设置字段 product.org_id 的值
	 *
	 * @param orgId
	 *            the value for product.org_id
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	/**
	 * 获得字段 product.remark 的值
	 *
	 * @return the value of product.remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置字段 product.remark 的值
	 *
	 * @param remark
	 *            the value for product.remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获得字段 product.state 的值
	 *
	 * @return the value of product.state
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * 设置字段 product.state 的值
	 *
	 * @param state
	 *            the value for product.state
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 获得字段 product.available 的值
	 *
	 * @return the value of product.available
	 */
	public Double getAvailable() {
		return available;
	}

	/**
	 * 设置字段 product.available 的值
	 *
	 * @param available
	 *            the value for product.available
	 */
	public void setAvailable(Double available) {
		this.available = available;
	}

	/**
	 * 获得字段 product.create_time 的值
	 *
	 * @return the value of product.create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置字段 product.create_time 的值
	 *
	 * @param createTime
	 *            the value for product.create_time
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获得字段 product.contact_file 的值
	 *
	 * @return the value of product.contact_file
	 */
	public String getContactFile() {
		return contactFile;
	}

	/**
	 * 设置字段 product.contact_file 的值
	 *
	 * @param contactFile
	 *            the value for product.contact_file
	 */
	public void setContactFile(String contactFile) {
		this.contactFile = contactFile;
	}

	/**
	 * 获得字段 product.orders 的值
	 *
	 * @return the value of product.orders
	 */
	public Integer getOrders() {
		return orders;
	}

	/**
	 * 设置字段 product.orders 的值
	 *
	 * @param orders
	 *            the value for product.orders
	 */
	public void setOrders(Integer orders) {
		this.orders = orders;
	}

	/**
	 * 获得字段 product.handling_fee 的值
	 *
	 * @return the value of product.handling_fee
	 */
	public Double getHandlingFee() {
		return handlingFee;
	}

	/**
	 * 设置字段 product.handling_fee 的值
	 *
	 * @param handlingFee
	 *            the value for product.handling_fee
	 */
	public void setHandlingFee(Double handlingFee) {
		this.handlingFee = handlingFee;
	}

	/**
	 * 获得字段 product.level 的值
	 *
	 * @return the value of product.level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * 设置字段 product.level 的值
	 *
	 * @param level
	 *            the value for product.level
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * 获得字段 product.invest_scope 的值
	 *
	 * @return the value of product.invest_scope
	 */
	public String getInvestScope() {
		return investScope;
	}

	/**
	 * 设置字段 product.invest_scope 的值
	 *
	 * @param investScope
	 *            the value for product.invest_scope
	 */
	public void setInvestScope(String investScope) {
		this.investScope = investScope;
	}

	public Double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getOrgBriefName() {
		return orgBriefName;
	}

	public void setOrgBriefName(String orgBriefName) {
		this.orgBriefName = orgBriefName;
	}

	public List<ProductGrade> getProductGradeList() {
		return productGradeList;
	}

	public void setProductGradeList(List<ProductGrade> productGradeList) {
		this.productGradeList = productGradeList;
	}

	public Double getDividendRate() {
		return dividendRate;
	}

	public void setDividendRate(Double dividendRate) {
		this.dividendRate = dividendRate;
	}

	public boolean isSale() {
		return sale;
	}

	public void setSale(boolean sale) {
		this.sale = sale;
	}

	public String getContactPrefix() {
		return contactPrefix;
	}

	public void setContactPrefix(String contactPrefix) {
		this.contactPrefix = contactPrefix;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

}