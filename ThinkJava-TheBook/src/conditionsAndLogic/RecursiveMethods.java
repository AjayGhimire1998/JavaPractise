package conditionsAndLogic;

public class RecursiveMethods {

	public static void main(String[] args) {
//		countdownWithParams(5);
//		countUp(6);
//		displayBinary(23);
		displayHex(20);
		System.out.println();

	}

	public static void countdownWithParams(int num) {
		if (num == 0) {
			System.out.println("Booom!!!! ");
		} else {
			System.out.println(num);
			countdownWithParams(num - 1);
		}
	}

	public static void countUp(int num) {
		if (num == 0) {
			System.out.println("BOOOM!!");
		} else {
			countUp(num - 1);
			System.out.println(num);
		}

	}

	public static void displayBinary(int num) {
		if (num > 0) {
			displayBinary(num / 2);
			System.out.print(num % 2);
		}

	}

	public static void displayHex(int num) {
		if (num > 0) {
			displayHex(num / 16);
			System.out.print(num % 16);
		}
	}
}
