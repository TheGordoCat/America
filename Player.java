//main player, includes the interactions of the frame

import java.awt.Color;


public class Player extends Brick {
	
	
	public Player(){
		super (800, 500, 80, 80, Color.black, 12);
	}
	
	public void interact(){								//interacts with the boundaries of the game
		if (getX() <= 0) 
			setX(0);
		if (getX() + getWidth() >= AmericansGame.WIDTH)
			setX(1500 - getWidth());
		if (getY() <= 0) 
			setY(0);
		if (getY() + getHeight() >= AmericansGame.HEIGHT)
			setY(1000 - getHeight());
	}
	
	
	
	public boolean getCollision(){
		return false;
	}
}