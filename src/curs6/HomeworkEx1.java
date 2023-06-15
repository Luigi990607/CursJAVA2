package curs6;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci anul de vechime in firma: ");
		int vechime = scan.nextInt();
		System.out.println("Te rog sa introduci valoarea vanzarilor efectuate: ");
		int vanzari = scan.nextInt();
		System.out.println("Te rog sa introduci luna in care ai efectuat vanzarile: ");
		int luna = scan.nextInt();
		
		switch(vechime) {
		case 1:
		    System.out.println("Primesti un bonus de 100 de lei!");
		    break;
		case 2:
			System.out.println("Primesti un bonus de 200 de lei!");
			break;
		case 3:
		if(vanzari<=5000) {
			System.out.println("Primesti un bonus de 600 de lei!");
		} else if(vanzari>5000 && vanzari<=10000 && luna>=1 && luna<=6) {
		   System.out.println("Primesti un bonus de 800 de lei!");
		} else if(vanzari>5000 && vanzari<=10000 && luna>=7 && luna<=11) {
			   System.out.println("Primesti un bonus de 1000 de lei!");
	    } else if(vanzari>5000 && vanzari<=10000 && luna==12) {
			   System.out.println("In decembrie se vand singure!");
		} else if(vanzari>10000) {
			System.out.println("Primesti un bonus de 1200 de lei!");
		}
}
	}}
