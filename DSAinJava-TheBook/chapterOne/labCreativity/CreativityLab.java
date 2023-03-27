package labCreativity;

import java.util.Random;
import java.util.Scanner;

public class CreativityLab {

	public static void main(String[] args) {
//		calculator();
		String sent = "I will never spam my friends again.";

		printHundredTimesWithTypos(sent);
//		printInputInReverse();
//		int[] nums = { 1, 2, 1, 0, 1, 2, 98, 96 };
//		int[] numsTwo = { 2, 4, 2, 0, 100, 1, 2, 100 };
//		System.out.println(Arrays.toString(productsOfTwoArr(nums, numsTwo)));
//		System.out.println(hasProductEven(nums));
//		System.out.println(smallestValue(nums));
//		System.out.println(largestValue(nums));
//		System.out.println(Arrays.toString(reverseArray(nums)));
//		System.out.println(countOdDivisible(10));
//
//		float[] floats = { 1.0f, 2.0f, 4.5f, 2.2f };
//		System.out.println(hasDistinctFloats(floats));
//		int[] cards = new int[52];
//		for (int i = 0; i < cards.length; i++) {
//			cards[i] = i + 1;
//		}
//		System.out.println(Arrays.toString(cards));
//		shuffleNumbers(cards);
//		System.out.println(Arrays.toString(cards));
//		Random random = new Random();
////		System.out.println(random.nextInt(2));
//		char[] catDog = { 'c', 'a', 't', 'd', 'o', 'g' };
//		printALlPossibleStrings(catDog, 0, catDog.length);

	}

	/*
	 * C-1.14 Write a pseudocode description of a method that reverses an array of n
	 * integers, so that the numbers are listed in the opposite order than they were
	 * before, and compare this method to an equivalent Java method for doing the
	 * same thing.
	 */
	public static int[] reverseArray(int[] nums) {
		for (int i = 0; i < nums.length / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = temp;

		}
		return nums;
	}

	/*
	 * Write a pseudocode description of a method for finding the smallest and
	 * largest numbers in an array of integers and compare that to a Java method
	 * that would do the same thing.
	 */
	public static int smallestValue(int[] nums) {
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[index] > nums[i]) {
				index = i;
			}
		}
		return nums[index];
	}

	/*
	 * Write a pseudocode description of a method for finding the smallest and
	 * largest numbers in an array of integers and compare that to a Java method
	 * that would do the same thing.
	 */
	public static int largestValue(int[] nums) {
		int index = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[index] < nums[i]) {

				index = i;
			}
		}
		return nums[index];
	}

	/*
	 * C-1.17 Write a short Java method that takes an array of int values and
	 * determines if there is a pair of distinct elements of the array whose product
	 * is even.
	 */

	public static boolean hasProductEven(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int evenproduct = nums[i] * nums[j];
				System.out.println(evenproduct);
				if (evenproduct % 2 == 0) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * C-1.19 Write a Java program that can take a positive integer greater than 2
	 * as input and write out the number of times one must repeatedly divide this
	 * number by 2 before getting a value less than 2.
	 */
	public static int countOdDivisible(int n) {
		if (n <= 2) {
			System.err.println("only number greater than 2 is valid");
			return 0;
		}
		int count = 0;
		while (n >= 2) {
			n = n / 2;
			count++;
		}
		return count;
	}

	/*
	 * Write a Java method that takes an array of float values and determines if all
	 * the numbers are different from each other (that is, they are distinct).
	 *
	 */
	public static boolean hasDistinctFloats(float[] floats) {
		for (int i = 0; i < floats.length - 1; i++) {
			for (int j = i + 1; j < floats.length; j++) {
				if (floats[i] == floats[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void shuffleNumbers(int[] nums) {
		Random random = new Random();
		for (int i = nums.length - 1; i > 0; i--) {

			int rand = random.nextInt(i + 1);
			swap(nums, i, rand);
		}

	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private static void swap(char[] nums, int i, int j) {
		char temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	/*
	 * Write a short Java program that outputs all possible strings formed by using
	 * the characters 'c', 'a', 't', 'd', 'o', and 'g' exactly once.
	 * 
	 */
	public static void printALlPossibleStrings(char[] chars, int start, int end) {
		if (start == end) {
			System.out.println(new String(chars));
		} else {
			for (int i = start; i < end; i++) {
				swap(chars, start, i);
				printALlPossibleStrings(chars, start + 1, end);
				swap(chars, start, i);
			}

		}
	}

	/*
	 * Write a short Java program that takes two arrays a and b of length n storing
	 * int values, and returns the dot product of a and b. That is, it returns an
	 * array c of length n such that c[i] = a[i] · b[i], for i = 0,...,n−1.
	 */

	public static int[] productsOfTwoArr(int[] a, int[] b) {
		int[] result = new int[a.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = a[i] * b[i];
		}
		return result;
	}

	/*
	 * Write a short Java program that takes all the lines input to standard input
	 * and writes them to standard output in reverse order. That is, each line is
	 * output in the correct order, but the ordering of the lines is reversed.
	 */

	public static void printInputInReverse() {
		String[] inputs = new String[3];
		int inputCount = 0;
		while (inputCount < 3) {
			System.out.println("Input line number " + (inputCount + 1) + ":");
			Scanner in = new Scanner(System.in);
			String input = in.nextLine();
			inputs[inputCount] = input;
			inputCount++;
		}
		for (int i = 0; i < inputs.length; i++) {
			System.out.println("Input number " + (i + 1) + " says: " + inputs[i]);
			String result = "";
			for (int j = inputs[i].length() - 1; j >= 0; j--) {
//				char temp = inputs[i].charAt(j);
				result += inputs[i].charAt(j);

			}

			System.out.println("The revered version of input number" + (i + 1) + " says: " + result);
		}

	}

	/*
	 * Write a Java program that can simulate a simple calculator, using the Java
	 * console as the exclusive input and output device. That is, each input to the
	 * calculator, be it a number, like 12.34 or 1034, or an operator, like + or =,
	 * can be done on a separate line. After each such input, you should output to
	 * the Java console what would be displayed on your calculator
	 */

	public static void calculator() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
//		int firstInt = 0;
		double firstDoub = 0;

		if (in.hasNextInt()) {
			firstDoub = in.nextInt();
		} else if (in.hasNextDouble()) {
			firstDoub = in.nextDouble();
		} else {
			System.err.println(in.next() + "is not a number");
		}

		System.out.println();
		Scanner inTwo = new Scanner(System.in);
		System.out.println("Enter the operator");
		String operator = inTwo.next();
		System.out.println();

		Scanner inThree = new Scanner(System.in);
		System.out.println("Enter another number: ");
//		int secondInt = 0;
		double secondDoub = 0;
		if (inThree.hasNextInt()) {
			secondDoub = inThree.nextInt();
		} else if (inThree.hasNextDouble()) {
			secondDoub = inThree.nextDouble();
		} else {
			System.err.println(inThree.next() + "is not a number");
		}

//		System.out.println(operator.equals("+"));
		if (operator.equals("+")) {
			System.out.println(firstDoub + secondDoub);
		} else if (operator.equals("-")) {
			System.out.println(firstDoub - secondDoub);
		} else if (operator.equals("*")) {
			System.out.println(firstDoub * secondDoub);
		} else if (operator.equals("/")) {

			System.out.println(firstDoub / secondDoub);
		} else {
			System.err.println("Wrong operator");
		}

	}

	/*
	 * A common punishment for school children is to write out a sentence multiple
	 * times. Write a Java stand-alone program that will write out the following
	 * sentence one hundred times: “I will never spam my friends again.” Your
	 * program should number each of the sentences and it should make eight
	 * different randomlooking typos.
	 */
	public static void printHundredTimesWithTypos(String str) {
		Random rand = new Random();
		for (int i = 1; i <= 100; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(i).append(". ");
			for (char c : str.toCharArray()) {
				if (rand.nextInt(80) == 0) {
					sb.append(getRandomChar(c));
				} else {
					sb.append(c);
				}
			}
			System.out.println(sb.toString());
		}

	}

	public static char getRandomChar(char c) {
		Random rand = new Random();
		char randomChar;
		do {
			randomChar = (char) (rand.nextInt(26) + 'a');
		} while (randomChar == c);
		return randomChar;
	}

	public void hasSameBirthday() {

	}

}
