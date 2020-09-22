package com.demo.assignments.q1;

/**
 * Extend thread class to create a class MyThread which displays a message 10
 * times. And use this to create the three threads.
 *
 */
public class MyThreadMain {

	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
