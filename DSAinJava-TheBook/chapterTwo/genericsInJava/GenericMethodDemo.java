package genericsInJava;

import java.util.Arrays;

public class GenericMethodDemo {
	public static <T> void reverse(T[] data) {
		int low = 0, high = data.length - 1;
		while (low < high) {

			T temp = data[low];
			data[low++] = data[high];
			data[high--] = temp;
		}
	}

	public static void rever(int[] nums) {
		int low = 0;
		int high = nums.length - 1;

		while (low < high) {
			int temp = nums[low];
			nums[low++] = nums[high];
			nums[high--] = temp;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		rever(nums);
		System.out.println(Arrays.toString(nums));
	}
}
