package com.demo.assignments.q2;

/**
 * By using Runnable interface repeat the above process.
 *
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello from " + Thread.currentThread().getName());

		}
	}

}
