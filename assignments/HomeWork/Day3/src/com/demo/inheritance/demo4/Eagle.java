package com.demo.inheritance.demo4;

public class Eagle extends Bird {

	public Eagle(int length, int height) {
		super(length, height);

	}

	@Override
	public String size() {

		String s = (length * height) > 100 ? "Big" : "Small";
		System.out.println(s);
		return "";
	}

}
