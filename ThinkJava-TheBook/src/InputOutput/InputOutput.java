package InputOutput;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		System.out.println("Please enter your age: ");
		Scanner scanner2 = new Scanner(System.in);
		int age = scanner2.nextInt();

		System.out.println("Please enter youtr name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println("Hello, " + "Mr. " + name);

		System.out.println(" you sure you are " + age + " years old ?");

		Scanner scanner3 = new Scanner(System.in);
		String confirm = scanner3.nextLine();

		switch (confirm) {
		case "Yes":
			System.out.println("Thanks for not lying");
			break;
		case "YES":
			System.out.println("Thanks for not lying");
			break;
		case "yes":
			System.out.println("Thanks for not lying");
			break;
		case "y":
			System.out.println("Thanks for not lying");
			break;
		default:
			System.out.println("Liar Liar");

		}

	}
}
