package curs7;

import java.util.*;
public class HomeworkEx3 {
	
	  public static int[] askUser() {
	        System.out.println("Introduceti de la tastatura 10 numere !");
	        Scanner scanner = new Scanner(System.in);

	        int[] array = new int[10];

	        for (int i = 0; i <= 10 - 1; i++) {
	            System.out.format("Introduceti elementul %d : ", i+1);
	            array[i] = scanner.nextInt();
	        }
	        return array;
	    }

	    public static void afiseazaPareFor(int[] array) {
	        System.out.print("Afiseaza numerele pare: ");

	        for (int i = 0; i<array.length; i++) {
	            if(array[i] %2 ==0)
	            {
	                System.out.print(array[i] + " ");
	            }
	        }
	        System.out.println();
	    }

	    public static void afiseazaPareWhile(int[] array) {
	        System.out.print("Afiseaza numerele pare: ");
	        int index = 0;
	        while (index<array.length) {
	            if(array[index] %2 == 0)
	            {
	                System.out.print(array[index] + " ");
	            }
	            index++;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = askUser();
        afiseazaPareFor(array);
        afiseazaPareWhile(array);
	}

}
