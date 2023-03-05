package arrays;

import junit.framework.TestCase;

public class ArraysTest extends TestCase {
	public void testSearch() {
		int[] testArray = { 1, 2, 3, 4, 7, 2, 6, 8 };

		assertEquals(7, ArrayTraversal.search(testArray, 8));
		assertEquals(-1, ArrayTraversal.search(testArray, 18));
	}

}
