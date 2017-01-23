//Higher level block, allowing movement upon the plain
import java.awt.Color;
import java.awt.Graphics;

public class Brick extends Block{
  
   private int speed;

   public Brick(){
	  super(10,10,10,10);
      speed = 5;
   }

   public Brick(int x, int y){
		super(x, y);
		speed = 5;
   }

   public Brick(int x, int y, int s){
		super(x, y);
		speed = s;
   }

   public Brick(int x, int y, int wid, int ht, int s){
		super(x, y, wid, ht);
		speed = s;
   }

   public Brick(int x, int y, int wid, int ht, Color col){
		super(x, y, wid, ht, col);
  }
   
   public Brick(int x, int y, int wid, int ht, Color col, int s){
		super(x, y, wid, ht, col);
		speed = s;
   }

   
   public void setSpeed(int s){
		speed = s;
   }

   public void moveUp(){
	      setY(getY()-getSpeed());
	   }

   public void moveDown(){
	      setY(getY()+getSpeed());
	   }

   public void moveLeft(){
	      setX(getX()-getSpeed());
	   }

   public void moveRight(){
	      setX(getX()+getSpeed());
	   }
   
   
   public void moveUpAndDrawColor(Graphics window, Color color){		//draws old color and places new block
		  draw(window, color);
	      setY(getY()-getSpeed());
	      draw(window);
	   }
   
   public void moveDownAndDrawColor(Graphics window, Color color){
		  draw(window, color);
	      setY(getY()+getSpeed());
	      draw(window);
	   }
   
   public void moveLeftAndDrawColor(Graphics window, Color color){
		  draw(window, color);
	      setX(getX()-getSpeed());
	      draw(window);
	   }

public void moveRightAndDrawColor(Graphics window, Color color){
		  draw(window, color);
	      setX(getX()+getSpeed());
	      draw(window);
	   }
   
   public int getSpeed(){
   		return speed;
   }
   
   
   public String toString(){
   		String output = "";
   		return output += super.toString() + " " + speed;
   }
}
