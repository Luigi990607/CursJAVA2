package curs2;

public class Shape {
	private int lenght;
	private int width;
	private double radius;
	
	
	public int calculateSquareArea() {
		return lenght*lenght;
	}
	
	public int calculateRectangleArea() {
		return lenght*width;
	}
		
	public Shape (int lenght) {
		this.lenght=lenght;
		System.out.println("The area of the square is: " + calculateSquareArea());
	}
	
	public Shape (int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
		System.out.println("The area of the rectangle is: " + calculateRectangleArea());
	}
	
	public Shape (double radius) {
		this.radius = radius;
		radius= 3.0;
		double area = Math.PI * (radius* radius);
		System.out.println("The area of the circle is: " + area);
		return;
	}
}
