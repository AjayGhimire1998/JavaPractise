package stringAndThings;

public class SubStrings {

	public static void main(String[] args) {

		/*
		 * The substring method returns a new string that copies letters from an
		 * existing string, starting at the given index.
		 * 
		 * The first example returns a copy of the entire string. The second example
		 * returns all but the first two characters. As the last example shows,
		 * substring returns the empty string if the argument is the length of the
		 * string.
		 */

		String fruit = "banana";
		System.out.println(fruit.substring(5));

		/*
		 * Like most string methods, substring is overloaded. That is, there are other
		 * versions of substring that have different parameters. If it’s invoked with
		 * two arguments, they are treated as a start and end index:
		 */
		System.out.println(fruit.substring(1, 5));
	}

}
