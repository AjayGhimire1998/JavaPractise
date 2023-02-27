package InputOutput;

import java.util.Scanner;

public class CelciusToFaraheinheit {
	final static double FAR_PER_CEL = 9.0 / 5.0;
	final static double FAR_PER_ZERO_CEL = 32.0;

	public static void main(String[] args) {
//		celToFar();
		secondsToHoursMinutesSeconds();
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

		System.out.println(minutes);
		System.out.printf("%d hours, %d minutes, %d seconds", hours, minutes, remainder);

	}

}
