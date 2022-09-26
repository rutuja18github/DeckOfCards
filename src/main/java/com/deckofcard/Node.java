package com.deckofcard;

public class Node {
	String key;
    Node next;

    // constructor to create a new linked list node
    public Node(String decks) {
        this.key = decks;
        this.next = null;
    }
}
