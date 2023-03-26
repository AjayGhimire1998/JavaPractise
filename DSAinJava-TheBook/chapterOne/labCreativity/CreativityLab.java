package labCreativity;

import java.util.Arrays;

public class CreativityLab {

	public static void main(String[] args) {
		int[] nums = { 2, 4, 5, 9, 1, 2 };
		System.out.println(Arrays.toString(reverseArray(nums)));
	}

	/*
	 * C-1.14 Write a pseudocode description of a method that reverses an array of n
	 * integers, so that the numbers are listed in the opposite order than they were
	 * before, and compare this method to an equivalent Java method for doing the
	 * same thing.
	 *
	 */
	public static int[] reverseArray(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			result[i] = nums[nums.length - 1 - i];
			result[result.length - 1 - i] = temp;

		}
		return result;
	}

}
