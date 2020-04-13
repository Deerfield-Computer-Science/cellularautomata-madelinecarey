package prisonersDilemma;

public class saudiArabia extends oil {
	
	public saudiArabia(Location l, World w) {
		super(l, w);
		myBudget = 100;
	}
	
	public void reproduce() {
		// this is silly code really, but as an example
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		
		myWorld.getCreatureList().add(new saudiArabia(new Location(newX,newY), myWorld));
	}

}
