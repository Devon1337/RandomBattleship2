package com.devon.battleShip2.preini;

import com.devon.battleShip2.BattleshipTwo;

public class BoardPreInitialization {
	
	public static BattleshipTwo bst = new BattleshipTwo();
	
	
	
	// setups the board for default game
	@SuppressWarnings("static-access")
	public static void setupBoard() {
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				bst.hmBoard[x][y] = "[ ]";
				bst.shBoard[x][y] = "[ ]";
			}
		}
	}
}
