package com.demo.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Emp;

@Repository
public class EmpDaoJdbcImpl implements EmpDao {

	@Autowired
	private JdbcTemplate jt;

	@Override
	public String save(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp findBtId(int id) {
		Emp e = jt.queryForObject("select * from EMP where empno=" + id, (rs, n) -> {

			return new Emp(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));

		});
		return e;
	}

	@Override
	public List<Emp> getAll() {
		List<Emp> empList = jt.query("select * from EMP", (rs, n) -> {

			return new Emp(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));

		});

//		List<Emp> empList = jt.query("select * from EMP", new RowMapper<Emp>() {
//
//			@Override
//			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//				return new Emp(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
//			}
//
//		});
		return empList;
	}

	@Override
	public String update(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

}
