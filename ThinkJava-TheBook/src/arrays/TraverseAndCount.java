package arrays;

import java.util.Arrays;

public class TraverseAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = RandomNumbers.randomArray(30);
		System.out.println(inRange(scores, 90, 100));

		/*
		 * What we need is a way to store 100 counters, preferably so we can use an
		 * index to access them. In other words, we need another array!
		 * 
		 * The following fragment creates an array of 100 counters, one for each
		 * possible score. It loops through the scores and uses inRange to count how
		 * many times each score appears. Then it stores the results in the array:
		 * 
		 * @param args
		 */
		int[] counts = new int[100];
		for (int i = 0; i < counts.length; i++) {
			counts[i] = inRange(scores, i, i + 1);
		}
		System.out.println(Arrays.toString(counts));

	}

	/**
	 * For exam scores, we might have ten counters to keep track of how many
	 * students scored in the 90s, the 80s, etc. To do that, we can traverse the
	 * array and count the number of elements that fall in a given range.
	 * 
	 * The following method takes an array and two integers, low and high. It
	 * returns the number of elements that fall in the range from low to high.
	 * 
	 * @param a
	 * @param low
	 * @param high
	 * @return
	 */
	public static int inRange(int[] a, int low, int high) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= low && a[i] < high) {
				count++;
			}
		}
		return count;
	}
}
