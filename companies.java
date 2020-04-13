import java.awt.Color;
import java.util.ArrayList;

public abstract class companies {
			
	protected World myWorld;
	protected int myBudget;
	protected Location myLocation;
	protected Color myColor;
	protected int myAge;
	protected boolean alive;
	protected int myInfluence;
	protected String typeOfCompany;
	
	// lifeform constructors
	public companies(int myBudget, Location myLocation, Color myColor, World myWorld, int myInfluence) {
		super();
		this.myBudget = myBudget;
		this.myLocation = myLocation;
		this.myColor = myColor;
		this.myWorld = myWorld;
		this.myInfluence = myInfluence;
		alive = true;
	}
	
	public companies(Location myLocation, World myWorld) {
		super();
		this.myWorld = myWorld;
		this.myLocation = myLocation;
		alive = true;
	}
	
	/* all the basic lifeform functions
	 * 		getOlder
	 * 		reproduce
	 */
	
	// we all age the same, time clicks forward and we all age one unit of time
	public void age(int time){
		myAge+=time;
		if (myBudget<=0) {
			alive=false;
		}
	}
	
	// to be alive you have to be able to reproduce....
	public void reproduce() {
	}
	
	public boolean isDead(){
		return !alive;
	}
	
	// getter and setters (aka accessors and mutators)
	public int getMyBudget() {
		return myBudget;
	}
	
	public void setMyBudget(int myLifeSpan) {
		this.myBudget = myLifeSpan;
	}
	
	public Location getMyLocation() {
		return myLocation;
	}
	
	public void setMyLocation(Location myLocation) {
		this.myLocation = myLocation;
	}
	
	public Color getMyColor() {
		return myColor;
	}
	
	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}
	
	public int getAge() {
		return myAge;
	}

	public void setAge(int age) {
		this.myAge = age;
	}
	
	public int getMyInfluence() {
		return myInfluence;
	}
	
	public void setMyInfluence() {
		this.myInfluence = myInfluence;
	}
	
	public String getTypeOfCompany() {
		return typeOfCompany;
	}
	
	public void setTypeOfCompany() {
		this.typeOfCompany = typeOfCompany;
	}
	
	@Override
	public String toString() {
		return "LifeForm [myLifeSpan=" + myBudget + ", myLocation="
				+ myLocation + ", myColor=" + myColor + "]";
	}
}