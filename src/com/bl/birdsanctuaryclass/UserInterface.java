package com.bl.birdsanctuaryclass;

import java.util.List;
import java.util.Set;

public class UserInterface {

		void print(Set<Bird> birds) {
			for(Bird bird: birds) {
				System.out.println(bird);
			}
//			for(int i = 0; i < birds.size() ; i++) {
//				System.out.println(birds.get(i));
//			}
		}
		
		void printAllFlyableBirds(Set<Bird> birds) {
//			for(int i = 0; i < birds.size(); i++) {
//				birds.get(i).fly();
//			}
			for(Bird bird: birds) {
				bird.fly();
			}
		}
}
