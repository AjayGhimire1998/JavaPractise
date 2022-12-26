package areaOfCircle;

public class Circle {

	double radius;
	double PI = 3.14;

	double area = PI * radius * radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double findArea(double radius) {
		return PI * (radius * radius);
	}

}
