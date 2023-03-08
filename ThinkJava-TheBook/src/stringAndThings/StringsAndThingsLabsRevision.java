package stringAndThings;

import java.util.Arrays;

public class StringsAndThingsLabsRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(letterHist("AAAABBBCCCZZZ")));
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

}
