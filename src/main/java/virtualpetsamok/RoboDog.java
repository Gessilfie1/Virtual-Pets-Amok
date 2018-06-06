package virtualpetsamok;

public class RoboDog extends Robotic implements Walkable {

	public RoboDog(String name, String description) {
		super(name, description);
	}

	@Override
	public void walkDog(VirtualPetAmok dogs) {
		dogs.happiness(5);

	}

}
