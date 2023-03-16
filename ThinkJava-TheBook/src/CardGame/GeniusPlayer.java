package CardGame;

import java.util.ArrayList;

public class GeniusPlayer extends Player {

	GeniusPlayer(String name) {
		super(name);
	}

	@Override
	public Card play(Eights eights, Card prev) {

	}

	private ArrayList<Card> getPlayableCards(Card prev) {
		ArrayList<Card> playableCards = new ArrayList<>();
		for (Card card : getHand().cards) {
			if (cardMatches(card, prev)) {
				playableCards.add(card);

			}
		}
		return playableCards;
	}

	private Card getHighRankedCard(ArrayList<Card> cards) {
		Card highRankedCard = cards.get(0);
		for (Card card : cards) {
			if (card.compareTo(highRankedCard) > 0) {
				highRankedCard = card;
			}
		}
		return highRankedCard;
	}
}
