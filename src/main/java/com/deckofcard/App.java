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
		DeckOfCards deckOfCard = new DeckOfCards(); // class object
		deckOfCard.cardDeck();
		deckOfCard.shuffle();
		
		Queue player1 = new Queue();
		Queue player2 = new Queue();
		Queue player3 = new Queue();
		Queue player4 = new Queue();
		deckOfCard.allotCards(player1);
		deckOfCard.allotCards(player2);
		deckOfCard.allotCards(player3);
		deckOfCard.allotCards(player4);
		deckOfCard.printPlayersCard(player1);
		deckOfCard.printPlayersCard(player2);
		deckOfCard.printPlayersCard(player3);
		deckOfCard.printPlayersCard(player4);

	}
}
