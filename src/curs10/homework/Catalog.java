package curs10.homework;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Catalog {

	public static void main(String[] args) {
		ArrayList<Elev> catalog = new ArrayList<>();
        catalog.add(new Elev("Alex", 7));
        catalog.add(new Elev("Ion", 5));
        catalog.add(new Elev("Elena", 8));
        int continua = 1;
        Scanner scan = new Scanner(System.in);
        String nume = "";
        int nota = 0;

        while (continua == 1) {

            System.out.println("Nume: ");
            nume = scan.nextLine();
            System.out.println("Nota: ");
            nota = scan.nextInt();
            int verificareNume = 0;
            int indexNume = 0;

            for (Elev elev : catalog){
                verificareNume = 0;
                indexNume = 0;
                if(elev.getNume().equals(nume)) {
                    verificareNume = 1;
                    indexNume = catalog.indexOf(elev);

                    if (verificareNume == 1 && nota <= catalog.get(indexNume).getNota())
                        System.out.println("Nu ai nevoie de alta nota");
                    else
                        catalog.get(indexNume).setNota(nota);
                    break;
                }

            }

            if(verificareNume == 0){
                catalog.add(new Elev(nume, nota));
                System.out.println("Nu aveai nota, ti-am trecut acum!");
            }


            System.out.println("Continuam? [1 - da/ 0 - nu]:");

            continua = scan.nextInt();
            scan.nextLine();
        }

        for(Elev elev : catalog){
            System.out.println(elev.getNume() + " " + elev.getNota());
        }
    }
}