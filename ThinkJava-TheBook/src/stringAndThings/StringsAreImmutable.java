package stringAndThings;

public class StringsAreImmutable {

	public static void main(String[] args) {
		/*
		 * Strings provide methods, toUpperCase and toLowerCase, that convert from
		 * upper‐ case to lowercase and back. These methods are often a source of
		 * confusion, because it sounds like they modify strings. But neither these
		 * methods nor any others can change a string, because strings are immutable
		 */

		String name = "Ajay Ghimire";
		String capitalName = name.toUpperCase();
		System.out.println("capital name: " + capitalName);
		System.out.println("nme: " + name);

		String str = new String();
		str = "Hello";
		System.out.println(System.identityHashCode(str));
		System.out.println(str.toString());

		str = str + " World";
		System.out.println(System.identityHashCode(str));
		System.out.println(str.toString());

		/*
		 * This example demonstrates a common way to work with string methods. It
		 * invokes text.replace, which returns a reference to a new string,
		 * "CS is fun!". Then it assigns the new string to text, replacing the old
		 * string. This assignment is important; if you don’t save the return value,
		 * invoking text.replace has no effect.
		 */
		String text = "Computer Science is fun";
		text = text.replace("Computer Science", "CS");
		System.out.println(text);

	}

}
