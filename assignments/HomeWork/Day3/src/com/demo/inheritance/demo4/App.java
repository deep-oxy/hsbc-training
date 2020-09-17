package com.demo.inheritance.demo4;

public class App {

	public static void main(String[] args) {

		Bird b;

		Parrot p = new Parrot(8, 5);
		Eagle e = new Eagle(16, 10);
		Duck d = new Duck(10, 10);

		b = p;
		b.size();
		b = e;
		b.size();
		b = d;
		b.size();

	}

}
