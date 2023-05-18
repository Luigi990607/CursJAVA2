package curs4;

import java.util.Scanner;

/*
 * Un program care citeste de la tastatura 2 nur si verifica urmatoarele:
 * -Daca fiecare nr este pozitiv
 * -Daca ambele nr sunt pozitive 
 * -Care dintre cele 2 este cel mai mic(verificam daca sunt egale)
 * Printam :
 * Ex: num1 este pozitiv
 * Numerele sunt pozitive
 * 
 * Implementare cu if else
 * Implementare cu ternary (conditional) operator
 */
public class ConditionalOperator {
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Te rog introdu nr1:");
		num1=scan.nextInt();
		System.out.println("Te rog introdu nr2:");
		num2=scan.nextInt();
		scan.close();
		
		if (num1> 0) {
			System.out.println("Num1 este pozitiv");
		}
		else {
			System.out.println("Num1 este negativ");
		}
		
		
		//String y = (num1>0) ? "Num1 este pozitiv" : "Num1 este negativ";
			
		
		if (num2> 0) {
				System.out.println("Num2 este pozitiv");
			}
			else {
				System.out.println("Num2 este negativ");
		}
			if (num1>0 && num2>0)
			{
				System.out.println("Numerele sunt pozitive");
			}
			else {
				System.out.println("Cel putin un nr este negativ!");
			}
			if (num1>num2) {
				System.out.println("Num1 este mai mare!");
			}
			else if (num2>num1) {
				System.out.println("Num2 este mai mare!");
			}
			else {
				System.out.println("Sunt egale");
			}
			
			System.out.println("-------------------------------");
			//result = conditie ? expresie1(true):expresie2(false)
			
			String y = (num1>0) ? "Num1 este pozitiv" : "Num1 este negativ";
			System.out.println(y);
			y = (num2>0) ? "Num2 este pozitiv" : "Num2 este negativ";
			System.out.println(y);
			y = (num1>0 && num2>0) ? "Numerele sunt pozitive" : "Numerele sunt negative";
			System.out.println(y);
			y = (num1>num2)?"Num1 este mai mare":(num2>num1)?"Num2 este mai mare":"Sunt egale";
			System.out.println(y);
	} 

}
