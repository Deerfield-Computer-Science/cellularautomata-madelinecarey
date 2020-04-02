import java.awt.Color;
import java.util.ArrayList;

public class Rabbit extends Plant {

	public Rabbit(Location loc, World w) {
		super(loc, w);
		myLifeSpan = 10;
	}

	@Override
	public void reproduce() {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		myWorld.getCreatureList().add(new Rabbit(new Location(newX,newY), myWorld));		
	}

	
}
