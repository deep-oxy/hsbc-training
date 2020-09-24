package com.hsbc.training.app;

import java.util.Scanner;

import com.hsbc.training.app.dao.shoppingDao;
import com.hsbc.training.app.impl.shoppingDaoImpl;
import com.hsbc.training.app.service.ShoppingService;

/**
 * @author Piyush Deep 
 * purpose: main application to run the project
 *
 */

public class mainApp {

	public static void main(String[] args) {
		shoppingDao dao = new shoppingDaoImpl();

		ShoppingService service = new ShoppingService(dao);

		System.out.println("Please enter you choice: ");

		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();

		if (choice.equals("apparels")) {
			service.printApparelReport();
		} else if (choice.equals("food")) {
			service.printFoodReport();
		} else if (choice.equals("electronic")) {
			service.printElectronicsReport();
		} else {
			System.out.println("Wrong input");
		}

	}

}
