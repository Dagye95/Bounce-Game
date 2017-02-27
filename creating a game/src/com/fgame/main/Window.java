package com.fgame.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

	/**
	 * this class creates  the window	 */
	private static final long serialVersionUID = -7710387843186783153L;

	public Window(int width, int height, String title, Game game) { 
		JFrame frame = new JFrame (title); //creating a j frame from the JRE library using with frame as the variable 
			
		frame.setPreferredSize(new Dimension(width, height)); 
		frame.setMaximumSize(new Dimension(width, height)); //setting the size of the window, preferred, maximum and minimum
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lets the user exit the game
		frame.setResizable(false); //doesnt allow resizing of the screen
		frame.setLocationRelativeTo(null); //just lets the user adjust the screen to the middle
		frame.add(game); //adds the game class to the frame
		frame.setVisible(true); // allows me to see the game
		game.start(); //runs the start method in the start class

	}
}

/**
 * created a jframe// the frame of the game window, everytime Frame. is used, i am referring back to	 */