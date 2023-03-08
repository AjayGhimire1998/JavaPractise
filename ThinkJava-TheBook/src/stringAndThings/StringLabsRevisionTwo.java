package stringAndThings;

public class StringLabsRevisionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printString("AjayGhimire");
//		printBackwards("Ghimire");
		System.out.println(reverseString("Coffee"));
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

}
