package com.bl.birdsanctuaryclass;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Bird Sanctuary!!");
		
	    Duck duck = new Duck();
	    duck.birdId = "d001";
	    Emu emu = new Emu();
	    emu.birdId = "em001";
	    Ostrich ostrich = new Ostrich();
	    ostrich.birdId = "os001";
	    Parrot parrot = new Parrot();
	    parrot.birdId = "p001";
	    Penguin penguin = new Penguin();
	    penguin.birdId = "pn001";
	    Parrot parrot1 = new Parrot();
		parrot1.birdId = "p001";
	    
	    BirdRepository birdRepo = new BirdRepository();
	    
	    birdRepo.addBirds(duck);
	    birdRepo.addBirds(emu);
	    birdRepo.addBirds(penguin);
	    birdRepo.addBirds(ostrich);
	    birdRepo.addBirds(parrot);
	    birdRepo.addBirds(parrot1);
	    
	    UserInterface userInterface = new UserInterface();
	    userInterface.print(birdRepo.getBirdList());
	    
	    birdRepo.removeBirds(emu);
	    
	    System.out.println("Printing birds after removal");
	    
	    userInterface.print(birdRepo.getBirdList());
	    userInterface.printAllFlyableBirds(birdRepo.getBirdList());
	}

}
