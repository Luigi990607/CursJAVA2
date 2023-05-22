package curs5;

import java.util.Scanner;

public class PasswordValidator {
	/*
	 * Facem un program care valideaza o parola pe baza unor reguli:
	 * 1. Parola trebuie sa fie minim 10 caractere.
	 * 2. Parola trebuie sa contina un UpperCase.
	 * 3. Parola nu trebuie sa fie la fel ca usernemul.
	 * 
	 * Intrebam userul un username si o parola,
	 * il informam regulile de mai sus
	 * Daca parola este valida atunci printam "parola valida"
	 * Daca parola este invalida atunci in informam care reguli nu au fost respectate si il tinem in bucla 
	 * pana introduce o parola valida
	 * 
	 */
	
	String username;
	String password;
	Scanner scan= new Scanner(System.in);
	public void getUsername() {
		System.out.println("Te rog introdu username: ");
		username=scan.next();
	}
	public void getPassword() {
		System.out.println("Te rog introdu parola: ");
		password=scan.next();
	}

	public void printPasswordRules() {
		System.out.println("Reguli parola: ");
		System.out.println("1. Parola trebuie sa fie minim 10 caractere. ");
		System.out.println("2. Parola trebuie sa contina un UpperCase. ");
		System.out.println("3. Parola nu trebuie sa fie la fel ca usernemul. ");
	}

	public boolean checkPasswordRules() {
		if(password.length()<10) {
			
		}
	}
	
	public void checkPasswordRules() {
		
		if (password.length < 10) {
			System.out.println("Parola trebuie sa fie minim 10 caractere.");
		}
	}
	public static void main(String[] args) {

	}

}
