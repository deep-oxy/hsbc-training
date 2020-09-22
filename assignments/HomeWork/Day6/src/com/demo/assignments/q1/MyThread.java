package com.demo.assignments.q1;

/**
 * Extend thread class to create a class MyThread which displays a message 10
 * times. And use this to create the three threads.
 *
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello from " + Thread.currentThread().getName());
		}
	}

}
