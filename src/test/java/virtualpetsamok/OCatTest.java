package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OCatTest {
	
	OCat underTest = new OCat("nameCat", "descriptionCat");
	
	

	
	@Test
	public void shouldBeAbleToFeed() {
		
		int hungerLevelBefore = underTest.getHunger();
		underTest.giveFood(5);
		int hungerLevelAfter = underTest.getHunger();
		assertThat(hungerLevelAfter - hungerLevelBefore, is (5));
	}
	
	@Test
	public void shouldBeAbleToWater()	{
		int thirstLevelBefore = underTest.getThirst();
		underTest.giveWater(5);
		int thirstLevelAfter = underTest.getThirst();
		assertThat(thirstLevelAfter - thirstLevelBefore, is(5));
	}
	
	@Test
	public void shouldBeAbleToMakeWaste() {
		int wasteLevelBefore = underTest.getWaste();
		underTest.makeWaste(5);
		int wasteLevelAfter = underTest.getWaste();
		assertThat(wasteLevelAfter - wasteLevelBefore, is(5));
	}
	
	@Test
	public void shouldBeAbleToGetPetName() {
		String check = underTest.getPetName();
		assertEquals(check, "nameCat");
	}
	
	@Test
	public void shouldBeAbleToGetPetDescription() {
		String check = underTest.getPetDescription();
		assertEquals(check, "descriptionCat");
	}
	
	@Test
	public void shouldReturnPetTypeAsOrganic() {
		String check = underTest.getPetType();
		assertEquals (check, "Organic");
	}

}
