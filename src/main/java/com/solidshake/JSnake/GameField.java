package com.solidshake.JSnake;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class GameField extends JFrame {
	
	public GameField() {
		
//		super("JSnake");
//		this.setBounds(0,0,800,800);
//		this.setLocationRelativeTo(null);
//		
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		this.getContentPane().setBackground(Color.BLACK);
//		
//		JPanel p = new JPanel();
//	    this.add(p);
//		p.setLayout(new GridLayout(10,10));
//		
//		JTextField[][] fieldList = new JTextField[10][10];
//		
//		//ArrayList<JTextField> fieldList = new ArrayList<JTextField>();
//		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 10; j++) {
//				JTextField field = new JTextField();
////				JTextField field = new JTextField("i: " + i + " j: " + j);
//				p.add(field);
//				fieldList[i][j] = field;
//			}
//		}
//		
//		fieldList[0][0].addKeyListener(new KeyAdapter() {
//			
//			public void keyPressed(KeyEvent e) {
//				System.out.println(e.getKeyCode());
//			}
//			
//		});
		
//		fieldList[0][0].setBackground(Color.green);
		
	    
	}
	
	public void printGameTitle() {
		getContentPane().add(new JLabel((new ImageIcon("icon.jpg"))));
	}
	
	public void printMenu() {
		getContentPane().setBackground(Color.BLUE);
	}

}
