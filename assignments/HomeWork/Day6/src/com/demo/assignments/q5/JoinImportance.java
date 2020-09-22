package com.demo.assignments.q5;

/**
 * Write a program to show the importance of join method
 *
 */
public class JoinImportance extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Iteration number: " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
