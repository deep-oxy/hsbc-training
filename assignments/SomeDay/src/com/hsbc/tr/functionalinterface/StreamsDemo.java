package com.hsbc.tr.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out
				.println("Max even = " + nums.stream().filter(n -> n % 2 == 0).max((o1, o2) -> o1.compareTo(o2)).get());

		System.out
				.println("Max odd = " + nums.stream().filter(n -> n % 2 != 0).max((o1, o2) -> o1.compareTo(o2)).get());

		System.out.println(nums.stream().mapToInt((n) -> n.intValue()).sum());

		List<String> names = Arrays.asList("Piyush", "Shantanu", "Sharmaji", "Shekhar", "Deep", "Deepali", "Dhanush",
				"Nandini");

		names.stream().filter(s -> s.startsWith("Sh")).filter(s -> s.length() > 7).forEach(System.out::println);
		names.stream().filter(s -> s.startsWith("Sh") && s.length() > 7).forEach(System.out::println);
		names.stream().filter(s -> {
			if (s.startsWith("Sh") && s.length() > 7) {
				return true;
			} else {
				return false;
			}
		}).forEach(System.out::println);
		List<String> names2 = names.stream().filter(s -> s.startsWith("Sh") && s.length() > 7)
				.collect(Collectors.toList());
		System.out.println(names2);
		names.forEach(a -> System.out.println("Hello, " + a));
		names.stream().map(s -> "Hello, " + s).forEach(System.out::println);

	}

}
