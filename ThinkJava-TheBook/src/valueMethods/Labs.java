package valueMethods;

public class Labs {
	public static void main(String[] args) {
		boolean result = isDivisible(8, 2);
		System.out.println(result);
	}

	public static boolean isDivisible(int n, int m) {
		return n % m == 0;
	}

}
