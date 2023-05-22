package curs5;

import java.util.Scanner;

/*
 * facem un program care calculeaza salariul pe o saptamana
 * intrebam userul cate ore a lucrat
 * calculam doar daca a lucrat maxim 40 de ore si minim 1 ora
 * 
 * 
 * salariul=nrOreLucrate*20
 */

public class WageCalculator {

	  public static void main(String[] args) {
		System.out.println("Te rog introdu nr de ore lucrate: ");
		Scanner scan=new Scanner(System.in);
		
		int nrOre = scan.nextInt();
		while (nrOre <1 || nrOre >=40) {
			System.out.println("Nr de ore invalid, introdu un nr intre 1 si 40");
			System.out.println("Te rog introdu nr de ore lucrate: ");
			nrOre=scan.nextInt();
		}
			System.out.println("Ssalariul tau este: "+ nrOre*20);
			scan.close();
		}
}
