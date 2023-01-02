package interfaceBasedInheriAndPoly;

//1. An interface reference variable can refer to any objects that implements the interface
//2. A real usage of the above sceanrio using methods 
//3. Type casting in action

public class Main {

	public static void main(String[] args) {
//		Measurable measurable = new Reactangle(10, 20); // rectangle implements Measurable

		Measurable rect1 = new Reactangle(10, 20);
		Measurable circle1 = new Circle(10);
		addArea(rect1, circle1);

		Measurable r1 = new Reactangle(10, 10);
		Reactangle r2 = new Reactangle(10, 10);

		Reactangle r3 = (Reactangle) r1; // measureable cannot be converted to the rectangle

		addArea(r2, r3);

		Measurable r4 = new Circle(10);
		Reactangle r5 = new Reactangle(10, 10);

		if (r4 instanceof Circle) {
			System.out.println("It is a cicle");
		}
		if (r4 instanceof Reactangle) {
			Reactangle rect = (Reactangle) r4;
			rect.hello();

		}

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

	public void hello() {
		System.out.println("HELLO FROM RECT");
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