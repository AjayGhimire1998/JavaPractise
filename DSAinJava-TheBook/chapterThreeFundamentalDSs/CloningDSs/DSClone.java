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
}
