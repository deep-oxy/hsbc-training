package com.demo.assignments.q5;

/**
 * Write a program to show the importance of join method
 *
 */

public class JoinImportanceMain {

	public static void withoutjoin() {
		System.out.println("Without using join");
		System.out.println("Main thread starts...");
		JoinImportance t1 = new JoinImportance();
		JoinImportance t2 = new JoinImportance();
		t1.start();
		t2.start();
		System.out.println("Main thread exits...");
	}

	public static void withjoin() {
		System.out.println("With using join");
		System.out.println("Main thread starts...");
		JoinImportance t11 = new JoinImportance();
		JoinImportance t21 = new JoinImportance();
		t11.start();
		t21.start();
		try {
			t11.join();
			t21.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Main thread exits...");
	}

	public static void main(String[] args) throws InterruptedException {
		withoutjoin();
		// withjoin();
		// uncomment withjoin() to see the effect of join
	}

}
