package curs3;

import java.util.Scanner;

/*facem un program care citeste de la tastatura un user si o parola si le verifica da sunt ca urmatoarele:
*String "TestUser" -> username
*int 1234 -> password 
*Daca sunt la fel printeaza: "Login successfull."
*Daca nu sunt la fel printeaza:"Username or password incorrect!" */


public class LoginExample {
	
	public String username;
	public int password;
	
	public void askTheUser() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the user: ");
		username=scan.next();
		System.out.println("Please enter the password: ");
		password=scan.nextInt();
		scan.close();
	}
	
	//pentru String intodeauna folosim equals pt comparare
	// && -> and operator
	// || -> or operator
	// == -> verifica continutul stringului
	public void CheckCredentials() {
		
		if (username.equals("TestUser") && password == 1234 ) {
			System.out.println("Login successfull!");
		}
		else {
			System.out.println("Username or password is incorrect!");
		}
		
	}

}
