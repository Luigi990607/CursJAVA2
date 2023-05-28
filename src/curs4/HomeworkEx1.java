package curs4;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    double factura;
		Scanner scan= new Scanner(System.in);
		System.out.println("Te rog introdu suma de plata:");
		factura=scan.nextDouble();
		
		//factura=factura>=100?factura==factura-factura*10/100:factura==factura-factura*5/100;
		
		
		if (factura>=100) {
			factura= factura - factura*10/100;
			System.out.println("Factura dispune de un discount de 10%: "+ factura);
		}
		else if(factura>0 && factura<100){
			factura= factura - factura*5/100;
			System.out.println("Factura dispune de un discount de 5%: "+ factura);
		}
		else {
			System.out.println("Introdu o suma pozitiva de facturare!");
		}
	
	
		
	}

}
