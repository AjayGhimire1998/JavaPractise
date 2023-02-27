package conditionsAndLogic;

public class RecursiveMethods {

	public static void main(String[] args) {
		countdownWithParams(5);
	}

	public static void countdownWithParams(int num) {
		if (num == 0) {
			System.out.println("Booom!!!! ");
		} else {
			System.out.println(num);
			countdownWithParams(num - 1);
		}
	}

}
