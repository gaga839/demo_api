package com.wocai.jrt.orders.bean;

public class OrdersCountBean {
	public OrdersCountBean(){
		super();
	}
	public OrdersCountBean(String type){
		this.type = type;
	}
	/**
	 * 类型
	 */
	private String type;
	/**
	 * 交易量
	 */
	private Integer amount=0;
	/**
	 * 交易额
	 */
	private Double Turnover=0D;
	/**
	 * 交易佣金
	 */
	private Double oncession =0D;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Double getTurnover() {
		return Turnover;
	}
	public void setTurnover(Double turnover) {
		Turnover = turnover;
	}
	public Double getOncession() {
		return oncession;
	}
	public void setOncession(Double oncession) {
		this.oncession = oncession;
	}
	
}
