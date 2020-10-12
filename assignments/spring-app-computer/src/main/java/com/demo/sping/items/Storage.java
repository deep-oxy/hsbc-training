package com.demo.sping.items;

import org.springframework.stereotype.Repository;

@Repository
public class Storage {

	private String storageType;
	private int storageSize;

	public Storage() {

	}

	public Storage(String storageType, int storageSize) {
		this.storageType = storageType;
		this.storageSize = storageSize;
	}

	public String getStorageType() {
		return storageType;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

}
