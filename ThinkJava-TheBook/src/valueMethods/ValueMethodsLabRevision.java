package valueMethods;

public class ValueMethodsLabRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isDivisble = isDivisible(3, 2);
		System.out.println(isDivisble);
		System.out.println(isTriangle(2, 1, 12));
		System.out.println(multAdd(1, 2, 3));
		System.out.println(oddSum(13));

	}

	public static boolean isDivisible(int m, int n) {
		if (n % m == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isTriangle(int a, int b, int c) {
		if (a > b + c || b > c + a || c > a + b) {
			return false;
		}

		return true;

	}

	public static double multAdd(double a, double b, double c) {
		return a * b + c;
	}

	public static int oddSum(int a) {
		if (a % 2 == 0 || a == 1) {
			return 1;
		} else {
			int hehe = a;
			hehe += oddSum(a - 2);
			return hehe;
		}
	}

}
