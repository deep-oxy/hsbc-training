package com.demo.spring.dao.jdbcimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.spring.dao.CustomerDao;
import com.demo.spring.entity.Customer;

@Primary
@Repository
public class CustomerDaoJdbcImpl implements CustomerDao {

	@Autowired
	JdbcTemplate jt;

	@Override
	public List<Customer> listAll() {
		String query = "select * from customer";
		try {
			List<Customer> customerList = jt.query(query, new RowMapper<Customer>() {

				@Override
				public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new Customer(rs.getInt(1), rs.getString(2), rs.getInt(3));
				}
			});
			return customerList;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Kuch to gadbad haai Daya");
		}
	}

	@Override
	public Customer findById(int customerId) {
		String query = "select * from customer where custId=" + customerId;
		try {
			Customer customer = jt.queryForObject(query, new RowMapper<Customer>() {

				@Override
				public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

					return new Customer(rs.getInt(1), rs.getString(2), rs.getInt(3));
				}
			});
			return customer;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Not Found");
		}
	}

	@Override
	public String addCustomer(Customer customer) {
		String query = "insert into customer(custId,custname,mobile) values (?,?,?)";
		try {
			int row = jt.update(query, customer.getCustomerId(), customer.getCustomerName(), customer.getMobile());

			return "Customer added successfully...";

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Kuch to gadbad haai Daya");
		}

	}

}
