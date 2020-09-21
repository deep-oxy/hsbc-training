package com.demo.io.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.Emp;

public class MyEmpArraySerializer {

	public static void main(String[] args) throws Exception {

		Emp[] empList = new Emp[20];
		FileOutputStream fos = new FileOutputStream("emp2.ser");
		ObjectOutputStream objout = new ObjectOutputStream(fos);
		for (int i = 0; i < 20; i++) {
			empList[i] = new Emp(100 + i, "Emp" + i, "city" + i, 6000 + i);

		}
		objout.writeObject(empList);
		objout.close();

		System.out.println("Searlized...");

	}

}
