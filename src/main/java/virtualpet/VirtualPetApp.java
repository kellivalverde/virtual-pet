package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet myPet = new VirtualPet("Pterry the Pterodactyl");
		Scanner input = new Scanner(System.in);

		System.out.println("Hello, my name is " + myPet.getPetName() + "!" + "\n \n ****************** \n \n");
		
	// loop start

		while (true) {

			System.out.println("Here's how I feel...");

			System.out.println("Hunger: " + myPet.getHunger());
			// other stats
			
			
			
			System.out.println("\nHint: Get all my stats down to zero to keep me a happy pet.");
			System.out.println("\nSo, what would you like to do? \n");
			// list of things to do: feed, water, play...
			System.out.println("Press 1 to feed me");
			System.out.println("Press 2 to give me water");
			System.out.println("Press 3 to clean my poop");
			System.out.println("Press 4 to play fetch");
			System.out.println("Press 5 to do nothing");
			


			String menuOption = input.nextLine();

//		System.out.println("Enter deposit amount: ");
//		int amountToDeposit = input.nextInt();
//		myAtm.deposit(amountToDeposit);
//		input.nextLine(); // gives us input separation
//		

			myPet.tick();
			input.close();
		} // loop end

	}

}
