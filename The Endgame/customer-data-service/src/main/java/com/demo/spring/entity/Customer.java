package com.demo.spring.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private int customerId;
	private String customerName;
	private int mobile;

	public Customer() {

	}

	public Customer(int customerId, String customerName, int mobile) {

		this.customerId = customerId;
		this.customerName = customerName;
		this.mobile = mobile;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getMobile() {
		return mobile;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals overriden");
		Customer other = (Customer) obj;
		if (customerId != other.customerId)
			return false;
		return true;
	}

	@Override
	public int hashCode() {

		return this.getCustomerId();
	}

}
