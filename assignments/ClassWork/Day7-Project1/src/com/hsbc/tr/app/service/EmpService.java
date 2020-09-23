package com.hsbc.tr.app.service;

import com.hsbc.tr.app.dao.EmpDao;
import com.hsbc.tr.app.entity.Emp;

public class EmpService {
	private EmpDao dao;

	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name, String city, double salary) {
		return dao.save(new Emp(id, name, city, salary));

	}

	public String getEmpDetails(int id) {
		Emp e = dao.findById(id);
		return (e.getEmpId() + " " + e.getName() + " " + e.getCity() + " " + e.getSalary());
	}

	public void printEmpList() {
		for (Emp e1 : dao.listAll()) {
			System.out.println(e1.getEmpId() + " " + e1.getName() + " " + e1.getCity() + " " + e1.getSalary());
		}
	}
}
