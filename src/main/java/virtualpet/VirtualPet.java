package virtualpet;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int poop;
	
	private String petName;
	
	public VirtualPet(String petName) {
			this.petName = petName;
	}
	
	
	// getters
	
	public String getPetName() {
		return petName;
	}
	
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getPoop() {
		return poop;
	}

	// tick() method
	public void tick() {
		hunger ++;
		thirst ++;
		poop ++;
		}

	
	
	
	
}
