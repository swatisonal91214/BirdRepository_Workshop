package com.bl.birdsanctuaryclass;

import java.util.List;
import java.util.Scanner;
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
		
		public int showMainMenu() {
			int option = 0;
				System.out.println("Enter your choice!!");
				System.out.println("1.Add Birds \n2.Delete Birds\n 3.Update Birds\n 4.Print Birds \n 5.Exit");
				Scanner sc = new Scanner(System.in);
				option = sc.nextInt();
				return option;
		}
}
