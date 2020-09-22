package com.hsbc.training.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// HashSet<String> names = new HashSet<String>();
		// TreeSet<String> names = new TreeSet<String>();
		Set<String> names = new HashSet<>();
		names.add("Piyush");
		names.add("Piyush1");
		names.add("Piyush2");
		names.add("Piyush3");
		names.add("Piyush4");
		names.add("Piyush");

		System.out.println(names.contains("piyush"));
		System.out.println(names.contains("Piyush"));
		names.add("Deep");
		System.out.println(names);
		names.remove("Piyush1");
		System.out.println(names);

		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			name = "hi, " + name;
			System.out.println(name);
		}

		for (String s : names) {
			System.out.println(s);
		}

		System.out.println(names);
		names.clear();
		System.out.println(names);
	}

}
