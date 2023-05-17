package curs3;

import java.util.Scanner;

public class HomeworkIfElseEx3 {
	
	static int number;
	
	public static void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti numarul corespunzator zilei de azi:");
		number=scan.nextInt();
		scan.close();
	}
	
	public static void compareTheDays() {
		if (number == 0) {
			System.out.println("Te rog sa introduci un numar mai mare ca 0");
		}
		else if (number == 1) {
			System.out.println("Astazi este luni!");
		}
		else if (number == 2) {
			System.out.println("Astazi este marti!");
		}
		else if (number == 3) {
			System.out.println("Astazi este miercuri!");
		}
		else if (number == 4) {
			System.out.println("Astazi este joi!");
		}
		else if (number == 5) {
			System.out.println("Astazi este vineri!");
		}
		else if (number == 6) {
			System.out.println("Astazi este sambata!");
		}
		else if (number == 7) {
			System.out.println("Astazi este duminica!");
		}
		else if (number > 7) {
			System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid");
		}
		else {
			System.out.println("Te rog sa introduci un numar pozitiv!");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		askTheUser();
		compareTheDays();

	}

}
