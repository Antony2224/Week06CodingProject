package Week06CodingAssignment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck{
	
	private List<Card> cards = new ArrayList<>();
	private String[] cardVaule = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"}; 
	private String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
	public Deck() {
		for(int v =0; v<= 12; v++) {
			for(int s=0; s<= 3; s++) {
				Card c =new Card();
				c.setValue(v+2);
				c.setName(cardVaule[v] + " of " + suit[s]);
				cards.add(c);
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
		 }
	public void printDeck(int num) {
		for (Card card : cards) {
			System.out.println(card);
		}
	}
}
