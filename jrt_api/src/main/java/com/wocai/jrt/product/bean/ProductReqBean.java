package com.wocai.jrt.product.bean;

/***
 * 
 * @author linbaolu
 * @date 2015年7月28日 下午8:08:59
 */
public class ProductReqBean {
	private String employeeId;// 员工id
	private String productId;// 产品id
	private String productKey;// 产品简称/代码
	private String type;// 产品类型
	private String incomeType;// 收益类型
	private Integer duration;// 存续期限
	private Integer startDuration;// 存续期限
	private Integer endDuration;// 存续期限
	private Integer saleType;// 产品类型：与数据库的type不同，这里表示最新上线、热销产品等：0,1,2
	private Integer page;// 页码
	private int pageSize = 10;// 页大小

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductKey() {
		return productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getStartDuration() {
		return startDuration;
	}

	public void setStartDuration(Integer startDuration) {
		this.startDuration = startDuration;
	}

	public Integer getEndDuration() {
		return endDuration;
	}

	public void setEndDuration(Integer endDuration) {
		this.endDuration = endDuration;
	}

	public Integer getSaleType() {
		return saleType;
	}

	public void setSaleType(Integer saleType) {
		this.saleType = saleType;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
