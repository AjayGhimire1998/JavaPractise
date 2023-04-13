package reinforcementLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Reinforcement {
	public static void main(String[] args) {
		System.out.println(giveSeed(12, 5, 100, 92));

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list);
		randomlyEmpty(list);
		System.out.println(list);
		list.add(100);
		System.out.println(list);
		randomlyEmpty(list);
		System.out.println(list);

		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(nums));
		randomlyEmptyArray(nums);
		System.out.println(Arrays.toString(nums));

	}

	/**
	 * 1 Give the next five pseudorandom numbers generated by the process described
	 * on page 113, with a = 12, b = 5, and n = 100, and 92 as the seed for cur.
	 * 
	 */
	public static int giveSeed(int a, int b, int n, int seed) {
		return (a * seed + b) % n;
	}

	/**
	 * Write a Java method that repeatedly selects and removes a random entry from
	 * an array until the array holds no more entries.
	 * 
	 * @param nums
	 */
	public static void randomlyEmpty(ArrayList<Integer> nums) {
		Random random = new Random();
		int indexToRemove = 0;
		while (nums.size() > 0) {
			indexToRemove = random.nextInt(nums.size());
			nums.remove(indexToRemove);
		}
	}

	public static void randomlyEmptyArray(int[] nums) {
		Random random = new Random();
		int indexToRemove = 0;
		while (nums.length > 0) {
			indexToRemove = random.nextInt(nums.length);
			int[] temp = new int[nums.length - 1];
			for (int i = 0, k = 0; i < nums.length; i++) {
				if (i == indexToRemove) {
					continue;
				}
				temp[k++] = nums[i];
			}
			nums = temp;
		}
	}
}
