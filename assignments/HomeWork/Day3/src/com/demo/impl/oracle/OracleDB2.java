package com.demo.impl.oracle;

//Write a program to extend one interface to another and then implement in the classes

import com.demo.interfaces.MyConnectionVer2;

public class OracleDB2 implements MyConnectionVer2 {

	@Override
	public String getConnectionInfo() {

		return "Connection established successfully";
	}

	@Override
	public String getDbDetails() {

		return "Oracle Db 13c";
	}

	@Override
	public String haveFun() {

		return "Fun Oracle Db 13c";
	}

	@Override
	public String getDBMetaData() {

		return "Meta Oracle Db 13c";
	}

}
