package curs8;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgeVerifier obj=new AgeVerifier();
		System.out.println("Please enter your age: ");
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		try {
		obj.checkAge(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}

}
