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
	}

}
