package com.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File file = new File("C:\\Users\\lenovo\\Documents\\io\\demo1.txt");
			fis = new FileInputStream(file);
			fos = new FileOutputStream("demo_1.txt");

			int data = 0;
			while ((data = fis.read()) != -1) {

				System.out.print((char) data);
				fos.write(data);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("File not exist");

		}

		catch (IOException e) {
			System.out.println(e);
			System.out.println("IO exception");
		} finally {
			System.out.println("Finally");
		}

		try {
			fis.close();
			fos.close();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (NullPointerException e) {

			e.printStackTrace();
		}

		System.out.println("end of task");

	}

}
