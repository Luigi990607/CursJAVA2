package curs3;

import java.util.Scanner;

public class HomeworkIfElseEx1 {
	
	static int varsta;
	
	public static void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the age:");
		varsta=scan.nextInt();
		scan.close();
	}
	
	public static void compareTheAges() {
		if (varsta < 18) {
			System.out.println("Esti minor!");
		}
		else if (varsta >= 18 && varsta <= 65) {
			System.out.println("Esti adult!");
		}
		else { 
			System.out.println("Esti batran!");
		}
	}
	public static void main(String[] args) {
		askTheUser();
		compareTheAges();
	}
}	
