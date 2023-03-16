package CardGame;

public class CardDeck extends CardCollection {

	public static void main(String[] args) {
		CardDeck deck = new CardDeck("Deck");
		System.out.println(deck.cards);
	}

	/**
	 * The first line of the constructor uses something new, super, which is a
	 * keyword that refers to the superclass of the current class. When super is
	 * used like a method, as in this example, it invokes the constructor of the
	 * superclass.
	 * 
	 * So in this case, super invokes the CardCollection constructor, which
	 * initializes the attributes label and cards. When it returns, the Deck
	 * constructor resumes and pop‐ ulates the (empty) ArrayList with Card objects.
	 * 
	 */
	CardDeck(String label) {
		super(label);

		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards.add(new Card(rank, suit));
			}

		}
	}
}
