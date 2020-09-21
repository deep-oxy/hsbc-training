package com.demo.io.ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.io.entity.Emp;

public class MyEmpArrayDeserializer {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("emp2.ser");
		ObjectInputStream objin = new ObjectInputStream(fis);

		try {
			while (true) {
				Emp[] empList = (Emp[]) objin.readObject();

				for (Emp e : empList) {
					System.out.println(e.getEmpId() + " " + e.getName());
				}
			}
		} catch (EOFException e) {
			System.out.println("done...");
		}
		objin.close();

	}

}
