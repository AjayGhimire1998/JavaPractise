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

	public static void main(String[] args) {
		int[][] data1 = { { 1, 2 }, { 3, 4 } };
		int[][] data2 = { { 5, 6 }, { 7, 8 } };

		Matrix matrix1 = new Matrix(data1);
		Matrix matrix2 = new Matrix(data2);

		Matrix sum = matrix1.add(matrix2);
		sum.print();

		Matrix product = matrix1.multiply(matrix2);
		product.print();

	}

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

		int[][] resultData = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				resultData[i][j] = data[i][j] + other.data[i][j];
			}
		}

		return new Matrix(resultData);
	}

	Matrix multiply(Matrix other) {
		if (cols != other.cols) {
			throw new IllegalArgumentException("number of columns between matrices must match");
		}

		int[][] resultData = new int[rows][other.cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < other.cols; j++) {
				int sum = 0;
				for (int k = 0; k < cols; k++) {
					sum += data[i][k] * other.data[k][j];
				}
				resultData[i][j] = sum;
			}

		}
		return new Matrix(resultData);
	}

	void print() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}

}
