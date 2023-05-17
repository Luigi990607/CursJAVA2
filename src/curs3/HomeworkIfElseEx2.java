package curs3;

import java.util.Scanner;

public class HomeworkIfElseEx2 {
	
	static int punctaj;
	
	public static void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the score:");
		punctaj=scan.nextInt();
		scan.close();
	}
	
	public static void compareTheScores() {
		if (punctaj >= 0 && punctaj < 65) {
			System.out.println("Ai picat testul!");
		}
		else if (punctaj >=65 && punctaj <=100) {
			System.out.println("Felicitari, ai trecut testul!");
		}
		else {
			System.out.println("Valoarea punctajului nu este rezonabila sau incadrata in barem!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		askTheUser();
		compareTheScores();
	}

}
