package com.demo.assignments;

//Write a program in which constructor throws an exception and test where to handle it.

public class MainApp {

	public static void main(String[] args) {
		try {
			ConstructorException c = new ConstructorException();
			c.message();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println("Program run Successfully");

	}

}
