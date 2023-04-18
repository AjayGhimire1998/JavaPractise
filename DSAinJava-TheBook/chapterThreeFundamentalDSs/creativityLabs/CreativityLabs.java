package creativityLabs;

import java.util.ArrayList;

public class CreativityLabs {

	/**
	 * Let A be an array of size n ≥ 2 containing integers from 1 to n−1 inclusive,
	 * one of which is repeated. Describe an algorithm for finding the integer in A
	 * that is repeated.
	 * 
	 * @param nums
	 * @return
	 */
	public static int findRepeated(int[] nums) {
		if (nums.length < 2) {
			return -1;
		}
		int result = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					result = nums[i];
				}
			}
		}
		return result;

	}

	public static int findRepeatedQuick(int[] nums) {
		boolean[] visited = new boolean[nums.length];
		for (int x : nums) {
			if (visited[x]) {
				return x;
			}
			visited[x] = true;

		}
		return -1;

	}

	/**
	 * Let B be an array of size n ≥ 6 containing integers from 1 to n−5 inclusive,
	 * five of which are repeated. Describe an algorithm for finding the five
	 * integers in B that are repeated.
	 * 
	 * @param nums
	 * @return
	 */
	public static ArrayList<Integer> findAllRepeated(int[] nums) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int absVal = Math.abs(nums[i]);
			if (result.contains(absVal)) {
				result.add(nums[i]);
			} else {
				result.add(absVal);
			}

			if (result.size() == 5) {
				return result;
			}
		}

		return new ArrayList<>();
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 3, 5 };
		System.out.println(findRepeated(nums));
		System.out.println(findRepeatedQuick(nums));

		int[] nums2 = { 1, 2, 3, 4, 4, 5, 2, 3, 4, 5 };
//		System.out.println(findAllRepeated(nums2));
		System.out.println(findAllRepeated(nums2));
	}

	/*
	 * Give examples of values for a and b in the pseudorandom generator given on
	 * page 113 of this chapter such that the result is not very random looking, for
	 * n = 1000.
	 */
	/*
	 * The pseudorandom generator given on page 113 of the chapter is:
	 * 
	 * x[0] = seed x[i] = (a*x[i-1] + b) % n
	 * 
	 * For n = 1000, some examples of values for a and b that can produce a
	 * non-random-looking result are:
	 * 
	 * a = 0, b = 0: This will always produce the same number and is therefore not
	 * random at all. All x[i] will be 0 after the first iteration.
	 * 
	 * a = 1, b = 0: This will produce a sequence of numbers that are just the
	 * consecutive integers starting from the seed value. While it is deterministic,
	 * it is not very random-looking since the sequence is very regular.
	 * 
	 * a = 2, b = 0: This will produce a sequence of numbers that alternate between
	 * even and odd numbers. Again, while it is deterministic, it is not very
	 * random-looking since the sequence is very regular.
	 * 
	 * a = 1, b = 1: This will produce a sequence of numbers that are just the
	 * consecutive integers starting from the seed value, but shifted by 1. While it
	 * is deterministic, it is not very random-looking since the sequence is very
	 * regular and shifted by a fixed amount.
	 * 
	 * These are just a few examples, but there are many other combinations of a and
	 * b that can produce non-random-looking results for n = 1000.
	 */

}
