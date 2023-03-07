package stringAndThings;

public class IndexOfMethod {
	public static void main(String[] args) {

		/*
		 * The indexOf method searches for a character in a string.
		 * 
		 * This example finds the index of 'a' in the string. But the letter appears
		 * three times, so it’s not obvious what indexOf should do. According to the
		 * documentation, it returns the index of the first appearance.
		 */
		String fruit = "passionfruit";
		System.out.println(fruit.indexOf('f'));

		/*
		 * This example finds the index of 'a' in the string. But the letter appears
		 * three times, so it’s not obvious what indexOf should do. According to the
		 * documentation, it returns the index of the first appearance.
		 */
		System.out.println(fruit.indexOf('a'));

		/*
		 * To find subsequent appearances, you can use another version of indexOf, which
		 * takes a second argument that indicates where in the string to start looking.
		 * 
		 * This code starts at index 2 (the first 'n') and finds the next 'a', which is
		 * at index 3. If the letter happens to appear at the starting index, the
		 * starting index is the answer. So fruit.indexOf('a', 5) returns 5.
		 */
		System.out.println(fruit.indexOf("ssion", 2));
	}
}
