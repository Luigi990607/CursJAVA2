package curs5;

import java.util.Scanner;
public class WhileExample {
	
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		int j=0;
		while (j<10) {
			System.out.println(j);
			j++;
		}
		System.out.println("--------------------");
		
		String[] array = {"Iasi","Cluj","Alba","Pitesti"};
		
		for (int a=0;a<array.length;a++) {
			System.out.println(array[a]);
		}
		int b=0;
		while (b<array.length) {
			System.out.println(array[b]);
			b++;
		}
	}

}
