package equivalenceTesting;

import java.util.Arrays;

public class TestClass {
	public static void main(String[] args) {

		// testing striings
		String name = "Ajay";
		String ajay = new String("Ajay");
		System.out.println(name == ajay);

		// testing arrays
		int[] nums = { 1, 2, 3, 4, 5 };
		int[] nums2 = { 1, 2, 3, 4, 5 };
		int[] nums3 = nums;
		System.out.println(nums == nums2);
		System.out.println(nums.equals(nums2));
		System.out.println(Arrays.equals(nums, nums2));

		System.out.println(nums == nums3);
		System.out.println(nums3.equals(nums));
		System.out.println(Arrays.equals(nums, nums3));
	}
}
