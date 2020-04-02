import java.awt.Color;
import java.util.ArrayList;

public class Flower extends Plant {

	public Flower(Location loc, World w) {
		super(loc, w);
		myLifeSpan = 4;
	}

	@Override
	public void reproduce() {
		int newX = (int)(Math.random()*20);
		int newY = (int)(Math.random()*20); 
		myWorld.getCreatureList().add(new Flower(new Location(newX,newY), myWorld));		
	}

	
}
