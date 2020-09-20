package com.demo.assignments;

public class MainApp3 {

	public static void main(String[] args) {
		Account a = new Account(50000, false);

		try {
			a.getBalance();
			a.withdraw(25000);
			a.getBalance();
			a.deposite(5000);
			a.getBalance();
			//a.blockAccount();
			a.getBalance();
			a.withdraw(15000);
			a.getBalance();
			a.withdraw(20000);
			a.blockAccount();
			a.getBalance();
		} catch (AccountBlockedException | InsufficientBalanceException e) {
			System.out.println(e);
		}
		System.out.println("MainApp End");

	}

}
