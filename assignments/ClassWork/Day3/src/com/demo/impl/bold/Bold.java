package com.demo.impl.bold;

import com.demo.interfaces.Writer;

public class Bold implements Writer {

	@Override
	public String getConnectionInfo() {

		return "Connection successful";
	}

	@Override
	public String about() {

		return "Hi from Bold";
	}

}
