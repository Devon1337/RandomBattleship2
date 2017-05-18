package com.devon.battleShip2.ini;


public class DebugVerbos {

	
	public static void debugVerbose(String Message, boolean debugEnabled) {
		if(debugEnabled) {
			System.out.println(Message);
		}
	}
	
}
