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
			for(int i = 1; i > 7; i++){
				if(myField.getBench()[i] == null){
					myField.getBench()[i] = myField.getHand().get(slot);
					myField.getHand().remove(slot);
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("There are no spots open on your bench.");
		}
	}

	public void benchToArena(int slot){
		Card[] myBench = myField.getBench();
		myBench[0] = myBench[slot];
		myBench[slot] = null;
	}
	
}
