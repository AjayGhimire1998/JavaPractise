package projects;

public class TwoDArrayAddAndMultiply {

//	public static void main(String[] args) {
//
//		int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 } };
//		int total = 0;
//		int product = 1;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums[i].length; j++) {
//				total += nums[i][j];
//				product *= nums[i][j];
//			}
//		}
//		System.out.println("Sum: " + total);
//		System.out.println("Product: " + product);
//
//	}

}

/**
 * Write a Java program for a matrix class that can add and multiply arbitrary
 * twodimensional arrays of integers.
 * 
 * @param args
 */
class Matrix {
	private int[][] data;
	private int rows;
	private int cols;

	Matrix(int[][] data) {
		this.data = data;
		this.rows = data.length;
		this.cols = data[0].length;
	}

	Matrix add(Matrix other) {
		if (rows != other.rows || cols != other.cols) {
			throw new IllegalArgumentException("Matrices must have same dimension");
		}
	}
}
