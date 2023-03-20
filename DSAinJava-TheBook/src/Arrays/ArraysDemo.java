package Arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] hist = new int[nums.length];
		hist[0]++;
		hist[1]++;
		for (int i = 2; i < Math.sqrt(nums[i]); i++) {
			if (nums[i] % i == 0) {
				continue;
			}
			hist[i]++;
		}

		System.out.println(Arrays.toString(hist));

	}

}
