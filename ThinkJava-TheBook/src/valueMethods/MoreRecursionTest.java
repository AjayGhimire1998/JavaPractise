package valueMethods;

import junit.framework.TestCase;

public class MoreRecursionTest extends TestCase {

	public void testFibonacci() {
		assertEquals(1, MoreRecursion.fibonacci(1));
		assertEquals(1, MoreRecursion.fibonacci(2));
		assertEquals(2, MoreRecursion.fibonacci(3));
	}

}
