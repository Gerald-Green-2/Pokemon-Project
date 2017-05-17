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
		if(myField.getBench()[0] == null){
			myField.getBench()[0] = myField.getBench()[slot];
			myField.getBench()[slot] = null;
		}
		else{
			System.out.println("There is already a pokemon in your Arena.");
		}
	}
	
	public void arenaToBench(int slot){
		if(myField.getBench()[slot] == null){
			myField.getBench()[slot] = myField.getBench()[0];
			myField.getBench()[0] = null;
		}
		else{
			System.out.println("There is already a pokemon in your Bench at this position.");
		}
	}
	
}
