package InputOutput;

import java.util.Scanner;

public class ScannerBug {

	public static void main(String[] args) {

		System.out.println("What is your name ?");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

		System.out.println("What is your age ?");
		Scanner in2 = new Scanner(System.in);
		int age = in2.nextInt();

		System.out.printf("Hello %s, you are %d years old\n", name, age);

		System.out.println("What is your age ?");
		Scanner in3 = new Scanner(System.in);
		int age2 = in3.nextInt();

		System.out.println("What is your name ?");
		Scanner in4 = new Scanner(System.in);
		String name2 = in4.nextLine();

		System.out.printf("Hello %s, you are %d years old\n", name2, age2);

	}

}
