package com.hsbc.training.app.entity;

/**
 * @author Piyush Deep purpose: entity creation
 *
 */

public class FoodItems {

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private String manufacture;
	private String expiry;
	private String vegetarian;
	private int quantity;

	public FoodItems() {
		// Default empty constructor
	}

	public FoodItems(int itemCode, String itemName, double unitPrice, String manufacture, String expiry,
			String vegetarian, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.manufacture = manufacture;
		this.expiry = expiry;
		this.vegetarian = vegetarian;
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

	public String getManufacture() {
		return manufacture;
	}

	public String getExpiry() {
		return expiry;
	}

	public String isVegetarian() {
		return vegetarian;
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

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
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

		FoodItems other = (FoodItems) obj;
		if (itemCode != other.itemCode)
			return false;
		return true;
	}

}
