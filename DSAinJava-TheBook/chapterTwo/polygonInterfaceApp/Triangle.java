package polygonInterfaceApp;

public class Triangle implements Polygon {
	private double a, b, c;

	Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double area() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double perimeter() {
		return a + b + c;
	}

}
