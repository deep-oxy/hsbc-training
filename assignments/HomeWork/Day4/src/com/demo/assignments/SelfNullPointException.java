package com.demo.assignments;

/*Write a program which catches an NullPointerException and re throws as a user defined exception
(MyNullPointerException which is a checked exception)*/

public class SelfNullPointException extends RuntimeException {

	@Override
	public String toString() {
		return "This is SelfNullPointException";
	}

}
