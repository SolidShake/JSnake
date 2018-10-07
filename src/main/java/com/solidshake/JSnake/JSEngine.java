package com.solidshake.JSnake;

public class JSEngine 
{
    JSEngine() {
    	
    }
    
    public static void start() {
    	Snake snake = new Snake();
    	GameField field = new GameField();
    	
    	field.showSnake(snake);
    	
//    	while(true) {
//    		
//    	}
    }

    public static void onUpdate() {

    }
}
