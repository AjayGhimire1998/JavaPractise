package valueMethods;

public class ReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double print = calculateArea(2.0);
//		System.out.println(print);

		System.out.println(calculateArea(2.0));

	}

	public static double calculateArea(double radius) {
		double result = Math.PI * radius * radius;
		return result;
	}

}
