package com.demo.interfaces;

import com.demo.impl.plain.*;
import com.demo.impl.italics.*;
import com.demo.impl.bold.*;

public class AllWriters {

	public static Writer getMyWriter(String mrwriter) {
		if (mrwriter.equals("Plain")) {
			return new Plain();
		} else if (mrwriter.equals("Italics")) {
			return new Italics();
		} else if (mrwriter.equals("Bold")) {
			return new Bold();
		} else {
			return null;
		}

	}

}
