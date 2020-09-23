package com.hsbc.tr.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hsbc.tr.app.dao.EmpDao;
import com.hsbc.tr.app.entity.Emp;

public class EmpDaoImpl implements EmpDao {

	static Map<Integer, Emp> empDb = new HashMap<>();

	public EmpDaoImpl() {
		empDb.put(100, new Emp(100, "Piyush", "Hyderabad", 54000));
		empDb.put(101, new Emp(101, "Piyush1", "Hyderabad1", 54100));
		empDb.put(102, new Emp(102, "Piyush2", "Hyderabad2", 54200));
		empDb.put(103, new Emp(103, "Piyush3", "Hyderabad3", 54300));
		empDb.put(104, new Emp(104, "Piyush4", "Hyderabad4", 54400));

	}

	@Override
	public Emp findById(int id) {
		if (empDb.containsKey(id)) {
			return empDb.get(id);
		}
		return null;
	}

	@Override
	public List<Emp> listAll() {
		// ArrayList<Emp> empList=new ArrayList<>(empDb.values());
		// return empList;
		return new ArrayList<>(empDb.values());
	}

	@Override
	public String save(Emp e) {
		if (empDb.containsKey(e.getEmpId())) {
			return "Emp already exist";
		} else {
			empDb.put(e.getEmpId(), e);
			return "Emp added succefully";
		}
	}

}
