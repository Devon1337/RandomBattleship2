package com.devon.battleShip2.ini;

import java.util.Scanner;

import com.devon.battleShip2.BattleshipTwo;


public class shipPlacement {

	public static Scanner keyboard = new Scanner(System.in);
	public static BattleshipTwo bst = new BattleshipTwo();
	
	@SuppressWarnings("static-access")
	public static void PlaceShip() {
		
		for(int x = 0; x < 5; x++) {
			System.out.println("X Location for ship" + x);
			int placeMentX = keyboard.nextInt();
		
			System.out.println("Y Location for ship" + x);
			int placeMentY = keyboard.nextInt();
			
			bst.hmBoard[placeMentX][placeMentY] = "[X]";
			bst.PrintBoard();
			
			switch(x) {
			
			case 0:
				ShipCalc(placeMentY, placeMentY, 5);
				break;
			case 1:
				ShipCalc(placeMentY, placeMentY, 4);
				break;
			case 2:
				ShipCalc(placeMentY, placeMentY, 3);
				break;
			case 3:
				ShipCalc(placeMentY, placeMentY, 3);
				break;
			case 4:
				ShipCalc(placeMentY, placeMentY, 2);
				break;
			
			}
		}
		System.out.println("");
		System.out.println("");
		
	}
	
	public static void ShipCalc(int x, int y, int shipSize) {
		
		int counter = 1;
		int unUsed = 0;
		
		if(x - shipSize < -1) {
			System.out.println(counter + ".) Right");
			counter++;
			
		}  else {
			unUsed++;
		}
		if(x + shipSize > 10) {
			System.out.println(counter + ".) Left");
			counter++;
			
		} else {
			unUsed++;
		}
		if(y - shipSize < -1) {
			System.out.println(counter + ".) Down");
			counter++;
			
		} else {
			unUsed++;
		}
		if(y + shipSize > 10) {
			System.out.println(counter + ".) Up");
			counter++;
			
		} else {
			unUsed++;
		}
		if(unUsed == 4) {
			System.out.println(counter + ".) Up");
			counter++;
			System.out.println(counter + ".) Down");
			counter++;
			System.out.println(counter + ".) Left");
			counter++;
			System.out.println(counter + ".) Right");
		}
		
		
		
	}
	
}
