package virtualpetsamok;

public class ODog extends Organic implements Walkable {

	public ODog(String name, String description) {
		super(name, description);
	}

	@Override
	public void walkDog(VirtualPetAmok Dogs) {
		this.happiness(5);
		this.makeWaste(-5);
	}





}
