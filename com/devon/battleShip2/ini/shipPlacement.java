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
		}
		System.out.println("");
		System.out.println("");
		
	}
	
	public static void ShipCalc(int x, int y, int shipSize) {
		
		int counter = 1;
		
		if(x - shipSize < 0) {
			System.out.println(counter + ".) Right");
			counter++;
		} 
		if(x + shipSize > 9) {
			System.out.println(counter + ".) Left");
			counter++;
		}
		if(y - shipSize < 0) {
			System.out.println(counter + ".) Down");
			counter++;
		}
		if(y + shipSize > 9) {
			System.out.println(counter + ".) Up");
			counter++;
		}
		
		
	}
	
}
