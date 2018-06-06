package virtualpetsamok;

public abstract class Robotic extends VirtualPetAmok {

	private int rustLevel = 10;

	public Robotic(String name, String description) {
		super(name, description);
	
	}
	
	public int getRustLevel() {
		
		return rustLevel;
	}
	
	public void giveOil(int amount) {
		rustLevel += amount;
		healthLevel += amount;
		
	}
	
	@Override
	public String getPetType() {
		
		return "Robotic";
	}



	

}