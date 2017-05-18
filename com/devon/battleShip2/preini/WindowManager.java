package com.devon.battleShip2.preini;

import java.awt.BorderLayout;
import java.awt.TextArea;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowManager {

	public static JFrame windowsManage = new JFrame();
	public static JPanel panelset = new JPanel(new BorderLayout());
	public static JLabel labelset = new JLabel();
	public static JButton MenuButton = new JButton();
	public static TextArea test = new TextArea();
	
	public void iniWindow() {
		MenuButton.setLocation(200, 200);
		MenuButton.setText("Start Game!");
		MenuButton.setBounds(200, 200, 200, 200);
		MenuButton.setVisible(true);
		
		windowsManage.setTitle("Battleship 2");
		windowsManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowsManage.setName("Battleship 2");
		windowsManage.setResizable(false);		
		windowsManage.setSize(800, 800);
		windowsManage.setVisible(true);
		
		
		
	}
	
}
