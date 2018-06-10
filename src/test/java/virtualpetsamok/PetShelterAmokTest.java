package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class PetShelterAmokTest {
	
	PetShelterAmok shelter = new PetShelterAmok();
	ODog oDog = new ODog("1", "");
	OCat oCat = new OCat("2", "");
	
	@Test
	public void shouldBeAbleToAddPet() {
		ODog oDog = new ODog("1", "");
		shelter.addPet(oDog);
		Collection<VirtualPetAmok> check = shelter.getAllPets();
		
		assertThat(check, contains(oDog));
	}
	
	@Test
	public void shouldBeAbleToAddTwoDifferentPets() {
		shelter.addPet(oDog);
		shelter.addPet(oCat);
		
		Collection<VirtualPetAmok> check = shelter.getAllPets();
		
		assertEquals(2, check.size());
		assertThat(check, containsInAnyOrder(oDog, oCat));
	}
	


}
