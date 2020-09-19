package com.demo.assignments;

//Write a program in which constructor throws an exception and test where to handle it.

public class ConstructorException {

	public ConstructorException() {
		throw new ArithmeticException("Arithmetic Exception from Constructor");
	}

	public void message() {
		System.out.println("Hello from method");
	}

}
