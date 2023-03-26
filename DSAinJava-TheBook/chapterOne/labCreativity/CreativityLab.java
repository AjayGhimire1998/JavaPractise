package labCreativity;

import java.util.Arrays;

public class CreativityLab {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 0, 1, 2, 98, 96 };
		System.out.println(hasProductEven(nums));
		System.out.println(smallestValue(nums));
		System.out.println(largestValue(nums));
		System.out.println(Arrays.toString(reverseArray(nums)));
		System.out.println(countOdDivisible(10));

		float[] floats = { 1.0f, 2.0f, 4.5f, 2.2f };
		System.out.println(hasDistinctFloats(floats));

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

}
