package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.entity.Emp;

public interface EmpDao {

	public String save(Emp e);

	public Emp findBtId(int id);

	public List<Emp> getAll();

	public String update(Emp e);

	public String delete(Emp e);

}
