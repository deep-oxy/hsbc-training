package com.hsbc.tr.functionalinterface;

public class Greeter {

	public void greet(GreetMessage message) {
		System.out.println(message.greetMessage(null, null));
	}

}
