package InputOutput;

import java.util.Scanner;

public class InchesToCentis {

	final static double MULTIPLIER = 2.53;

	public static void main(String[] args) {
		inchesToCentis();
	}

	static void inchesToCentis() {
		int inch;
		double cm;

		System.out.println("How many inches ? ");
		Scanner in = new Scanner(System.in);
		inch = in.nextInt();
		cm = inch * MULTIPLIER;

		System.out.println(inch + " inches is: " + cm + " cms");

	}

}
