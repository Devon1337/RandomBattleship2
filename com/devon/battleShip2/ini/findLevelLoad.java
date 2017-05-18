package com.devon.battleShip2.ini;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import com.devon.battleShip2.ini.*;



@SuppressWarnings("unused")
public class findLevelLoad {

	public static HashMap<Character, String> SaveLOC = new HashMap<Character, String>();
	
	public static MainMenu shipini = new MainMenu();
	
	public static Scanner keyboard = new Scanner(System.in);

	public void printLevel(char saveInput) throws IOException {
		hashSetup();
		if(SaveLOC.get(saveInput).equals(null)) {
			
		} else {
			System.out.println("File 1.) " + SaveLOC.get(saveInput));
		}
		
	}
	
	public static void hashSetup() {
		findLevelLoad.SaveLOC.put('m', "Main");
		findLevelLoad.SaveLOC.put('s', "SaveOption");
		findLevelLoad.SaveLOC.put('o', "OptionMenu");
		findLevelLoad.SaveLOC.put('c', "Console");
	}
	
	public void findLevels(char saveInput) throws IOException {
			hashSetup();
			System.out.println("File 1.) " + SaveLOC.get(saveInput));
			int input = keyboard.nextInt();
			loadLevel(input, saveInput);
	}
	
	public static void loadLevel(int userInput, char saveFile) throws IOException {
		hashSetup();
		if(userInput == 1) {
			switchParse(saveFile);
		}
	}
	
	@SuppressWarnings("static-access")
	public static void switchParse(char saveFile) throws IOException {
		hashSetup();
		switch(saveFile) {
		
		case 'm':
			shipini.displayMenu();
			break;
		case 's':
			shipini.saveMenu();
			break;
		case 'o':
			
			break;
		case 'c':
			
			break;
		
		
		
		}
	}
	
}
