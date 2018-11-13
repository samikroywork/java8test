package com.test.dto;

public class IntWrapper {
	private int data;

	public IntWrapper(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	@Override
	public String toString() {
		return "IntWrapper [data=" + data + "]";
	}

}
