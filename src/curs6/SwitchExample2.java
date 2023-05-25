package curs6;

import java.util.Scanner;

public class SwitchExample2 {
/*
 * Program care verifica daca un student este eligibil pt bursa
 * Conditii:
 * sa fie anul3
 * sa aiba un punctaj de 80 pt bursa 1
 * sa aiba un punctaj de 50 pt bursa 2
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int an;
		int punctaj;
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu anul in care esti: ");
		an= scan.nextInt();
		
		
		switch(an) {
		case 3:
		System.out.println("Te rog introdu punctajul tau: ");
		punctaj = scan.nextInt();
		switch (punctaj) {
		case 80: System.out.println("Bursa 1");
		break;
		case 50: System.out.println("Bursa 2");
		break;
		default : System.out.println("Nu esti eligibil pentru bursa!");
		}
		break;
		default : System.out.println("Nu esti eligibil");
		
		}

	}

}
