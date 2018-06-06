package virtualpetsamok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboDogTest {
	
	RoboDog underTest = new RoboDog("name", "description");
	VirtualPetAmok RoboDog1 = new VirtualPetAmok();
	
	@Test
	public void shouldBeAbleToOilRoboPet() {
		
		int rustLevelBefore = RoboDog1.getRustLevel();
		underTest.oil(RoboDog1);
		int rustLevelAfter = RoboDog1.getRustLevel();
		assertThat(rustLevelAfter - rustLevelBefore, is (5));
	}
	
	@Test
	public void shouldReturnPetTypeAsRobotic() {
		String check = underTest.getPetType();
		assertEquals (check, "Robotic");
	}
	}


