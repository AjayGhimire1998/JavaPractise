package arrays;

import java.util.Arrays;

public class ArraysLabsRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] test = { 1, 2, 3, 4, 5 };
		int[] test2 = { 1, 2, 4, 5, 6, 9, 9, 1, 7, 2, 99, 98, 99 };
		System.out.println(Arrays.toString(powArray(test)));
		System.out.println(Arrays.toString(powArrayTwo(test, 3)));
		System.out.println(Arrays.toString(histogram(test2)));
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

	public static int[] histogram(int[] a) {
		int[] test = new int[100];
		int count;
		for (int i = 0; i < a.length; i++) {
			count = a[i];
			test[count]++;
		}
		return test;
	}

}
