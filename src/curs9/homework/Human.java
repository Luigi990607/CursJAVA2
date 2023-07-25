package curs9.homework;

public class Human extends Primate implements BasicNeeds{

	public String eat() {
		return "Omnivore!";
	}
	public void drink() {
		System.out.println("");
	}
	public void sleep() { 
		System.out.println("I need to sleep!");
	}
}
