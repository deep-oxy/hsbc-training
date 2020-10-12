package com.demo.sping.items;

import org.springframework.stereotype.Repository;

@Repository
public class Ram {

	private String ramType;
	private int ramSize;

	public Ram() {

	}

	public Ram(String ramType, int ramSize) {
		this.ramType = ramType;
		this.ramSize = ramSize;
	}

	public String getRamType() {
		return ramType;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamType(String ramType) {
		this.ramType = ramType;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

}
