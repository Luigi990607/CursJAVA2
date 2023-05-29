package curs5;

import java.util.Scanner;

public class HomeworkEx1 {
	
	String username;
	int password;
	static boolean validUser,validPass;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username;
		int password;
		boolean validUser=false;
	    boolean validPass=false;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a username:");
		username =scan.next();
		System.out.println("Te rog introdu parola: ");
		password =scan.nextInt();
		if (username=="t") {
			
			System.out.println(validUser + "Asta trb afisat");}
		else {validUser=true;
		System.out.println(validUser+" trueeee");}
		
		
		if(password!=1234) {
			
			System.out.println(validPass);}
		else {validPass=true;
		System.out.println(validUser+"true");}
		
		//do {
			
		//	System.out.println("Login " + validUser + " "+validPass);
		
		//}while(validUser==true && validPass==true);
		

	}

}
