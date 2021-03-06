package com.hsbc.training.app.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hsbc.training.app.dao.DuplicateItemException;
import com.hsbc.training.app.dao.ItemNotFoundException;
import com.hsbc.training.app.dao.shoppingDao;
import com.hsbc.training.app.entity.Apparels;
import com.hsbc.training.app.entity.Electronics;
import com.hsbc.training.app.entity.FoodItems;

/**
 * @author Piyush Deep
 * 
 *         purpose: to create methods for implementation of the needs of the
 *         application and populate the data
 *
 */

public class shoppingDaoImpl implements shoppingDao {

	static Map<Integer, FoodItems> fooditemsDb = new HashMap<>();
	static Map<Integer, Apparels> apparelsDb = new HashMap<>();
	static Map<Integer, Electronics> electronicsDb = new HashMap<>();

	// populating data

	public shoppingDaoImpl() {

		fooditemsDb.put(100, new FoodItems(100, "Milk", 45, "15/04/2020", "15/05/2020", "Yes", 124));
		fooditemsDb.put(101, new FoodItems(101, "Curd", 34, "12/04/2020", "12/05/2020", "Yes", 99));
		fooditemsDb.put(102, new FoodItems(102, "Cake", 12, "13/04/2020", "13/05/2020", "Yes", 56));
		fooditemsDb.put(103, new FoodItems(103, "Banana", 56, "14/04/2020", "14/05/2020", "Yes", 77));
		fooditemsDb.put(104, new FoodItems(104, "Egg", 99, "17/04/2020", "17/05/2020", "No", 36));

		apparelsDb.put(200, new Apparels(200, "Tshirt", 45, "Cotton", 124));
		apparelsDb.put(201, new Apparels(201, "shirt", 55, "Cotton", 99));
		apparelsDb.put(202, new Apparels(202, "Sweater", 96, "Wool", 45));
		apparelsDb.put(203, new Apparels(203, "Jacket", 458, "Leather", 66));
		apparelsDb.put(204, new Apparels(204, "inner", 75, "Cotton", 78));

		electronicsDb.put(300, new Electronics(300, "TV", 522, 6, 87));
		electronicsDb.put(301, new Electronics(301, "Mobile", 549, 6, 55));
		electronicsDb.put(302, new Electronics(302, "Watch", 752, 12, 99));
		electronicsDb.put(303, new Electronics(303, "DTV", 455, 15, 125));
		electronicsDb.put(304, new Electronics(304, "Charger", 78, 26, 77));

	}

	// implementing all the overridden methods form shoppingDao

	@Override
	public List<FoodItems> reportFoodItems() {

		ArrayList<FoodItems> f = new ArrayList<>(fooditemsDb.values());

		Collections.sort(f, new MyFoodSorter());

		return f;
	}

	@Override
	public List<Apparels> reportApparels() {
		ArrayList<Apparels> a = new ArrayList<>(apparelsDb.values());

		Collections.sort(a, new MyApparelsSorter());

		return a;
	}

	@Override
	public List<Electronics> reportElectronics() {

		ArrayList<Electronics> e = new ArrayList<>(electronicsDb.values());

		Collections.sort(e, new MyElectronicsSorter());

		return e;
	}

	@Override
	public String addApparels(Apparels a) throws DuplicateItemException {
		try {
			if (apparelsDb.containsKey(a.getItemCode())) {
				throw new DuplicateItemException();
			} else {
				apparelsDb.put(a.getItemCode(), a);
				return "item added succefully";
			}
		} catch (DuplicateItemException e) {
			throw e;
		}
	}

	@Override
	public String addFood(FoodItems f) throws DuplicateItemException {
		try {
			if (fooditemsDb.containsKey(f.getItemCode())) {
				throw new DuplicateItemException();
			} else {
				fooditemsDb.put(f.getItemCode(), f);
				return "item added succefully";
			}
		} catch (DuplicateItemException e) {
			throw e;
		}
	}

	@Override
	public String addElectronics(Electronics e) throws DuplicateItemException {
		try {
			if (electronicsDb.containsKey(e.getItemCode())) {
				throw new DuplicateItemException();
			} else {
				electronicsDb.put(e.getItemCode(), e);
				return "item added succefully";
			}
		} catch (DuplicateItemException ex) {
			throw ex;
		}
	}

	@Override
	public String removeFood(int id) throws ItemNotFoundException {
		try {
			if (fooditemsDb.containsKey(id)) {
				fooditemsDb.remove(id);
				return "Item removed Successfully";
			} else {
				throw new ItemNotFoundException();
			}
		} catch (ItemNotFoundException e) {
			throw e;
		}
	}

	@Override
	public String removeApparels(int id) throws ItemNotFoundException {
		try {
			if (apparelsDb.containsKey(id)) {
				apparelsDb.remove(id);
				return "Item removed Successfully";
			} else {
				throw new ItemNotFoundException();
			}
		} catch (ItemNotFoundException e) {
			throw e;
		}
	}

	@Override
	public String removeElectronics(int id) throws ItemNotFoundException {
		try {
			if (electronicsDb.containsKey(id)) {
				electronicsDb.remove(id);
				return "Item removed Successfully";
			} else {
				throw new ItemNotFoundException();
			}
		} catch (ItemNotFoundException e) {
			throw e;
		}
	}

}

//overriding compare method to sort for our purposes

class MyApparelsSorter implements Comparator<Apparels> {

	@Override
	public int compare(Apparels a1, Apparels a2) {
		// TODO Auto-generated method stub
		return a1.getQuantity() - a2.getQuantity();
	}

}

class MyFoodSorter implements Comparator<FoodItems> {

	@Override
	public int compare(FoodItems f1, FoodItems f2) {
		// TODO Auto-generated method stub
		return f1.getQuantity() - f2.getQuantity();
	}

}

class MyElectronicsSorter implements Comparator<Electronics> {

	@Override
	public int compare(Electronics e1, Electronics e2) {
		// TODO Auto-generated method stub
		return e1.getQuantity() - e2.getQuantity();
	}

}