package arrays;

import java.util.Arrays;

public class CreatingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] counts = new int[5];
		System.out.println(Arrays.toString(counts));
		counts[0] = 1;
		System.out.println(Arrays.toString(counts));
		counts[1] = counts[0] * 6;
		System.out.println(Arrays.toString(counts));
		counts[2]++;
		System.out.println(Arrays.toString(counts));
		counts[3] -= 70;
		System.out.println(Arrays.toString(counts));

		for (int i = 0; i < counts.length; i++) {
			System.out.println(counts[i]);
		}
		int i = 0;
		while (i < counts.length) {
			if (counts[i] == -70) {
				System.out.println(counts[i]);
			}
			i++;
		}

		String[] names = { "ajay", "ghimire" };
		System.out.println(names);

		String[] animals = new String[3];
		System.out.println(Arrays.toString(animals));
		String[] pets = animals;
		System.out.println(Arrays.toString(pets));

		animals[0] = "dog";

		System.out.println(Arrays.toString(animals));
		System.out.println(Arrays.toString(pets));

		String[] petTypes = Arrays.copyOf(animals, 2);
		System.out.println(Arrays.toString(petTypes));

	}

}
