package sortingAnArray;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] nums = { 1, 6, 9, 2, 4, 9, 5, 3 };
		insertionSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void insertionSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[i] < nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
	}
}
