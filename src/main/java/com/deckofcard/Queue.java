package com.deckofcard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Queue {
	 private static final Logger logger = LogManager.getLogger(Queue.class);
	Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    //  to add an value to the queue.
    void enqueue(String decks) {
        //linkList node
        Node temp = new Node(decks);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front =temp;
            this.rear =temp;
            return;
        }

        // Add the new node at end of queue
        this.rear.next = temp;
        this.rear = temp;
    }
    //get players card
    void getCards() {
        if (this.front == null)
            return;
        else {
            Node temp = this.front;
            while (temp != null) {
                logger.info(temp.key);
                temp = temp.next;
            }
        }
    }

}
