package com.demo.spring.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.spring.dao.CustomerDao;
import com.demo.spring.data.CustomerDb;
import com.demo.spring.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private CustomerDb db;

	@Override
	public List<Customer> listAll() {
		return new ArrayList<>(db.getDb().values());
	}

	@Override
	public Customer findById(int customerId) {
		if (db.getDb().containsKey(customerId)) {
			return db.getDb().get(customerId);
		} else {
			throw new RuntimeException("Customer not found...");
		}
	}

	@Override
	public String addCustomer(Customer customer) {
		if (db.getDb().containsKey(customer.getCustomerId())) {
			throw new RuntimeException("Customer already exist...");
		} else {
			db.getDb().put(customer.getCustomerId(), customer);
			return "Customer added successfully...";
		}
	}

}
