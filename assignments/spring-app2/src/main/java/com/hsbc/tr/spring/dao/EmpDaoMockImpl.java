package com.hsbc.tr.spring.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.hsbc.tr.spring.entity.Emp;

@Repository
//@Primary
public class EmpDaoMockImpl implements EmpDao {

	public String save(Emp e) {
		return "Mock: Emp saved with id " + e.getEmpId();
	}

}
