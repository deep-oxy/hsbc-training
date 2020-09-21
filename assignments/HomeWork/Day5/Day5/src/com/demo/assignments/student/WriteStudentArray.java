package com.demo.assignments.student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Write a method which accepts an array of students and store it in a file as
 * student record.
 *
 */
public class WriteStudentArray {

	public static void main(String[] args) throws Exception {
		Student s[] = new Student[20];
		FileOutputStream fos = new FileOutputStream("studentinfo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < 20; i++) {
			s[i] = new Student(100 + i, "Piyush" + i);
			// or take this input from the console

		}
		oos.writeObject(s);
		oos.close();

		System.out.println("Writing successful");

	}

}
