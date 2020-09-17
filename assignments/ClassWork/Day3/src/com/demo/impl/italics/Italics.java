package com.demo.impl.italics;

import com.demo.interfaces.Writer;

public class Italics implements Writer {

	@Override
	public String getConnectionInfo() {

		return "Connection successful";
	}

	@Override
	public String about() {

		return "Hi from Italics";
	}

}
