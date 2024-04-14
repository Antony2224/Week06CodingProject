package Week06CodingAssignment;
import java.util.List;

public class App{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		deck.shuffle();		
		
		for(int i = 0; i <26; i++) {
			player2.draw(deck);
			player1.draw(deck);
		}
		
		for(int i =0; i< 26; i++) {
			Card p1C = player1.flip();
			Card p2C = player2.flip();
			if(p1C.getValue()> p2C.getValue()) {
				p1C.describe(p1C);
				p2C.describe(p2C);
				System.out.println("Player 1 wins a point");
				player1.incrementScore();
			}
			else if(p1C.getValue()< p2C.getValue()) {
				p1C.describe(p1C);
				p2C.describe(p2C);
				System.out.println("Player2 wins a point");
				player2.incrementScore();
			}
			else {
				p1C.describe(p1C);
				p2C.describe(p2C);
				System.out.println("It's a tie!");
			}
		}
		System.out.println(player1.getScore());
		System.out.println(player2.getScore());
		if(player1.getScore() < player2.getScore()) {
			System.out.println("Player2 Wins!");
		}
		else if(player1.getScore() > player2.getScore()) {
			System.out.println("Player1 Wins!");
		}
		else {
			System.out.println("Draw");
		}
	}	
}
