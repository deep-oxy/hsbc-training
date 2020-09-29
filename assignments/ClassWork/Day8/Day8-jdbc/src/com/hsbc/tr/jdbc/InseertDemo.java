package com.hsbc.tr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InseertDemo {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
//		String INSERT_SQL = "insert into emp (empno,name,city,salary) values(?,?,?,?)";
//		String Select_SQL = "select * from emp";
//		String Select_SQL = "select * from emp where empno=?";
		String Select_SQL = "select empno,name,city,salary from emp where empno=?";
//		String Select_SQL = "select empno,salary,city,name from emp where empno=?";

		try {
			// Load the driver
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			// Get the connection
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");

			if (conn != null) {
				System.out.println("Got the connection");
			}

//			pst = conn.prepareStatement(INSERT_SQL);
//			pst.setInt(1, 102);
//			pst.setString(2, "Antonio");
//			pst.setString(3, "Pune");
//			pst.setDouble(4, 65000);
//
//			int rowCount = pst.executeUpdate();
//			if (rowCount == 1) {
//				System.out.println("1 row inserted...");
//			}

			pst = conn.prepareStatement(Select_SQL);
			pst.setInt(1, 102);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String city = rs.getString(3);
				double salary = rs.getDouble(4);
				System.out.println(id + " " + name + " " + city + " " + salary);
			}

//			while (rs.next()) {
//				int id = rs.getInt("empno");
//				String name = rs.getString("name");
//				String city = rs.getString("city");
//				double salary = rs.getDouble("salary");
//				System.out.println(id + " " + name + " " + city + " " + salary);
//			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found...");
		} catch (SQLException ex) {
			System.out.println("Exception: " + ex);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
