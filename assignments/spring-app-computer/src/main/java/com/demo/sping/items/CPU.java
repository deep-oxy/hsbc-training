package com.demo.sping.items;

import org.springframework.stereotype.Repository;

@Repository
public class CPU {

	private String cpuType;
	private String cpuFrequency;

	public CPU() {

	}

	public CPU(String cpuType, String cpuFrequency) {
		this.cpuType = cpuType;
		this.cpuFrequency = cpuFrequency;
	}

	public String getCpuType() {
		return cpuType;
	}

	public String getCpuFrequency() {
		return cpuFrequency;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}

	public void setCpuFrequency(String cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}

}
