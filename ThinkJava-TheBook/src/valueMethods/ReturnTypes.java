package valueMethods;

public class ReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double print = calculateArea(2.0);
//		System.out.println(print);

		System.out.println(calculateArea(2.0));
		System.out.printf("%.2f square radius", calculateAreaConcise(2.0));

	}

	public static double calculateArea(double radius) {
		double result = Math.PI * radius * radius;
		return result;
	}

	public static double calculateAreaConcise(double radius) {
		return Math.PI * radius * radius;
	}

}
