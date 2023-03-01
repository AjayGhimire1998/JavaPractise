package valueMethods;

public class MoreRecursion {

	public static void main(String[] args) {
		int print = factorial(5);
		System.out.println(print);
	}

	/**
	 * factorial method to return the factorial of given integer
	 * 
	 * @param n, which is an integer
	 * @return 1 if n is 0, or else cursively factorise
	 */
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int recurse = factorial(n - 1);
		int result = n * recurse;
		return result;
	}

}
