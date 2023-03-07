package stringAndThings;

public class StringLabsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printString("Hellooo world");
		printBack("HelloWorld");
		String reversed = reverseString("hello world");
		System.out.println(reversed);

		System.out.println(isAbecedarian("ajjyyy"));
	}

	/**
	 * Returns the first character of the given String.
	 */
	public static char first(String s) {
		return s.charAt(0);
	}

	/**
	 * Returns all but the first letter of the given String.
	 */
	public static String rest(String s) {
		return s.substring(1);
	}

	/**
	 * Returns all but the first and last letter of the String.
	 */
	public static String middle(String s) {
		return s.substring(1, s.length() - 1);
	}

	/**
	 * Returns the length of the given String.
	 */
	public static int length(String s) {
		return s.length();
	}

	/**
	 * 2. Using these methods, and without using any other String methods, write a
	 * method called printString that takes a string as a parameter and that
	 * displays the letters of the string, one on each line. It should be a void
	 * method.
	 * 
	 * @param s
	 */
	public static void printString(String s) {
		for (int i = 0; i < length(s); i++) {
			System.out.println(s.charAt(i));
		}
	}

	/**
	 * Again using only these methods, write a method called printBackward that does
	 * the same thing as printString but that displays the string backward (again,
	 * one character per line).
	 * 
	 * @param s
	 */
	public static void printBack(String s) {
		for (int i = length(s) - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}

	/**
	 * Now write a method called reverseString that takes a string as a parameter
	 * and that returns a new string as a return value. The new string should
	 * contain the same letters as the parameter, but in reverse order. String
	 * backwards = reverseString("coffee"); System.out.println(backwards); The
	 * output of this example code should be: eeffoc
	 * 
	 * @param s
	 * @return
	 */
	public static String reverseString(String s) {
		String result = "";
		for (int i = length(s) - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}

	/**
	 * A word is said to be “abecedarian” if the letters in the word appear in
	 * alphabetical order. For example, the following are all six-letter English
	 * abecedarian words: abdest, acknow, acorsy, adempt, adipsy, agnosy, befist,
	 * behint, beknow, bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort,
	 * deinos, diluvy, dimpsy Write a method called isAbecedarian that takes a
	 * String and returns a boolean indicating whether the word is abecedarian. Your
	 * method can be iterative or recur‐ sive.
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isAbecedarian(String s) {
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) < s.charAt(i - 1)) {
				return false;
			}
		}
		return true;

	}

}
