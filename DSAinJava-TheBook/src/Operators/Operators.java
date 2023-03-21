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

//		System.out.println(intToBinary(4));
//		System.out.println(intToHex(900));
//
//		System.out.println(binaryToInt("100"));

		// Bitwise operators

//		int a = 12;
//		System.out.println(a);
//
//		int b = ~a;
//		System.out.println(b);

		System.out.println(unaryOperate(12));

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

	public static int[] intArrReverse(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			result[i] = nums[nums.length - 1 - i];
			result[nums.length - 1 - i] = temp;
		}
		return result;
	}

	public static int unaryOperate(int n) {
		int[] binary = new int[8];
		int i = 0;
		while (n > 0) {
			binary[i] = n % 2;
			n /= 2;
			i++;
		}
		int[] orderedBinary = intArrReverse(binary);

		for (int j = 0; j < orderedBinary.length; j++) {
			if (orderedBinary[j] == 0) {
				orderedBinary[j] = 1;
			} else {
				orderedBinary[j] = 0;
			}
		}

		String stringedBinary = "";

		for (int k = 0; k < orderedBinary.length; k++) {
			stringedBinary += orderedBinary[k];
		}
		System.out.println(stringedBinary);

		return binaryToInt(stringedBinary);

	}
}
