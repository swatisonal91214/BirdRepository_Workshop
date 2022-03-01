package com.bl.birdsanctuaryclass;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Bird Sanctuary!!");
		
	    Duck duck = new Duck();
	    Emu emu = new Emu();
	    Ostrich ostrich = new Ostrich();
	    Parrot parrot = new Parrot();
	    Penguin penguin = new Penguin();
	    
	    BirdRepository birdRepo = new BirdRepository();
	    
	    birdRepo.addBirds(duck);
	    birdRepo.addBirds(emu);
	    birdRepo.addBirds(penguin);
	    birdRepo.addBirds(ostrich);
	    birdRepo.addBirds(parrot);
	    
	    UserInterface userInterface = new UserInterface();
	    userInterface.print(birdRepo.getBirdList());
	    
	    birdRepo.removeBirds(emu);
	    
	    System.out.println("Printing birds after removal");
	    
	    userInterface.print(birdRepo.getBirdList());
	}

}
