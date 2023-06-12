package curs9;

public class CurrentAcount implements Account{

	public double balance;
	@Override
	public void deposit(double amount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		if (amount<=0) {
			throw new InvalidAmountException(amount + "is not valid!");
		}
		balance= balance + amount;
		//System.out.println("Current balance is: "+ balance);
		checkBalance();
		
	}

	@Override
	public void withdraw(double amount) throws InsuficientFundsException {
		// TODO Auto-generated method stub
		if(amount>balance) {
			throw new InsuficientFundsException("You don t have sufficient funds!");
		}
		balance= balance - amount;
		//System.out.println("Current balance is: " + balance);
		checkBalance();
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Current balance is: " + balance);
	}

}
