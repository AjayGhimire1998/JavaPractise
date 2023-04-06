package sortingAnArray;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] nums = { 1, 6, 2, 9, 4, 9, 5, 3 };
		insertionSort(nums);
		System.out.println(Arrays.toString(nums));

		char[] chars = { 'z', 't', 'a', 'm', 'w', 'y', 'b' };
		insertionSortFromBook(chars);
		System.out.println(Arrays.toString(chars));

	}

	static void insertionSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int curr = nums[i];
			int j = i;
			while (j > 0 && nums[j - 1] > curr) {
				nums[j] = nums[j - 1];
				j--;
			}
			nums[j] = curr;
		}
	}

	static void insertionSortFromBook(char[] chars) {
		for (int i = 1; i < chars.length; i++) {
			char current = chars[i];
			int j = i;
			while (j > 0 && chars[j - 1] > current) {
				chars[j] = chars[j - 1];
				j--;
			}
			chars[j] = current;
		}
	}
}
