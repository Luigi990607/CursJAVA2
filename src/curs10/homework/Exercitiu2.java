package curs10.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercitiu2 {

	   
	public static void main(String[] args) {
	        List<String> lista1 = new ArrayList<>(Arrays.asList("Product1", "Product2", "Product3", "Product4", "Product5"));
	        List<String> lista2 = new ArrayList<>(Arrays.asList("Product1", "Product2", "Product6", "Product4", "Product8"));

	        List<String> rezultat = new ArrayList<>();

	        for (String product : lista1) {
	            if (lista2.contains(product)) {
	                rezultat.add("Yes");
	            } else {
	                rezultat.add("No");
	            }
	        }

	        System.out.println(rezultat);
	    }
	}