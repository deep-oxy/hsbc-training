package com.demo.io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\lenovo\\Documents\\io");
		System.out.println("Directory: "+file.isDirectory());
		System.out.println("Can write: "+file.canWrite());

	}

}
