package com.demo.assignments.student;

import java.io.Serializable;

public class Student implements Serializable {

	private int stuId;
	private String name;

	public Student(int stuId, String name) {
		this.stuId = stuId;
		this.name = name;
	}

	public int getStuId() {
		return stuId;
	}

	public String getName() {
		return name;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public void setName(String name) {
		this.name = name;
	}

}
