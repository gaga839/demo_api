package com.wocai.jrt.message.model;

public class PayMessage {
	private String type;// 0 - 支付结果
	private String state;// 0 - 失败， 1 - 成功
	private String data;
	private String alias;//指定客户端，用employeeId

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
