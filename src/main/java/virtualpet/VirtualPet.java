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
		hunger = 0;
	}

	// thirst
	public int getThirst() {
		return thirst;
	}

	public void giveWater() {
		thirst = 0;
	}

	// poop level
	public int getPoop() {
		return poop;
	}

	public void cleanPoop(int poopScooped) {
		if (poop > poopScooped) {
			poop -= poopScooped; // make Pterry sad?
		} else {
			poop -= poop;
		}
	}

	// boredom
	public int getBoredom() {
		return boredom;
	}

	public void playFetch() {
		boredom = 0;
	}

	

	// tick() method
	public void tick() {
		hunger++;
		thirst++;
		poop++;
		boredom++;
	}

}
