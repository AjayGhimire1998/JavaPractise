package conditionsAndLogic;

import java.util.Scanner;

public class FlagVaribales {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer you want to check: ");
		int input = in.nextInt();

		boolean evenFlag = (input % 2 == 0);

		if (evenFlag) {
			System.out.println("your input is even");
		}

		if (!evenFlag) {
			System.out.println("Your input is odd");
		}

	}

}
