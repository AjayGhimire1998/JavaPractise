package stringAndThings;

import java.util.Arrays;

public class StringTraversal {

	public static void main(String[] args) {

		String text = "Computer Science is fun";

		/*
		 * Strings provide a method called length that returns the number of characters
		 * in the string. Because it is a method, you have to invoke it with the empty
		 * argument list, (). The condition is i < fruit.length(), which means that when
		 * i is equal to the length of the string, the condition is false and the loop
		 * terminates.
		 */
		for (int i = 0; i < text.length(); i++) {

			System.out.print(text.charAt(i));

		}
		System.out.println();

		/* converting a string into an array of charcters */
		System.out.println(Arrays.toString(text.toCharArray()));

		/* inhanced for loop can work on string after conversion */
		for (char letter : text.toCharArray()) {
			System.out.print(letter);
		}

		System.out.println();

		/*
		 * This code compiles and runs, but invoking the charAt method throws a
		 * StringIndex OutOfBoundsException. The problem is that there is no sixth
		 * letter in "banana". Since we started counting at 0, the 6 letters are indexed
		 * from 0 to 5. To get the last character, you have to subtract 1 from length.
		 */
		String fruit = "banana";
		System.out.println(fruit.toCharArray()[fruit.length() - 1]);

		System.out.println(reverse(fruit));
		System.out.println(reverse(text));

		int[] nums = { 1, 2, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(reverse(nums)));

	}

	/* reversing a string */
	public static String reverse(String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);

		}
		return result;
	}

	/* reversing an array */
	public static int[] reverse(int[] a) {
		int[] result = new int[a.length];

		for (int i = a.length - 1; i >= 0; i--) {
			result[i] = a[a.length - 1 - i];

		}
		return result;
	}

}
