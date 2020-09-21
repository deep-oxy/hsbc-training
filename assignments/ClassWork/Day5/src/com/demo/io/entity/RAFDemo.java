package com.demo.io.entity;

import java.io.RandomAccessFile;

public class RAFDemo {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("C:\\Users\\lenovo\\Documents\\io\\lion.txt", "r");
		printData(10, raf);
	}

	static void printData(int seekPoint, RandomAccessFile rf) throws Exception {

		rf.seek(100);
		int x = 0;
		while ((x = rf.read()) != -1) {
			System.out.print((char) x);
		}

	}

}
