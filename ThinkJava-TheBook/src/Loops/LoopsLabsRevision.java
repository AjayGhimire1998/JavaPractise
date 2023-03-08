package Loops;

public class LoopsLabsRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(16.0));
	}

	public static double squareRoot(double x) {
		double x0 = x / 2;
		double x1 = (x0 + x / x0) / 2;
		double diff = Math.abs(x1 - x0);
		while (diff > 0.0001) {
			x0 = x1;
			x1 = (x0 + x / x0) / 2;
			diff = Math.abs(x1 - x0);
		}
		return x1;
	}

}
