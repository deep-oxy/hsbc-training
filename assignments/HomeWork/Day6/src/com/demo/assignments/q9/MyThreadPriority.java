package com.demo.assignments.q9;

/**
 * Test Thread Priority.
 *
 */
public class MyThreadPriority extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Iteration number: " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
