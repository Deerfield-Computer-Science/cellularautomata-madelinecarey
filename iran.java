package cellularAutomata;

public class iran extends oil {
	
	public iran(Location l, World w) {
		super(l, w);
		myBudget = 3;
	}
	
	public void reproduce() {
		// this is silly code really, but as an example
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new iran(new Location(newX,newY), myWorld));
	}


}
