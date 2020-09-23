package com.hsbc.tr.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hsbc.tr.app.dao.CustomerDao;
import com.hsbc.tr.app.dao.CustomerNotFoundException;
import com.hsbc.tr.app.dao.DuplicateCustomerException;
import com.hsbc.tr.app.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {

	static Map<Integer, Customer> cusDb = new HashMap<>();

	public CustomerDaoImpl() {
		cusDb.put(100, new Customer(100, "Piyush", "Hyderabad", 54000));
		cusDb.put(101, new Customer(101, "Piyush1", "Hyderabad1", 54100));
		cusDb.put(102, new Customer(102, "Piyush2", "Hyderabad2", 54200));
		cusDb.put(103, new Customer(103, "Piyush3", "Hyderabad3", 54300));
		cusDb.put(104, new Customer(104, "Piyush4", "Hyderabad4", 54400));
	}

	@Override
	public String add(Customer c) throws DuplicateCustomerException {
		try {
			if (cusDb.containsKey(c.getCusId())) {
				throw new DuplicateCustomerException();
			} else {
				cusDb.put(c.getCusId(), c);
				return "Customer added succefully";
			}
		} catch (DuplicateCustomerException e) {
			throw e;
		}

	}

	@Override
	public String remove(int id) throws CustomerNotFoundException {
		try {
			if (cusDb.containsKey(id)) {
				cusDb.remove(id);
				return "Customer removed Successfully";
			} else {
				throw new CustomerNotFoundException();
			}
		} catch (CustomerNotFoundException e) {
			throw e;
		}

	}

	@Override
	public List<Customer> listAll() {
		return new ArrayList<>(cusDb.values());
	}

	@Override
	public Customer findById(int id) throws CustomerNotFoundException {
		try {
			if (cusDb.containsKey(id)) {
				return cusDb.get(id);
			} else {
				throw new CustomerNotFoundException();
			}
		} catch (CustomerNotFoundException e) {
			throw e;
		}
	}

}
