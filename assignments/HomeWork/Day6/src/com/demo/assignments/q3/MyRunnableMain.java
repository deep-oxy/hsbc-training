package com.demo.assignments.q3;

/**
 * Write a class MyRunnable which implements runnable interface. In the run
 * method write a program to display the numbers form 1 to 20. Write a start
 * method so that the when ever we call the method start, it has to start the
 * thread.
 *
 * 
 */
public class MyRunnableMain {

	public static void start(Thread t) {
		t.start();
	}

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		r.run();
		Thread t = new Thread(r);
		start(t);

	}

}
