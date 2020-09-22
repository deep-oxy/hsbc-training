package com.demo.assignments.q2;

/**
 * By using Runnable interface repeat the above process.
 *
 */
public class MyRunnableMain {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		MyRunnable r2 = new MyRunnable();
		MyRunnable r3 = new MyRunnable();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

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
