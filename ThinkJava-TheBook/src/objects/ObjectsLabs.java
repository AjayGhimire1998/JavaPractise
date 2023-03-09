package objects;

import java.math.BigInteger;

public class ObjectsLabs {
	public static void main(String[] args) {
//		System.out.println(factorial(17));
		tableOfFactorials();
	}

	public static BigInteger factorial(int n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

	public static void tableOfFactorials() {
		for (int i = 0; i <= 30; i++) {

			System.out.println(i + "      " + factorial(i));
		}
	}
}
