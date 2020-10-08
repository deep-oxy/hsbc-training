package com.hsbc.tr.spring.dao;

import com.hsbc.tr.spring.entity.Emp;

public class EmpDaoMockImpl implements EmpDao {

	public String save(Emp e) {
		return "Mock: Emp saved with id " + e.getEmpId();
	}

}
