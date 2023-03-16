package CardGame;

/*
 * That’s it for the Deck class. Next we need a way to represent a hand, which
 * is the col‐ lection of cards held by a player, and a pile, which is a
 * collection of cards on the table. We could define two classes, one for hands
 * and one for piles, but there is not much difference between them. So we’ll
 * use one class, called Hand, for both hands and piles. Here’s what the
 * definition looks like:
 *
 */
public class Hand extends CardCollection {

	public static void main(String[] args) {

		CardDeck deck = new CardDeck("Deck");
		deck.shuffle();
		Hand hand = new Hand("Hand");
		deck.deal(hand, 5);
		hand.display();

		Hand drawPile = new Hand("Draw Pile");
		deck.dealAll(drawPile);
		System.out.printf("Draw Pile has %d cards.\n", drawPile.size());
	}

	/*
	 * Like Deck, Hand extends CardCollection, so it inherits methods like getLabel,
	 * size, and getCard, which are used in display. Hand also provides a
	 * constructor, which invokes the constructor of CardCollection (and nothing
	 * else).
	 * 
	 * In summary, a Deck is just like a CardCollection, but it provides a different
	 * con‐ structor. And a Hand is just like a CardCollection, but it provides an
	 * additional method, display.
	 * 
	 */
	Hand(String label) {
		super(label);
	}

	public void display() {

		System.out.println(getLabel() + ": ");
		for (int i = 0; i < size(); i++) {
			System.out.println(getCard(i));
		}
		System.out.println();
	}
}
