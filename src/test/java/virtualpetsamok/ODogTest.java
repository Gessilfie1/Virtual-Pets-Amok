package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ODogTest {
	
	ODog underTest = new ODog("name", "description");
	
	
	//test on state verification (variables)
	@Test
	public void shouldBeAbleToIncreaseHealth() {
		
		int healthLevelBefore = underTest.getHealthLevel();
		underTest.walkDog();
		 int healthLevelAfter = underTest.getHealthLevel();
		assertThat(healthLevelAfter - healthLevelBefore, is(5));
	}
	
	@Test
	public void shouldBeAbleToIncreaseHappiness() {
		
		int happyLevelBefore = underTest.getHappyLevel();
		underTest.cleanCage(Odog1);
		int happyLevelAfter = Odog1.getHappyLevel();
		assertThat(happyLevelBefore - happyLevelAfter, is(5));
	}
	
	@Test
	public void shouldBeAbleToFeed() {
		
		int hungerLevelBefore = Odog1.getHunger();
		underTest.feed(Odog1);
		int hungerLevelAfter = Odog1.getHunger();
		assertThat(hungerLevelAfter - hungerLevelBefore, is (5));
	}
	
	@Test
	public void shouldBeAbleToWater()	{
		int thirstLevelBefore = Odog1.getThirst();
		underTest.water(Odog1);
		int thirstLevelAfter = Odog1.getThirst();
		assertThat(thirstLevelAfter - thirstLevelBefore, is(5));
	}
	
	@Test
	public void shouldBeAbleToMakeWaste() {
		int wasteLevelBefore = Odog1.getWaste();
		underTest.soil(Odog1);
		int wasteLevelAfter = Odog1.getWaste();
		assertThat(wasteLevelAfter - wasteLevelBefore, is(5));
	}
	
	@Test
	public void shouldBeAbleToGetPetName() {
		String check = underTest.getPetName();
		assertEquals(check, "name");
	}
	
	@Test
	public void shouldBeAbleToGetPetDescription() {
		String check = underTest.getPetDescription();
		assertEquals(check, "description");
	}
	
	@Test
	public void shouldReturnPetTypeAsOrganic() {
		String check = underTest.getPetType();
		assertEquals (check, "Organic");
	}
	
	
	

}
