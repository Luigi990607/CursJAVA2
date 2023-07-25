package curs9.homework;

public class TestClass {

	public static void main(String[] args) {

		Human om=new Human();
		Monkey maimuta=new Monkey();
		System.out.println("Primate dataType instance of Human: ");
		System.out.println("--------------------------");
		om.walk();
		om.run();
		System.out.println(om.eat());
		om.speak();
		om.sleep();
		System.out.println();
		System.out.println("Primate dataType instance of Monkey: ");
		System.out.println("--------------------------");
		maimuta.walk();
		maimuta.run();
		System.out.println(maimuta.eat());
		maimuta.speak();
		maimuta.sleep();	
	}

}
