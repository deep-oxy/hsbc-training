package com.demo.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;

@Repository
public interface CustomerDao {

	List<Customer> listAll();

	Customer findById(int customerId);
	
	String addCustomer(Customer customer);
}
