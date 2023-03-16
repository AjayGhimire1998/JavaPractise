package CardGame;

import java.util.ArrayList;

/*
 *To implement this game, we need to represent a deck of cards, a discard pile, a draw
  pile, and a hand for each player. And we need to be able to deal, draw, and discard
  cards.
  
  The Deck class from the previous chapter meets some of these requirements, but
  there are two problems:
  
  1. Hands and piles have different sizes, and their sizes change as the game pro‐
  gresses. Our implementation of Deck uses a Card array, and the size of an array
  can’t change.
  
  2. It’s not clear that a Deck object is the right way to represent hands and piles. We
  might want new classes for other collections of cards.
  
  We can solve the first problem by replacing the Card array with an ArrayList, which
  is in the java.util package. An ArrayList is a collection, which is an object that
  contains other objects.
  
  The Java library provides a variety of collections. For our purposes, ArrayList is a
  good choice because it provides methods to add and remove elements, and it grows
  and shrinks automatically.
  
  To solve the second problem, we can use a language feature called inheritance. We’ll
  define a new class, CardCollection, to represent a collection of cards. Then we’ll
  define Deck and Hand as subclasses of CardCollection.
  
  A subclass is a new class that “extends” an existing class; that is, it has the attributes
  and methods of the existing class, plus more. We’ll see the details soon, but let’s start
  with CardCollection:
 */
public class CardCollection {

	public static void main(String[] args) {

	}

	/*
	 * Here’s the beginning of a CardCollection class that uses ArrayList instead of
	 * a primitive array:
	 * 
	 * When you declare an ArrayList, you specify the type it contains in angle
	 * brackets (<>). This declaration says that cards is not just an ArrayList,
	 * it’s an ArrayList of Card objects.
	 * 
	 * The constructor takes a string as an argument and assigns it to an instance
	 * variable, label. It also initializes cards with an empty ArrayList.
	 */

	private String label;
	private ArrayList<Card> cards;

	public CardCollection(String label) {
		this.label = label;
		this.cards = new ArrayList<Card>();
	}

	/*
	 * ArrayList provides a method, add, that adds an element to the collection. We
	 * will write a CardCollection method that does the same thing:
	 * 
	 * Until now, we have used this explicitly to make it easy to identify
	 * attributes. Inside addCard and other instance methods, you can access
	 * instance variables without using the keyword this. So from here on, we will
	 * drop it:
	 */
	public void addCard(Card card) {
		cards.add(card);
	}

	/*
	 * We also need to be able to remove cards from a collection. The following
	 * method takes an index, removes the card at that location, and shifts the
	 * following cards left to fill the gap:
	 */
	public Card popCard(int i) {
		return cards.remove(i);
	}

	/*
	 * If we are dealing cards from a shuffled deck, we don’t care which card gets
	 * removed. It is most efficient to choose the last one, so we don’t have to
	 * shift any following cards. Here is an overloaded version of popCard that
	 * removes and returns the last card:
	 * 
	 */
	public Card popCard() {
		return popCard(size() - 1);
	}

	/*
	 * Notice that popCard uses CardCollection’s own size method, which in turn
	 * calls the ArrayList’s size method:
	 */
	public int size() {
		return cards.size();
	}

	/*
	 * For convenience, CardCollection also provides an empty method that returns
	 * true when size is zero:
	 */
	public boolean empty() {
		return cards.size() == 0;
	}

}
