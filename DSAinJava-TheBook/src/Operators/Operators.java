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

		System.out.println(intToBinary(4));
		System.out.println(intToHex(900));

		System.out.println(binaryToInt("100"));
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

	public static String intToHex(int n) {
		String hex = "";

		while (n > 0) {
			hex = n % 16 + hex;
			n /= 16;
		}
		return hex;
	}

	public static int binaryToInt(String binary) {
		int result = 0;
		for (int i = 0; i < binary.length(); i++) {
			result = result * 2 + Character.getNumericValue(binary.charAt(i));
		}
		return result;
	}
}
