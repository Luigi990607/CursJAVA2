package curs8.homework;

public class Account {

	private int accountNumber;
	public double balance;
	public Customer accountOwner;
	
	public Account(int accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}	
	
	public void withdraw(Double sum) throws InsuficientFundsException {
		if(sum > balance ) {
			throw new InsuficientFundsException("Insuficient funds for transaction");
		}
		this.balance = balance - sum;
	}
}
