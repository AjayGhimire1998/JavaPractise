package labProjects;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount charged: $");
		double amountCharged = input.nextDouble();

		System.out.print("Enter amount given: $");
		double amountGiven = input.nextDouble();

		double change = amountGiven - amountCharged;

		if (change < 0) {
			System.err.println("Error: amount given is not sufficient");
			System.exit(0);
		}

		int dollars = (int) change;
		int cents = (int) Math.round(change - dollars) * 100;
		System.out.println(cents);

		int numOfHundreds = dollars / 100;
		dollars %= 100;

		int numOfFifties = dollars / 50;
		dollars %= 50;

		int numOfTwenties = dollars / 20;
		dollars %= 20;

		int numOfTens = dollars / 10;
		dollars %= 10;

		int numOfFives = dollars / 5;
		dollars %= 5;

		int numOfTwos = dollars / 2;
		dollars %= 2;

		int numOfOnes = dollars;

		int numOfFiftyCents = cents / 50;
		cents %= 50;

		int numOfTwentyCents = cents / 20;
		cents %= 20;

		int numOfTenCents = cents / 10;
		cents %= 10;

		int numOfFiveCents = cents / 5;
		cents %= 5;

		System.out.println("Change due: $" + String.format("%.2f", change));
		System.out.println("Hundreds: " + numOfHundreds);
		System.out.println("Fifties: " + numOfFifties);
		System.out.println("Twenties: " + numOfTwenties);
		System.out.println("Tens: " + numOfTens);
		System.out.println("Fives: " + numOfFives);
		System.out.println("Twos: " + numOfTwos);
		System.out.println("Ones: " + numOfOnes);
		System.out.println("FiftyCents: " + numOfFiftyCents);
		System.out.println("TwentyCents: " + numOfTwentyCents);
		System.out.println("TenCents: " + numOfTenCents);
		System.out.println("FiveCents: " + numOfFiveCents);

	}
}
