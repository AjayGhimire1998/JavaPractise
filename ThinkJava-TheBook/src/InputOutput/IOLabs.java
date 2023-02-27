package InputOutput;

import java.util.Random;
import java.util.Scanner;

public class IOLabs {
	final static double FAR_PER_CEL = 9.0 / 5.0;
	final static double FAR_PER_ZERO_CEL = 32.0;

	public static void main(String[] args) {
//		celToFar();
//		secondsToHoursMinutesSeconds();
		guessStarter();
	}

	static void celToFar() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the celius value: ");
		double cel = in.nextDouble();
		double far = cel * FAR_PER_CEL + FAR_PER_ZERO_CEL;

		System.out.printf("%.1f C = %.1f F", cel, far);
	}

	static void secondsToHoursMinutesSeconds() {
		int input, seconds, hours, minutes, remainder;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the seconds");
		input = in.nextInt();

		minutes = input / 60;
		remainder = input - minutes * 60;
		hours = minutes / 60;
		minutes = minutes % 60;

		System.out.printf("%d hours, %d minutes, %d seconds", hours, minutes, remainder);
	}

	static void guessStarter() {

		Random rand = new Random();
		int num = rand.nextInt(100) + 1;

		System.out.println(
				"I'm thinking of a number between 1 and 100\n" + "(including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		Scanner in = new Scanner(System.in);
		int guess = in.nextInt();

		System.out.println("Your guess is: " + guess);

		System.out.println("The number I was thinking is: " + num);

		if (guess > num) {
			System.out.println("you were off by: " + (guess - num));
		} else {
			System.out.println("you were off by: " + (num - guess));
		}

	}
}
