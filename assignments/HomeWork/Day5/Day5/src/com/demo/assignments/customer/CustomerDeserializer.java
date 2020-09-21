package com.demo.assignments.customer;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Create a class Customer with the following attributes: 1. customerId 2. name
 * 3. address Write one program to serialize 3 Customer Objects stored in a file
 * named “customers.ser” Write One program to deserialize the Customer Objects
 * from the above file.
 *
 * 
 */
public class CustomerDeserializer {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("customers.ser");
		ObjectInputStream objin = new ObjectInputStream(fis);

		try {
			while (true) {

				// Object obj = objin.readObject();
				// Emp e = (Emp)obj;
				// System.out.println(obj.getClass().getName());

				Customer cus = (Customer) objin.readObject();
				System.out.println(cus.getCustId() + " " + cus.getName() + " " + cus.getAddress());
			}
		} catch (EOFException e) {
			System.out.println("Done...");
		}

		objin.close();

	}

}
