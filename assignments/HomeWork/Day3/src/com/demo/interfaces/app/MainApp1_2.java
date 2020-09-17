package com.demo.interfaces.app;

import com.demo.interfaces.MyConFactory2;
import com.demo.interfaces.MyConnectionVer2;

//Write a program to extend one interface to another and then implement in the classes

public class MainApp1_2 {

	public static void main(String[] args) {
		MyConnectionVer2 con = MyConFactory2.getMyConnection("mysql");
		System.out.println(MyConnectionVer2.releaseVer);
		System.out.println(con.getConnectionInfo());
		System.out.println(con.getDbDetails());
		System.out.println(con.getDBMetaData());
		System.out.println(con.haveFun());

	}

}
