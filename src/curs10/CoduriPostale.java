package curs10;

import java.util.*;
/*
 * Facem un program care imi retunreaza un oras pe 
 * baza unui cod postal.
 * Avem nevoie de o clasa care sa contina inca de la 
 * initializare o serie de coduri postale si orasele asociate lor
 * (6 coduri si orase)
 * Avem nevoie de o functionalitate care sa ne permita sa cautam 
 * pe baza codului si sa retunreze orasul.
 * Daca codul nu exista vreau sa arunc CodPostalException
 * Daca codul exista vreau sa printez orasul
 * Daca codul nu exista vreau sa inrteb din nou pana primesc un cod valid
 */
public class CoduriPostale {

	Map<Integer, String> cp = new HashMap<>();
	public CoduriPostale() {
		cp = new HashMap<>();
		cp.put(404, "Cluj");
		cp.put(250, "Iasi");
		cp.put(621, "Pitesti");
		cp.put(541, "Buzau");
		cp.put(100, "Constanta");
		cp.put(894, "Oradea");
	}

}
