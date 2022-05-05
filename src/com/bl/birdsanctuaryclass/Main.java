package com.bl.birdsanctuaryclass;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Bird Sanctuary!!");
		UserInterface userInterface = new UserInterface();
		int useroption = userInterface.showMainMenu();
		Main main = new Main();
		main.handleUserSelection(useroption);
	    
//	    
//	    
//	    
//	    
//	    System.out.println("Printing birds after removal");
//	    
//	    userInterface.print(birdRepo.getBirdList());
//	    userInterface.printAllFlyableBirds(birdRepo.getBirdList());
	}
	
	public void addBird() {
		System.out.println("You have selected to add the birds");
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
	}
	
	public void removeBird() {
		BirdRepository birdRepo = new BirdRepository();
		System.out.println("Enter the bird id for delete: ");
		Scanner sc = new Scanner(System.in);
		String bId = sc.next();
		
		Bird bird = birdRepo.getBird(bId);
		birdRepo.removeBirds(bird);
		System.out.println("Bird is removed.");
		
		
	}
	
	public void printBirds() {
		
	}
	private void handleUserSelection(int useroption) {
		BirdRepository birdRepo = new BirdRepository();
		switch(useroption) {
		case 1 :
			
			addBird();
			break;
				
		case 2: 
			System.out.println("Please enter the bird ID");
			Scanner sc = new Scanner(System.in);
			String birdId = sc.nextLine();
			Bird bird = birdRepo.getBird(birdId);
			birdRepo.removeBirds(bird);
			System.out.println("Bird is removed" + bird);
			break;
		}
		
	}

}
