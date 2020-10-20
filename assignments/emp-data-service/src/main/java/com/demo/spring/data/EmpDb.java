package com.demo.spring.data;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Emp;

@Repository
public class EmpDb {

	private static HashMap<Integer, Emp> db = new HashMap<>();

	public static HashMap<Integer, Emp> getDb() {
		return db;
	}

	public static void setDb(HashMap<Integer, Emp> db) {
		EmpDb.db = db;
	}

	public EmpDb() {
		db.put(100, new Emp(100, "Piyush", "Hyderabad", 55000));
		db.put(101, new Emp(101, "Deep", "Pune", 55000));
		db.put(102, new Emp(102, "Mangal", "Delhi", 55000));
		db.put(103, new Emp(103, "Pandey", "Dhanbad", 55000));
		db.put(104, new Emp(104, "Chandra", "Ranchi", 55000));
		db.put(105, new Emp(105, "Shekhar", "Patna", 55000));
		db.put(106, new Emp(106, "Azad", "Jamshedpur", 55000));
		db.put(107, new Emp(107, "Honey", "Vellore", 55000));
	}
}
