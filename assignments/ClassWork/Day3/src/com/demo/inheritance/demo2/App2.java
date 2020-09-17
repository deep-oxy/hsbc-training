package com.demo.inheritance.demo2;

public class App2 {

	public static void printDetails(Person p) {
		System.out.println(p.getDetails());

	}

	public static void main(String[] args) {
		Person p = new Person(100, "Piyush");
		Employee e = new Employee(204, "John", 45000);
		TraineeEmployee t = new TraineeEmployee(320, "Smith", 55000, "Awesome");

		System.out.println(p.getDetails());

		Person p2 = new Employee(103, "Jhef", 87552);

		System.out.println(p2.getDetails());

		printDetails(t);
		
		Object o=e;
		System.out.println(o.getClass().getName());
		System.out.println(o.toString());

	}

}
