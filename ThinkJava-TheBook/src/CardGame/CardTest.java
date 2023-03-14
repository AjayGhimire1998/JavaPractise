package CardGame;

import junit.framework.TestCase;

public class CardTest extends TestCase {
	public void testRandomInt() {
		int randomInt = Deck.randomInt(2, 9);
		assertTrue(randomInt >= 2 && randomInt <= 9);
	}
}
