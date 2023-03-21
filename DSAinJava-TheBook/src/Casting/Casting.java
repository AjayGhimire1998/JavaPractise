package Casting;

import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 7;
		int j = 4;

		double d = i / j;
		double d2 = (double) i / j;
		System.out.println(d);
		System.out.println(d2);

		String s = Integer.toString(i);
		System.out.println(s + 8);

		boolean isIt = true;
		do {
			System.out.println("Hello, it is.");
		} while (false);
		isIt = false;

		Scanner in = new Scanner(System.in);

		String input;
		do {
			input = in.next();
			System.out.println(input);
		} while (input.length() > 0);
	}

}
