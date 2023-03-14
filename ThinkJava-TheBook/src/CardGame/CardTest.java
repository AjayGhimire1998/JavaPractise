package CardGame;

import junit.framework.TestCase;

public class CardTest extends TestCase {
	public void testRandomInt() {

		assertTrue(Deck.randomInt(2, 9) >= 2 && Deck.randomInt(2, 9) <= 9);
		assertTrue(Deck.randomInt(1, 3) >= 1 && Deck.randomInt(1, 3) <= 3);
	}
}
