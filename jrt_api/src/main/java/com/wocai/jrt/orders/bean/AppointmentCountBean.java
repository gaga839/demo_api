package com.wocai.jrt.orders.bean;

public class AppointmentCountBean {

	private String type;
	private Integer appointment=0;
	private Integer deal=0;
	private Integer undeal=0;
	private Integer cancel=0;
	private Integer expired=0;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getAppointment() {
		return appointment;
	}
	public void setAppointment(Integer appointment) {
		this.appointment = appointment;
	}
	public Integer getDeal() {
		return deal;
	}
	public void setDeal(Integer deal) {
		this.deal = deal;
	}
	public Integer getUndeal() {
		return undeal;
	}
	public void setUndeal(Integer undeal) {
		this.undeal = undeal;
	}
	public Integer getCancel() {
		return cancel;
	}
	public void setCancel(Integer cancel) {
		this.cancel = cancel;
	}
	public Integer getExpired() {
		return expired;
	}
	public void setExpired(Integer expired) {
		this.expired = expired;
	}
	
}
