package Soal1;

public class TestCylinder {
	public static void main (String[] args) {
		// Declare and allocate a new instance of cylinder
		// with default color, radius, and height
		Cylinder c1 = new Cylinder();
		System.out.println(c1.toString()
		+ " base area=" + c1.getArea()
		+ " volume=" + c1.getVolume());
		// Declare and allocate a new instance of cylinder
		// specifying height, with default color and radius
		Cylinder c2 = new Cylinder(10.0);
		System.out.println(c2.toString()
		+ " base area=" + c2.getArea()
		+ " volume=" + c2.getVolume());
		// Declare and allocate a new instance of cylinder
		// specifying radius and height, with default color
		Cylinder c3 = new Cylinder(2.0, 10.0, "red");
		System.out.println(c3.toString()
		+ " Color=" + c3.getColor()
		+ " base area=" + c3.getArea()
		+ " volume=" + c3.getVolume());
	}
}
