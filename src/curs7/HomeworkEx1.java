package curs7;

import java.util.Scanner;

public class HomeworkEx1 {
	
	public static int[] askUser() {
		System.out.println("Cate elemente trebuie sa aiba array-ul: ");
		Scanner scan = new Scanner(System.in);
		int lungimeArray = scan.nextInt();
		int[]array = new int[lungimeArray];
		
		for(int i=0;i<=lungimeArray - 1;i++) {
			System.out.println("Introdu elementul %d: " + i+1);
			array[i]=scan.nextInt();
		}
		return array;
	}
	
	public static void reverseArrayFor(int[] array) {
		int[] reverseArray= new int[array.length]
				System.out.println("Array reversed: ");
		for (int i=array.length-1;i>=0;i--) {
			int j=0;
			reverseArray[j]=array[i];
			System.out.println(reverseArray[j]+" ");
			j++;
		}
		System.out.println("------------");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Cate elemente trebuie sa aiba array-ul: ");
		int array= scan.nextInt();
		array.lenght==4;
		}
	
	public static void rezolvareCuFor(int element) {
		for (int i=0; i<numbers.length;i++) {
			if (numbers[i] == 4) {
				System.out.println(numbers);
			}
   }
	}}
