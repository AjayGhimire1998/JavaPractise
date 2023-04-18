package creativityLabs;

import java.util.ArrayList;
import java.util.Random;

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

		int[] nums2 = { 1, 2, 3, 4, 4, 5, 2, 3, 4, 5 };
//		System.out.println(findAllRepeated(nums2));
		System.out.println(findAllRepeated(nums2));
	}

	/*
	 * Give examples of values for a and b in the pseudorandom generator given on
	 * page 113 of this chapter such that the result is not very random looking, for
	 * n = 1000.
	 */
	/*
	 * The pseudorandom generator given on page 113 of the chapter is:
	 * 
	 * x[0] = seed x[i] = (a*x[i-1] + b) % n
	 * 
	 * For n = 1000, some examples of values for a and b that can produce a
	 * non-random-looking result are:
	 * 
	 * a = 0, b = 0: This will always produce the same number and is therefore not
	 * random at all. All x[i] will be 0 after the first iteration.
	 * 
	 * a = 1, b = 0: This will produce a sequence of numbers that are just the
	 * consecutive integers starting from the seed value. While it is deterministic,
	 * it is not very random-looking since the sequence is very regular.
	 * 
	 * a = 2, b = 0: This will produce a sequence of numbers that alternate between
	 * even and odd numbers. Again, while it is deterministic, it is not very
	 * random-looking since the sequence is very regular.
	 * 
	 * a = 1, b = 1: This will produce a sequence of numbers that are just the
	 * consecutive integers starting from the seed value, but shifted by 1. While it
	 * is deterministic, it is not very random-looking since the sequence is very
	 * regular and shifted by a fixed amount.
	 * 
	 * These are just a few examples, but there are many other combinations of a and
	 * b that can produce non-random-looking results for n = 1000.
	 */

	/*
	 * Suppose you are given an array, A, containing 100 integers that were
	 * generated using the method r.nextInt(10), where r is an object of type
	 * java.util.Random. Let x denote the product of the integers in A. There is a
	 * single number that x will equal with probability at least 0.99. What is that
	 * number and what is a formula describing the probability that x is equal to
	 * that number?
	 * 
	 * The possible values of each integer in array A are between 0 and 9 inclusive,
	 * which means that the product of all the integers in A can be any non-negative
	 * integer less than or equal to 9^100, which is approximately equal to 1.03 ×
	 * 10^95.
	 * 
	 * To find the number that x will equal with probability at least 0.99, we can
	 * use the Pigeonhole Principle, which states that if n items are put into m
	 * containers, with n > m, then at least one container must contain more than
	 * one item.
	 * 
	 * In this case, we can consider the set of all possible products of 100
	 * integers between 0 and 9 inclusive. There are a total of (10^100) possible
	 * products, but only (9^100 + 8^100 + ... + 1) of them are less than or equal
	 * to 9^100. Therefore, if we generate 10^100 random products using the given
	 * method, at least one of them must occur at least twice.
	 * 
	 * This means that there is a single number that x will equal with probability
	 * at least 0.99. To find that number, we can generate a large number of
	 * products and keep track of the frequency of each product. The product that
	 * occurs with the highest frequency is the number that x will equal with
	 * probability at least 0.99.
	 * 
	 * As for the formula describing the probability that x is equal to that number,
	 * it depends on the specific value of the number. Let k be the value of the
	 * number. The probability that x is equal to k can be calculated as follows:
	 * 
	 * P(x = k) = C(100, n1) * C(100 - n1, n2) * ... * C(100 - n1 - n2 - ... - nk-1,
	 * nk)
	 * 
	 * where C(n, k) is the number of ways to choose k items from a set of n items,
	 * and ni is the number of occurrences of the ith prime factor in k. This
	 * formula takes into account the fact that k can be factorized into prime
	 * factors, and each prime factor can be distributed among the 100 integers in A
	 * in a certain number of ways. However, calculating this formula exactly for
	 * large values of k can be computationally intensive.
	 */

	/*
	 * Write a method, shuffle(A), that rearranges the elements of array A so that
	 * every possible ordering is equally likely. You may rely on the nextInt(n)
	 * method of the java.util.Random class, which returns a random number between 0
	 * and n−1 inclusive.
	 */

	public static void shuffle(int[] nums) {
		Random random = new Random();
		for (int i = nums.length - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;

		}
	}

}
