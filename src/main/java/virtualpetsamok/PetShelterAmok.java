package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelterAmok {

	Map<String, VirtualPetAmok> pets = new HashMap<String, VirtualPetAmok>();

	public void addPet(VirtualPetAmok virtualPet) {
		pets.put(virtualPet.getPetName(), virtualPet);
	}

	public Collection<VirtualPetAmok> getAllPets() {
		return pets.values();
	}

	public void showPetType() {
		for (VirtualPetAmok pet : pets.values()) {
			System.out.println(pet.getPetName() + " " + pet.getPetType());
		}
		

	}

}
