package com.devon.battleShip2.ini;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.devon.battleShip2.BattleshipTwo;

public class saveLevel {

	private static File file = new File("saveFile.txt");
	private static File shipLoc = new File("PlayerShipLoc.txt");
	private static BattleshipTwo bst = new BattleshipTwo();
	
	@SuppressWarnings("static-access")
	public void LevelSave(char LevelType) throws IOException{
		
			if(!(file.exists())) {
				file.createNewFile();
			} else {
				System.out.println("File Already Exists!");
			}
			
			FileWriter writer = new FileWriter(file);
			
			writer.write(LevelType);
			writer.flush();
			writer.close();

			bst.publicSave = LevelType;
		}
	public void DeleteSave() throws IOException{
		if(file.delete()) {
			System.out.println("Save has been successfully deleted!");
		} else {
			System.err.println("There was a error deleting the file!");
		}
	}
	
	@SuppressWarnings({ "unused", "resource" })
	public void saveBoardLoc() throws IOException {
		
		if(!(shipLoc.exists())) {
			shipLoc.createNewFile();
		} else {
			System.out.println("File Already Exists!");
		}
		
		FileWriter writer = new FileWriter(file);
		
		
	}
}
