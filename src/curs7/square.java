package curs7;

public class square extends Shape{

	public square(String nume, String culoare) {
		super(nume, culoare);
		
	}
	
	String nume="patrat";
	String culoare= "galben";
	
	public void printDetails() {
		System.out.println("Numele este "+super.nume+" si culoarea este "+super.culoare);
	}

}
