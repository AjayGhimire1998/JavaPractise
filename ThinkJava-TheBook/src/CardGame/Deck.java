package CardGame;

import java.util.Random;

public class Deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Deck deck = new Deck();
//		deck.shuffle();
//		deck.print();
//		deck.swapCards(0, 1);
//		Deck subDeck = deck.subdeck(0, 9);
//		subDeck.selectionSort();
//		subDeck.print();
//		System.out.println(deck.lowIndexWithoutParams());
//		System.out.println();

		Deck deck2 = new Deck();

//		deck2.print();
		deck2.shuffle();
		deck2.selectionSortPractise();
		deck2.print();
		System.out.println(deck2.indexLowestPractise(0, 5));
//		Deck subDeck2 = deck2.subdeck(0, 9);
//		subDeck2.selectionSort();
//		subDeck2.print();
//		System.out.println();
		System.out.println();
//		deck2.almostMergeSortRecursively().print();
//		deck2.almostMergeSort().print();
//		deck2.print();
//		System.out.println(deck2.toString());
//		deck.selectionSort();
//		deck.print();
//		System.out.println(deck.lowIndexWithoutParams());
//		System.out.println(deck.cards.length);
//		System.out.println(deck.cards.length);

//		System.out.println(randomInt(2, 9));
//		System.out.println(randomInt(1, 3));

//		System.out.println(deck.indexLowest(49, 51));

//		Deck mergedDeck = merge(subDeck, subDeck2);
//		mergedDeck.print();
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

	/*
	 * Write a method called indexLowest that uses the compareCard method to find
	 * the lowest card in a given range of the deck (from lowIndex to highIndex,
	 * including both).
	 * 
	 */
	public int indexLowest(int lowIndex, int highIndex) {
		int lowestIndex = lowIndex;
		for (int i = lowIndex + 1; i <= highIndex; i++) {
			if (this.cards[lowestIndex].compareTo(this.cards[i]) > 0) {
				lowestIndex = i;
			}
		}
//		System.out.println("Lowest card: " + this.cards[lowestIndex]);
		return lowestIndex;
	}

	public int indexLowestPractise(int lowIndex, int highIndex) {
		int result = lowIndex;

		for (int i = result + 1; i <= highIndex; i++) {
			if (this.cards[i].compareTo(this.cards[result]) < 0) {
				result = i;
			}
		}
		return result;
	}

	public int lowIndexWithoutParams() {
		int lowIndex = 0;
		for (int i = 1; i < this.cards.length; i++) {
			if (this.cards[lowIndex].compareTo(this.cards[i]) > 0) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}

	/*
	 * Write a method called selectionSort that implements the selection sort algo‐
	 * rithm in “Selection Sort” on page 177.
	 * 
	 */
	public void selectionSort() {

//		for (int i = 0; i < this.cards.length; i++) {
//			int lowIndex = indexLowest(i, this.cards.length - 1);
//			if (lowIndex != i) {
//				Card temp = this.cards[i];
//				this.cards[i] = this.cards[lowIndex];
//				this.cards[lowIndex] = temp;
//			}
//		}

		for (int i = 0; i < this.cards.length - 1; i++) {
			int lowIndex = i;
			for (int j = i + 1; j < this.cards.length; j++) {
				if (this.cards[lowIndex].compareTo(this.cards[j]) > 0) {
					lowIndex = j;
				}
			}
			Card temp = this.cards[i];
			this.cards[i] = this.cards[lowIndex];
			this.cards[lowIndex] = temp;

		}

	}

	public void selectionSortPractise() {

		for (int i = 0; i < this.cards.length - 1; i++) {
			int lowIndex = i;
			for (int j = i + 1; j < this.cards.length; j++) {
				if (this.cards[lowIndex].compareTo(this.cards[j]) > 0) {
					lowIndex = j;
				}
			}
			Card temp = this.cards[i];
			this.cards[i] = this.cards[lowIndex];
			this.cards[lowIndex] = temp;

		}
	}

	/*
	 * The first line creates an unpopulated subdeck. Inside the for loop, the
	 * subdeck gets populated with copies of references from the deck.
	 * 
	 * The length of the subdeck is high - low + 1, because both the low card and
	 * the high card are included. This sort of computation can be confusing, and
	 * forgetting the + 1 often leads to “off-by-one” errors. Drawing a picture is
	 * usually the best way to avoid them.
	 * 
	 */
	public Deck subdeck(int low, int high) {
		Deck sub = new Deck(high - low + 1);
		for (int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}

	/*
	 * 
	 * The next helper method we need is merge, which takes two sorted subdecks and
	 * returns a new deck containing all cards from both decks, in order. Here’s
	 * what the algorithm looks like in pseudocode, assuming the subdecks are named
	 * d1 and d2:
	 * 
	 * public static Deck merge(Deck d1, Deck d2) { // create a new deck big enough
	 * for all the cards // use the index i to keep track of where we are at in //
	 * the first deck, and the index j for the second deck int i = 0; int j = 0; //
	 * the index k traverses the result deck for (int k = 0; k <
	 * result.cards.length; k++) { // if d1 is empty, d2 wins // if d2 is empty, d1
	 * wins // otherwise, compare the two cards // add the winner to the new deck at
	 * position k // increment either i or j } // return the new deck }
	 * 
	 */
	public static Deck merge(Deck deck1, Deck deck2) {
		Deck result = new Deck(deck1.cards.length + deck2.cards.length);

		int i = 0;
		int j = 0;
		int k = 0;

		while (k < result.cards.length) {
			if (i >= deck1.cards.length) {
				result.cards[k] = deck2.cards[j];
				j++;
			} else if (j >= deck2.cards.length) {
				result.cards[k] = deck1.cards[i];
				i++;
			} else if (deck1.cards[i].compareTo(deck2.cards[j]) < 0) {
				result.cards[k] = deck1.cards[i];
				i++;
			} else {
				result.cards[k] = deck2.cards[j];
				j++;
			}
			k++;
		}
		return result;

	}

	/*
	 * Write the simple version of mergeSort, the one that divides the deck in half,
	 * uses selectionSort to sort the two halves, and uses merge to create a new,
	 * sorted deck.
	 */
	public Deck almostMergeSort() {
		Deck d1 = this.subdeck(0, this.cards.length / 2 - 1);
		Deck d2 = this.subdeck(this.cards.length / 2, this.cards.length - 1);
		d1.selectionSort();
		d2.selectionSort();
		return merge(d1, d2);

	}

	/*
	 * The magical thing about merge sort is that it is inherently recursive.
	 * 
	 * At the point where you sort the subdecks, why should you invoke the slower
	 * algo‐ rithm, selectionSort? Why not invoke the spiffy new mergeSort you are
	 * in the pro‐ cess of writing? Not only is that a good idea, it is necessary to
	 * achieve the log2performance advantage.
	 * 
	 * To make mergeSort work recursively, you have to add a base case; otherwise it
	 * repeats forever. A simple base case is a subdeck with 0 or 1 cards. If
	 * mergeSort receives such a small subdeck, it can return it unmodified since it
	 * would already be sorted.
	 * 
	 * 
	 * Write a recursive version of mergeSort. Remember that selectionSort is a
	 * modifier and mergeSort is a pure method, which means that they get invoked
	 * differently:
	 */
	public Deck almostMergeSortRecursively() {
		if (this.cards.length <= 1) {
			return this;
		} else {
			int mid = this.cards.length / 2;
			Deck d1 = this.subdeck(0, mid - 1);
			Deck d2 = this.subdeck(mid, this.cards.length - 1);
			d1 = d1.almostMergeSortRecursively();
			d2 = d2.almostMergeSortRecursively();
			return merge(d1, d2);
		}
	}

	/*
	 * Write a toString method for the Deck class. It should return a single string
	 * that rep‐ resents the cards in the deck. When it’s printed, this string
	 * should display the same results as the print method in “The Deck Class” on
	 * page 175.
	 * 
	 * Hint: You can use the + operator to concatenate strings, but it is not very
	 * efficient. Consider using java.util.StringBuilder; you can find the
	 * documentation by doing a web search for “Java StringBuilder”.
	 */
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Card card : this.cards) {
			result.append(card.toString()).append("\n");
		}
		return result.toString();

	}

}
