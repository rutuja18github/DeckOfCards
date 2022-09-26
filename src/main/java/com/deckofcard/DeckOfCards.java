package com.deckofcard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeckOfCards {
	private static final Logger logger = LogManager.getLogger(DeckOfCards.class);

	String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String[] deck = new String[52];

	// initialize deck
	public void cardDeck() {
		// initialize deck
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " " + SUITS[j];
				logger.info(deck[SUITS.length * i + j]);
			}
		}
	}

}