package curs5;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[]  args) {
		String array = {"Iasi";"Alba"};
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
