package stringAndThings;

import java.util.Arrays;

public class StringsAndThingsLabsRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(letterHist("AAAABBBCCCZZZ")));
		System.out.println(checkBrac("Ajay)Ghimire(("));
	}

	public static int[] letterHist(String str) {

		int[] chars = new int[26];
		for (int i = 0; i < str.length(); i++) {
			Character c = Character.toLowerCase(str.charAt(i));
			if (c >= 'a' && c <= 'z') {
				chars[c - 'a']++;
			}
		}
		return chars;
	}

	public static boolean checkBrac(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				count++;
			} else if (c == ')') {
				count--;
			}
		}
		return count == 0;
	}

}
