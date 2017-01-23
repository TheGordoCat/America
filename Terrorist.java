//this is the object that needs to be clicked upon in order to win the game. 

import java.awt.Color;
import java.awt.Graphics;


public class Terrorist extends Brick{

	
	private int xSpeed;
	private int ySpeed;
	private static int erradicated;
	
	public Terrorist() {
		super((int) (Math.random() * 1400), (int) (Math.random() * 900), 70, 70, Color.blue);
		xSpeed = (int)(Math.random()* 10);
		ySpeed = (int)(Math.random()* 10);
	}
	
	public void moveAndDraw(Graphics g, int xMouse, int yMouse){
		draw(g, Color.white);
		setY(getY() - getYSpeed());
		setX(getX() - getXSpeed());
		interact();
		restart(xMouse, yMouse);
		draw(g);
	}
	
	
	public void interact(){								//boundaries for the object
		
		if (getX() <= 0) 
			setXSpeed(-getXSpeed());
		if (getX() + getWidth() >= AmericansGame.WIDTH)
			setXSpeed(-getXSpeed());
		if (getY() <= 0) 
			setYSpeed(-getYSpeed());
		if (getY() + getHeight() >= AmericansGame.HEIGHT)
			setYSpeed(-getYSpeed());
	}
	
	public void restart(int xMouse, int yMouse){	//is mouse click in virus? If so, add points
		if (xMouse >= getX())
			if (xMouse <= getX() + getWidth())
				if (yMouse >= getY())
					if (yMouse <= getY() + getHeight()){
						setX( (int) (Math.random() * 1400));
						setY( (int) (Math.random() * 900));
						setXSpeed((int)(Math.random()* 15) + 5);
						setYSpeed((int)(Math.random()* 15) + 5);
						erradicated += 100;
					}	
	}
	
	
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	
	public int getErradicated(){
		return erradicated;
	}
	
	public void setXSpeed(int xs){
		xSpeed = xs;
	}
	
	public void setYSpeed(int ys){
		ySpeed = ys;
	}
	
}