package com.demo.sping.items;

import org.springframework.stereotype.Repository;

@Repository
public class Display {

	private String displayType;
	private String displayMemory;
	private String resolution;

	public Display() {

	}

	public Display(String displayType, String displayMemory, String resolution) {
		this.displayType = displayType;
		this.displayMemory = displayMemory;
		this.resolution = resolution;
	}

	public String getDisplayType() {
		return displayType;
	}

	public String getDisplayMemory() {
		return displayMemory;
	}

	public String getResolution() {
		return resolution;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public void setDisplayMemory(String displayMemory) {
		this.displayMemory = displayMemory;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

}
