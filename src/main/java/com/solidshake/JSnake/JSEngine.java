package com.solidshake.JSnake;

public class JSEngine 
{
    JSEngine() {
<<<<<<< HEAD
    }

    private static boolean alive = true;

    public static boolean isSnakeAlive() {
        return alive;
    }

    public static void killSnake() {
        alive = false;
    }

    public static void resurrectSnake() {
        alive = true;
=======
    	
>>>>>>> refs/remotes/origin/master
    }

    public static void onCreate() {

<<<<<<< HEAD
        Snake snake = new Snake();
        GameField field = new GameField();

        field.showSnake(snake);
    }

    public static void onStart() {
        onUpdate();
    }

    public static void onUpdate() {
        while(true) {
            if (isSnakeAlive()) {

            } else {
                break;
            }
        }
        gameOver();
    }

    public static void gameOver() {

=======
    	Snake snake = new Snake();
    	GameField field = new GameField();
    	
    	field.showSnake(snake);
    	
//    	while(true) {
//    		
//    	}
>>>>>>> refs/remotes/origin/master
    }

    public static void onStart() {

    }

    public static void onUpdate() {

    }

    public static void gameOver() {

    }
}
