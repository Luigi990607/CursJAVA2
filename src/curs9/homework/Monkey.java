package curs9.homework;

public class Monkey extends Primate implements BasicNeeds{

	public String eat() {
		return "Mostly erbivore";
	}
	public void drink() {
		System.out.println("");
	}
	public void sleep() { 
		System.out.println("I need to sleep!");
	}
	public void speak() {
		System.out.println("cannot speak!");
	}
}
