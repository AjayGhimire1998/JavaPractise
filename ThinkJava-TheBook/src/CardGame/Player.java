package CardGame;

public class Player {
	private String name;
	private Hand hand;

	/*
	 * A Player has two private attributes: a name and a hand. The constructor takes
	 * the player’s name as a string and saves it in an instance variable. In this
	 * example, we have to use this to distinguish between the instance variable and
	 * the parameter with the same name.
	 */
	Player(String name) {
		this.name = name;
		this.hand = new Hand(name);
	}

	/*
	 * The primary method that Player provides is play, which decides which card to
	 * dis‐ card during each turn:
	 * 
	 * The first parameter is a reference to the Eights object that encapsulates the
	 * state of the game. We’ll need it if we have to draw a new card. The second
	 * parameter, prev, is the card on top of the discard pile.
	 */
	public Card play(Eights eights, Card prev) {
		Card card = searchForMatch(prev);
		if (card == null) {
			card = drawForMatch(eights, prev);
		}
		return card;
	}

	public Card searchForMatch(Card prev) {

	}

	public Card drawForMatch(Eights eights, Card prev) {

	}

	public static boolean cardMatches(Card card1, Card card2) {

	}

	public int score() {

	}
}
