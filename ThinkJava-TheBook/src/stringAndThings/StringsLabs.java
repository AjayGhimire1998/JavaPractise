package stringAndThings;

public class StringsLabs {

	public static void main(String[] args) {
		System.out.println(addOrConcat("aja", 'y'));

		String str = "hello";
		char c = '!';
		int num = 12;
		double dec = 3.14;

		System.out.println(str + c); // string concatenation: "hello!"
		System.out.println(c + num); // character addition: 75 ('!' has an ASCII value of 33, so 33 + 42 = 75)
		System.out.println(num + dec); // numeric addition: 45.14
		System.out.println(str + num + dec); // string concatenation: "hello423.14"
	}

	/**
	 * Create a new program named Test.java and write a main method that contains
	 * expressions that combine various types using the + operator. For example,
	 * what happens when you “add” a String and a char? Does it perform character
	 * addi‐ tion or string concatenation? What is the type of the result? (How can
	 * you deter‐ mine the type of the result?)
	 * 
	 * @param str
	 * @param character
	 * @return
	 */
	public static String addOrConcat(String str, char character) {
		return str + character;
	}

}
