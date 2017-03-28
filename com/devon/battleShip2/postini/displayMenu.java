package com.devon.battleShip2.postini;

import com.devon.battleShip2.BattleshipTwo;

public class displayMenu {

	public static BattleshipTwo bst = new BattleshipTwo();
	
	// Meant to only display the board information
		public static void displayBoard() {
			System.out.println("Hit Board");
			for(int x = 0; x < 10; x++) {
				for(int y = 0; y < 10; y++) {
					System.out.print(bst.hmBoard[x][y]);
				}
				System.out.println();
				
			}
			
			System.out.println();
			
			System.out.println("Ship Board");
			for(int x = 0; x < 10; x++) {
				for(int y = 0; y < 10; y++) {
					System.out.print(bst.shBoard[x][y]);
				}
				System.out.println();
				
			}

		}
	
}
