package com.solidshake.JSnake;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

public class JSEngine extends Canvas implements Runnable {
	
	private final int WIDTH = 800;
	private final int HEIGHT = 800;
	
	
	private Thread thread;
	private boolean running = false;
	private JFrame frame;
	
    JSEngine() {
    	frame = new JFrame();
		frame.setBounds(0,0,WIDTH,HEIGHT);
    }
    
    public synchronized void start() {
    	running = true;
    	thread = new Thread(this);
    	thread.start();
    }
    
    public synchronized void stop() {
    	running = false;
    	try {
    		thread.join();
    	} catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    }
    
	public void run() {
		init();
		while(running) {
			render();
			update();
		}
	}
	
	private void init() {
    	frame.add(this);
    	frame.setTitle("Snake");
    	frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
	
	private void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}
		Graphics2D g = (Graphics2D) bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.GRAY);
		g.fillRect(100, 100, 600, 600);
		g.dispose();
		bs.show();
	}

	private void update() {
			// TODO Auto-generated method stub
			
	}
	


//    public static void onCreate() {
//
//        Snake snake = new Snake();
//        GameField field = new GameField();
//        
//        field.printGameTitle();
//        
//        try {
//			TimeUnit.SECONDS.sleep(1);
//		} catch (InterruptedException e) {
//			//
//		}
//        
//        field.printMenu();
//
////        field.paintRect(g);
////        field.showSnake(snake);
//    }
//
//    public static void onStart() {
//        onUpdate();
//    }
//
//    public static void onUpdate() {
////        while(true) {
////            if (isSnakeAlive()) {
////
////            } else {
////                break;
////            }
////        }
//        gameOver();
//    }
//
//    public static void gameOver() {
//
//    }
    
    public static void main(String[] args) {
    	new JSEngine().start();
    }
}
