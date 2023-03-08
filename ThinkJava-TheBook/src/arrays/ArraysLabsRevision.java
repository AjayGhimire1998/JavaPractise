package arrays;

import java.util.Arrays;

public class ArraysLabsRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] test = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(powArray(test)));
		System.out.println(Arrays.toString(powArrayTwo(test, 3)));
	}

	public static double[] powArray(double[] a) {
		double[] result = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			result[i] = a[i] * a[i];
		}
		return result;
	}

	public static double[] powArrayTwo(double[] a, int n) {
		double[] result = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			result[i] = 1;
			for (int j = 0; j < n; j++) {
				result[i] *= a[i];
			}
		}
		return result;
	}

}
