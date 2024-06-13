package finalProject;

import java.util.ArrayList;
import java.util.List;

public class App  {

	public static void main(String[] args) {
	//Instantiation of Deck and Players
	List<Card> hand1 = new ArrayList<Card>();
	List<Card> hand2 = new ArrayList<Card>();
	Deck deck = new Deck();
	Player player1 = new Player(hand1, "Tom", 0);
	Player player2 = new Player(hand2, "Sam", 0);
	deck.shuffle();
	//Draw Phase
	for (int i = 1; i <= 52; i++) {
		if (i % 2 == 0) {
			player1.draw(deck);
		}else{
			player2.draw(deck);
	} 
	}	
	player1.displayPlayer();
	System.out.println("-----------------------------------");
	player2.displayPlayer();
	System.out.println("All cards have been drawn");
	System.out.println(hand1.size());
	System.out.println(hand2.size());
	
	for (int j = 0; j < 26; j++) {
	
		if (player1.flip().getValue() < player2.flip().getValue()) {
			player1.increaseScore();
			System.out.println("----------------------------------------------------");
			System.out.println("Player1 Wins The Round!");
			System.out.println("Player1's Score: " + player1.getScore() + " /Player2's Score: " + player2.getScore());
			System.out.println("Player1's Card:");
			player1.flip().displayCard();
			System.out.println("Player2's Card:");
			player2.flip().displayCard();
			System.out.println("----------------------------------------------------");
		} else if (player1.flip().getValue() > player2.flip().getValue()) {
			player2.increaseScore();
			System.out.println("----------------------------------------------------");
			System.out.println("Player2 Wins The Round!");
			System.out.println("Player1's Score: " + player1.getScore() + " /Player2's Score: " + player2.getScore());
			System.out.println("Player1's Card:");
			 player1.flip().displayCard();
			 System.out.println("Player2's Card:");
			 player2.flip().displayCard();
			System.out.println("----------------------------------------------------");
		 } else {
		     System.out.println("----------------------------------------------------");
			 System.out.println("Draw");
			 System.out.println("Player1's Score: " + player1.getScore() + " /Player2's Score: " + player2.getScore());
			 System.out.println("Player1's Card:");
			 player1.flip().displayCard();
			 System.out.println("Player2's Card:");
			 player2.flip().displayCard();
			 System.out.println("----------------------------------------------------");
		 }
	}
	
	if (player1.getScore() > player2.getScore()) {
		System.out.println("----------------------------------------------------");
		System.out.println("Player1's Final Score: " + player1.getScore() + " /Player2's Final Score: " + player2.getScore());
		System.out.println("Player1 Wins The Game!");
		System.out.println("----------------------------------------------------");
	} else if (player2.getScore() > player1.getScore()) {
		System.out.println("----------------------------------------------------");
		System.out.println("Player1's Final Score: " + player1.getScore() + " /Player2's Final Score: " + player2.getScore());
		System.out.println("Player2 Wins The Game!");
		System.out.println("----------------------------------------------------");
	} else {
		System.out.println("----------------------------------------------------");
		System.out.println("This Game Is A Draw!");
		System.out.println("----------------------------------------------------");
	}
	
	
	
	}	
	}

	
