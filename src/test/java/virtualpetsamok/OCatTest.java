package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OCatTest {
	
	OCat underTest = new OCat("nameCat", "descriptionCat");
	
	
	@Test
	public void shouldBeAbleToIncreaseHappiness() {
		
		int happyLevelBefore = underTest.getHappyLevel();
		underTest.emptyLitterBox();
		int happyLevelAfter = underTest.getHappyLevel();
		assertThat(happyLevelBefore - happyLevelAfter, is(5));
	}
	
	@Test
	public void shouldBeAbleToFeed() {
		
		int hungerLevelBefore = underTest.getHunger();
		underTest.feed();
		int hungerLevelAfter = underTest.getHunger();
		assertThat(hungerLevelAfter - hungerLevelBefore, is (5));
	}
	
	@Test
	public void shouldBeAbleToWater()	{
		int thirstLevelBefore = OCat1.getThirst();
		underTest.water(OCat1);
		int thirstLevelAfter = OCat1.getThirst();
		assertThat(thirstLevelAfter - thirstLevelBefore, is(5));
	}
	
	@Test
	public void shouldBeAbleToMakeWaste() {
		int wasteLevelBefore = OCat1.getWaste();
		underTest.soil(OCat1);
		int wasteLevelAfter = OCat1.getWaste();
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
