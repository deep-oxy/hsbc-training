package com.demo.assignments;

public class InsufficientBalanceException extends Exception {

	@Override
	public String toString() {
		return "Your Balance is Insufficient";
	}

}
