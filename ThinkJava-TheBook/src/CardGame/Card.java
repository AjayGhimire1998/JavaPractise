package CardGame;

import java.util.Arrays;

public class Card {

	public static void main(String[] args) {
		Card card = new Card(11, 1);
		Card card2 = new Card(12, 1);
		Card card3 = new Card(2, 1);
		Card card4 = new Card(4, 1);
		Card card5 = new Card(6, 1);

		Card[] cards = { card, card2, card3, card4, card5 };
//		System.out.println(card);
		System.out.println(Arrays.toString(makeDeck()));

		printDeck(makeDeck());
		int indexOfSeacrhedCard = search(makeDeck(), card);
		System.out.println(indexOfSeacrhedCard);

		int indexOfBinarySeacrh = binarySearch(makeDeck(), card);
		System.out.println(indexOfBinarySeacrh);
		System.out.println(recursiveBinarySearch(makeDeck(), card, 2, 52));

		System.out.printf("%d practise methods result", binarySearchPractise(makeDeck(), card));
		System.out.println();
		System.out.printf("%d practise two methods result", recursiveBinarySearchPractise(makeDeck(), card, 2, 52));

		System.out.println();
		System.out.println(Arrays.toString(suitHist(cards)));
		System.out.println(hasFlush(cards));

	}

	/*
	 * The instance variables are private: we can access them from inside this
	 * class, but not from other classes.
	 * 
	 * That’s easy enough, but it is not foolproof, because some fool might come
	 * along later and add a modifier. We can prevent that possibility by declaring
	 * the instance variables final:
	 */

	private final int rank;
	private final int suit;

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

	public int getSuit() {
		return this.suit;
	}

	public int getRank() {
		return this.rank;
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
	 * 
	 * In some card games, Aces are ranked higher than Kings. Modify the compareTo
	 * method to implement this ordering.
	 */
	public int compareTo(Card card) {
		if (this.suit < card.suit) {
			return -1;
		} else if (this.suit > card.suit) {
			return 1;
		} else {
			if (this.rank == 1 && card.rank != 1) {
				return 1;
			} else if (this.rank != 1 && card.rank == 1) {
				return -1;
			} else if (this.rank < card.rank) {
				return -1;
			} else if (this.rank > card.rank) {
				return 1;
			}
			return 0;
		}

	}

	/*
	 * The outer loop iterates suits from 0 to 3. For each suit, the inner loop
	 * iterates ranks from 1 to 13. Since the outer loop runs 4 times, and the inner
	 * loop runs 13 times for each suit, the body is executed 52 times.
	 * 
	 */
	public static Card[] makeDeck() {
		Card[] cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit < SUITS.length; suit++) {
			for (int rank = 1; rank < RANKS.length; rank++) {

				cards[index] = new Card(rank, suit);
				index++;
			}
		}
		return cards;
	}

	/*
	 * Since cards has type Card[], an element of cards has type Card. So println
	 * invokes the toString method in the Card class. This method is similar to
	 * invoking System.out.println(Arrays.toString(cards)).
	 * 
	 */
	public static void printDeck(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i]);
		}
	}

	/*
	 * The next method we’ll write is search, which takes an array of cards and a
	 * Card object as parameters. It returns the index where the Card appears in the
	 * array, or -1 if it doesn’t. This version of search uses the algorithm we saw
	 * in “Array Traversal” on page 107, which is called sequential search:
	 * 
	 */
	public static int search(Card[] cards, Card target) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * When you look for a word in a dictionary, you don’t just search page by page
	 * from front to back. Since the words are in alphabetical order, you probably
	 * use a binary search algorithm:
	 * 
	 * 
	 * 1. Start on a page near the middle of the dictionary. 2. Compare a word on
	 * the page to the word you are looking for. If you find it, stop.
	 * 
	 * 3. If the word * on the page comes before the word you are looking for, flip
	 * to some‐ where later in the dictionary and go to step 2.
	 * 
	 * 4. If the word on the page comes after the word you are looking for, flip to
	 * some‐ where earlier in the dictionary and go to step 2.
	 * 
	 * If you find two adjacent words on the page and your word comes between them,
	 * you can conclude that your word is not in the dictionary.
	 * 
	 * First, we declare low and high variables to represent the range we are
	 * searching. Ini‐ tially we search the entire array, from 0 to length - 1.
	 * 
	 * Inside the while loop, we repeat the four steps of binary search:
	 * 
	 * 1. Choose an index between low and high—call it mid—and compare the card at
	 * mid to the target.
	 * 
	 * 2. If you found the target, return the index.
	 * 
	 * 3. If the card at mid is lower than the target, search the range from mid + 1
	 * to high.
	 * 
	 * 4. If the card at mid is higher than the target, search the range from low to
	 * mid - 1.
	 * 
	 * If low exceeds high, there are no cards in the range, so we break out of the
	 * loop and return -1. Notice that this algorithm depends on the compareTo
	 * method of the object.
	 */
	public static int binarySearch(Card[] cards, Card target) {

		int low = 0;
		int high = cards.length - 1;

		while (low <= high) {
			System.out.println(low + ", " + high);
			int mid = (low + high) / 2;
			System.out.println(mid);
			int comp = cards[mid].compareTo(target);

			if (comp == 0) {
				return mid;
			} else if (comp < 0) {
				low = mid + 1;
				System.out.println("new low: " + low);
			} else {
				high = mid - 1;
				System.out.println("new high: " + high);
			}
		}
		System.out.println("Hello");
		return -1;
	}

	public static int binarySearchPractise(Card[] cards, Card target) {
		int low = 0;
		int high = cards.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int comp = cards[mid].compareTo(target);
			if (comp == 0) {
				return mid;
			} else if (comp < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	/*
	 * Instead of a while loop, we have an if statement to terminate the recursion.
	 * If high is less than low, there are no cards between them, and we conclude
	 * that the card is not in the array.
	 * 
	 * Two common errors in recursive programs are (1) forgetting to include a base
	 * case, and (2) writing the recursive call so that the base case is never
	 * reached. Either error causes infinite recursion and a StackOverflowException.
	 * 
	 */
	public static int recursiveBinarySearch(Card[] cards, Card target, int low, int high) {
		if (high < low) {
			return -1;
		}
		int mid = (low + high) / 2;
		int comp = cards[mid].compareTo(target);

		if (comp == 0) {
			return mid;
		} else if (comp < 0) {
			return recursiveBinarySearch(cards, target, mid + 1, high);
		} else {
			return recursiveBinarySearch(cards, target, low, mid - 1);
		}
	}

	public static int recursiveBinarySearchPractise(Card[] cards, Card target, int low, int high) {

		if (high < low) {
			return -1;
		}

		int mid = (low + high) / 2;
		int comp = cards[mid].compareTo(target);

		if (comp == 0) {
			return mid;
		} else if (comp < 0) {
			return recursiveBinarySearchPractise(cards, target, mid + 1, high);
		} else {
			return recursiveBinarySearchPractise(cards, target, low, mid - 1);
		}
	}

	/*
	 * In Poker a “flush” is a hand that contains five or more cards of the same
	 * suit. A hand can contain any number of cards.
	 * 
	 * 1. Write a method called suitHist that takes an array of cards as a parameter
	 * and that returns a histogram of the suits in the hand. Your solution should
	 * only tra‐ verse the array once.
	 */
	public static int[] suitHist(Card[] cards) {
		int[] hist = new int[SUITS.length];

		for (int i = 0; i < cards.length; i++) {
			hist[cards[i].suit]++;

		}
		return hist;

	}

	/*
	 * Write a method called hasFlush that takes an array of cards as a parameter
	 * and returns true if the hand contains a flush (and false otherwise).
	 * 
	 */
	public static boolean hasFlush(Card[] cards) {
		int[] hist = suitHist(cards);
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] >= 5) {
				return true;
			}
		}
		return false;
	}
}
