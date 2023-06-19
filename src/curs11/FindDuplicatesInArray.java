package curs11;

import java.util.*;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> numeDuplicat = new HashSet<>();
		String[] names= {"Ion","Maria","Oana","Ion","Bogdan","Ion","Maria","Oana"};
		for(int i=0; i<names.length; i++) {
			for (int j=names.length-1;j>=0;j--) {
				if(names[i].equals(names[j])) {
					//System.out.println("Nume duplicat: " + names[i]);
					numeDuplicat.add(names[i]);
				}
			}
		}
		System.out.println("-------------------");
		for(String nume : numeDuplicat) {
			System.out.println("Nume duplicat: " + nume);
			
		}
	}

}
