package CloningDSs;

import java.util.Arrays;

public class DSClone {
	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5 };
		int[] backup = data;

		backup[0] = 100;
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(backup));

	}
}
