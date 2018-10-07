package com.solidshake.JSnake;

public class JSEngine 
{
    JSEngine() {
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
    }

    public static void onCreate() {

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

    }

    public static void onUpdate() {

    }
}
