package CardGame;

import java.util.Scanner;

/**
 * In this section we present bottom-up development, which goes the other way
 * around: first we identify simple pieces we need, then we assemble them into
 * more complex algorithms. Looking at the rules of Crazy Eights, we can
 * identify some methods we’ll need:
 * 
 * • Create the deck, the discard and draw piles, and the player objects.
 * 
 * • Deal the cards.
 * 
 * • Check whether the game is over.
 * 
 * • If the draw pile is empty, shuffle the discard pile and move the cards into
 * the draw pile.
 * 
 * • Draw a card.
 * 
 * • Keep track of whose turn it is and switch from one player to the next.
 * 
 * • Display the state of the game.
 * 
 * • Wait for the user before running the next turn.
 * 
 * Now we can start implementing the pieces. Here is the beginning of the class
 * defini‐ tion for Eights, which encapsulates the state of the game:
 * 
 * 
 * In this version, there are always two players. One of the exercises at the
 * end of the chapter asks you to modify this code to handle more players.
 *
 *
 * The last instance variable is a Scanner that we’ll use to prompt the user
 * after each move. Here’s a constructor that initializes the instance variables
 * and deals the cards:
 */
public class Eights {
	public static void main(String[] args) {
		Eights eights = new Eights();
		eights.playGame();
	}

	private Player one;
	private Player two;
	private Hand drawPile;
	private Hand discardPile;
	private Scanner in;

	Eights() {
		CardDeck deck = new CardDeck("Deck");
		deck.shuffle();

		int handSize = 5;
		one = new Player("Ajay");
		deck.deal(one.getHand(), handSize);

		two = new Player("Sia");
		deck.deal(two.getHand(), handSize);

		discardPile = new Hand("Discards");
		deck.deal(discardPile, 1);

		drawPile = new Hand("Draw Pile");
		deck.dealAll(drawPile);

		in = new Scanner(System.in);

	}

	/*
	 * The next piece we’ll need is a method that checks whether the game is over.
	 * If either hand is empty, we’re done:
	 */
	public boolean isDone() {
		return one.getHand().empty() || two.getHand().empty();
	}

	/*
	 * When the draw pile is empty, we have to shuffle the discard pile. Here is a
	 * method for that:
	 * 
	 * The first line saves the top card from discardPile. The next line transfers
	 * the rest of the cards to drawPile. Then we put the saved card back into
	 * discardPile and shuffle drawPile.
	 */
	public void reShuffle() {
		Card prev = discardPile.popCard();
		discardPile.dealAll(drawPile);
		discardPile.addCard(prev);
		drawPile.shuffle();
	}

	/*
	 * Now we can use reshuffle as part of draw:
	 */
	public Card draw() {
		if (drawPile.empty()) {
			reShuffle();
		}
		return drawPile.popCard();
	}

	/*
	 * We can switch from one player to the next like this:
	 * 
	 * The nextPlayer method takes the current player as a parameter and returns the
	 * player who should go next
	 */
	public Player nextPlayer(Player current) {
		if (current == one) {
			return two;
		} else {
			return one;
		}
	}

	/*
	 * Displays the state of the game.
	 */
	public void displayState() {
		one.display();
		two.display();
		discardPile.display();
		System.out.println("Draw Pile: ");
		System.out.println(drawPile.size() + " cards");
	}

	/*
	 * Waits for the user to press enter.
	 */
	public void waitForUser() {
		in.nextLine();
	}

	/*
	 * Using these pieces, we can write takeTurn, which executes one player’s turn:
	 * 
	 * takeTurn reads the top card off the discard pile and passes it to
	 * player.play, which we saw in the previous section. The result is the card the
	 * player chose, which is added to the discard pile.
	 */
	public void takeTurn(Player player) {
		Card prev = discardPile.last();
		Card next = player.play(this, prev);
		discardPile.addCard(next);

		System.out.println(player.getName() + " plays " + next);
		System.out.println();
	}

	public void playGame() {
		Player player = one;

		// keep playing until there's a winner
		while (!isDone()) {
			displayState();
			waitForUser();
			takeTurn(player);
			player = nextPlayer(player);
		}

		// display the final score
		one.displayScore();
		two.displayScore();
	}

}
