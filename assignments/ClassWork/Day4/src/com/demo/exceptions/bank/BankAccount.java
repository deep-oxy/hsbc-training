package com.demo.exceptions.bank;

public class BankAccount {

	private double balance = 0.0;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double withdraw(double amount) 
	{
		try {
		if(balance<amount) {
			throw new LowBalanceException();
		}else {
			balance=balance-amount;
			System.out.println("Transaction successful, new balance= "+balance);
		}
		}catch (LowBalanceException e) {
			System.out.println(e);
			throw e;
		}
		return balance;
	}

}
