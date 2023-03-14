package CardGame;

import java.util.Random;

public class Deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Deck deck = new Deck();
//		deck.print();

		System.out.println(randomInt(2, 9));
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

	public static int randomInt(int low, int high) {
		Random rand = new Random();
		return rand.nextInt(high - low) + 2;
	}

}
