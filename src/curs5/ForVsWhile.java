package curs5;

import java.util.Scanner;

/*
 * Facem un program care ii cere userului numele in continuu 
 * Le inmulteste cu 10 pana cand userul introduce 0
 * Daca a introdus 0 facem exit din loop
 * 
 * FOR
 * WHILE
 */
public class ForVsWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number: ");
        Scanner scan=new Scanner(System.in);
        scan.close();
        //rezolvareCuFor();
        //rezolvareCuWhile();
        rezolvareCuDoWhile();
	}
	
	public static void rezolvareCuFor() {
		System.out.println("Please enter a number: ");
		Scanner scan=new Scanner(System.in);
		
		for (;;) {
			int nr= scan.nextInt();
			if (nr == 0) {
				break;
			}
			System.out.println(nr * 10);
			System.out.println("Please enter a number: ");
			scan.close();
		}
	}
	
	public static void rezolvareCuWhile() {
		
		System.out.println("Please enter a number: ");
		Scanner scan=new Scanner(System.in);
		int nr = scan.nextInt();
		while (nr!=0) {
			System.out.println(nr * 10);
			System.out.println("Please enter a number: ");
			nr = scan.nextInt();
		}
		scan.close();
	}
	
	public static void rezolvareCuDoWhile(){
		System.out.println("Te rog introdu nr de ore lucrate: ");
		Scanner scan=new Scanner(System.in);
		int nr=scan.nextInt();
		
		do {

			System.out.println("Please enter a number: ");
			nr = scan.nextInt();
			System.out.println(nr * 10);
		} while (nr !=0);
		scan.close();
		
	}
	
}
