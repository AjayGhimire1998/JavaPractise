package CardGame;

import junit.framework.TestCase;

public class CardTest extends TestCase {
	public void testRandomInt() {

		assertTrue(Deck.randomInt(2, 9) >= 2 && Deck.randomInt(2, 9) <= 9);
		assertTrue(Deck.randomInt(1, 3) >= 1 && Deck.randomInt(1, 3) <= 3);
	}

	public void testSwapCards() {
		Deck testDeck = new Deck();
		Deck swappedDeck = new Deck();
		swappedDeck.swapCards(2, 4);
//		testDeck.swapCards(0, 1);
		assertTrue((testDeck.getCards()[2].equals(swappedDeck.getCards()[4])
				&& (testDeck.getCards()[4].equals(swappedDeck.getCards()[2]))));
	}

	public void testShuffle() {
		Deck testDeck = new Deck();
		Deck shuffledDeck = new Deck();
		shuffledDeck.shuffle();

		assertTrue((testDeck.getCards().length == shuffledDeck.getCards().length));
	}
}
