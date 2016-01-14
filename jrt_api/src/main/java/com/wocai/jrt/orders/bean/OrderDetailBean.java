package com.wocai.jrt.orders.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单详情返回参数bean
 * @author zhangyz
 * @date 2015年7月28日 上午9:40:47
 */
public class OrderDetailBean {
	/**
	 * 订单id
	 */
	private String id;
	/**
	 * 投资人id
	 */
	private String investorId;
	/**
	 * 投资人姓名
	 */
	private String investorName;
	/**
	 * 下单金额
	 */
	private BigDecimal orderAmount;
	/**
	 * 性别
	 */
	private Integer gender;
	/**
	 * 手机号码
	 */
	private String mobile;
	/**
	 * 出生日期
	 */
	private Date birthday;
	/**
	 * 身份证号码
	 */
	private String idCard;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 客户视频
	 */
	private String videoUser;
	/**
	 * 理财师视频
	 */
	private String videoManager;
	/**
	 * 身份证正面
	 */
	private String idcardFront;
	/**
	 * 身份证背面
	 */
	private String idcardBack;
	/**
	 * 理财师签字
	 */
	private String contactSignManager;
	/**
	 * 投资人签字
	 */
	private String contactSignUser;
	/**
	 * 支付理财师签字确认
	 */
	private String paySignManager;
	/**
	 * 支付投资人签字确认
	 */
	private String paySignUser;
	/**
	 * 订单状态
	 */
	private Integer state;
	/**
	 * 产品类型
	 */
	private String type;
	/**
	 * 预期收益
	 */
	private String prospectiveEarnings;
	/**
	 * 产品缩略图
	 */
	private String thumbnail;
	
	
	public String getInvestorName() {
		return investorName;
	}
	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInvestorId() {
		return investorId;
	}
	public void setInvestorId(String investorId) {
		this.investorId = investorId;
	}
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVideoUser() {
		return videoUser;
	}
	public void setVideoUser(String videoUser) {
		this.videoUser = videoUser;
	}
	public String getVideoManager() {
		return videoManager;
	}
	public void setVideoManager(String videoManager) {
		this.videoManager = videoManager;
	}
	public String getIdcardFront() {
		return idcardFront;
	}
	public void setIdcardFront(String idcardFront) {
		this.idcardFront = idcardFront;
	}
	public String getIdcardBack() {
		return idcardBack;
	}
	public void setIdcardBack(String idcardBack) {
		this.idcardBack = idcardBack;
	}
	public String getContactSignManager() {
		return contactSignManager;
	}
	public void setContactSignManager(String contactSignManager) {
		this.contactSignManager = contactSignManager;
	}
	public String getContactSignUser() {
		return contactSignUser;
	}
	public void setContactSignUser(String contactSignUser) {
		this.contactSignUser = contactSignUser;
	}
	public String getPaySignManager() {
		return paySignManager;
	}
	public void setPaySignManager(String paySignManager) {
		this.paySignManager = paySignManager;
	}
	public String getPaySignUser() {
		return paySignUser;
	}
	public void setPaySignUser(String paySignUser) {
		this.paySignUser = paySignUser;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProspectiveEarnings() {
		return prospectiveEarnings;
	}
	public void setProspectiveEarnings(String prospectiveEarnings) {
		this.prospectiveEarnings = prospectiveEarnings;
	}
	
}
