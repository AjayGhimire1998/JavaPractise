package StringBuilderClass;

import java.util.Scanner;

public class MyStringBuilder {

	public static void main(String[] args) {
//		MyStringBuilder str = new MyStringBuilder();
//		System.out.println(str.str);

		String greet = "Hello";
		char[] chars = { 'a', 'b', 'c', 'd' };
		StringBuilder greetBuilder = new StringBuilder(greet);
		System.out.println(greetBuilder.reverse());

		StringBuilder greeting = new StringBuilder();

		greeting.append("Hello World");

		greeting.setCharAt(0, 'E');
		greeting.insert(0, "YE");
		System.out.println(greeting.toString());

	}

	static Scanner in;
	static char[] charSequence;
	String str = "";

	MyStringBuilder() {

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
