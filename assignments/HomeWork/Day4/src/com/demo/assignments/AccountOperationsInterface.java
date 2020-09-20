package com.demo.assignments;

public interface AccountOperationsInterface {
	public double deposite(double amt) throws AccountBlockedException;

	public double withdraw(double amt) throws AccountBlockedException, InsufficientBalanceException;

	public double getBalance() throws AccountBlockedException;

	public void blockAccount();

}
