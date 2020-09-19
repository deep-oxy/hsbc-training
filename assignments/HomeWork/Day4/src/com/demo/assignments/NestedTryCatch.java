package com.demo.assignments;

//Write the program to test nested try catch

public class NestedTryCatch {
	public static void main(String[] args) {
		System.out.println("Start of program");
		try {
			int a = 10;
			int b = 0;
			try {
				double d = a / b;
			} catch (NullPointerException e) {
				System.out.println("inner catch: " + e);
			}
		} catch (ArithmeticException e) {
			System.out.println("outer catch: " + e);
		} finally {
			System.out.println("this is finally block");
		}

		System.out.println("End of program");
	}

}
