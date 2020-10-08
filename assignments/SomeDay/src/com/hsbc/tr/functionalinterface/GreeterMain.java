package com.hsbc.tr.functionalinterface;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
//
//		// GreetMessage gm=new GoodMorning();
//
//		greeter.greet(new GoodMorning());
//		greeter.greet(new GoodEvening());
//
//		greeter.greet(new GreetMessage() {
//
//			@Override
//			public String greetMessage() {
//
//				return "Good Night";
//			}
//		});

		// using lambda
		// method signature without name->implementation
		greeter.greet((fn, ln) -> "Good Day" + fn + " " + ln);

		GreetMessage gm = (fn, ln) -> "Good Day" + fn + " " + ln;

	}

}

//class GoodMorning implements GreetMessage {
//
//	@Override
//	public String greetMessage() {
//
//		return "Good Morning";
//	}
//
//}
//
//class GoodEvening implements GreetMessage {
//
//	@Override
//	public String greetMessage() {
//
//		return "Good Evening";
//	}
//
//}