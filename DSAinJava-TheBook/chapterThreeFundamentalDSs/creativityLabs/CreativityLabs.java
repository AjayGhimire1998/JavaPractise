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

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 3, 5 };
		System.out.println(findRepeated(nums));
		System.out.println(findRepeatedQuick(nums));
	}
}
