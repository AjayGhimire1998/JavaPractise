package arrays;

import java.util.Arrays;

public class ArraysLabsRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] test = { 1, 2, 3, 4, 5 };
		int[] test3 = { 1, 2, 3, 4, 5 };
		int[] test2 = { 1, 2, 4, 5, 6, 9, 9, 99, 1, 7, 2, 99, 98 };
		int[] scores = { 3, 6, 9 };
		System.out.println(Arrays.toString(powArray(test)));
		System.out.println(Arrays.toString(powArrayTwo(test, 3)));
		System.out.println(Arrays.toString(histogram(test2)));
		System.out.println(maxValue(test2));
		System.out.println(maxValue(test3));
		System.out.println(indexOfMax(test2));
		System.out.println(Arrays.toString(sieve(9)));
		System.out.println(areFactors(100, test2));
		System.out.println(areFactors(36, scores));

		System.out.println(isPrime(98));
	}

	public static double[] powArray(double[] a) {
		double[] result = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			result[i] = a[i] * a[i];
		}
		return result;
	}

	public static double[] powArrayTwo(double[] a, int n) {
		double[] result = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			result[i] = 1;
			for (int j = 0; j < n; j++) {
				result[i] *= a[i];
			}
		}
		return result;
	}

	public static int[] histogram(int[] a) {
		int[] test = new int[100];
		int count;
		for (int i = 0; i < a.length; i++) {
			count = a[i];
			test[count]++;
		}
		return test;
	}

	public static int maxValue(int[] a) {
		int maxValue = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
			}
		}
		return maxValue;
	}

	public static int indexOfMax(int[] a) {
		int maxIndex = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static boolean[] sieve(int n) {
		boolean[] result = new boolean[n];
		Arrays.fill(result, true);

		result[0] = false;
		result[1] = false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (result[i]) {
				for (int j = i * i; j < n; j += i) {
					result[j] = false;
				}
			}
		}
		return result;
	}

	public static boolean areFactors(int n, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (n % a[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean arePrimeFactors(int n, int[] a) {
		if (n < 2) {
			return false;
		}

		int product = 1;
		for (int i = 0; i < a.length; i++) {
			product *= a[i];
		}

		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0 && product != n) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
