package com.solidshake.JSnake;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class GameField extends JFrame {
	
	public GameField() {
		super("JSnake");
		this.setBounds(0,0,500,500);
		
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		this.setLocation(x, y);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
	    this.add(p);
		p.setLayout(new GridLayout(10,10));
		
		JTextField[][] fieldList = new JTextField[10][10];
		
		//ArrayList<JTextField> fieldList = new ArrayList<JTextField>();
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				JTextField field = new JTextField();
//				JTextField field = new JTextField("i: " + i + " j: " + j);
				p.add(field);
				fieldList[i][j] = field;
			}
		}
		
//		fieldList[0][0].setBackground(Color.green);
		
	    this.setVisible(true);
	}

	public void showSnake(Snake snake) {
		
		
	}

}
