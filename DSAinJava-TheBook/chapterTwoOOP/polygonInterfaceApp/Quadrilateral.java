package polygonInterfaceApp;

public class Quadrilateral implements Polygon {
	private double a, b, c, d;

	Quadrilateral(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public double area() {
		double s = (a + b + c + d) / 2;
		return Math.sqrt((s - a) * (s - b) * (s - c) * (s - d));
	}

	@Override
	public double perimeter() {
		return a + b + c + d;
	}
}
