package arrays;

import java.util.Arrays;

public class ArrayLabs {

	public static void main(String[] args) {

		double[] nums = { 2, 4, 6, 8 };
		System.out.println(Arrays.toString(powArray(nums, 3)));

	}

	/**
	 * Starting with the code in “Array Traversal” on page 107, write a method
	 * called powArray that takes a double array, a, and returns a new array that
	 * contains the elements of a squared. Generalize it to take a second argument
	 * and raise the ele‐ ments of a to the given power.
	 * 
	 * @param a
	 * @param n
	 * @return
	 */
	public static double[] powArray(double[] a, double n) {
		double[] results = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			double poweredResult = 1;
			for (int j = 0; j < n; j++) {
				poweredResult *= a[i];
				results[i] = poweredResult;
			}
		}
		return results;
	}
}
