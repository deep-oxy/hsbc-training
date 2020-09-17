package com.demo.interfaces;

//Write a program to extend one interface to another and then implement in the classes

import com.demo.impl.mysql.MySqlDb2;
import com.demo.impl.oracle.OracleDB2;

public class MyConFactory2 {

	public static MyConnectionVer2 getMyConnection(String dbname) {
		if (dbname.equals("oracle")) {
			return new OracleDB2();
		} else if (dbname.equals("mysql")) {
			return new MySqlDb2();
		} else {
			return null;
		}
	}

}
