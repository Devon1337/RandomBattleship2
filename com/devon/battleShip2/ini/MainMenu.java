package com.devon.battleShip2.ini;

import java.io.IOException;
import java.util.Scanner;

import com.devon.battleShip2.BattleshipTwo;
import com.devon.battleShip2.ini.*;

@SuppressWarnings("unused")
public class MainMenu {


	private static boolean debugVerbose = false;
	
	public static BattleshipTwo bst = new BattleshipTwo();
	public static findLevelLoad load = new findLevelLoad();
	public static saveLevel save = new saveLevel();
	
	public static DebugVerbos debug = new DebugVerbos();
	
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void getVerbose(boolean verbose) {
		debugVerbose = verbose;
	}
	
	public static void displayMenu() throws IOException {
		System.out.println("= Display Menu =");
		System.out.println("=1) StartGame =");
		System.out.println("=2) OptionMenu=");
		System.out.println("=3) SaveMenu  =");
		System.out.println("=4) Quit      =");
		int menuParse = keyboard.nextInt();
		parseMenuOption(menuParse);
	}
	
	public static void optionMenu() throws IOException {
		System.out.println("= Display Menu =");
		System.out.println("=1) DebugVerbos=");
		System.out.println("=2) ConsoleLog =");
		System.out.println("=3) difficulty =");
		System.out.println("=4) Return!    =");
		int menuParse = keyboard.nextInt();
		parseOptionMenuOption(menuParse);
	}
	
	public static void saveMenu() throws IOException {
		System.out.println("= Display Menu =");
		System.out.println("=1) SaveGame   =");
		System.out.println("=2) LoadGame   =");
		System.out.println("=3) DeleteSave =");
		System.out.println("=4) Return!    =");
		int menuParse = keyboard.nextInt();
		parseSaveMenuOption(menuParse, 'm');
	}
	
	public static void parseCaseOption(int option) throws IOException {
		if(option == 1) {
			DebugVerbos.debugVerbose("DebugVerbose Enabled",BattleshipTwo.debugVerbose);
			debugVerbose = true;
			BattleshipTwo.getVerbose(true);
		} else if(option == 2) {
			DebugVerbos.debugVerbose("Disabling Debug Verbose",BattleshipTwo.debugVerbose);
			debugVerbose = false;
			BattleshipTwo.getVerbose(false);
		} else {
			DebugVerbos.debugVerbose("Error: Incorrect input place for ParseCaseOption: " + option,BattleshipTwo.debugVerbose);
			parseOptionMenuOption(1);
		}
	}
	
	public static void parseOptionMenuOption(int optionNumb) throws IOException {
		switch(optionNumb) {
		// DebugVerbos
		case 1: 
			DebugVerbos.debugVerbose("Loading String parseOptionMenuOption_Case1",BattleshipTwo.debugVerbose);
			System.out.println("Debug Verbose = " + BattleshipTwo.debugVerbose);
			System.out.println("1.) Enable");
			System.out.println("2.) Disable");
			int input = keyboard.nextInt();
			parseCaseOption(input);
			break;
		// ConsoleLog
		case 2:
			
			break;
		// Difficulty
		case 3:
			
			break;
		// Return
		case 4:
			
			break;
		// Default
		default:
			System.out.println("Error incorrect varible input!");
			tempNumbParse();
			break;
		}
	}
	
	public static void parseSaveMenuOption(int optionNumb, char Menu) throws IOException {
		switch(optionNumb) {
		// Gameplay
		case 1: 
			save.LevelSave(Menu);
			//save.saveBoardLoc();
			break;
		// Options
		case 2:
			// Load
			load.findLevels(BattleshipTwo.publicSave);
			break;
		// Save Menu
		case 3:
			save.DeleteSave();
			break;
		// Quit
		case 4:
			
			break;
		// Default
		default:
			System.out.println("Error incorrect varible input!");
			tempNumbParse();
			break;
		}
	}
	
	@SuppressWarnings("static-access")
	public static void parseMenuOption(int optionNumb) throws IOException {
		switch(optionNumb) {
		// Gameplay
		case 1: 
			bst.gameplay = true;
			bst.StartGame();
			break;
		// Options
		case 2:
			optionMenu();
			break;
		// Save Menu
		case 3:
			saveMenu();
			break;
		// Quit
		case 4:
			
			break;
		// Default
		default:
			System.out.println("Error incorrect varible input!");
			tempNumbParse();
			break;
		}
	}
	
	public static void tempNumbParse() throws IOException {
		
		DebugVerbos.debugVerbose("Parsing Incorrect String!",BattleshipTwo.debugVerbose);
		
		int tempInput = keyboard.nextInt();
		
		parseMenuOption(tempInput);
	}
	
}
