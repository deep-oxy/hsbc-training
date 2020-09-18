package com.demo.exceptions.bank;

public class BankMain {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000);

		account.withdraw(2000);
		account.withdraw(5000);
		account.withdraw(4000);
		System.out.println("Done Succcesfully");

	}

}
