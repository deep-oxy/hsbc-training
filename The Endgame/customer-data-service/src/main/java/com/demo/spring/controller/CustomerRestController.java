package com.demo.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.entity.Customer;
import com.demo.spring.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerRestController {

	@Autowired
	private CustomerService service;

	@GetMapping(path = "/customer/find/{customerId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity getCustomerDetails(@PathVariable("customerId") int customerId) {
		try {
			return ResponseEntity.ok(service.findById(customerId));
		} catch (RuntimeException e) {
			e.printStackTrace();
			return ResponseEntity.ok("{\"status\":\"Customer not found...\"}");
		}

	}

	@GetMapping(path = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> listAll() {
		return ResponseEntity.ok(service.listAll());
	}

	@PostMapping(path = "/customer/add", produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
		try {
			return ResponseEntity.ok("{\"status\":" + "\"" + service.addCustomer(customer) + "\"" + "}");
		} catch (RuntimeException e) {
			e.printStackTrace();
			return ResponseEntity.ok("{\"status\":\"Customer already exist...\"}");
		}

	}

}
