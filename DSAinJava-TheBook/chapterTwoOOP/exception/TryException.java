package exception;

public class TryException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -12;
		try {
//			n = Integer.parseInt(args[0]);
			if (n <= 0) {
				System.out.println("n must be positive. Using default.");
				n = 0;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No argument specified for n. Using default");
		} catch (NumberFormatException e) {
			System.out.println("Invalid integer argument. Usinf default");
		}
//		ensurePositive(2);
		System.out.println(parseInt("12ab"));
	}

	// throw clause
	public static void ensurePositive(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Thats not positive");
		}
	}

	// throws clause
	/**
	 * @param s
	 * @return
	 * @throws NumberFormatException
	 */
	public static int parseInt(String s) throws NumberFormatException {
		return Integer.parseInt(s);
	}
}
