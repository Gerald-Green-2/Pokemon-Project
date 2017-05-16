package pokemonGame;

import java.util.ArrayList;

public class Player {
	
	Field myField = new Field();
	
	public Player(Field field) {
		myField = field;
	}
	
	public Field getField(){
		return myField;
	}
	
	public void playFromHand(int slot){
		try{
			myField.getBench()[0] = myField.getHand().get(slot);
			myField.getHand().remove(slot);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("There are no spots open on your bench.");
		}
	}

	public void benchToArena(){
		Card[] myBench = myField.getBench();
		myBench.set();
	}
	
}
