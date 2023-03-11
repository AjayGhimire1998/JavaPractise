package arraysOfObjects;

public class Card {

	public static void main(String[] args) {
		Card card = new Card(11, 1);
		System.out.println(card);
	}

	private int rank;
	private int suit;

	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() {
		return String.format("%s of %s", ranks[this.rank], suits[this.suit]);
	}

}
