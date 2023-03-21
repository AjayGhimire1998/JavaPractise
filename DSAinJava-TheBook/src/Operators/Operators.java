package Operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i = 8;
//		System.out.println(i);
//
//		int j = i++;
//		System.out.println(j);
//		System.out.println(i);
//
//		int k = ++i;
//		System.out.println(k);
//		System.out.println(i);
//
//		int m = i--;
//		System.out.println(m);
//		System.out.println(i);
//
//		int n = 9 + --i;
//		System.out.println(n);

		System.out.println(intToBinary(900));
		// Bitwise operators

	}

	public static String intToBinary(int n) {

		String binary = "";

		while (n > 0) {
			binary = n % 2 + binary;
			n /= 2;
		}
		return binary;
	}
}
