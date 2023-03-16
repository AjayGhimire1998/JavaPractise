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

	/*
	 * Using top-down development, we’ll have play invoke two helper methods,
	 * searchFor Match and drawForMatch. searchForMatch looks in the player’s hand
	 * for a card that matches the previously played card:
	 * 
	 * The strategy is pretty simple: the for loop searches for the first card
	 * that’s legal to play and returns it. If there are no cards that match, it
	 * returns null.
	 */
	public Card searchForMatch(Card prev) {
		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.getCard(i);
			if (cardMatches(card, prev)) {
				return hand.popCard(i);
			}
		}
		return null;
	}

	/*
	 * The strategy is pretty simple: the for loop searches for the first card
	 * that’s legal to play and returns it. If there are no cards that match, it
	 * returns null. And in that case, we have to draw cards until we get a match:
	 * 
	 * The while loop runs until it finds a match (we’ll assume for now that it
	 * always does). It uses the Eights object to draw a card. If it matches, it
	 * returns the card. Otherwise it adds the card to the player’s hand and
	 * continues.
	 */
	public Card drawForMatch(Eights eights, Card prev) {
		while (true) {
			Card card = eights.draw();
			System.out.println(name + " draws " + card);
			if (cardMatches(card, prev)) {
				return card;
			}
			hand.addCard(card);
		}
	}

	/*
	 * Both searchForMatch and drawForMatch use cardMatches, which is a static
	 * method, also defined in Player. cardMatches is a straightforward translation
	 * of the rules of the game:
	 */
	public static boolean cardMatches(Card card1, Card card2) {
		if (card1.getSuit() == card2.getSuit()) {
			return true;
		}

		if (card1.getRank() == card2.getRank()) {
			return true;
		}

		if (card1.getRank() == 8) {
			return true;
		}
		return false;
	}

	/*
	 * Finally, Player provides score, which computes penalty points for cards left
	 * in a player’s hand at the end of the game:
	 */
	public int score() {
		int sum = 0;

		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.getCard(i);
			int rank = card.getRank();
			if (rank == 8) {
				sum -= 20;
			} else if (rank > 10) {
				sum -= 10;
			} else {
				sum -= rank;
			}
		}
		return sum;
	}
}
