package com.demo.exceptions;

public class Main {

	public static void main(String[] args) {
		App1 a1 = new App1();
		try {
			a1.calculate(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("Divided by zero");
			// e.printStackTrace();
		}
		System.out.println("done success");

	}

}
