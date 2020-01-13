package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet myPet = new VirtualPet("Pterry the Pterodactyl");
		Scanner input = new Scanner(System.in);

		System.out.println("Hello, my name is " + myPet.getPetName() + "!"
				+ "\n \n********************************************** \n \n");

		// loop start

		while (true) {

			System.out.println("Here's how I feel...");
																		// could I clean this up with an array?
			System.out.println("Hunger: " + myPet.getHunger());
			System.out.println("Thirst: " + myPet.getThirst());
			System.out.println("Poop level: " + myPet.getPoop());
			System.out.println("Boredom: " + myPet.getBoredom());

			System.out.println("\nHint: Get all my stats down to zero to keep me a happy pet.");
						
			System.out.println("\nSo, what would you like to do? \n");
			System.out.println("Press 1 to feed me");
			System.out.println("Press 2 to give me water");
			System.out.println("Press 3 to clean my poop");
			System.out.println("Press 4 to play fetch");
			System.out.println("Press 5 to do nothing");

			String menuOption = input.nextLine();

			if (menuOption.contentEquals("1")) {
				System.out.println("Yum yum! I love food.");
				myPet.feed();
				//myPet.getHunger --;
								
			} else if(menuOption.contentEquals("2")) {
				System.out.println("Glug glug! Thanks for the water!");
				myPet.giveWater();
			}	
			else if(menuOption.contentEquals("3")) {
				System.out.println("Thanks! It was getting stinky in here.");
				myPet.cleanPoop();
			}
			 else if(menuOption.contentEquals("4")) {
				System.out.println("Yay! Let's play!");
				myPet.play();
								
 			} else if(menuOption.contentEquals("5")) {
 				System.out.println("Aw man... Ok, I guess I'll see you later.");
				break;
			} else {
				System.out.println("What?! Say that again.");
			}

			myPet.tick();
			
			System.out.println("Press enter to see how I feel now.");
			input.nextLine();
			
			
		} // loop end

	input.close();
}

}
