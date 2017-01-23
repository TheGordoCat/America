//basic structure of the graphics. Creates a block on the plain

import java.awt.Color;
import java.awt.Graphics;

public class Block{
	
	private int width;
	private int height;

	private int xPos;
	private int yPos;

	private Color color;	

	public Block(){
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.white;	
	}

	public Block(int x, int y){
		color = Color.white;
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
  	}

   	public Block(int x, int y, int wid, int ht){
		color = Color.white;
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
   	}

	public Block(int x, int y, int wid, int ht, Color col){
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
	}


   public void draw(Graphics g){
      g.setColor(color);
      g.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics g, Color col){
	  g.setColor(col);
      g.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
   
    public int getX(){										//get and set methods for blocks parameters
    	return xPos;
    }
    
    public int getY(){
    	return yPos;
    }
    
    public int getWidth(){
    	return width;
    }
    
    public int getHeight(){
    	return height;
    }
    
    public Color getColor(){
    	return color;
    }
    
    public void setX(int x){
    	xPos = x;
    }
    
    public void setY(int y){
    	yPos = y;
    }
    
    public void setWidth(int wid){
    	width = wid;
    }
    
    public void setHeight(int ht){
    	height = ht;
    }
    
    public void setColor(Color col){
    	color = col;
    }
    
    public void setPos(int x, int y){
    	xPos = x;
    	yPos = y;
    }

  
   public String toString(){
   		String output = "";
   		output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
   		return output;
   }
}
