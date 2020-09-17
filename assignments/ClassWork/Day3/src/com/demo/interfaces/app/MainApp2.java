package com.demo.interfaces.app;

import com.demo.interfaces.AllWriters;
import com.demo.interfaces.Writer;

public class MainApp2 {

	public static void main(String[] args) {
		Writer w = AllWriters.getMyWriter("Plain");
		System.out.println(Writer.dummy);
		System.out.println(w.getConnectionInfo());
		System.out.println(w.about());

	}

}
