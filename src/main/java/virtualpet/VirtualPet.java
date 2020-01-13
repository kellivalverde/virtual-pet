package virtualpet;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int poop;
	private int boredom;
	private int tired;

	private String petName;

	public VirtualPet(String petName) {
		this.petName = petName;
	}

	// getters

	public String getPetName() {
		return petName;
	}

	// food
	public int getHunger() {
		return hunger;
	}

	public void feed() {
		hunger = -1;
		poop ++;
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
		thirst ++;
	}

	

	// tick() method
	public void tick() {
		hunger++;
		thirst++;
		poop++;
		boredom++;
	}

}
