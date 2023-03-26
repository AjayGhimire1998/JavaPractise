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
	 */
	public static int[] reverseArray(int[] nums) {
		for (int i = 0; i < nums.length / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = temp;

		}
		return nums;
	}

}
