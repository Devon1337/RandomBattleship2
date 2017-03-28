package com.devon.battleShip2.ini;

import java.util.Scanner;

import com.devon.battleShip2.BattleshipTwo;
import com.devon.battleShip2.ini.*;

public class MainMenu {

	private static boolean debugVerbose = false;
	
	public static BattleshipTwo bst = new BattleshipTwo();
	
	public static DebugVerbos debug = new DebugVerbos();
	
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void getVerbose(boolean verbose) {
		debugVerbose = verbose;
	}
	
	public static void displayMenu() {
		System.out.println("= Display Menu =");
		System.out.println("=1) StartGame =");
		System.out.println("=2) OptionMenu=");
		System.out.println("=3) SaveMenu  =");
		System.out.println("=4) Quit      =");
		int menuParse = keyboard.nextInt();
		parseMenuOption(menuParse);
	}
	
	public static void optionMenu() {
		System.out.println("= Display Menu =");
		System.out.println("=1) DebugVerbos=");
		System.out.println("=2) ConsoleLog =");
		System.out.println("=3) difficulty =");
		System.out.println("=4) Return!    =");
		int menuParse = keyboard.nextInt();
		parseOptionMenuOption(menuParse);
	}
	
	public static void saveMenu() {
		System.out.println("= Display Menu =");
		System.out.println("=1) SaveGame   =");
		System.out.println("=2) LoadGame   =");
		System.out.println("=3) ViewSave   =");
		System.out.println("=4) Return!    =");
		int menuParse = keyboard.nextInt();
		parseMenuOption(menuParse);
	}
	
	public static void parseCaseOption(int option) {
		if(option == 1) {
			DebugVerbos.debugVerbose("DebugVerbose Enabled",bst.debugVerbose);
			debugVerbose = true;
		} else if(option == 2) {
			DebugVerbos.debugVerbose("Disabling Debug Verbose",bst.debugVerbose);
			bst.debugVerbose = false;
		} else {
			DebugVerbos.debugVerbose("Error: Incorrect input place for ParseCaseOption: " + option,bst.debugVerbose);
			parseOptionMenuOption(1);
		}
	}
	
	public static void parseOptionMenuOption(int optionNumb) {
		switch(optionNumb) {
		// DebugVerbos
		case 1: 
			DebugVerbos.debugVerbose("Loading String parseOptionMenuOption_Case1",bst.debugVerbose);
			System.out.println("Debug Verbose = " + bst.debugVerbose);
			System.out.println("1.) Enable");
			System.out.println("2.) Disable");
			int input = keyboard.nextInt();
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
	
	public static void parseSaveMenuOption(int optionNumb) {
		switch(optionNumb) {
		// Gameplay
		case 1: 
			
			break;
		// Options
		case 2:
			
			break;
		// Save Menu
		case 3:
			
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
	
	public static void parseMenuOption(int optionNumb) {
		switch(optionNumb) {
		// Gameplay
		case 1: 
			
			break;
		// Options
		case 2:
			optionMenu();
			break;
		// Save Menu
		case 3:
			
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
	
	public static void tempNumbParse() {
		
		DebugVerbos.debugVerbose("Parsing Incorrect String!",bst.debugVerbose);
		
		int tempInput = keyboard.nextInt();
		
		parseMenuOption(tempInput);
	}
	
}
