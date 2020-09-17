package com.demo.impl.empdaomockhibernateimpl;

import com.demo.impl.emp.Emp;
import com.demo.interfaces.EmpDao;

public class EmpDaoMockHibernateImpl implements EmpDao {

	@Override
	public Emp findByid(int id) {

		return (new Emp(4256, "PiyushMock"));
	}

	@Override
	public String save(Emp e) {

		return "Saved Mock";
	}

	@Override
	public void listAllEmps() {

	}

}
