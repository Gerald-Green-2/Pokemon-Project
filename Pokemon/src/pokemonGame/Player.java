package pokemonGame;

public class Player {
	
	Field myField = new Field();
	
	public Player(Field field) {
		myField = field;
	}
	
	public Field getField(){
		return myField;
	}
	
	public void playFromHand(int slot){
		myHand = myField.getHand();
		myBench = myField.getBench();
		try{
			myBench.add(myHand[slot]);
			myHand.remove(slot);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("There are no spots open on your bench.");
		}
	}

	
	
}
