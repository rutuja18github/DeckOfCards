package com.deckofcard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);
	public static void main(String[] args) {
		logger.info("Welcome To Deck Of Cards Game");
		DeckOfCards deckCards = new DeckOfCards();
		deckCards.cardDeck();
	}
}
