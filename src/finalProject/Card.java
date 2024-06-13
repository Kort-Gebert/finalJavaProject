package finalProject;

public class Card {
//field variables	
	private String cardName;
	private String suitName;
	private int value;

//Card Constructor	
	public Card(String cardName, String suitName, int value) {
		this.cardName = cardName;
		this.suitName = suitName;
		this.value = value;
	}

//Method to display a card	
	public void displayCard() {
		System.out.println(cardName + " of " + suitName + " -- " + value);
	}

//Getters and Setters	
	public void SetCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardName() {
		return cardName;
	}

	public void setSuitName(String suitName) {
		this.suitName = suitName;
	}

	public String getSuitName() {
		return suitName;
	}

	public void SetValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
