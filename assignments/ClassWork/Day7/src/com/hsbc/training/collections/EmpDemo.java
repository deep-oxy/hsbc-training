package com.hsbc.training.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

import com.demo.io.entity.Emp;

public class EmpDemo {

	public static void main(String[] args) {
		// HashSet<Emp> data = new HashSet<Emp>();
		// ArrayList<Emp> data = new ArrayList<Emp>();
		Vector<Emp> data = new Vector<>();
		for (int i = 0; i < 10; i++) {
			Emp e = new Emp(100 + i, "Piyush" + i, "Hyderabad" + i, 54000 + 1000 * i);
			data.add(e);
		}

		// Doesn't works on HashSet
		Emp e2 = new Emp(103, "Piyush3", "Hyderabad3", 57000.0);
		System.out.println(data.contains(e2));

		// Displaying
		Iterator<Emp> itr = data.iterator();
		while (itr.hasNext()) {
			Emp e1 = itr.next();
			System.out.println(e1.getEmpId() + " " + e1.getName() + " " + e1.getCity() + " " + e1.getSalary());
		}

		// Searching and/or removing emp
		for (Emp e : data) {
			if (e.getEmpId() == 103) {
				System.out.println("Found " + e.getEmpId() + " " + e.getName());
				System.out.println("Removing emp");
				data.remove(e);
				break;
			}
		}

		for (Emp e : data) {

			System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getCity() + " " + e.getSalary());

		}

		Enumeration<Emp> empNum = data.elements();
		while (empNum.hasMoreElements()) {
			Emp e = empNum.nextElement();
			System.out.println(e.getName());
		}

	}

}
