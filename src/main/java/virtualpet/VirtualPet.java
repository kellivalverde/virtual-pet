//homework
package virtualpet;

public class VirtualPet {

	private int hunger = 0; // baby bear
	private int thirst = 0;
	private int boredom = 0;
	private int poop = 0;
	private String petName;
	private String petDescription;

	

	public VirtualPet(String petName) {
		this.petName = petName;
	}

	// getters

	public String getPetName() {
		return this.petName;
	}

	public String getPetDescription() {
		return this.petDescription;
	}

	public VirtualPet(String petNameParameter, String petDescriptionParameter) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;

	}

	public VirtualPet(String string, String string2, int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	// food
	public int getHunger() {
		return hunger;
	}

	public void feed() {
		hunger = -1;
		poop++;
	}

	// thirst
	public int getThirst() {
		return thirst;
	}

	public void giveWater() {
		thirst = -1;
	}

	// poop level
	public int getPoop() {
		return poop;
	}

	public void cleanPoop() {
		poop = -1;
	}

	// boredom
	public int getBoredom() {
		return boredom;
	}

	public void play() {
		boredom = -1;
		thirst++;
	}

	// tick() method
	public void tick() {
		hunger++;
		thirst++;
		poop++;
		boredom++;
	}

}
