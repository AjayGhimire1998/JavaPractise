package CardGame;

public class Deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		deck.print();
	}

	private Card[] cards;

	Deck(int n) {
		this.cards = new Card[n];
	}

	Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				this.cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}

	public void print() {
		for (int i = 0; i < this.cards.length; i++) {
			System.out.println(this.cards[i]);
		}
	}

}
