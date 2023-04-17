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

		int[] nums2 = { 1, 2, 2, 1, 3, 3, 4, 5, 6, 6 };
//		System.out.println(findAllRepeated(nums2));
		System.out.println(findAllRepeated(nums2));
	}

}
