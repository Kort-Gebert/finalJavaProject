package finalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//List of cards for deck
	List<Card> cards = new ArrayList<Card>();
	//Deck constructor
public Deck() {
	 String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
	 String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven",
			      "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	 
	 for (String suit : suits) {
		 int count = 2;
		 for (String number : numbers) {
			 Card card = new Card(number, suit, count);
			 this.cards.add(card);
			 count++;
		 }
	 }	 
}
//Method to display deck 
public void displayDeck() {
	for(Card card : this.cards) {
		card.displayCard();
	}
}
//Method to draw card
public Card draw() {
	Card card = this.cards.remove(0);
	return card;
}
//Method to shuffle the deck
public void shuffle() {
	Collections.shuffle(this.cards);
}
//Getters and Setters
public void setCards(List<Card> cards) {
	this.cards = cards;
}

public List<Card> getCards() {
	return cards;
}

}
	
	

