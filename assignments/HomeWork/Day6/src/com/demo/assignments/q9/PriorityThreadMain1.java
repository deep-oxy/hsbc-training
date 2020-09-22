package com.demo.assignments.q9;

/**
 * Test Thread Priority.
 *
 */

public class PriorityThreadMain1 {

	public static void main(String[] args) throws InterruptedException {

		// default thread priority
		System.out.println("Main thread starts...");
		System.out.println(Thread.currentThread() + " with priority " + Thread.currentThread().getPriority());
		MyThreadPriority t1 = new MyThreadPriority();
		MyThreadPriority t2 = new MyThreadPriority();
		MyThreadPriority t3 = new MyThreadPriority();

		System.out.println("Initial priority of thread " + t1.getName() + " is " + t1.getPriority());
		System.out.println("Initial priority of thread " + t2.getName() + " is " + t2.getPriority());
		System.out.println("Initial priority of thread " + t3.getName() + " is " + t3.getPriority());

		System.out.println("Main thread exits...");

		// Custom thread priority setting
		System.out.println("Main thread starts...");
		System.out.println(Thread.currentThread() + " with priority " + Thread.currentThread().getPriority());

		t1.setPriority(4);
		t2.setPriority(1);
		t3.setPriority(5);

		System.out.println("Priority of thread " + t1.getName() + " after change is " + t1.getPriority());
		System.out.println("Priority of thread " + t2.getName() + " after change is " + t2.getPriority());
		System.out.println("Priority of thread " + t3.getName() + " after change is " + t3.getPriority());

		Thread t = Thread.currentThread();
		t.setPriority(6);
		System.out.println(Thread.currentThread() + " with changed priority " + Thread.currentThread().getPriority());

		System.out.println("Main thread exits...");

	}

}
