package com.demo.assignments.customer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CustomerSerializer {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("customers.ser");
		ObjectOutputStream objout = new ObjectOutputStream(fos);

		for (int i = 0; i < 20; i++) {
			Customer cus = new Customer(100 + i, "Piyush" + i, "Hyderabad" + i);
			objout.writeObject(cus);
		}

		objout.close();

		System.out.println("Customers Serliazed..");

	}

}
