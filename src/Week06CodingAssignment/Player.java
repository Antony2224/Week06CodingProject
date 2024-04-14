package Week06CodingAssignment;
import java.util.ArrayList;
import java.util.List;

public class Player {
	public List<Card> hand = new ArrayList<>();
	public int Score = 0;
	public String name = "Player"; 
	
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void describe() {
		System.out.println(name);
		for(Card c : hand) {
			c.describe(c);
		}
	}
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	public Card draw(Deck cards) {
		Card cardDrawn = new Card();
		for (int i=0; i< 1; i++) {
			cardDrawn = cards.draw();
			hand.add(cardDrawn);
		}
		
		return cardDrawn;
		
	}
	public int incrementScore() {
		return Score++;
	}
	
}
