package com.demo.assignments.customer;

import java.io.Serializable;

public class Customer implements Serializable {

	private int custId;
	private String name;
	private String address;

	public Customer(int custId, String name, String address) {
		this.custId = custId;
		this.name = name;
		this.address = address;
	}

	public int getCustId() {
		return custId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
