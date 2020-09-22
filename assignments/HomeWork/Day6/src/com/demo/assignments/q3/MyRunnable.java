package com.demo.assignments.q3;

/**
 * Write a class MyRunnable which implements runnable interface. In the run
 * method write a program to display the numbers form 1 to 20. Write a start
 * method so that the when ever we call the method start, it has to start the
 * thread.
 *
 * 
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
