package com.bl.birdsanctuaryclass;

import java.util.ArrayList;
import java.util.List;

public class BirdRepository {
	
	private List birdList = new ArrayList(); 
	
	List getBirdList() {
		return birdList;
	}
	
	void addBirds(Duck duck) {
		birdList.add(duck); 
	}
	
	void addBirds(Emu emu) {
		birdList.add(emu); 
	}
	
	void addBirds(Ostrich ostrich) {
		birdList.add(ostrich); 
	}
	
	void addBirds(Parrot parrot) {
		birdList.add(parrot); 
	}
	
	void addBirds(Penguin penguin) {
		birdList.add(penguin); 
	}
	
	void removeBirds(Emu emu) {
		birdList.remove(emu);
	}

	void removeBirds(Duck duck) {
		birdList.remove(duck); 
	}
	
	void removeBirds(Ostrich ostrich) {
		birdList.remove(ostrich); 
	}
	
	void removeBirds(Parrot parrot) {
		birdList.remove(parrot); 
	}
	
	void removeBirds(Penguin penguin) {
		birdList.remove(penguin); 
	}
}