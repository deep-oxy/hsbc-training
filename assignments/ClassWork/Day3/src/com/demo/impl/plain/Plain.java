package com.demo.impl.plain;

import com.demo.interfaces.Writer;

public class Plain implements Writer {

	@Override
	public String getConnectionInfo() {

		return "Connection successful";
	}

	@Override
	public String about() {

		return "Hi from Plain";
	}

}
