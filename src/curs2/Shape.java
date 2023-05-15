package curs2;

public class Shape {
	private int lenght;
	private int width;
	private double radius;
	
	
	public int calculateSquareArea () {
		return lenght*lenght;
	}
	
	public int calculateRectangleArea () {
		return lenght*width;
	}
		
	public static void main(String[] args) {
	}	
	public Shape (int lenght) {
		this.lenght=lenght;
	}
	
	public Shape (int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
	}
	
	public Shape (double radius) {
		this.radius = radius;
	}

}
