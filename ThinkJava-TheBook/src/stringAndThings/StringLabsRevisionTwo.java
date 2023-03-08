package stringAndThings;

import java.util.Arrays;

public class StringLabsRevisionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printString("AjayGhimire");
//		printBackwards("Ghimire");
//		System.out.println(reverseString("Coffee"));
		System.out.println(isPalindrome("pndrrdnilap"));
		System.out.println(isAbecedarian("dimpsyzzz"));
		System.out.println(isDoubloon("abba"));
		System.out.println(sortString("apqzfjsgzq"));
		System.out.println(isAnagram("strop", "prot"));

		int[] nums = { 1, 8, 2, 5, 3, 9, 0, 10, 9, 26, 21 };
		System.out.println(Arrays.toString(sortArray(nums)));
	}

	public static void printString(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void printBackwards(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}

	public static boolean isPalindrome(String str) {
//		if (str.length() == 1) {
//			return true;
//		} else if (str.length() == 2) {
//			return str.charAt(0) == str.charAt(1);
//		}
//
//		if (str.charAt(0) == str.charAt(str.length() - 1)) {
//			return isPalindrome(str.substring(1, str.length() - 1));
//		}
//		return false;

		if (str.length() == 1) {
			return true;
		} else if (str.length() == 2) {
			return str.charAt(0) == str.charAt(1);
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}

		return true;

	}

	public static boolean isAbecedarian(String str) {
//		if (str.length() <= 1) {
//			return true;
//		} else {
//			if (str.charAt(0) > str.charAt(1)) {
//				return false;
//			} else {
//				return isAbecedarian(str.substring(1));
//			}
//		}

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) < str.charAt(i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isDoubloon(String str) {
		str = str.toLowerCase();
		int[] chars = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			chars[c - 'a']++;
		}

		for (int j = 0; j < 26; j++) {
			if (chars[j] != 0 && chars[j] != 2) {
				return false;
			}
		}
		return true;
	}

	public static String sortString(String str) {
		char[] chars = str.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] > chars[j]) {
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		return new String(chars);
	}

	public static boolean isAnagram(String str1, String str2) {
		return sortString(str1).equals(sortString(str2));
	}

	public static int[] sortArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
