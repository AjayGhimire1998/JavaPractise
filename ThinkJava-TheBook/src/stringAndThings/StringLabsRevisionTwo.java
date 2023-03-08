package stringAndThings;

public class StringLabsRevisionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printString("AjayGhimire");
//		printBackwards("Ghimire");
//		System.out.println(reverseString("Coffee"));
		System.out.println(isPalindrome("pndrrdnilap"));
		System.out.println(isAbecedarian("dimpsyzzz"));
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

}
