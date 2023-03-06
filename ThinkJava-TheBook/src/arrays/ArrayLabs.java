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

		System.out.println(Arrays.toString(sieve(20)));

		System.out.println(areFactors(2, scores));

		int[] primeFactors = { 2, 3, 5 };
		System.out.println(areFactors(30, primeFactors));
		System.out.println(maxInRange(primeFactors, 0, 2));

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

	/**
	 * The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all
	 * prime num‐ bers up to any given limit,” which you can read about at
	 * https://en.wikipedia.org/wiki/ Sieve_of_Eratosthenes. Write a method called
	 * sieve that takes an integer parameter, n, and returns a boolean array that
	 * indicates, for each number from 0 to n - 1, whether the number is prime.
	 * 
	 * @param n
	 * @return
	 */
	public static boolean[] sieve(int n) {
		boolean[] isPrime = new boolean[n];
		Arrays.fill(isPrime, true);

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (isPrime[i]) {
				for (int j = i * i; j < n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		isPrime[0] = false;
		isPrime[1] = false;

		return isPrime;
	}

	/**
	 * Write a method named areFactors that takes an integer n and an array of
	 * integers, and that returns true if the numbers in the array are all factors
	 * of n (which is to say that n is divisible by all of them).
	 * 
	 * @param n
	 * @param a
	 * @return
	 */
	public static boolean areFactors(int n, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (n % a[i] != 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Write a method named arePrimeFactors that takes an integer n and an array of
	 * inte‐ gers, and that returns true if the numbers in the array are all prime
	 * and their product is n.
	 * 
	 * @param n
	 * @param a
	 * @return
	 */
	public static boolean arePrimeFactors(int n, int[] a) {
		if (n < 2) {
			return false;
		}
		int product = 1;
		for (int i = 0; i < a.length; i++) {
			product *= a[i];
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (n % i == 0 && product != n) {
				return false;
			}
		}
		return true;

	}

	/**
	 * Write a method called maxInRange that takes an array of integers and two
	 * indexes, lowIndex and highIndex, and finds the maximum value in the array,
	 * but only considering the elements between lowIndex and highIndex, including
	 * both.
	 * 
	 * This method should be recursive. If the length of the range is 1, that is, if
	 * lowIn dex == highIndex, we know immediately that the sole element in the
	 * range must be the maximum. So that’s the base case.
	 * 
	 * If there is more than one element in the range, we can break the array into
	 * two pieces, find the maximum in each of the pieces, and then find the maximum
	 * of the maxima.
	 * 
	 * @param a
	 * @param lowIndex
	 * @param highIndex
	 * @return
	 */
	public static int maxInRange(int[] a, int lowIndex, int highIndex) {
		if (lowIndex == highIndex) {
			return a[lowIndex];
		} else {
			int midIndex = (lowIndex + highIndex) / 2;
			int maxLeft = maxInRange(a, lowIndex, midIndex);
			int maxRight = maxInRange(a, midIndex + 1, highIndex);
			return Math.max(maxLeft, maxRight);
		}

	}
}
