package curs4;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPalindrom("masina");

	}
	
	public static void checkPalindrom(String cuvant) {
		
		/*
		 * CuvantIntors = "";
		 * Cuvant = radar;
		 * 
		 * CuvantIntors = CuvantIntors + "r"
		 * CuvantIntors = CuvantIntors + "a"
		 */
		
		String CuvantIntors= "";
		
		for (int i=cuvant.length()-1;i>=0;i--) {
			CuvantIntors = CuvantIntors + cuvant.charAt(i);
		}
		
		String result = CuvantIntors.equals(cuvant)? "Este palindrom!" : "Nu este palindrom!";
		System.out.println(result);
	}

}
