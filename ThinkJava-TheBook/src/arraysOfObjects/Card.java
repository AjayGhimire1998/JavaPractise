package arraysOfObjects;

public class Card {

	public static void main(String[] args) {
		Card card = new Card(11, 1);
		System.out.println(card);
	}

	/*
	 * The instance variables are private: we can access them from inside this
	 * class, but not from other classes.
	 */

	private int rank;
	private int suit;

	/*
	 * Local variables are created when a method is invoked, and their space is
	 * reclaimed when the method ends. Instance variables are created when you
	 * construct an object and reclaimed when the object is garbage-collected.
	 * 
	 * Now it’s time to learn about class variables. Like instance variables, class
	 * variables are defined in a class definition, before the method definitions.
	 * But they are identified by the keyword static. They are created when the
	 * program begins (or when the class is used for the first time) and survive
	 * until the program ends. Class variables are shared across all instances of
	 * the class.
	 * 
	 * Class variables are often used to store constant values that are needed in
	 * several places. In that case, they should also be defined as final. Note that
	 * whether a variable is static or final involves two separate considerations:
	 * static means the variable is shared, and final means the variable is
	 * constant.
	 * 
	 * One advantage of defining SUITS and RANKS as class variables is that they
	 * don’t need to be created (and garbage-collected) every time toString is
	 * called. They may also be needed in other methods and classes, so it’s helpful
	 * to make them available every‐ where. Since the array variables are final, and
	 * the strings they reference are immuta‐ ble, there is no danger in making them
	 * public.
	 */
	public static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
	public static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };

	// contructor
	Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	/*
	 * To display Card objects in a way that humans can read easily, we need to map
	 * the integer codes onto words. A natural way to do that is with an array of
	 * Strings.
	 */
	public String toString() {
		return String.format("%s of %s", RANKS[this.rank], SUITS[this.suit]);

	}

	/*
	 * It would also be nice to have a method for comparing cards, so we can tell if
	 * one is higher or lower than another. For primitive types, we can use the
	 * comparison opera‐ tors—<, >, etc.—to compare values. But these operators
	 * don’t work for object types.
	 */
	public boolean equals(Card card) {
		return this.rank == card.rank && this.suit == card.suit;
	}

	/*
	 * To make cards comparable, we have to decide which is more important: rank or
	 * suit. The choice is arbitrary, and it might be different for different games.
	 * But when you buy a new deck of cards, it comes sorted with all the Clubs
	 * together, followed by all the Diamonds, and so on. So for now, let’s say that
	 * suit is more important.
	 * 
	 * compareTo returns 1 if this wins, -1 if that wins, and 0 if they are
	 * equivalent. It com‐ pares suits first. If the suits are the same, it compares
	 * ranks. If the ranks are also the same, it returns 0.
	 */
	public int compareTo(Card card) {
		if (this.suit < card.suit) {
			return -1;
		}
		if (this.suit > card.suit) {
			return 1;
		}
		if (this.rank < card.rank) {
			return -1;
		}
		if (this.rank > card.rank) {
			return 1;
		}
		return 0;
	}
}
