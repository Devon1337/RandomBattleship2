package com.devon.battleShip2.ini;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.devon.battleShip2.*;

@SuppressWarnings("unused")
public class readSaveLevel {

	public static findLevelLoad load = new findLevelLoad();
	
	private static File file = new File("saveFile.txt");
	
	public static char readSave() throws IOException {
		
		try {
		FileReader fr = new FileReader(file);
		char [] a = new char[1];
		fr.read(a);
		
		int correction = 0;
		fr.close();
		
		return a[0];
		} catch (FileNotFoundException e){
			System.out.println("Save Could not be found!");
			return ' ';
		}
	}
	
	
}
