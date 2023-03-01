package valueMethods;

public class ReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double print = calculateArea(2.0);
//		System.out.println(print);

//		System.out.println(calculateArea(2.0));
//		System.out.printf("%.2f square radius\n", calculateAreaConcise(2.0));
//		System.out.println(absoluteValue(1.2));

		double distance = distance(1.0, 2.0, 4.0, 6.0);
		System.out.println(distance);

	}

	public static double calculateArea(double radius) {
		double result = Math.PI * radius * radius;
		return result;
	}

	public static double calculateAreaConcise(double radius) {
		return Math.PI * radius * radius;
	}

	public static double absoluteValue(double x) {
		if (x < 0) {
			return -x;
		} else {
			return x;
		}
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		double dsquared = dx * dx + dy * dy;

		System.out.println("dx is: " + dx);
		System.out.println("dy is: " + dy);

		double result = Math.sqrt(dsquared);

		return result;
	}

	public static double circleArea(double xc, double yc, double xp, double yp) {
		double radius = distance(xc, yc, xp, yp);
		double area = calculateArea(radius);
		return area;
	}

}
