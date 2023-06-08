package curs8;

public class overloadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multiply(2,3.5);
		System.out.println(123);
		System.out.println("123");
		System.out.println(123.5);
	}

	public static void multiply(int num1, int num2) {
		System.out.println(num1*num2);
		
	}
	public static void multiply(double num1, double num2) {
		System.out.println(num1*num2);
		
	}
}
