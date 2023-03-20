package StringBuilderClass;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilder {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
	}

	Scanner in;
	char[] charSequence;

	StringBuilder() {
		String result = "";
		System.out.println("Please enter the str upto 5 char");
		in = new Scanner(System.in);
		charSequence = new char[5];
		for (int i = 0; i < charSequence.length; i++) {
			charSequence[i] = in.next().charAt(0);
		}

		if (charSequence.length == 5) {
			in.close();
		}
		System.out.println(Arrays.toString(charSequence));

	}

}
