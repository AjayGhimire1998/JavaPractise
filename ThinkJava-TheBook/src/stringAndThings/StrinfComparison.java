package stringAndThings;

public class StrinfComparison {

	public static void main(String[] args) {

		String name1 = "Alan Turing";
		String name2 = "Ada Lovelace";
		if (name1 == name2) { // wrong!
			System.out.println("The names are the same.");
		}

		/*
		 * This code compiles and runs, and most of the time it gets the answer right.
		 * But it is not correct, and sometimes it gets the answer wrong. The problem is
		 * that the == oper‐ ator checks whether the two variables refer to the same
		 * object (by comparing the ref‐ erences). If you give it two different strings
		 * that contain the same letters, it yields false.
		 */

		/*
		 * This example invokes equals on name1 and passes name2 as an argument. The
		 * equals method returns true if the strings contain the same characters;
		 * otherwise it returns false.
		 */
		if (name1.equals(name2)) {
			System.out.println("The names are same");
		} else {
			System.out.println("they are not same");
		}

		/*
		 * If the strings differ, we can use compareTo to see which comes first in
		 * alphabetical order:
		 */

		int differ = name1.compareTo(name2);
		if (differ == 0) {
			System.out.println("The names are the same");
		} else if (differ < 0) {
			System.out.println("name1 comes before name2");
		} else if (differ > 0) {
			System.out.println("name2 comes before name1");
		}

		/*
		 * The return value from compareTo is the difference between the first
		 * characters in the strings that differ. If the strings are equal, their
		 * difference is zero. If the first string (the one on which the method is
		 * invoked) comes first in the alphabet, the difference is negative. Otherwise,
		 * the difference is positive.
		 * 
		 * In the preceding code, compareTo returns positive 8, because the second
		 * letter of "Ada" comes before the second letter of "Alan" by 8 letters.
		 * 
		 * Both equals and compareTo are case-sensitive. The uppercase letters come
		 * before the lowercase letters, so "Ada" comes before "ada".
		 */
	}

}
