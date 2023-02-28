package valueMethods;

public class ReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double print = calculateArea(2.0);
//		System.out.println(print);

		System.out.println(calculateArea(2.0));
		System.out.printf("%.2f square radius\n", calculateAreaConcise(2.0));
		System.out.println(absoluteValue(1.2));

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

	public static double distance(double x1, double x2, double x3, double x4) {
		return 0.0;
	}

}
