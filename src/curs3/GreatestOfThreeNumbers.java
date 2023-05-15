package curs3;

import java.util.Scanner;

/* Facem un program care intreaba utilizatorul 3 nr
* Verificam care dintre cele 3 nr este cel mai mare si printam corespunzator
* Daca 2 nr sunt egale si sunt cele mai mari printam " Some nr are equals" 
* Ex: "First nr is the greatest"
*/
public class GreatestOfThreeNumbers {
	
	int number1,number2,number3;
	
	public void askTheNumbers() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Pleasse enter the first number");
		number1=scan.nextInt();
		System.out.println("Pleasse enter the second number");
		number2=scan.nextInt();
		System.out.println("Pleasse enter the third number");
		number3=scan.nextInt();
		scan.close();
	}
	
	public void CompareTheNumbers() {
		if (number1>number2 && number1>number3) {
			System.out.println("First number is the greatest!");
		}
		else if (number2>number1 && number2>number3) {
			System.out.println("Second number is the greatest!");
		}
		else if (number3>number1 && number3>number2) {
			System.out.println("Third number is the greatest!");
		}
		else {
			System.out.println("Some numbers are equals!");
		}
	}

}
