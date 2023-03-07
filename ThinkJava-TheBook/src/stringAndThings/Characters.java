package stringAndThings;

public class Characters {

	public static void main(String[] args) {
		/*
		 * Strings provide a method named charAt, which extracts a character. It returns
		 * a char, a primitive type that stores an individual character (as opposed to
		 * strings of them).
		 * 
		 */
		String fruit = "banana";
		char letter = fruit.charAt(0);
		System.out.println(letter);

		/*
		 * Characters work like the other primitive types we have seen. You can compare
		 * them using relational operators:
		 */
		if (letter == 'a') {
			System.out.println('?');
		}

		/*
		 * Character literals, like 'a', appear in single quotes. Unlike string
		 * literals, which appear in double quotes, character literals can only contain
		 * a single character. Escape sequences, like '\t', are legal because they
		 * represent a single character. The increment and decrement operators work with
		 * characters. So this loop displays the letters of the alphabet:
		 * 
		 */
		System.out.print("Roman Alphabet: ");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
		}
		System.out.println();

		/*
		 * In Unicode, each character is represented by a “code unit”, which you can
		 * think of as an integer. The code units for uppercase Greek letters run from
		 * 913 to 937, so we can display the Greek alphabet like this:
		 */
		System.out.print("Greek Alphabets: ");
		for (int i = 913; i <= 937; i++) {
			System.out.print((char) i);
		}
		System.out.println();
	}

}
