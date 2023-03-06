package arrays;

import java.util.Arrays;

public class ArrayLabs {

	public static void main(String[] args) {

		double[] nums = { 2, 4, 6, 8 };
		System.out.println(Arrays.toString(powArray(nums, 3)));

		int[] scores = { 3, 2, 4, 6, 2, 1, 8, 5, 0, 7 };

		System.out.println(Arrays.toString(scores));

		System.out.println(Arrays.toString(histogram(scores, 13)));

		System.out.println(indexOfMax(scores));

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

	/**
	 * Starting with the code in “The Enhanced for Loop” on page 111, write a method
	 * called histogram that takes an int array of scores from 0 to (but not
	 * including) 100, and returns a histogram of 100 counters. Generalize it to
	 * take the number of counters as an argument.
	 * 
	 * @param scores
	 * @param numCounters
	 * @return
	 */
	public static int[] histogram(int[] scores, int numCounters) {
		int[] counters = new int[numCounters];
		int maxScore = numCounters - 1;
		for (int score : scores) {
			if (score > maxScore) {
				throw new IllegalArgumentException("Score " + score + " is out of range.");
			}
			counters[score]++;
		}
		return counters;
	}

	/**
	 * Write a method called indexOfMax that takes an array of integers and returns
	 * the index of the largest element. Can you write this method using an enhanced
	 * for loop? Why or why not?
	 * 
	 * @param a
	 * @return
	 */
	public static int indexOfMax(int[] a) {
		int maxIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

}
