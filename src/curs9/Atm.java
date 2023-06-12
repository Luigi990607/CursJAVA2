package curs9;

import java.util.Scanner;

/*
 * simulam lucrul cu un atm
 * avem 3 operatiuni
 * 1. withdraw
 * 2. deposit
 * 3. checkBalance
 * intrebam userul ce operatiune vrea sa faca.
 * daca vrea withdraw facem balance= balance - amount si printam soldul
 * === daca withdraw este mai mare decat balanta printam " insuficient...
 * daca vrea deposit facem balance=balance + amount si printam soldul
 * daca vrea check balance printam soldul
 * 
 * programul face parte dintr-un intreg sistem bancar ceea ce implica multiple conturi 
 * (cont curent, cont economii, cont de credit etc.)
 * toate conturile au aceleasi 3 operatiuni dar implementari spedicice 
 * noi implementam atm pe cont curent
 * 
 * dupa ce utilizatorul efectueaza o operatiune il intrebam daca vrea sa continue.
 * 
 */

public class Atm {
	
	double amount;
	static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		
		CurrentAcount acc = new CurrentAcount();
		acc.balance=1000;
		//acc.checkBalance();
		Atm atm=new Atm();
		boolean flag=true;
		while(flag) {
			//Scanner scan= new Scanner(System.in);
		
			try {
			atm.atmOperations(acc);
			System.out.println("Do you want to continue?");
			flag=scan.nextBoolean();
			
			}catch(InvalidAmountException | InsuficientFundsException e) {
				e.printStackTrace();
			}
		}
		scan.close();
	}

	
	public void atmOperations(CurrentAcount.obj) throws InvalidAmountException, InsuficientFundsException {
		//Scanner scan=new Scanner(System.in);
		System.out.println("Hi, Available operations are:");
		System.out.println("1: Deposit");
		System.out.println("2: Withdraw");
		System.out.println("3: Check Balance");
		
		int option=scan.nextInt();
		switch(option) {
		case 1:
			System.out.println("Please enter the deposit amount:");
			double amount=scan.nextDouble();
			obj.deposit(amount);
			break;
		case 2:
			System.out.println("Please enter the withdraw amount:");
			double amount2=scan.nextDouble();
			obj.withdraw(amount2);
			break;
		case 3:
			obj.checkBalance();
			break;
			default:
				System.out.println("Invalid option!");
		}

		//scan.close();				
	}
}
