package StringBuilderClass;

import java.util.Scanner;

public class StringBuilder {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		System.out.println(str.str);
	}

	static Scanner in;
	static char[] charSequence;
	String str = "";

	StringBuilder() {

		System.out.println("Please enter the str upto 5 char");
		in = new Scanner(System.in);
		charSequence = new char[5];
		for (int i = 0; i < charSequence.length; i++) {
			charSequence[i] = in.next().charAt(0);
		}

		if (charSequence.length == 5) {
			in.close();
		}
		int index = 0;
		while (index < charSequence.length) {
			str += charSequence[index];
			index++;
		}

	}

}
