package com.demo.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.CustomerDao;
import com.demo.spring.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao dao;

	public Customer findById(int customerId) {
		return dao.findById(customerId);
	}

	public List<Customer> listAll() {
		return dao.listAll();
	}

	public String addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}
}
