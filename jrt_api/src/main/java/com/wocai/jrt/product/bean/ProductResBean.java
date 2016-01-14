package com.wocai.jrt.product.bean;

/***
 * 
 * @author linbaolu
 * @date 2015年7月28日 下午8:09:10
 */
public class ProductResBean {
	private String id;// 产品id
	private String productBriefName;// 产品简称
	private String orgBriefName;// 机构简称
	// private String fundInvest;// 投资方向
	// private String type;// 产品类型
	private String incomeType;// 收益类型
	private Double scale;// 基金规模
	private Double subStart;// 投资门槛
	private Integer duration;// 存续期限
	// private Boolean defaultCommissionSet;// 默认设置
	// private Double defaultDividend;// 团队长默认提成
	// private Double defaultCommission;// 默认佣金比例
	// private Double commissionRate;// 佣金比例
	private String thumbnail;// 缩略图
	private String prospectiveEarnings;
	private Double available;
	private Integer state;
	private Double dividendRate;// 提成比例
	private Double commissionRate;// 佣金比例

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductBriefName() {
		return productBriefName;
	}

	public void setProductBriefName(String productBriefName) {
		this.productBriefName = productBriefName;
	}

	public String getOrgBriefName() {
		return orgBriefName;
	}

	public void setOrgBriefName(String orgBriefName) {
		this.orgBriefName = orgBriefName;
	}

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	public Double getScale() {
		return scale;
	}

	public void setScale(Double scale) {
		this.scale = scale;
	}

	public Double getSubStart() {
		return subStart;
	}

	public void setSubStart(Double subStart) {
		this.subStart = subStart;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getProspectiveEarnings() {
		return prospectiveEarnings;
	}

	public void setProspectiveEarnings(String prospectiveEarnings) {
		this.prospectiveEarnings = prospectiveEarnings;
	}

	public Double getAvailable() {
		return available;
	}

	public void setAvailable(Double available) {
		this.available = available;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Double getDividendRate() {
		return dividendRate;
	}

	public void setDividendRate(Double dividendRate) {
		this.dividendRate = dividendRate;
	}

	public Double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = commissionRate;
	}

}
