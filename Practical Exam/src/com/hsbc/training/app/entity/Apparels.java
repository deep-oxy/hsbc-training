package com.hsbc.training.app.entity;

/**
 * @author Piyush Deep purpose: entity creation
 *
 */

public class Apparels {

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private String sizenmaterial;
	private int quantity;

	public Apparels() {
		// TODO Auto-generated constructor stub
	}

	public Apparels(int itemCode, String itemName, double unitPrice, String sizenmaterial, int quantity) {

		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.sizenmaterial = sizenmaterial;
		this.quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public String getSizenmaterial() {
		return sizenmaterial;
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

	public void setSizenmaterial(String sizenmaterial) {
		this.sizenmaterial = sizenmaterial;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return itemCode;
	}

	@Override
	public boolean equals(Object obj) {

		Apparels other = (Apparels) obj;
		if (itemCode != other.itemCode)
			return false;
		return true;
	}

}
