# Virtual Pet Shelter

Create a virtual pet. Bonus points if it becomes a fad!

## Details

We’re going to use TDD to drive the creation of an application that simulates you taking care of the pets in a shelter.

Include a game loop in this project, too. It should query the user, then call the appropriate method(s) on VirtualPetShelter and/or VirtualPet. In general, your VirtualPetApp should talk to your VirtualPetShelter, and your VirtualPetShelter should talk to your VirtualPet. Try to avoid VirtualPetApp talking directly to VirtualPet instances, apart from accessing basic information about pets (via get* methods).

## Required Tasks to be completed in the order you feel is necessary

### VirtualPetShelterApp class

Create a main method that…
implements a game loop.
asks for user input.
writes output to the console.
calls VirtualPetShelter’s tick method after each interaction
Available user interface actions should include (at minimum)…
feeding all the pets
watering all the pets
playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one
allow intake of a pet, prompting the user for the pet’s information, requiring the user to (at minimum) specify name and description
(Hint: you can use tab characters (“\t”) to align console output in columns.)

### VirtualPetShelter class

include appropriate instance variable(s) to store the pets who reside at the shelter
include methods that:
return a Collection of all of the pets in the shelter
return a specific VirtualPet given its name
allow intake of a homeless pet
allow adoption of a homeless pet
feed all of the pets in the shelter
water all of the pets in the shelter
plays (or performs some other interaction(s)) with an individual pet in the shelter
include a tick method that calls the tick method for each of the pets in the shelter, updating their needs

### VirtualPet class

In addition to the requirements from last week’s project:

include instance variables representing:
name (from the above example, this might be “Tommy”)
description (from the above example, this might be “smells like a Stargazer lily fresh with morning dew”)
include a constructor that accepts a name and description
include a constructor that, in addition to name and description, accepts default values for the pet’s attributes (hunger, boredom, etc)
Do not include a default (zero arguments) constructor.

### Grading

Here is the rubric.

### Stretch Tasks

Consider any stretch tasks from last week’s project that you did not attempt.
Keep track of the cleanliness of individual pets’ cages and offer an option in the user interface to clean pet cages
DNA! In order to give your pets individual character, include as part of each pet’s state one or more multipliers for needs so that one pet may become hungrier/thirstier/more bored slower/faster than another pet. (Tip: you could create a class to encapsulate this.)
