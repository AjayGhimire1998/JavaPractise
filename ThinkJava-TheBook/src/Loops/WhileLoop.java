package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDown(10);

	}

	public static void countDown(int n) {
		while (n > 0) {
			System.out.println(n);
			n--;
		}
		System.out.println("Boom");

	}

}
