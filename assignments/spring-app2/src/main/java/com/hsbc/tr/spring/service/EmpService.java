package com.hsbc.tr.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hsbc.tr.spring.dao.EmpDao;
import com.hsbc.tr.spring.entity.Emp;

@Service
public class EmpService {

	@Autowired
//	Qualifier gives priority over primary
	// @Qualifier("empDaoMock2Impl")
	// @Qualifier("mockDao2")
	private EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name, String city, double salary) {
		String response = dao.save(new Emp(id, name, city, salary));
		return response;

	}

}
