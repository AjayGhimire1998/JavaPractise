package stringAndThings;

import java.util.Arrays;

public class StringsLabs {

	public static void main(String[] args) {
		System.out.println(addOrConcat("aja", 'y'));

		String str = "hello";
		char c = 'Z';
		int num = 12;
		double dec = 3.14;
		boolean bool = true;

		System.out.println(str + c); // string concatenation: "hello!"
		System.out.println(c + num); // character addition: 75 ('!' has an ASCII value of 33, so 33 + 42 = 75)
		System.out.println(num + dec); // numeric addition: 45.14
		System.out.println(str + num + dec); // string concatenation: "hello423.14"

//		System.out.println(bool + bool);
//		System.out.println(dec + bool);
//		System.out.println((char) c + c);
		System.out.println("" + 5);

		System.out.println(Arrays.toString(letterHist(str)));
		System.out.println((int) c);

		System.out.println(c > 'a');

		System.out.println(checkBrackets("((3 + 7) * 2)"));

	}

	/**
	 * Create a new program named Test.java and write a main method that contains
	 * expressions that combine various types using the + operator. For example,
	 * what happens when you “add” a String and a char? Does it perform character
	 * addi‐ tion or string concatenation? What is the type of the result? (How can
	 * you deter‐ mine the type of the result?)
	 * 
	 * @param str
	 * @param character
	 * @return
	 */
	public static String addOrConcat(String str, char character) {
		return str + character;
	}

	/**
	 * Write a method called letterHist that takes a string as a parameter and
	 * returns a histogram of the letters in the string. The zeroth element of the
	 * histogram should contain the number of a’s in the string (upper- and
	 * lowercase); the 25th element should contain the number of z’s. Your solution
	 * should only traverse the string once.
	 * 
	 * @param s
	 * @return
	 */
	public static int[] letterHist(String s) {
		int[] result = new int[26];

		for (int i = 0; i < s.length(); i++) {
			Character c = Character.toLowerCase(s.charAt(i));
			if (c >= 'a' && c <= 'z') {
				result[c - 'a']++;
			}
		}
		return result;
	}

	/**
	 * 1. Encapsulate this fragment in a method that takes a string argument and
	 * returns the final value of count.
	 * 
	 * 2. Now that you have generalized the code so that it works on any string,
	 * what could you do to generalize it more?
	 * 
	 * 3.Test your method with multiple strings, including some that are balanced
	 * and some that are not.
	 * 
	 * @param str
	 * @return
	 */
	public static int checkBrackets(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				count++;
			} else if (c == ')') {
				count--;
			}
		}
		return count;
	}

}
