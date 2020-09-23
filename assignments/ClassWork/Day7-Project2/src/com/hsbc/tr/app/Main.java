package com.hsbc.tr.app;

import com.hsbc.tr.app.dao.CustomerDao;
import com.hsbc.tr.app.impl.CustomerDaoImpl;
import com.hsbc.tr.app.service.CustomerService;

public class Main {

	public static void main(String[] args) {
		CustomerDao dao = new CustomerDaoImpl();

		CustomerService service = new CustomerService(dao);

		service.getCustomerDetails(102);
		// service.getCustomerDetails(111);
		// service.removeCustomer(111);
		// service.registerCustomer(101, "Piyush1", "Hyderabad1", 54100);

		System.out.println(service.registerCustomer(111, "Piyush11", "Hyderabad11", 55100));

		service.printCustomerList();

		System.out.println("------------------------------------------------------");

		System.out.println(service.removeCustomer(103));
		service.printCustomerList();

	}

}
