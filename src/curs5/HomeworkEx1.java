package curs5;

import java.util.Scanner;

public class HomeworkEx1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username;
		int password;
		boolean validLogin=false;
		int nrAttemps=0;
	    do {Scanner scan= new Scanner(System.in);
		System.out.println("Enter a username:");
		username =scan.next();
		System.out.println("Te rog introdu parola: ");
		password =scan.nextInt();
		if (username.equals("TestUser") && password==1234) {
	       validLogin=true;
	       System.out.println("Login successful!");
		}
		else {System.out.println("Login error!");
		nrAttemps++;}
		if (nrAttemps==3) {
			System.out.println("Utilizator blocat!");
		}
	    }while(validLogin==false && nrAttemps<3);

	}

}
