package curs6;

import java.util.Scanner;

public class switchExample {
	/*
	 * Intreb userul un calificativ 
	 * in functie de calificativ printez:
	 * Daca introduce A : printez "Felicitari!;
	 * Daca introduce B : printez destul de bine
	 * Daca introduce C : printez "Suficient!"
	 * Daca introduce D : printez "Insuficient"
	 * Daca introduce alt calificativ printeez "Nota invalida"
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Te rog introdu un calificativ: ");
		Scanner scan=new Scanner(System.in);
		String calificativ=scan.next();
		
		switch(calificativ.toUpperCase()) {
		
		case "A": System.out.println("Felicitari!");
		break;
		
		case "B": System.out.println("Destul de bine!");
		break;
		
        case "C": System.out.println("Suficient!");
        break;
        
		case "D": System.out.println("Insuficient!");
		break;
	
		default: System.out.println("Nota invalida!");
		}

	}

}
