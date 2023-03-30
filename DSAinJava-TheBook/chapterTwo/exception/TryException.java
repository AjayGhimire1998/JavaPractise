package exception;

public class TryException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -12;
		try {
			n = Integer.parseInt(args[0]);
			if (n <= 0) {
				System.out.println("n must be positive. Using default.");
				n = 0;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No argument specified for n. Using default");
		}
	}

}
