package com.solidshake.JSnake;

import java.awt.Color;
import java.util.LinkedList;

import javax.swing.JTextField;

public class Snake {
	
	private int x;
	private int y;
	private LinkedList<JTextField> field = new LinkedList<JTextField>();
	
    private static boolean alive = true;

    public static boolean isSnakeAlive() {
        return alive;
    }

    public static void killSnake() {
        alive = false;
    }

    public static void resurrectSnake() {
        alive = true;
    }
	
	Snake() {
		this.x = 5;
		this.y = 5;		
		
		field.addFirst(createNewCell("Snake head"));
	}
	
	public	int getLength() {
		return this.field.size();
	}
	
	public int[] getXY() {
		return new int[] {x, y};
	}
	
	private JTextField createNewCell() {
		JTextField s = new JTextField();
		s.setBackground(Color.red);
		
		return s;
	}
	
	private JTextField createNewCell(String name) {
		JTextField s = new JTextField();
		s.setBackground(Color.red);
		s.setText(name);
		
		return s;
	}
	
	private void addNewCell(char direction) {
		switch(direction) {
			case 'n':
				this.y++;
				break;
			case 's':
				this.y--;
				break;
			case 'w':
				this.x--;
				break;
			case 'e':
				this.x++;
				break;
		}
			
		field.addFirst(createNewCell("Snake head"));
	}
	
	private void move(char direction) {
		addNewCell(direction);
		field.removeLast();
	}

}
