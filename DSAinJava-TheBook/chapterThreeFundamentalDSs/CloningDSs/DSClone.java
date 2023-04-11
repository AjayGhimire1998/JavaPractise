package CloningDSs;

import java.util.Arrays;

public class DSClone {
	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5 };
		int[] backup = data;
		backup[0] = 100;
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(backup));

		String[] names = { "Ajay", "Ghimire" };
		String[] namesBackup = names.clone();
		namesBackup[0] = "jay";
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(namesBackup));

		// testing methods below

		int[][] orig = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] origClone = deepClone(orig);
		System.out.println(Arrays.toString(orig[2]));
		System.out.println(Arrays.toString(origClone[2]));

	}

	// creating a deep clone of the array that holds object references as the
	// elements

	// first creating a nested class for testing
	static class Person {

	}

	static class Contact extends Person {

	}

	public Person[] deepCopyOfReferenceArray(Contact[] contacts) {
		Person[] guests = new Person[contacts.length];
		for (int i = 0; i < contacts.length; i++) {
			guests[i] = (Person) contacts[i];
		}
		return guests;
	}

	// creating a deepClone of multi dimensional arrays
	public static int[][] deepClone(int[][] original) {
		int[][] backup = new int[original.length][];
		for (int i = 0; i < original.length; i++) {
			backup[i] = original[i].clone();
		}
		return backup;
	}

}
