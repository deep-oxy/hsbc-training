package com.demo.assignments;

/*Write a program which catches an NullPointerException and re throws as a user defined exception
(MyNullPointerException which is a checked exception)*/

public class NullPointExceptionDemo {
	String a[] = new String[5];

	public void display() {
		try {
			System.out.println(a[2].length());

		} catch (NullPointerException e) {

			System.out.println("here");
			throw new SelfNullPointException();

		}

	}

}
