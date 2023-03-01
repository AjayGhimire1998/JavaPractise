package valueMethods;

public class Labs {
	public static void main(String[] args) {
		boolean result = isDivisible(0, 1);
		System.out.println(result);
	}

	/**
	 * isDivisible that takes two integers, n and m
	 * 
	 * @param n, an integer
	 * @param m, an integer
	 * @return true if n is divisible by m, and false otherwise.
	 */
	public static boolean isDivisible(int n, int m) {
		return n % m == 0;
	}

}
