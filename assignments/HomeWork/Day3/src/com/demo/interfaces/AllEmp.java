package com.demo.interfaces;

import com.demo.impl.empdaomocjlbcimpl.*;
import com.demo.impl.empdaomockhibernateimpl.*;

public class AllEmp {
	public static EmpDao getMyEmp(String empd) {
		if (empd.equals("First")) {
			return new EmpDaoMocJlbcImpl();
		} else if (empd.equals("Second")) {
			return new EmpDaoMockHibernateImpl();
		} else {
			return null;
		}
	}

}
