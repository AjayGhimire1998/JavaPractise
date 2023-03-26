package labCreativity;

import java.util.Arrays;

public class CreativityLab {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 0, 1, 2, 98, 96 };
		System.out.println(smallestValue(nums));
		System.out.println(largestValue(nums));
		System.out.println(Arrays.toString(reverseArray(nums)));

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

	public static int smallestValue(int[] nums) {
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[index] > nums[i]) {
				index = i;
			}
		}
		return nums[index];
	}

	public static int largestValue(int[] nums) {
		int index = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[index] < nums[i]) {

				index = i;
			}
		}
		return nums[index];
	}

}
