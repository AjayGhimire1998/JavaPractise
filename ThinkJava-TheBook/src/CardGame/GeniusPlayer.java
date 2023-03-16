package CardGame;

import java.util.ArrayList;

public class GeniusPlayer extends Player {

	GeniusPlayer(String name) {
		super(name);
	}

	@Override
	public Card play(Eights eights, Card prev) {
		ArrayList<Card> playableCards = getPlayableCards(prev);

		ArrayList<Card> matchingSuitCards = new ArrayList<>();

		// prioritize playing cards that match the previous card's suit
		for (Card card : playableCards) {
			if (card.getSuit() == prev.getSuit()) {
				matchingSuitCards.add(card);
			}
		}

		if (!matchingSuitCards.isEmpty()) {
			Card highRankedMatchingSuitCard = getHighRankedCard(matchingSuitCards);
			matchingSuitCards.remove(highRankedMatchingSuitCard);
			return highRankedMatchingSuitCard;
		}

		// play an eight if available
		for (Card card : playableCards) {

			if (card.getRank() == 8) {
				playableCards.remove(card);
				return card;
			}
		}

		Card highestRankingCard = getHighRankedCard(playableCards);
		playableCards.remove(highestRankingCard);
		return highestRankingCard;
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
