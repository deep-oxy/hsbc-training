package com.hsbc.training.app.dao;

import java.util.List;

import com.hsbc.training.app.entity.Apparels;
import com.hsbc.training.app.entity.Electronics;
import com.hsbc.training.app.entity.FoodItems;

public interface shoppingDao {

	public List<FoodItems> reportFoodItems();

	public List<Apparels> reportApparels();

	public List<Electronics> reportElectronics();

	public String addApparels(Apparels a) throws DuplicateItemException;

	public String addFood(FoodItems f) throws DuplicateItemException;

	public String addElectronics(Electronics e) throws DuplicateItemException;

	public String removeFood(int id) throws ItemNotFoundException;

	public String removeApparels(int id) throws ItemNotFoundException;

	public String removeElectronics(int id) throws ItemNotFoundException;

}
