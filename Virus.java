//This is the object that the player is trying to avoid.
import java.awt.Color;
import java.awt.Graphics;


public class Virus extends Brick{

	private int xSpeed;
	private int ySpeed;
	
	public Virus() {
		super(50, (int) (Math.random() * 900), 130, 80, Color.green);
		xSpeed = (int)(Math.random()* 8) + 5;
		ySpeed = (int)(Math.random()* 8) + 5;
		
		
	}
	
	public void moveAndDraw(Graphics g){
		draw(g, Color.white);
		setY(getY() - getYSpeed());
		setX(getX() - getXSpeed());
		interact();
		draw(g);
	}
	
	
	public void interact(){							//boundaries for the object
		
		if (getX() <= 0) 
			setXSpeed(-getXSpeed());
		if (getX() + getWidth() >= AmericansGame.WIDTH)
			setXSpeed(-getXSpeed());
		if (getY() <= 0) 
			setYSpeed(-getYSpeed());
		if (getY() + getHeight() >= AmericansGame.HEIGHT)
			setYSpeed(-getYSpeed());
	}
	
	public int randomXNum() {
		int[] randoms = new int[2];
		randoms[0] = 50;
		randoms[1] = 1400;
		
		int r = (int)(Math.random()*2) + 1;
		return randoms[r];
	}
	
	
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
	
	public void setXSpeed(int xs){
		xSpeed = xs;
	}
	
	public void setYSpeed(int ys){
		ySpeed = ys;
	}
}