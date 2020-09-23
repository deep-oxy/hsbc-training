package com.hsbc.tr.app.entity;

public class Customer {
	private int cusId;
	private String name;
	private String city;
	private double balance;

	public Customer() {

	}

	public Customer(int cusId, String name, String city, double balance) {

		this.cusId = cusId;
		this.name = name;
		this.city = city;
		this.balance = balance;
	}

	public int getCusId() {
		return cusId;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public double getBalance() {
		return balance;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return cusId;
	}

	@Override
	public boolean equals(Object obj) {

		Customer other = (Customer) obj;
		if (cusId != other.cusId)
			return false;
		return true;
	}

}
