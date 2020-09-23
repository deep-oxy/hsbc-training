package com.hsbc.tr.app;

import com.hsbc.tr.app.dao.EmpDao;
import com.hsbc.tr.app.entity.Emp;
import com.hsbc.tr.app.impl.EmpDaoImpl;
import com.hsbc.tr.app.service.EmpService;

public class Main {

	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		EmpService service = new EmpService(dao);

		System.out.println(service.getEmpDetails(1010));

		System.out.println(service.getEmpDetails(101));

		String resp = service.registerEmp(105, "Raman", "Bhopal", 67000);
		System.out.println(resp);

		service.printEmpList();

	}

}
