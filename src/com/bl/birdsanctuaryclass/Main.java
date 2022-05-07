package com.bl.birdsanctuaryclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.bl.birdsanctuaryclass.Bird.Color;

public class Main {
	//BirdRepository birdRepo = BirdRepository.getInstance();
	public static void main(String[] args) {
		
		System.out.println("Welcome to Bird Sanctuary!!");
		UserInterface userInterface = new UserInterface();
		int useroption = 0; 
		Main main = new Main();
		
		while(useroption!=5) {
			useroption = userInterface.showMainMenu();
			main.handleUserSelection(useroption);
		}
		
		
		
//	    System.out.println("Printing birds after removal");
//	    
//	    userInterface.print(birdRepo.getBirdList());
//	    userInterface.printAllFlyableBirds(birdRepo.getBirdList());
	}
	
	public void addBird() {
//		System.out.println("You have selected to add the birds");
//		Duck duck = new Duck();
//		duck.birdId = "d001";
//		Emu emu = new Emu();
//		emu.birdId = "em001";
//		Ostrich ostrich = new Ostrich();
//		ostrich.birdId = "os001";
//		Parrot parrot = new Parrot();
//		parrot.birdId = "p001";
//		Penguin penguin = new Penguin();
//		penguin.birdId = "pn001";
//		Parrot parrot1 = new Parrot();
//		parrot1.birdId = "p001";
//		BirdRepository birdRepo = new BirdRepository();
//
//		birdRepo.addBirds(duck);
//		birdRepo.addBirds(emu);
//		birdRepo.addBirds(penguin);
//		birdRepo.addBirds(ostrich);
//		birdRepo.addBirds(parrot);
//		birdRepo.addBirds(parrot1);
		
		Scanner sc = new Scanner(System.in);
		Bird new_bird = new Bird();
		System.out.println("Enter the bird id: ");
		String newBirdId = sc.nextLine();
		new_bird.setBirdId(newBirdId);
		
		System.out.println("Enter the bird name: ");
		String newBirdName = sc.nextLine();
		new_bird.setName(newBirdName);
		
		System.out.println("Enter the bird color: ");
		System.out.println("1.BLACK		2.BROWN		3.WHITE		4.BLACK_WHITE		5.GREY		6.GREEN"	);
		int colorOption = sc.nextInt();
		switch(colorOption) {
		case 1: System.out.println("You selected Black Color");
		         new_bird.setColor(Color.BLACK);
		         break;
		case 2: System.out.println("You selected Brown Color");
        		new_bird.setColor(Color.BROWN);
        		break;
		case 3: System.out.println("You selected White Color");
        		new_bird.setColor(Color.WHITE);
        		break;
		case 4: System.out.println("You selected BLACK_WHITE Color");
				new_bird.setColor(Color.BLACK_WHITE);
				break;
		case 5: System.out.println("You selected GREY Color");
				new_bird.setColor(Color.GREY);
				break;
		case 6: System.out.println("You selected GREEN Color");
				new_bird.setColor(Color.GREEN);
				break;
				
		}
		
		BirdRepository birdRepo = BirdRepository.getInstance();
		birdRepo.addBirds(new_bird);
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(birdRepo.getBirdList());
	
			
		}
	
	
	public void removeBird() {
		BirdRepository birdRepo = BirdRepository.getInstance();
		//BirdRepository birdRepo = new BirdRepository();
		System.out.println("Enter the bird id for delete: ");
		Scanner sc = new Scanner(System.in);
		String bId = sc.next();
		
		Bird bird = birdRepo.getBird(bId);
		birdRepo.removeBirds(bird);
		System.out.println("Bird is removed.");
		
		
	}
	

	private void handleUserSelection(int useroption) {
		BirdRepository birdRepo = BirdRepository.getInstance();
		//BirdRepository birdRepo = new BirdRepository();
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
			
				case 4:
					System.out.println("You have selected the Print Option !!");
					Set<Bird> BirdList = birdRepo.getBirdList();
					UserInterface printObject = new UserInterface();
					printObject.print(BirdList);
					break;
				case 5:
					System.out.println("You have exited the Menu!!!");
					break;
			}
	}

}

