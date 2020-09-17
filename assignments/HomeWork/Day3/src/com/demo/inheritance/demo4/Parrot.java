package com.demo.inheritance.demo4;

public class Parrot extends Bird {

	public Parrot(int length, int height) {
		super(length, height);

	}

	@Override
	public String size() {

		String s = (length * height) > 100 ? "Big" : "Small";
		System.out.println(s);
		return "";
	}

}
