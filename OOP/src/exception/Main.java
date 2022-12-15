package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// exception: an event that occurs during the execution of a program that,
		// disrupts the normal flow of instruction
		Scanner scanner = new Scanner(System.in);
		try {

			System.out.println("Enter a whole number to divide:  ");
			int x = scanner.nextInt();

			System.out.println("Enter a whole number to divide by:  ");
			int y = scanner.nextInt();

			int z = x / y;

			System.out.println("result: " + z);

		} catch (ArithmeticException eh) {
			System.out.println("You cannot divide by zero! IDIOT!!!");

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Please enter a number, OMFGGGG how stupid!!");
		} catch (Exception e) {
			System.out.println("WHatever einstein");
		} finally {
//			System.out.println("This always prints");
			scanner.close();

		}

	}

}
