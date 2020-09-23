package com.hsbc.tr.app.dao;

import java.util.List;

import com.hsbc.tr.app.entity.Customer;

public interface CustomerDao {

	public String add(Customer c) throws DuplicateCustomerException;

	public String remove(int id) throws CustomerNotFoundException;

	public List<Customer> listAll();

	public Customer findById(int id) throws CustomerNotFoundException;

}
