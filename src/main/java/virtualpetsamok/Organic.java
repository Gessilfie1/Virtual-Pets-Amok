package virtualpetsamok;

public abstract class Organic extends VirtualPetAmok {

	private int hunger = 10;
	private int thirst = 10;
	private int waste = 10;

	public Organic(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	public int getHunger() {

		return hunger;
	}

	public void giveFood(int amount) {

		hunger += amount;

	}

	public void giveWater(int amount) {

		thirst += amount;
	}

	public void makeWaste(int amount) {

		waste += amount;
	}

	public int getThirst() {

		return thirst;
	}

	public int getWaste() {

		return waste;
	}

	public void removewaste(int amount) {
		happyLevel += amount;

	}

	@Override
	public String getPetType() {
		return "Organic";
	}

}