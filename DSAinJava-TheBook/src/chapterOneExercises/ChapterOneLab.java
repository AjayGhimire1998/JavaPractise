package chapterOneExercises;

import java.util.Scanner;

public class ChapterOneLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inputAllBaseTypes();
		System.out.println(isMultiple(10000, 23));
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

}
