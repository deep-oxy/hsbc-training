package com.demo.assignments.q7;

public class PrintWorker implements Runnable {

	private MessagePrinter printer;
	private String message;

	public PrintWorker(MessagePrinter printer, String message) {
		this.printer = printer;
		this.message = message;
	}

	@Override
	public void run() {
		// printer.print(message);
		synchronized (printer) {
			printer.print(message);
			// synchronizing the whole object is not a good idea
		}

	}

}
