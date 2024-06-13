package finalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// field Variables
	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name = " ";

	// Player Constructor
	public Player(List<Card> hand, String name, int score) {
		this.hand = hand;
		this.score = score;
		this.name = name;
	}

//Method to display player info
	public void displayPlayer() {
		System.out.println("Player " + name + "--" + score);
		for (Card card : hand) {
			card.displayCard();
		}
	}

//Method to play and "flip" a card over
	public Card flip() {
		Card topCard = this.hand.remove(0);
		return topCard;
	}

//Method to draw from the deck
	public void draw(Deck deck) {
		Card card = deck.draw();
		this.hand.add(card);
	}

//method to increase the score of the winner
	public void increaseScore() {
		score++;
	}

	public int getScore() {
		return score;
	}
}
