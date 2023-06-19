package curs7;

import java.util.Scanner;

public class HomeworkEx1 {
	
	public static int[] askUser() {
		System.out.println("Cate elemente trebuie sa aiba array-ul: ");
		Scanner scan = new Scanner(System.in);
		int lungimeArray = scan.nextInt();
		int[]array = new int[lungimeArray];
		
		for(int i=0;i<=lungimeArray - 1;i++) {
			System.out.println("Introdu elementul " + (i+1) + ": ");
			array[i]=scan.nextInt();
		}
		return array;
	}
	
	public static void reverseArrayFor(int[] array){
		int[] reverseArray= new int[array.length];
				System.out.print("Array reversed: ");
		for (int i=array.length-1;i>=0;i--) {
			int j=0;
			reverseArray[j]=array[i];
			System.out.print(reverseArray[j]+" ");
			j++;
		}
		System.out.println();
	}
	
	 public static void reverseArrayWhile(int[] array) {
	        int[] reversedArray = new int[array.length];
	        System.out.print("Array reversed: ");
	        int index = array.length - 1;
	        while (index >= 0) {
	            int k = 0;
	            reversedArray[k] = array[index];
	            System.out.print(reversedArray[k] + " ");
	            index--;
	        }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = askUser();
		reverseArrayFor(array);
		reverseArrayWhile(array);
		}
}
	
