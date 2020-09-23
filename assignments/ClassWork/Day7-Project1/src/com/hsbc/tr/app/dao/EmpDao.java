package com.hsbc.tr.app.dao;

import java.util.List;

import com.hsbc.tr.app.entity.Emp;

public interface EmpDao {

	public Emp findById(int id);

	public List<Emp> listAll();

	public String save(Emp e);

}
