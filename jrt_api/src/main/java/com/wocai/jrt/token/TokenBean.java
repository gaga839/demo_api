package com.wocai.jrt.token;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

/**
 * token对象Bean。不使用也是可以的，为了以后扩展方便，还是使用吧
 * 
 * @author yinlei
 * @date 2015年7月4日 下午2:14:27
 */
public class TokenBean implements Serializable {
	private static final long serialVersionUID = -7607582158899968817L;
	private String employeeId;
	private long timestamp;

	public TokenBean() {
	}

	public TokenBean(String token) {
		String[] tokens = StringUtils.split(token, "&");
		this.employeeId = tokens[0];
		this.timestamp = Long.parseLong(tokens[1]);
	}

	public TokenBean(String employeeId, long timestamp) {
		super();
		this.employeeId = employeeId;
		this.timestamp = timestamp;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return employeeId + "&" + timestamp;
	}

}
