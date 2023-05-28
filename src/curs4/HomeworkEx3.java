package curs4;

import java.util.Scanner;

public class HomeworkEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int punctaj;
		String calificativ;
		Scanner scan= new Scanner(System.in);
		System.out.println("Te rog introdu punctajul: ");
		punctaj=scan.nextInt();
		
		calificativ=punctaj>100?"Introdu un punctaj coerent":punctaj>=90?"FB":(punctaj>=80?"B":"S");
		System.out.println("Calificativul este: "+calificativ);
		/*
		if (punctaj>=90) {
			calificativ = "FB";
		}
		else if(punctaj>=80) {
			calificativ = "B";
		}
		else {
			calificativ = "S";
		}
*/
		
		if (calificativ=="FB") {
			System.out.println("Ai primit: Foarte bine!");
		}
		else if (calificativ=="B") {
			System.out.println("Ai primit: Bine!");
		}
		else { 
			System.out.println("Ai primit: Suficient!");
		}
	}

}
