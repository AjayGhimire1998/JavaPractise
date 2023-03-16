package CardGame;

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
