package arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(randomArray(10)));

	}

	/**
	 * The following method creates an int array and fills it with random numbers
	 * between 0 and 99. The argument specifies the size of the array, and the
	 * return value is a refer‐ ence to the new array.
	 * 
	 * @param size
	 * @return
	 */
	public static int[] randomArray(int size) {
		Random rand = new Random();
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = rand.nextInt(100);
		}
		return newArray;
	}

}
