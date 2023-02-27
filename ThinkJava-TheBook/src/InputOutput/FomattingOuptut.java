package InputOutput;

public class FomattingOuptut {

	public static void main(String[] args) {
		System.out.println(4.0 / 3.0);
		System.out.printf("Four thirds = %.3f", 4.0 / 3.0);

		int num = 12345;
		System.out.printf("\n%08d", num);

		double dec = 6.78939000;
		System.out.printf("\nRounded decimal = %.2f", dec);

		double pi = 0.0009;
		int x = (int) pi;
		System.out.println("\n" + x);
	}

}
