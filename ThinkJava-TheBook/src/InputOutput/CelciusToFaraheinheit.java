package InputOutput;

import java.util.Scanner;

public class CelciusToFaraheinheit {
	final static double FAR_PER_CEL = 9.0 / 5.0;
	final static double FAR_PER_ZERO_CEL = 32.0;

	public static void main(String[] args) {
		celToFar();
	}

	static void celToFar() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the celius value: ");
		double cel = in.nextDouble();
		double far = cel * FAR_PER_CEL + FAR_PER_ZERO_CEL;

		System.out.printf("%.1f C = %.1f F", cel, far);
	}

}
