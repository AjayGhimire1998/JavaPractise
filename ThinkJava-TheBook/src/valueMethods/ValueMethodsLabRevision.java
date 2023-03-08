package valueMethods;

public class ValueMethodsLabRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isDivisble = isDivisible(3, 2);
		System.out.println(isDivisble);

	}

	public static boolean isDivisible(int m, int n) {
		if (n % m == 0) {
			return true;
		} else {
			return false;
		}

	}

}
