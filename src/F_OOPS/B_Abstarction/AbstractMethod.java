package F_OOPS.B_Abstarction;

abstract class Shape {

	abstract double getArea();

	abstract void printDetails();

}

class Rectangle extends Shape {

	double length;
	double breath;

	public Rectangle(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return length * breath;
	}

	@Override
	void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Type = Rectangle\n" + "Length =" + this.length + "\nBreadth =" + this.breath + "\nArea ="
				+ this.getArea());
	}

}

class Circle extends Shape {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

	@Override
	void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Type = Circle\n" + "Radius =" + this.radius + "\nArea =" + this.getArea());
	}

}

class Triangle extends Shape {

	double base;
	double height;

	public Triangle(double base, double height) {

		this.base = base;
		this.height = height;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

	@Override
	void printDetails() {
		// TODO Auto-generated method stub
		System.out.println(
				"Type = Triangle\n" + "Base =" + this.base + "\nHeight =" + this.height + "\nArea =" + this.getArea());
	}

}

public class AbstractMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Shape shape=new Shape();

		Rectangle rectangle = new Rectangle(30.3, 45.4);
		Circle circle = new Circle(23.2);
		Triangle triangle = new Triangle(146.2, 40.0);

		rectangle.printDetails();
		System.out.println();
		circle.printDetails();
		System.out.println();
		triangle.printDetails();

	}

}

