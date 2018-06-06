package virtualpetsamok;

public abstract class VirtualPetAmok implements Comparable<VirtualPetAmok> {
	
	private String petName;
	private String petDescription;

	private static final int DEFAULT_HAPPY_LEVEL = 10;
	private static final int DEFAULT_HEALTH_LEVEL = 20;
	protected int healthLevel = DEFAULT_HEALTH_LEVEL;
	protected int happyLevel = DEFAULT_HAPPY_LEVEL;
	
	@Override
	public String toString() {
		return this.petName;
		
	}
	

	@Override
	public int compareTo(VirtualPetAmok pet) {
		if(this.getPetName().compareTo(pet.getPetName()) < 0) {
			return -1;
		} else if (this.getPetName().compareTo(pet.getPetName()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}


	public VirtualPetAmok(String name, String description) {
		this.petName = name;
		this.petDescription = description;
				
	}
	
	public String getPetName() {

		return petName;
	}

	public String getPetDescription() {

		return petDescription;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public int getHappyLevel() {

		return happyLevel;
	}

	public void happiness(int amount) {
		healthLevel += amount;
		
	}
	
	public abstract String getPetType();


	

}
