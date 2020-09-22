package com.demo.assignments.q8;

/**
 * By using Runnable interface repeat the above process.
 * Using sleep method write the 1 and 2 programs.
 *
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello from " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
