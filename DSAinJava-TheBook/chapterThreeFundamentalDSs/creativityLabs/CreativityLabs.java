package creativityLabs;

public class CreativityLabs {

	/**
	 * Let A be an array of size n ≥ 2 containing integers from 1 to n−1 inclusive,
	 * one of which is repeated. Describe an algorithm for finding the integer in A
	 * that is repeated.
	 * 
	 * @param nums
	 * @return
	 */
	public int findRepeated(int[] nums) {
		if (nums.length < 2) {
			return 0;
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
}
