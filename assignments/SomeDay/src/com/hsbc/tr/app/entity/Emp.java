package com.hsbc.tr.app.entity;

public class Emp {
	private int empId;
	private String name;
	private String city;
	private double salary;

	public Emp() {

	}

	public Emp(int empId, String name, String city, double salary) {
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// after overriding equals we can use remove, contains directly
	@Override
	public boolean equals(Object obj) {
		// System.out.println("Equals overriden");
		Emp other = (Emp) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	@Override
	public int hashCode() {

		return this.getEmpId();
	}

}
