package valueMethods;

public class MoreRecursion {

	public static void main(String[] args) {
		int print = factorial(5);
		System.out.println(print);
		System.out.println(fibonacci(10));
//		System.out.println(ReturnTypes.isSingleDigit(9));ßß
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

	/**
	 * fibonacci
	 * 
	 * @param integer
	 * @return
	 */
	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);

	}

}
