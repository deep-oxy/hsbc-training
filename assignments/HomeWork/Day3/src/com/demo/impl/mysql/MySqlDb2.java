package com.demo.impl.mysql;

//Write a program to extend one interface to another and then implement in the classes

import com.demo.interfaces.MyConnectionVer2;

public class MySqlDb2 implements MyConnectionVer2 {

	@Override
	public String getConnectionInfo() {

		return "Connection established successfully";
	}

	@Override
	public String getDbDetails() {

		return "MySql Db 8.3";
	}

	@Override
	public String haveFun() {

		return "Fun MySql Db 8.3";
	}

	@Override
	public String getDBMetaData() {

		return "Meta MySql Db 8.3";
	}

}
