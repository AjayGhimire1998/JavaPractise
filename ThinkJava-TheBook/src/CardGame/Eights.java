package CardGame;

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
 */
public class Eights {

	public Card draw() {
		Card card = new Card(1, 2);
		return card;
	}
}
