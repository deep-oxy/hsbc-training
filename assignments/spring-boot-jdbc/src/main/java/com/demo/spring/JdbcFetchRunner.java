package com.demo.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcFetchRunner implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jt;

	@Override
	public void run(String... args) throws Exception {
		List<String> empList = jt.query("select * from EMP", (rs, n) -> {

			return rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4);

		});
		empList.forEach(System.out::println);

	}

}
