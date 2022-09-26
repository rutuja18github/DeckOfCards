package com.deckofcard;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeckOfCards {
	private static final Logger logger = LogManager.getLogger(DeckOfCards.class);

	String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String[] deck = new String[52];
	String[][] player = new String[4][13];
	int index = 0;
	int count=0;


	// initialize deck
	public void cardDeck() {
		// initialize deck
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " " + SUITS[j];
				logger.info(deck[SUITS.length * i + j]);
			}
		}
		shuffle();
	}

	// shuffle deck
	public void shuffle() {
		for (int i = 0; i < 52; i++) {
			Random ran = new Random();
			int random = ran.nextInt(52);
			String temp = deck[i];
			deck[i] = deck[random];
			deck[random] = temp;
			logger.info(deck[random]);
		}
	}
	// distribute cards to player's
		void allotCards(Queue players) {
			int count = 0;
	        for (int j = index; j < 52; j++) {
	            players.enqueue((deck[index++]));
	            count++;
	            if (count == 9) {
	                break;
	            }
	        }
		}

		// print cards of each players
		public void printPlayersCard(Queue players) {
				logger.info("Player " + (count + 1) );
					players.getCards();
					count++;
				System.out.println("\n");
		}
}