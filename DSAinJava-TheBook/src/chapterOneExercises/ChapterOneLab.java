package chapterOneExercises;

import java.util.Scanner;

public class ChapterOneLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inputAllBaseTypes();
//		System.out.println(isMultiple(10000, 23));
//		System.out.println(isEven(12));
//		System.out.println(Operators.intToBinary(12));

//		System.out.println(sumOfPositiveInts(10));
//		System.out.println(sumOfOddInts(9));
		System.out.println(sumOfSquares(10));

	}

	/*
	 * R-1.1 Write a short Java method, inputAllBaseTypes, that inputs a different
	 * value of each base type from the standard input device and prints it back to
	 * the standard output device.
	 */

	public static void inputAllBaseTypes() {
		Scanner in = new Scanner(System.in);
		System.out.println("Type anything: ");

		if (in.hasNextInt()) {
			System.out.println("You have entered an integer.");
		} else if (in.hasNextDouble()) {
			System.out.println("You have entered a double.");
		} else if (in.hasNextLine()) {
			System.out.println("String?");
		}
	}

	/*
	 * R-1.3 Write a short Java method, isMultiple, that takes two long values, n
	 * and m, and returns true if and only if n is a multiple of m, that is, n = mi
	 * for some integer i.
	 */

	public static boolean isMultiple(long n, long m) {
		return n % m == 0;
	}

	/*
	 * R-1.4 Write a short Java method, isEven, that takes an int i and returns true
	 * if and only if i is even. Your method cannot use the multiplication, modulus,
	 * or division operators, however.
	 */
	public static boolean isEven(int i) {
		return (i & 1) == 0;
	}

	/*
	 * R-1.5 Write a short Java method that takes an integer n and returns the sum
	 * of all positive integers less than or equal to n.
	 */

	public static int sumOfPositiveInts(int i) {
		int sum = 0;

		for (int j = i; j >= 0; j--) {
			sum += j;
		}

		return sum;

	}

	/*
	 * R-1.6 Write a short Java method that takes an integer n and returns the sum
	 * of all the odd positive integers less than or equal to n.
	 */

	public static int sumOfOddInts(int i) {
		int sum = 0;

		for (int j = i; j >= 0; j--) {

			if (j % 2 != 0) {
				sum += j;
			}

		}
		return sum;

	}

	/*
	 * Write a short Java method that takes an integer n and returns the sum of the
	 * squares of all positive integers less than or equal to n.
	 */

	public static int sumOfSquares(int i) {
		int sum = 0;

		for (int j = i; j >= 0; j--) {
			sum += j * j;
		}
		return sum;
	}

}
