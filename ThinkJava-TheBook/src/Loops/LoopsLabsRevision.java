package Loops;

public class LoopsLabsRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(16.0));
		System.out.println(power(2.0, 0));
		System.out.println(factorial(7));
		System.out.println(myExp(2, 3));
	}

	public static double squareRoot(double x) {
		double x0 = x / 2;
		double x1 = (x0 + x / x0) / 2;
		double diff = Math.abs(x1 - x0);
		while (diff > 0.0001) {
			x0 = x1;
			x1 = (x0 + x / x0) / 2;
			diff = Math.abs(x1 - x0);
		}
		return x1;
	}

	public static double power(double x, int n) {
		double result = 1;
		for (int i = 1; i <= n; i++) {
			result *= x;
		}
		return result;
	}

	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static double myExp(double x, int n) {
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result += power(x, i) / factorial(i);
		}
		return result;
	}

}
