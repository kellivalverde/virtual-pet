package virtualpet;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VirtualPetTest {

	private String petName = "Pterry";
	
	VirtualPet myPet = new VirtualPet(petName); // calling default constructor

	@Test
	public void hungerShouldBe0AtStart() {

		// act
		int result = myPet.getHunger(); // makes a method in VP2 class

		// assert
		assertEquals(0, result);
	}

}
 