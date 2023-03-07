package InputOutput;

import java.util.Random;
import java.util.Scanner;

public class IOLabsRevision {

	public static void main(String[] args) {
//		celToFarh();
//		secToHourMinSec();
		guessStarter();
	}

	public static void celToFarh() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the temp in Celcius: ");
		double cel = in.nextDouble();

		double farh = cel * 9 / 5 + 32;
		System.out.printf("%.1f celcius = %.1f F", cel, farh);
	}

	public static void secToHourMinSec() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the seconds: ");
		int sec = in.nextInt();

		int seconds = sec % 60;
		int actualMinutes = sec / 60;
		int minutes = actualMinutes % 60;
		int hour = actualMinutes / 60;

		System.out.printf("%d seconds = %d hours, %d minutes, %d seconds", sec, hour, minutes, seconds);
	}

	public static void guessStarter() {
		Random rand = new Random();
		int randGuess = rand.nextInt(100) + 1;
		System.out.println(
				"I'm thinking of a number between 1 and 100\n" + "(including both). Can you guess what it is?");
		Scanner in = new Scanner(System.in);
		System.out.println("type your guess: ");
		int yourGuess = in.nextInt();
		System.out.println("your guess is: " + yourGuess);
		System.out.println("the number I was thinking is: " + randGuess);
		System.out.println(
				"you were off by: " + (randGuess > yourGuess ? (randGuess - yourGuess) : (yourGuess - randGuess)));
	}

}
