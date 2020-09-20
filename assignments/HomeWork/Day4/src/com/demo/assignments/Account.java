package com.demo.assignments;

public class Account implements AccountOperationsInterface {

	double balance;
	boolean blocked;

	public Account(double balance, boolean blocked) {
		this.balance = balance;
		this.blocked = blocked;
	}

	@Override
	public double deposite(double amt) throws AccountBlockedException {
		if (blocked == true) {
			throw new AccountBlockedException();
		} else {
			balance += amt;
			System.out.println("Deposite transaction successful");
		}
		return balance;
	}

	@Override
	public double withdraw(double amt) throws AccountBlockedException, InsufficientBalanceException {
		if (blocked == true) {
			throw new AccountBlockedException();
		} else if (balance < amt) {
			throw new InsufficientBalanceException();
		} else {
			balance -= amt;
			System.out.println("Withdraw transaction successful");
		}
		return balance;
	}

	@Override
	public double getBalance() throws AccountBlockedException {
		if (blocked == true) {
			throw new AccountBlockedException();
		} else {
			System.out.println("Your balance is : " + balance);
			return balance;
		}

	}

	@Override
	public void blockAccount() {

		blocked = true;

	}

}
