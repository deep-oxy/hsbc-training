package com.hsbc.tr.spring.dao;

import org.springframework.stereotype.Repository;

import com.hsbc.tr.spring.entity.Emp;

@Repository

public class EmpDaoMock2Impl implements EmpDao {

	public String save(Emp e) {
		return "Mock2: Emp saved with id " + e.getEmpId();
	}

}
