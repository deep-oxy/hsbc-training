package com.hsbc.tr.web;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String username;
	private String password;
	private boolean authenticated;
	private List<String> users = new ArrayList<String>();

	public User() {
		users.add("Piyush");
		users.add("Deep");
		users.add("Honey");
		users.add("Dev");
		users.add("Deomist");

	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean isAuthenticated() {
		if (username.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public List<String> getUsers() {
		return users;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}

}
