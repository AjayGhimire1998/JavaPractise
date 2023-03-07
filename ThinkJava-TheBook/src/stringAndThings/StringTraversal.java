package stringAndThings;

public class StringTraversal {

	public static void main(String[] args) {

		String text = "Computer Science is fun";

		/*
		 * Strings provide a method called length that returns the number of characters
		 * in the string. Because it is a method, you have to invoke it with the empty
		 * argument list, (). The condition is i < fruit.length(), which means that when
		 * i is equal to the length of the string, the condition is false and the loop
		 * terminates.
		 */
		for (int i = 0; i < text.length(); i++) {

			System.out.println(text.charAt(i));
		}
	}

}
