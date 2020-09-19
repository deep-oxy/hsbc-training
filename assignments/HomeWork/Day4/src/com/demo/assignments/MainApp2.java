package com.demo.assignments;

/*Write a program which catches an NullPointerException and re throws as a user defined exception
  (MyNullPointerException which is a checked exception)*/

public class MainApp2 {

	public static void main(String[] args) {
		try {
			NullPointExceptionDemo n = new NullPointExceptionDemo();
			n.display();
		} catch (SelfNullPointException e) {
			System.out.println(e);
		}

		System.out.println("Run Successful");

	}

}
