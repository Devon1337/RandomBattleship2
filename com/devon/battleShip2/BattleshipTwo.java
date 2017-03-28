package com.devon.battleShip2;

import java.util.HashMap;
import java.util.Scanner;

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
	
	public static Scanner keyboard = new Scanner(System.in);
	
	public static HashMap<Integer, String> BB = new HashMap<Integer, String>(); 
	
	public static String[][] hmBoard = new String[10][10];
	public static String[][] shBoard = new String[10][10];
	
	
	public static File file = new File("saveFile.txt");
	
	// Used Multiple method system
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		preini.setupBoard();
		while(gameplay == false) {
		shipini.displayMenu();
		}
		displayini.displayBoard();	
		try {
			saveMainMenu();
			readSave();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getVerbose(boolean verbose) {
		debugVerbose = verbose;
	}
	

	public static void saveMainMenu() throws IOException {
		if(!(file.exists())) {
			file.createNewFile();
		} else {
			System.out.println("File Already Exists!");
		}
		
		FileWriter writer = new FileWriter(file);
		
		writer.write("m");
		writer.flush();
		writer.close();
	}
	
	public static void readSave() throws IOException {
		FileReader fr = new FileReader(file);
		char [] a = new char[1];
		fr.read(a);
		
		int correction = 0;
	
		
		
		for(char c : a) {
			for(int x = 0;x<1;x++) {
				if(a[x] == 'm') {
					correction++;
				}
			}
			System.out.println(c);
		fr.close();
		}
		load.findLevels(a[0]);
		System.out.println(correction);
	}
	
	public static void fileUse() throws IOException{
		
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
}
