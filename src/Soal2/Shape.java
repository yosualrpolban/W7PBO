package Soal2;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() { // 1st (default) constructor
		color = "green";
		filled = true;
	}
	public Shape(String color, boolean fill) {
		this.color = color;
		this.filled = fill;
	}
	
	public String getColor() {
		return color;
	}
	/** Returns the radius */
	public boolean getfilled() {
	return filled;
	}
	public String setFilled(boolean filled) {
		String resultFill = (filled==true)?" Filled":" Not filled";
		return resultFill;
	}
	public String toString() { // in Cylinder class
		
		return "A shape with color of " + color + " \nStatus : "+ setFilled(filled) ;
	}
}
