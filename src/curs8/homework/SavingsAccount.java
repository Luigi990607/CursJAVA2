package curs8.homework;

public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber,balance, accountOwner);	
	}

	@Override	
	public void withdraw(Double sum) throws InsuficientFundsException {
		if(sum > balance ) {
			System.out.println("The amount you entered is greater than the available balance :" + balance);
			System.out.println("Thank you for using our ATM !");
			throw new InsuficientFundsException("Insuficient funds for transaction!!!");
		}
		balance = balance - sum;
		System.out.println("Please pick your money!");
		System.out.println("Your new balance is : " + super.balance);
		System.out.println("Thank you for using our ATM !");
	}
}

