package com.hsbc.training.app.service;

import com.hsbc.training.app.dao.DuplicateItemException;
import com.hsbc.training.app.dao.ItemNotFoundException;
import com.hsbc.training.app.dao.shoppingDao;
import com.hsbc.training.app.entity.Apparels;
import com.hsbc.training.app.entity.Electronics;
import com.hsbc.training.app.entity.FoodItems;

public class ShoppingService {
	private shoppingDao dao;

	public ShoppingService(shoppingDao dao) {
		this.dao = dao;
	}

	public String registerFood(int itemCode, String itemName, double unitPrice, String manufacture, String expiry,
			String vegetarian, int quantity) {
		try {
			return dao.addFood(new FoodItems(itemCode, itemName, unitPrice, manufacture, expiry, vegetarian, quantity));
		} catch (DuplicateItemException e) {
			throw new RuntimeException("Item already exist");
		}
	}

	public String registerApparels(int itemCode, String itemName, double unitPrice, String sizenmaterial,
			int quantity) {
		try {
			return dao.addApparels(new Apparels(itemCode, itemName, unitPrice, sizenmaterial, quantity));
		} catch (DuplicateItemException e) {
			throw new RuntimeException("Item already exist");
		}
	}

	public String registerElectronics(int itemCode, String itemName, double unitPrice, int warranty, int quantity) {
		try {
			return dao.addElectronics(new Electronics(itemCode, itemName, unitPrice, warranty, quantity));
		} catch (DuplicateItemException e) {
			throw new RuntimeException("Item already exist");
		}
	}

	public String removeFood(int id) {
		try {
			return dao.removeFood(id);
		} catch (ItemNotFoundException e) {
			throw new RuntimeException("Item does not exist");
		}
	}

	public String removeApparels(int id) {
		try {
			return dao.removeApparels(id);
		} catch (ItemNotFoundException e) {
			throw new RuntimeException("Item does not exist");
		}
	}

	public String removeElectronics(int id) {
		try {
			return dao.removeElectronics(id);
		} catch (ItemNotFoundException e) {
			throw new RuntimeException("Item does not exist");
		}
	}

	public void printFoodReport() {
		for (FoodItems f : dao.reportFoodItems()) {
			System.out.println(
					f.getItemCode() + " " + f.getItemName() + " " + (200 - f.getQuantity()) + " " + f.isVegetarian());
		}
	}

	public void printApparelReport() {
		for (Apparels a : dao.reportApparels()) {
			System.out.println(a.getItemCode() + " " + a.getItemName() + " " + (200 - a.getQuantity()) + " "
					+ a.getSizenmaterial());
		}
	}

	public void printElectronicsReport() {
		for (Electronics e : dao.reportElectronics()) {
			System.out.println(
					e.getItemCode() + " " + e.getItemName() + " " + (200 - e.getQuantity()) + " " + e.getWarranty());
		}
	}

}