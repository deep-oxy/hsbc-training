package com.hsbc.tr.app;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.hsbc.tr.app.entity.Emp;

public class EmpProcessingApp {

	public static void main(String[] args) {
		Set<Emp> empSet = new HashSet<>();
		empSet.add(new Emp(100, "Rajesh", "Hyderabad", 45000));
		empSet.add(new Emp(101, "Scott", "London", 55000));
		empSet.add(new Emp(102, "Ashish", "Bangalore", 65000));
		empSet.add(new Emp(103, "Shantanu", "Hyderabad", 35000));
		empSet.add(new Emp(104, "Rupa", "Hyderabad", 35000));
		empSet.add(new Emp(105, "Chethan", "Delhi", 45000));
		empSet.add(new Emp(106, "Kirthi", "Bangalore", 75000));
		empSet.add(new Emp(107, "Kamal", "Bangalore", 45000));
		empSet.add(new Emp(108, "Manoj", "Hyderabad", 75000));
		empSet.add(new Emp(109, "Ramesh", "Hyderabad", 65000));

		empSet.stream().filter(e -> e.getSalary() > 50000)
				.forEach(x -> System.out.println(x.getEmpId() + " " + x.getName()));
		System.out.println("----------------------------------------------");
		System.out.println("Salary spent= " + empSet.stream().mapToDouble(e -> e.getSalary()).sum());
		System.out.println("----------------------------------------------");
		// we can use this method for mathematical operations like+,-,* on each n get
		// accumulated data
		System.out.println("Salary spent= "
				+ empSet.stream().mapToDouble(e -> e.getSalary()).reduce((a, b) -> a + b).getAsDouble());
		System.out.println("----------------------------------------------");
		empSet.stream().filter(e -> e.getCity().equals("Bangalore"))
				.forEach(x -> System.out.println(x.getEmpId() + " " + x.getName()));
		System.out.println("----------------------------------------------");
		empSet.stream().filter(e -> e.getCity().equals("Hyderabad")).map(s -> {
			s.setSalary(s.getSalary() + 5000);
			return s;
		}).forEach(x -> System.out.println(x.getEmpId() + " " + x.getName()));
		System.out.println("----------------------------------------------");

		Stream<Integer> data = Stream.of(1, 2);
		System.out.println(data.mapToInt(n -> n).reduce((x, y) -> x + y).getAsInt());
		System.out.println("----------------------------------------------");

		// when method called ie 'print' is static or else we need to create an object
		// and pass it
		empSet.stream().forEach(EmpPrinter::print);
		System.out.println("----------------------------------------------");
		EmpPrinter ob = new EmpPrinter();
		empSet.stream().forEach(ob::printu);

	}

}

// use this class to print emp data directly
class EmpPrinter {
	public static void print(Emp e) {
		System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getCity() + " " + e.getSalary());

	}

	public void printu(Emp e) {
		System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getCity() + " " + e.getSalary());

	}
}