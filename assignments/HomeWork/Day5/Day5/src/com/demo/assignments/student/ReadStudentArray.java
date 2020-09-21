package com.demo.assignments.student;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.demo.assignments.student.Student;

/**
 * Write a method which reads the data from the file and stores the data in the
 * student array. Display the student data on the console.
 *
 */
public class ReadStudentArray {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("studentinfo.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {

				Student stlist[] = (Student[]) ois.readObject();

				for (Student s : stlist) {
					System.out.println(s.getStuId() + " " + s.getName());
				}
			}
		} catch (EOFException e) {
			System.out.println("Done...");
		}

		ois.close();

	}

}
