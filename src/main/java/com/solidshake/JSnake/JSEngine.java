package com.solidshake.JSnake;

public class JSEngine 
{
    JSEngine() {
    	
    }

    public static void onCreate() {

    	Snake snake = new Snake();
    	GameField field = new GameField();
    	
    	field.showSnake(snake);
    	
//    	while(true) {
//    		
//    	}
    }

    public static void onStart() {

    }

    public static void onUpdate() {

    }

    public static void gameOver() {

    }
}
