package pokemonGame;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Deck {
	
	
	
	public static void Draw_from_deck(String args[]){
		
		/* READ IN TEXT FILE HERE, WE'LL CALL IT "cards" */
		LinkedList <String> card_list = new LinkedList<String>();
		
		/*Shuffles the list*/
		Collections.shuffle(card_list);
		
		/*Adds all cards to the card_list*/
		for (int i = 0; i < cards; i++) {
			card_list.add (new Integer (cards[i]));
		}
		
		/*Same as a queue*/
		while (!card_list.isEmpty())
			System.out.println(card_list.removeFirst());
		System.out.println();
	}
}
