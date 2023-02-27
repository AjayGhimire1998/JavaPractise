package InputOutput;

import java.util.Scanner;

public class InchesToCentis {

	final static double CM_PER_INCH = 2.54;

	public static void main(String[] args) {
		inchesToCentis();
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

}
