package curs8.homework;
import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsuficientFundsException{
		Customer c = new Customer("Luigi Posea","Bucuresti","luigi.posea@gmail.com");
		SavingsAccount sa = new SavingsAccount(23456789,1000.00, c);
		System.out.println("Hi " + c.name);
		System.out.print("Please enter the amount to withdraw: ");
		Scanner my_scan = new Scanner(System.in);
		double amount = my_scan.nextDouble();
		try {
			sa.withdraw(amount);
		} catch (InsuficientFundsException ife) {
				throw new InsuficientFundsException("Insuficient funds for transaction!!!");
		}

	}

}
