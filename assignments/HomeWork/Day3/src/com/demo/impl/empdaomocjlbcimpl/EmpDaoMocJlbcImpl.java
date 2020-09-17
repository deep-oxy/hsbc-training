package com.demo.impl.empdaomocjlbcimpl;

import com.demo.impl.emp.Emp;
import com.demo.interfaces.EmpDao;

public class EmpDaoMocJlbcImpl implements EmpDao {
	

	@Override
	public Emp findByid(int id) {

		return (new Emp(123, "Piyush"));
	}

	@Override
	public String save(Emp e) {

		return "Saved";
	}

	@Override
	public void listAllEmps() {

	}

}
