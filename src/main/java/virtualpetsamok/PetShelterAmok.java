package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelterAmok {

	Map<String, VirtualPetAmok> pets = new HashMap<String, VirtualPetAmok>();

	public void addPet(VirtualPetAmok virtualPet) {
		pets.put(virtualPet.getPetName(), virtualPet);
	}
	
	public VirtualPetAmok findPet(String name) {
		return pets.get(name);
	}

	public Collection<VirtualPetAmok> getAllPets() {
		return pets.values();
	}

	public void showPetType() {
		for (VirtualPetAmok pet : pets.values()) {
			System.out.println(pet.getPetName() + " " + pet.getPetType());
		}

	}
		
		public void tick(Organic tickpet) {
			if (tickpet.getHunger() == 0) {// if hunger reaches 0
				tickpet.emptyLitterBox(-2);
				tickpet.cleanCage(-2);
				System.out.println("WARNING: TOO MUCH FOOD. Let's go for a walk and walk this off!");
				
			}

			if (tickpet.getHunger() < 0) {// if hunger is less than 0
				System.out.println(" DECEASED:......");

			}

			if (tickpet.getThirst() == 0) { // if thirst reaches 0
				
				tickpet.emptyLitterBox(-2);
				tickpet.cleanCage(-2);
				System.out.println("WARNING: TOO MUCH WATER. LET'S GO FOR A WALK TO WALK IT OFF!");

			}

			if (tickpet.getThirst() < 0) { // if thirst is less than 0
				System.out.println(" DECEASED:......");
				
			}

			if (tickpet.getWaste() == 10) { // if waste reaches max
				System.out.println("WARNING:...living area has gotten too messy. Let's clean it up ");


			}

			if (tickpet.getWaste() > 10) { // if waste is greater than 10
				System.out.println("PETS DECEASED:.....UNINHABITABLE LIVING CONDITIONS.");

			}

			if (tickpet.getHunger() == 10) { // if hunger reaches max
				System.out.println("WARNING: I NEED FOOD BEFORE I PASS OUT!");

			}

			if (tickpet.getHunger() > 10) { // if hunger goes over max
				System.out.println("PETS DECEASED:......");

			}

			if (tickpet.getThirst() == 10) { // if thirst reaches max
				System.out.println("WARNING: NEED WATER RIGHT NOW!");

			}

			if (tickpet.getThirst() > 10) { // if thirst is more than max
				System.out.println("PETS DECEASED:......");

			}

		}	
		
		
		

	}




