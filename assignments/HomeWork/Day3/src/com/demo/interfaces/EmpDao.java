package com.demo.interfaces;

import com.demo.impl.emp.Emp;

public interface EmpDao {

	String dummy = "Dumbo";

	public Emp findByid(int id);

	public String save(Emp e);

	public void listAllEmps();

}
