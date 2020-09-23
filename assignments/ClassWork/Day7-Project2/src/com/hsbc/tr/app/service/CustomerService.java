package com.hsbc.tr.app.service;

import com.hsbc.tr.app.dao.CustomerDao;
import com.hsbc.tr.app.dao.CustomerNotFoundException;
import com.hsbc.tr.app.dao.DuplicateCustomerException;
import com.hsbc.tr.app.entity.Customer;

public class CustomerService {
	private CustomerDao dao;

	public CustomerService(CustomerDao dao) {
		this.dao = dao;
	}

	public String registerCustomer(int id, String name, String city, double balance) {
		try {
			return dao.add(new Customer(id, name, city, balance));
		} catch (DuplicateCustomerException e) {
			throw new RuntimeException("Customer already exist");
		}
	}

	public String getCustomerDetails(int id) {
		Customer c;
		try {
			c = dao.findById(id);
			return (c.getCusId() + " " + c.getName() + " " + c.getCity() + " " + c.getBalance());
		} catch (CustomerNotFoundException e) {
			throw new RuntimeException("Customer does not exist");
		}

	}

	public String removeCustomer(int id) {
		try {
			return dao.remove(id);
		} catch (CustomerNotFoundException e) {
			throw new RuntimeException("Customer does not exist");
		}
	}

	public void printCustomerList() {
		for (Customer c1 : dao.listAll()) {
			System.out.println(c1.getCusId() + " " + c1.getName() + " " + c1.getCity() + " " + c1.getBalance());
		}

	}

}
