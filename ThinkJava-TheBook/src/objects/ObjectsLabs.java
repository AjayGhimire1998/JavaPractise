package objects;

import java.math.BigInteger;

public class ObjectsLabs {
	public static void main(String[] args) {
//		System.out.println(factorial(17));
//		tableOfFactorials();
		BigInteger result = factorial(17);
		System.out.println(result);
		result.add(new BigInteger("1"));
		System.out.println(result);

		BigInteger num = new BigInteger("123456789");
		num.add(new BigInteger("1"));
		System.out.println(num);

		System.out.println(pow(8, 12));
	}

	/**
	 * Create a new program called Big.java and write (or reuse) an iterative
	 * version of factorial.
	 * 
	 * Convert factorial so that it performs its calculation using BigIntegers and
	 * returns a BigInteger as a result. You can leave the parameter alone; it will
	 * still be an integer.
	 * 
	 * @param n
	 * @return
	 */
	public static BigInteger factorial(int n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

	/**
	 * Display a table of the integers from 0 to 30 along with their factorials. At
	 * some point around 15, you will probably see that the answers are not right
	 * anymore. Why not?
	 * 
	 */
	public static void tableOfFactorials() {
		for (int i = 0; i <= 30; i++) {

			System.out.println(i + "      " + factorial(i));
		}
	}

	/**
	 * Many encryption algorithms depend on the ability to raise large integers to a
	 * power. Here is a method that implements an efficient algorithm for integer
	 * exponentiation:
	 * 
	 * @param x
	 * @param n
	 * @return
	 */
	public static BigInteger pow(int x, int n) {
//		if (n == 0)
//			return 1;
//
//		// find x to the n/2 recursively
//		int t = pow(x, n / 2);
//
//		// if n is even, the result is t squared
//		// if n is odd, the result is t squared times x
//		if (n % 2 == 0) {
//			return t * t;
//		} else {
//			return t * t * x;
//		}

		if (n == 0)
			return BigInteger.ONE;

		BigInteger t = pow(x, n / 2);

		if (n % 2 == 0) {
			return t.multiply(t);
		} else {
			return t.multiply(t).multiply(BigInteger.valueOf(x));
		}
	}

}
