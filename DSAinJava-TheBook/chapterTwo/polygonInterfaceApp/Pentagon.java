package polygonInterfaceApp;

public class Pentagon implements Polygon {
	double a;

	Pentagon(double a) {
		this.a = a;
	}

	@Override
	public double area() {
		return (5.0 / 4.0) * Math.pow(a, 2) * (1.0 / Math.tan(Math.PI / 5));
	}

	@Override
	public double perimeter() {

		return 5 * a;
	}

}
