package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		countDown(10);
		sequence(97);

	}

	public static void countDown(int n) {
		while (n > 0) {
			System.out.println(n);
			n--;
		}
		System.out.println("Boom");

	}

	public static void sequence(int n) {
		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = n * 3 + 1;
			}
		}
	}

}
