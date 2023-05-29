package curs7;

import java.util.Random;

public class RandomNumbers {

	/*
	 * facem un program care genereaza random 6 numebre in tre 0-9
	 * nr le tine intr un array
	 * nu tinem duplicate
	 * la final printam array ul
	 * 
	 * o metoda care genereaza nr si le pune in array (are return type array)
	 * o metoda care nu permite duplicat
	 * o metoda care printeaza array ul
	 */
	
	public final int LENGTH=6;
	public final int MAX_NUMBERS=9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Random random= new Random();
	//	random.nextInt(9);
		RandomNumbers obj=new RandomNumbers();

		obj.afisareArray(obj.generateNr());

	}
	public int[] generateNr() {
		Random random= new Random();
		int[] numbers=new int[LENGTH];
		int index=0;
		while(index<LENGTH) {
			int randomNr=0;
			
			while(checkDuplicate(randomNr,numbers)) {
				randomNr=random.nextInt(9);
			};
			numbers[index]=randomNr;
			index++;
		}
		return numbers;

	}
	
	public void afisareArray(int[] array) {
		for (int nr : array) {
			System.out.print(nr+ " | ");
		}
		
	}
	
	public boolean checkDuplicate(int element,int[] array) {
		for (int nr:array) {
			if (element==nr) {
				return true;
			}
		}
		return false;
		
	}

}
