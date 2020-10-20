package com.demo.spring.data;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;

@Repository
public class CustomerDb {

	private static HashMap<Integer, Customer> db = new HashMap<>();

	public static HashMap<Integer, Customer> getDb() {
		return db;
	}

	public static void setDb(HashMap<Integer, Customer> db) {
		CustomerDb.db = db;
	}

	public CustomerDb() {
		db.put(100, new Customer(100, "Piyush", 1234567890));
		db.put(101, new Customer(101, "Deep", 1236547898));
		db.put(102, new Customer(102, "Mangal", 1258963314));
		db.put(103, new Customer(103, "Pandey", 1564567890));
		db.put(104, new Customer(104, "Chandra", 1289567890));
		db.put(105, new Customer(105, "Shekhar", 1234777890));
		db.put(106, new Customer(106, "Aazad", 1234567899));
		db.put(107, new Customer(107, "Bhagat", 1554567890));
		db.put(108, new Customer(108, "Singh", 1234566890));
		db.put(109, new Customer(109, "Sartaj", 1234564590));
		db.put(110, new Customer(110, "Singh", 1234567780));
		db.put(111, new Customer(111, "Honey", 1234567589));
	}
}
