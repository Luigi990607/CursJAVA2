package curs4;

import java.util.Scanner;

public class HomeworkEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f,g,h,j,k,sum = 0;
		Scanner scan= new Scanner(System.in);
		 for (int i=0; i<10; i++) {
			 if (i==0) {
		System.out.println("Please enter number 1: ");
		a=scan.nextInt();
	    sum=a;
			 }
			 else if (i==1) {
		System.out.println("Please enter number 2: ");
		b=scan.nextInt();
		sum=sum+b;
			 }
			 else if (i==2) {
		System.out.println("Please enter number 3: ");
		c=scan.nextInt();
		sum=sum+c;
			 }
			 else if (i==3) {
		System.out.println("Please enter number 4: ");
		d=scan.nextInt();
		sum=sum+d;
			 }
			 else if (i==4) {
		System.out.println("Please enter number 5: ");
		e=scan.nextInt();
		sum=sum+e;
			 }
			 else if (i==5) {
		System.out.println("Please enter number 6: ");
		f=scan.nextInt();
		sum=sum+f;
			 }
			 else if (i==6) {
		System.out.println("Please enter number 7: ");
		g=scan.nextInt();
		sum=sum+g;
			 }
			 else if (i==7) {
		System.out.println("Please enter number 8: ");
		h=scan.nextInt();
		sum=sum+h;
			 }
		     else if (i==8) {
		System.out.println("Please enter number 9: ");
		j=scan.nextInt();
		sum=sum+j;
		     }
		     else {
		System.out.println("Please enter number 10: ");
		k=scan.nextInt();
		sum=sum+k;
		     }
	}
		 System.out.println("Suma numerelor este: "+sum);
}
}

		 
