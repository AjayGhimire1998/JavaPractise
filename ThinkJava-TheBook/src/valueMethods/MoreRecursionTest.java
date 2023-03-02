package valueMethods;

import junit.framework.TestCase;

public class MoreRecursionTest extends TestCase {

	public void testFibonacci() {
		assertEquals(1, MoreRecursion.fibonacci(1));
		assertEquals(1, MoreRecursion.fibonacci(2));
		assertEquals(2, MoreRecursion.fibonacci(3));
	}

	public void testIsDivisible() {
		assertEquals(false, Labs.isDivisible(1, 2));
		assertEquals(true, Labs.isDivisible(2, 2));
		assertEquals(true, Labs.isDivisible(0, 1));
		assertEquals(false, Labs.isDivisible(2, 3));
	}

	public void testIsTriangle() {
		assertEquals(true, Labs.isTriangle(3, 4, 5));
		assertEquals(false, Labs.isTriangle(1, 2, 3));
	}

	public void testmultAdd() {
		assertEquals(5.0, Labs.multAdd(1, 2, 3));
	}

}
