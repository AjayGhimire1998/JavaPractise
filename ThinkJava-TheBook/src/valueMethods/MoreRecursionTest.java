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
	}

}
