package com.hsbc.training.app.entity;

/**
 * @author Piyush Deep purpose: entity creation
 *
 */

public class Electronics {

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int warranty;
	private int quantity;

	public Electronics() {
		// TODO Auto-generated constructor stub
	}

	public Electronics(int itemCode, String itemName, double unitPrice, int warranty, int quantity) {

		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.warranty = warranty;
		this.quantity = quantity;
	}
	
	// setters and getters to change or access values

	public int getItemCode() {
		return itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getWarranty() {
		return warranty;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// overriding hash code for our purpose

	@Override
	public int hashCode() {
		return itemCode;
	}
	
	// overriding equals for our purpose

	@Override
	public boolean equals(Object obj) {

		Electronics other = (Electronics) obj;
		if (itemCode != other.itemCode)
			return false;
		return true;
	}

}
