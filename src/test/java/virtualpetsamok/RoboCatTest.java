package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboCatTest {
	
	RoboCat underTest = new RoboCat("name", "description");
	VirtualPetAmok RoboCat1 = new VirtualPetAmok();
	
	@Test
	public void shouldBeAbleToOilRoboPet() {
		
		int rustLevelBefore = RoboCat1.getRustLevel();
		underTest.oil(RoboCat1);
		int rustLevelAfter = RoboCat1.getRustLevel();
		assertThat(rustLevelAfter - rustLevelBefore, is (5));
	}
	
	@Test
	public void shouldReturnPetTypeAsRobotic() {
		String check = underTest.getPetType();
		assertEquals (check, "Robotic");
	}

}
