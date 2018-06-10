package virtualpetsamok;

import java.util.Scanner;

public class PetShelterAmokApp {

	public static void main(String[] args) {
		
		
		PetShelterAmok pets = new PetShelterAmok();
		ODog oDog1 = new ODog("Jo-Dog", " Looks like he's seen better days");
		OCat oCat1 = new OCat("Dee-Kitty", " probably can't walk too long with those legs");
		RoboDog rDog1 = new RoboDog("RoboJohnny", " is a bit nervous");
		RoboCat rCat1 = new RoboCat("RoboTom", " has eyes like a Stargazer lily fresh with morning dew.");
		
		pets.addPet(oDog1);
		pets.addPet(oCat1);
		pets.addPet(rDog1);
		pets.addPet(rCat1);
		
		Scanner input = new Scanner (System.in);
		
		int select;
		
		do {
			System.out.println(
					"Thank you for volunteering at Columbus Resort Animal Protection and Adoption Agency...call us CRAPAA for short!");
			System.out.println("\nThis is the status of your pets:\n");
			
			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Name", "Hunger", "Thirst", "Waste", "Health", "Happiness", "Rust Level");
			
			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", oDog1.getPetName(), oDog1.getHunger(), oDog1.getThirst(),
					oDog1.getWaste(), oDog1.getHealthLevel(), oDog1.getHappyLevel(), "N/A");
			
			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", oCat1.getPetName(), oCat1.getHunger(), oCat1.getThirst(),
					oCat1.getWaste(), oCat1.getHealthLevel(), oCat1.getHappyLevel(), "N/A");
			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", rDog1.getPetName(), "N/A" , "N/A" ,
					"N/A" , rDog1.getHealthLevel(), rDog1.getHappyLevel(), rDog1.getRustLevel());
			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", rCat1.getPetName(), "N/A" , "N/A" ,
					"N/A" , rCat1.getHealthLevel(), rCat1.getHappyLevel(), rCat1.getRustLevel());
			System.out.println("\nWhat would you like to do:\n");

			System.out.println("Pick a number.");
			System.out.println("[0] Quit. ");
			System.out.println("[1] Feed the organic pets");
			System.out.println("[2] Water the organic pets");
			System.out.println("[3] Walk a dog");
			System.out.println("[4] Oil Robotic Pets");
			System.out.println("[5] Clean Dog Cage");
			System.out.println("[6] Clean LitterBox");
			select = input.nextInt();

			if (select == 0) {
				continue;
				
			}

			else if (select == 1) { // Feed the organic pets

				oDog1.giveFood(-1);
				oCat1.giveFood(-1);
				oDog1.giveWater(+1);
				oCat1.giveWater(+1);
				oDog1.makeWaste(+1);
				oCat1.makeWaste(+1);
				System.out.println("Yummy! Thanks for the food!");
				
			}

			else if (select == 2) {// Water the organic pets
				
				oDog1.giveWater(-1);
				oCat1.giveWater(-1);
				oDog1.makeWaste(+1);
				oCat1.makeWaste(+1);
				System.out.println("Thank you for the water...we were sooo thirsty");
			}
			
			else if (select == 3) {// pick a dog to walk

				System.out.println("Ok so you'd like to take a walk with the dogs.");

					
				System.out.println("Let's Go!" + oDog1.getPetName() + " & " + rDog1.getPetName() + " time for a walk in the park");
								
				oDog1.walkDog(oDog1);
				rDog1.walkDog(rDog1);
				oDog1.makeWaste(-2);
				oDog1.giveFood(+1);
				
				
			}

			else if (select == 4) {// Oil Robotic Pets
				System.out.println("Let's give these Robo Pets some oil!\n");
				rDog1.giveOil(+2);
				rCat1.giveOil(+2);
				
				System.out.println("Whew...thanks! was starting to get a bit squeaky there");

			}

			else if (select == 5) {//Empty Dog Cages
				System.out.println("You want to clean the dog cages");
				oDog1.removeWaste(0);
				oDog1.cleanCage(+3);
				System.out.println("Thanks it was starting to get messy in there");

			}
			
			else if (select == 6) {
				System.out.println("You want to clean the litter boxes");
				oCat1.removeWaste(0);
				oCat1.emptyLitterBox(+3);
				System.out.println("Thanks that litterbox was starting to become unsightly");
			}

			else {
				System.out.println("Invalid selection. Please select one of the numbers listed");
			}
					
			pets.tick(oDog1);
			pets.tick(oCat1);
						
	} while (select != 0);

}
	
}
