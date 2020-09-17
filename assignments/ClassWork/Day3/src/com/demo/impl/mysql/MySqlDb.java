package com.demo.impl.mysql;

import com.demo.interfaces.MyConnection;

public class MySqlDb implements MyConnection {

	@Override
	public String getConnectionInfo() {

		return "Connection established successfully";
	}

	@Override
	public String getDbDetails() {

		return "MySql Db 8.3";
	}

}
