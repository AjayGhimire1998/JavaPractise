package CardGame;

import java.util.Random;

public class Deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
//		deck.print();
//		deck.swapCards(0, 1);
		deck.print();
		System.out.println();
		deck.shuffle();
		deck.print();
		System.out.println(deck.cards.length);

//		System.out.println(randomInt(2, 9));
//		System.out.println(randomInt(1, 3));
	}

	private Card[] cards;
	private static final Random rand = new Random();

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

	public Card[] getCards() {
		return this.cards;
	}

	/*
	 * When you transform a static method into an instance method, it usually gets
	 * shorter. We can simply type deck.print() to invoke the instance method.
	 * 
	 */
	public void print() {
		for (int i = 0; i < this.cards.length; i++) {
			System.out.println(this.cards[i]);
		}
	}

	/*
	 * Add a Deck method called randomInt that takes two integers, low and high, and
	 * returns a random integer between low and high, including both. You can use
	 * the nextInt provided by java.util.Random, which we saw in “Random Numbers” on
	 * page 108. But you should avoid creating a Random object every time random Int
	 * is invoked.
	 */
	public static int randomInt(int low, int high) {
		return rand.nextInt(high - low + 1) + low;
	}

	/*
	 * Write a method called swapCards that takes two indexes and swaps the cards at
	 * the given locations.
	 */
	public void swapCards(int lowIndex, int highIndex) {
		Card temp = this.cards[lowIndex];
		this.cards[lowIndex] = this.cards[highIndex];
		this.cards[highIndex] = temp;
	}

	/*
	 * Write a method called shuffle that uses the algorithm in “Shuffling Decks” on
	 * page 176.
	 * 
	 */
	public void shuffle() {
		for (int i = 0; i < this.cards.length; i++) {
			int randomIndex = randomInt(i, this.cards.length - 1);
			swapCards(i, randomIndex);
		}
	}

}
