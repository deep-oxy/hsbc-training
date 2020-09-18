package com.demo.exceptions;

public class App2 {

	public void divide(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(e);
			// e.printStackTrace();
			throw e;
		}
	}

}
