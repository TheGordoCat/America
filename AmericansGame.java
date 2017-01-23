//The goal is to click upon the images of the terrorists while avoiding the viruses. W, A, S, D are 
//the keys used to move and the mouse is used to click. After getting a certain number of 
//enemies, the difficulty increases.


import java.awt.Component;

import javax.swing.JFrame;



public class AmericansGame extends JFrame {
	
	static AmericansGame run;
	public static final int WIDTH = 1500;		// dimensions of the game
	public static final int HEIGHT = 1000;		//made public to allow access to other files

	public AmericansGame()
	{
		super("America's Fight Against Ebola");
		setSize(WIDTH, HEIGHT);
		
		Ebola game = new Ebola();
		
		((Component)game).setFocusable(true);			//creates game and allows user interactions
		getContentPane().add(game);
		setResizable(false);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main( String args[] )
	{
		run = new AmericansGame();					//runs game
		
	}
}