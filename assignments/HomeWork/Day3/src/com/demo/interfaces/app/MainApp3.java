package com.demo.interfaces.app;

import com.demo.interfaces.EmpDao;
import com.demo.impl.emp.Emp;
import com.demo.interfaces.AllEmp;

public class MainApp3 {

	public static void main(String[] args) {
		EmpDao e = AllEmp.getMyEmp("Second");
		System.out.println(EmpDao.dummy);
		System.out.println(e.findByid(2));
		System.out.println(e.save(new Emp(123, "Piyush")));

	}

}
