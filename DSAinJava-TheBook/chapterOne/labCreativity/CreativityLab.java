package labCreativity;

import java.util.Arrays;
import java.util.Random;

public class CreativityLab {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 0, 1, 2, 98, 96 };
		int[] numsTwo = { 2, 4, 2, 0, 100, 1, 2, 100 };
		System.out.println(Arrays.toString(productsOfTwoArr(nums, numsTwo)));
		System.out.println(hasProductEven(nums));
		System.out.println(smallestValue(nums));
		System.out.println(largestValue(nums));
		System.out.println(Arrays.toString(reverseArray(nums)));
		System.out.println(countOdDivisible(10));

		float[] floats = { 1.0f, 2.0f, 4.5f, 2.2f };
		System.out.println(hasDistinctFloats(floats));
		int[] cards = new int[52];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i + 1;
		}
		System.out.println(Arrays.toString(cards));
		shuffleNumbers(cards);
		System.out.println(Arrays.toString(cards));
		Random random = new Random();
//		System.out.println(random.nextInt(2));
		char[] catDog = { 'c', 'a', 't', 'd', 'o', 'g' };
		printALlPossibleStrings(catDog, 0, catDog.length);

	}

	/*
	 * C-1.14 Write a pseudocode description of a method that reverses an array of n
	 * integers, so that the numbers are listed in the opposite order than they were
	 * before, and compare this method to an equivalent Java method for doing the
	 * same thing.
	 */
	public static int[] reverseArray(int[] nums) {
		for (int i = 0; i < nums.length / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = temp;

		}
		return nums;
	}

	/*
	 * Write a pseudocode description of a method for finding the smallest and
	 * largest numbers in an array of integers and compare that to a Java method
	 * that would do the same thing.
	 */
	public static int smallestValue(int[] nums) {
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[index] > nums[i]) {
				index = i;
			}
		}
		return nums[index];
	}

	/*
	 * Write a pseudocode description of a method for finding the smallest and
	 * largest numbers in an array of integers and compare that to a Java method
	 * that would do the same thing.
	 */
	public static int largestValue(int[] nums) {
		int index = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[index] < nums[i]) {

				index = i;
			}
		}
		return nums[index];
	}

	/*
	 * C-1.17 Write a short Java method that takes an array of int values and
	 * determines if there is a pair of distinct elements of the array whose product
	 * is even.
	 */

	public static boolean hasProductEven(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int evenproduct = nums[i] * nums[j];
				System.out.println(evenproduct);
				if (evenproduct % 2 == 0) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * C-1.19 Write a Java program that can take a positive integer greater than 2
	 * as input and write out the number of times one must repeatedly divide this
	 * number by 2 before getting a value less than 2.
	 */
	public static int countOdDivisible(int n) {
		if (n <= 2) {
			System.err.println("only number greater than 2 is valid");
			return 0;
		}
		int count = 0;
		while (n >= 2) {
			n = n / 2;
			count++;
		}
		return count;
	}

	/*
	 * Write a Java method that takes an array of float values and determines if all
	 * the numbers are different from each other (that is, they are distinct).
	 *
	 */
	public static boolean hasDistinctFloats(float[] floats) {
		for (int i = 0; i < floats.length - 1; i++) {
			for (int j = i + 1; j < floats.length; j++) {
				if (floats[i] == floats[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void shuffleNumbers(int[] nums) {
		Random random = new Random();
		for (int i = nums.length - 1; i > 0; i--) {

			int rand = random.nextInt(i + 1);
			swap(nums, i, rand);
		}

	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private static void swap(char[] nums, int i, int j) {
		char temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	/*
	 * Write a short Java program that outputs all possible strings formed by using
	 * the characters 'c', 'a', 't', 'd', 'o', and 'g' exactly once.
	 * 
	 */
	public static void printALlPossibleStrings(char[] chars, int start, int end) {
		if (start == end) {
			System.out.println(new String(chars));
		} else {
			for (int i = start; i < end; i++) {
				swap(chars, start, i);
				printALlPossibleStrings(chars, start + 1, end);
				swap(chars, start, i);
			}

		}
	}

	/*
	 * Write a short Java program that takes two arrays a and b of length n storing
	 * int values, and returns the dot product of a and b. That is, it returns an
	 * array c of length n such that c[i] = a[i] · b[i], for i = 0,...,n−1.
	 */

	public static int[] productsOfTwoArr(int[] a, int[] b) {
		int[] result = new int[a.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = a[i] * b[i];
		}
		return result;
	}

}
