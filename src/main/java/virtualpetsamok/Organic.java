package virtualpetsamok;

public abstract class Organic extends VirtualPetAmok {

	private int hunger = 5;
	private int thirst = 5;
	private int waste = 5;

	public Organic(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	public int getHunger() {

		return hunger;
	}
	public int getThirst() {
		
		return thirst;
	}
	
	public int getWaste() {
		
		return waste;
	}
// instance variable modifiers
	public void giveFood(int amount) {

		hunger += amount;
	}

	public void giveWater(int amount) {

		thirst += amount;
	}

	public void makeWaste(int amount) {

		waste += amount;
	}
	
	public void removeWaste(int amount) {
		waste *= amount;
	}

	public void cleanCage(int amount) {
		healthLevel += amount;
	}
	
	public void emptyLitterBox(int amount) {
		healthLevel += amount;
	}

	@Override
	public String getPetType() {
		return "Organic";
	}
	


}