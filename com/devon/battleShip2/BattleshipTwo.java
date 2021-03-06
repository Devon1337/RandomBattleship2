package com.devon.battleShip2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.*;

import com.devon.battleShip2.preini.*;
import com.devon.battleShip2.ini.*;
import com.devon.battleShip2.postini.*;


@SuppressWarnings("unused")
public class BattleshipTwo {
	
	public static boolean gameplay = false;
	public static boolean debugVerbose = false;
	public static BoardPreInitialization preini = new BoardPreInitialization();
	public static displayMenu displayini = new displayMenu();
	public static MainMenu shipini = new MainMenu();
	public static findLevelLoad load = new findLevelLoad();
	public static hashSetup hash = new hashSetup();
	public static WindowManager windows = new WindowManager();
	public static readSaveLevel read = new readSaveLevel();
	public static shipPlacement shipPlace = new shipPlacement();
	public static Random ran = new Random();
	
	
	public static Scanner keyboard = new Scanner(System.in);
	
	public static HashMap<Integer, String> BB = new HashMap<Integer, String>(); 
	
	public static String[][] hmBoard = new String[10][10];
	public static String[][] shBoard = new String[10][10];
	
	public static String[][] botHMBoard = new String[10][10];
	public static String[][] botSHBoard = new String[10][10];
	
	public static char publicSave;
	
	
	
	// Used Multiple method system
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		publicSave = read.readSave(); 
		windows.iniWindow();
		hash.setupHash();
		preini.setupBoard();
		while(gameplay == false) {
		shipini.displayMenu();
		}      
		displayini.displayBoard();	
		windows.iniWindow();
		
		
	}
	
	public static void getVerbose(boolean verbose) {
		debugVerbose = verbose;
	}

	public static void PrintBoard() {
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				System.out.print(hmBoard[x][y]);
				System.out.print(shBoard[x][y]);
			}
			System.out.println();
		}
	}
	
	public static void StartGame() {
		while(gameplay == true) {
			PrintBoard();
			botTurn();
			PlayerTurn();
			
		}
	}
	
	@SuppressWarnings("static-access")
	public static void PlayerTurn() {
		shipPlace.PlaceShip();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
	}
	
	public static void botTurn() {
		int ShipOneX = ran.nextInt(10);
		int ShipTwoX = ran.nextInt(10);
		int ShipThreeX = ran.nextInt(10);
		int ShipFourX = ran.nextInt(10);
		int ShipFiveX = ran.nextInt(10);
		int ShipOneY = ran.nextInt(10);
		int ShipTwoY = ran.nextInt(10);
		int ShipThreeY = ran.nextInt(10);
		int ShipFourY = ran.nextInt(10);
		int ShipFiveY = ran.nextInt(10);
		botShipPlaceCorrection(ShipOneX, ShipOneY);
		botShipPlaceCorrection(ShipTwoX, ShipTwoY);
		botShipPlaceCorrection(ShipThreeX, ShipThreeY);
		botShipPlaceCorrection(ShipFourX, ShipFourY);
		botShipPlaceCorrection(ShipFiveX, ShipFiveY);
		botBoard();
	}
	
	public static void botBoard() {
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				botSHBoard[x][y] = "[ ]";
				System.out.print(botSHBoard[x][y]);
			}
			System.out.println();
		}
	}
	
	public static void botShipPlaceCorrection(int botx, int boty) {

		botSHBoard[botx][boty] = "[X]";

	}
	
}


/* Code Graveyard
 * public static void fileUse() throws IOException{
		if(!(file.exists())) {
			file.createNewFile();
		} else {
			System.out.println("File Already Exists!");
		}
		
		FileWriter writer = new FileWriter(file);
		writer.write("Test");
		writer.flush();
		writer.close();
		
		FileReader fr = new FileReader(file);
		char [] a = new char[5];
		fr.read(a);
		
		for(char c : a)
			System.out.print(c);
		fr.close();
		
		
	}
 * 
 * 
 */


