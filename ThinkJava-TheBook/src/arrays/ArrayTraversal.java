package arrays;

public class ArrayTraversal {

	public static void main(String[] args) {
		int[] integers = { 1, 2, 3, 4, 7, 2, 6, 8 };
		int index = search(integers, 2);
		System.out.println(index);

	}

	/**
	 * Looping through the elements of an array is called a traversal. Another
	 * common pat‐ tern is a search, which involves traversing an array looking for
	 * a particular element.
	 * 
	 * For example, the following method takes an int array and an integer value,
	 * and it returns the index where the value appears:
	 * 
	 * If we find the target value in the array, we return its index immediately. If
	 * the loop exits without finding the target, it returns -1, a special value
	 * chosen to indicate a failed search.
	 * 
	 * @param integer array
	 * @param target
	 * @return index or -1
	 */
	public static int search(int[] a, int target) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
