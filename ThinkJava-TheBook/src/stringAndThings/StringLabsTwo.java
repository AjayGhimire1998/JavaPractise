package stringAndThings;

public class StringLabsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printString("Hellooo world");
		printBack("HelloWorld");
		String reversed = reverseString("hello world");
		System.out.println(reversed);

		System.out.println(isAbecedarian("dimpsy"));
		System.out.println(isPalindrome("noon"));

		System.out.println(isDoubloon("ajaj"));

		System.out.println(sortString("olay"));
		System.out.println(isAnagram("allen downey", "well annoyed"));

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
	 * . A palindrome is a word that reads the same both forward and backward, like
	 * “otto” and “palindromeemordnilap”. Here’s one way to test whether a string is
	 * a palindrome: A single letter is a palindrome, a two-letter word is a
	 * palindrome if the letters are the same, and any other word is a palindrome if
	 * the first letter is the same as the last and the middle is a palindrome.
	 * Write a recursive method named isPalindrome that takes a String and returns a
	 * boolean indicating whether the word is a palindrome
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isPalindrome(String str) {
//		if (str.length() == 1) {
//			return true;
//		} else if (str.length() == 2) {
//			return str.charAt(0) == str.charAt(1);
//		}
//
//		if (str.charAt(0) == str.charAt(str.length() - 1)) {
//			return isPalindrome(middle(str));
//		}
//		return false;

		if (str.length() == 1 || (str.length() == 2 && str.charAt(1) == str.charAt(1))) {
			return true;

		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
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
//		for (int i = 1; i < s.length(); i++) {
//			if (s.charAt(i) < s.charAt(i - 1)) {
//				return false;
//			}
//		}
//		return true;

		if (s.length() <= 1) {
			return true;
		} else {
			if (s.charAt(0) > s.charAt(1)) {
				return false;
			} else {
				return isAbecedarian(s.substring(1));
			}
		}

	}

	/**
	 * A word is said to be a “doubloon” if every letter that appears in the word
	 * appears exactly twice. Here are some example doubloons found in the
	 * dictionary:
	 * 
	 * Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bilabial, boob,
	 * Caucasus, coco, Dada, deed, Emmett, Hannah, horseshoer, intestines, Isis,
	 * mama, Mimi, murmur, noon, Otto, papa, peep, reappear, redder, sees,
	 * Shanghaiings, Toto
	 * 
	 * Write a method called isDoubloon that takes a string and checks whether it is
	 * a dou‐ bloon. To ignore case, invoke the toLowerCase method before checking.
	 * 
	 * @param word
	 * @return
	 */
	public static boolean isDoubloon(String word) {
		word = word.toLowerCase();
		int[] counts = new int[26];

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c >= 'a' && c <= 'z') {
				counts[c - 'a']++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (counts[i] != 0 && counts[i] != 2) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAnagram(String str1, String str2) {
		return sortString(str1).equals(sortString(str2));

	}

	public static String sortString(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length - 1; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[j] < chars[i]) {
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		return new String(chars);
	}

}
