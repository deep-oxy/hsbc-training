package com.demo.assignments.q8;

/**
 * Extend thread class to create a class MyThread which displays a message 10
 * times. And use this to create the three threads.
 * Using sleep method write the 1 and 2 programs.
 *
 */
public class MyThread extends Thread {

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
