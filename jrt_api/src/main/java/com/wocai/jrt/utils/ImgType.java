package com.wocai.jrt.utils;

public enum ImgType {
	INVESTOR(1), EMPLOYEE(2), ORDER(3), PRODUCT(4);

	private int value;

	private ImgType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
