package com.demo.inheritance.demo3;

public class App {

	public static void main(String[] args) {
		Figure ref;
		Triangle t = new Triangle(10, 20);
		Rectangle r = new Rectangle(20, 30);
		Circle c = new Circle(12);

		ref = t;
		ref.area();

		ref = r;
		ref.area();

		ref = c;
		ref.area();

	}

}
