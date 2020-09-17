package com.demo.inheritance.demo2;

public class App {

	public static void main(String[] args) {
		Person p = new Person(100, "Piyush");
		Employee e = new Employee(204, "John", 45000);
		TraineeEmployee t = new TraineeEmployee(320, "Smith", 55000, "Awesome");

		System.out.println(p.getDetails());
		System.out.println(e.getDetails());
		System.out.println(t.getDetails());

	}

}
