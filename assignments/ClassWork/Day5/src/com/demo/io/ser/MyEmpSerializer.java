package com.demo.io.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.Emp;

public class MyEmpSerializer {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream objout = new ObjectOutputStream(fos);

		for (int i = 0; i < 20; i++) {
			Emp emp = new Emp(100 + i, "Piyush" + i, "India" + i, 55000 + 10 * i);
			objout.writeObject(emp);
		}

		objout.close();

		System.out.println("Emp Serliazed..");

	}

}
