package InputOutput;

import java.util.Scanner;

public class IOLabsRevision {

	public static void main(String[] args) {
//		celToFarh();
		secToHourMinSec();
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

}
