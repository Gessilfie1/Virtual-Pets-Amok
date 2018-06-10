package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboCatTest {
	
	RoboCat underTest = new RoboCat("name", "description");
	
	
	@Test
	public void shouldBeAbleToOilRoboPet() {
		
		int rustLevelBefore = underTest.getRustLevel();
		underTest.giveOil();
		int rustLevelAfter = underTest.getRustLevel();
		assertThat(rustLevelAfter - rustLevelBefore, is (5));
	}
	
	@Test
	public void shouldReturnPetTypeAsRobotic() {
		String check = underTest.getPetType();
		assertEquals (check, "Robotic");
	}

}
