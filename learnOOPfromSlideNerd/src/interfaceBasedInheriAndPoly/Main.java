package interfaceBasedInheriAndPoly;

//1. An interface reference variable can refer to any objects that implements the interface
//2. A real usage of the above sceanrio using methods 
//3. Type casting in action

public class Main {

	public static void main(String[] args) {
//		Measurable measurable = new Reactangle(10, 20); // rectangle implements Measurable

		Reactangle rect1 = new Reactangle(10, 20);
		Circle circle1 = new Circle(10);
		addArea(rect1, circle1);

	}

	public static void addArea(Measurable m1, Measurable m2) {
		double area = m1.getArea() + m2.getArea();
		System.out.println("Total area: " + area);
	}

}

interface Measurable {
	float PI = 3.14f;

	double getPerimeter();

	double getArea();
}

class Reactangle implements Measurable {

	int breadth, length;

	public Reactangle(int breadth, int length) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getPerimeter() {
		return 2 * (breadth + length);
	}

	@Override
	public double getArea() {
		return length * breadth;
	}

}

class Circle implements Measurable {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * PI * radius;
	}

	@Override
	public double getArea() {
		return PI * radius * radius;
	}

}