package com.demo.assignments.files;

import java.io.File;

/**
 * Write a program to test the attributes of a File
 *
 */
public class FileAttributes {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\lenovo\\Documents\\io\\lion.txt");
		System.out.println("File name: " + f.getName());
		System.out.println("Path: " + f.getPath());
		System.out.println("Abs path: " + f.getAbsolutePath());
		System.out.println("Parent: " + f.getParent());
		System.out.println("File exist: " + f.exists());
		System.out.println("The File is writable: " + f.canWrite());
		System.out.println("the file is readable: " + f.canRead());
		System.out.println("the file is a directory: " + f.isDirectory());
		System.out.println("File last modified: " + f.lastModified());
		System.out.println("File size: " + f.length() + "bytes");

	}

}
