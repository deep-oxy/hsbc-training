package com.demo.io.ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.io.entity.Emp;

public class MyEmpDeserializer {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("emp.ser");
		ObjectInputStream objin = new ObjectInputStream(fis);

		try {
			while (true) {

				// Object obj = objin.readObject();
				// Emp e = (Emp)obj;
				// System.out.println(obj.getClass().getName());

				Emp e = (Emp) objin.readObject();
				System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getSalary());
			}
		} catch (EOFException e) {
			System.out.println("Done...");
		}

		objin.close();

	}

}
