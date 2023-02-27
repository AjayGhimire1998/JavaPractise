package InputOutput;

import java.util.Scanner;

public class InchesToCentis {

	final static double CM_PER_INCH = 2.54;

	final static int INCHES_PER_FOOT = 12;

	public static void main(String[] args) {
		inchesToCentis();
		centisToFeetAndInches();
	}

	static void inchesToCentis() {
		int inch;
		double cm;

		System.out.println("How many inches ? ");
		Scanner in = new Scanner(System.in);
		inch = in.nextInt();
		cm = inch * CM_PER_INCH;

		System.out.printf("%d inches = %f cm\n", inch, cm);
		System.out.println(inch + " inches is: " + cm + " cms");

	}

	static void centisToFeetAndInches() {
		int feet, inches, remainder;
		double cm;

		System.out.println("How many centis ? ");
		Scanner in = new Scanner(System.in);
		cm = in.nextDouble();

		inches = (int) (cm / CM_PER_INCH);
		feet = inches / INCHES_PER_FOOT;
		remainder = inches % INCHES_PER_FOOT;

		System.out.printf("%.2f cm = %d feet, %d inches\n", cm, feet, remainder);

	}

}
