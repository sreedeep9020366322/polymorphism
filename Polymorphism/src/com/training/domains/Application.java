package com.training.domains;

import java.util.Scanner;

import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowRoom showRoom = new NewShowRoom();
		NewShowRoom newShowRoom = new NewShowRoom();
		Automobile polyAuto = null;
		int key = 1;
		
		//polyAuto= showRoom.getItem(key);
		//showRoom.printQuote(polyAuto);
	
	
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter: \n 1 for passengerCar \n 2 for sportsCar \n 3 for LuxuryCar \n 4 for SportsBike \n 5 for Exit ");
			key = sc.nextInt();
			
			switch(key){
				
			case 1: 
				polyAuto= showRoom.getItem(1);
				showRoom.printQuote(polyAuto);
				break;
			case 2:
				polyAuto= showRoom.getItem(key);
				showRoom.printQuote(polyAuto);
				break;
			case 3:
				polyAuto= newShowRoom.getItem(key);
				showRoom.printQuote(polyAuto);
				break;
			case 4:
				polyAuto= newShowRoom.getItem(key);
				showRoom.printQuote(polyAuto);
				break;
			case 5:
				System.out.println("Bye...");
				return ;
			default:
				System.out.println("wrong choice.");
				break;
			}
		}
	}

}
