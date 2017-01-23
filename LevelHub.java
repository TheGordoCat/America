//The Level Hub is where the game decides how to operate based upon the interactions of the player.
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class LevelHub {

	private Terrorist terror1;
	private Terrorist terror2;
	private Terrorist terror3;
	private Terrorist terror4;
	private Terrorist terror5;
	private ArrayList<Virus> virus1;
	private ArrayList<Virus> virus2;
	private ArrayList<Virus> virus3;
	private ArrayList<Virus> virus4;
	private ArrayList<Virus> virus5;
	private LVL1 lvl1;
	private LVL2 lvl2;
	private LVL3 lvl3;
	private LVL4 lvl4;
	private LVL5 lvl5;
	
	public LevelHub() {
		terror1 = new Terrorist();
		terror2 = new Terrorist();
		terror3 = new Terrorist();
		terror4 = new Terrorist();
		terror5 = new Terrorist();
		virus1 = new ArrayList<Virus>();
		virus2 = new ArrayList<Virus>();
		virus3 = new ArrayList<Virus>();
		virus4 = new ArrayList<Virus>();
		virus5 = new ArrayList<Virus>();
		lvl1 = new LVL1();
		lvl2 = new LVL2();
		lvl3 = new LVL3();
		lvl4 = new LVL4();
		lvl5 = new LVL5();
	}
	
	public void function(Graphics g, int xMouse, int yMouse) {		//creates new level at certain points
		if (terror1.getErradicated() < 300){
			g.setColor(Color.white);
			g.fillRect(0, 0, 1500, 1000);
			lvl1.draw(g, xMouse, yMouse);
			virus1 = lvl1.getVirus();
			terror1 = lvl1.getTerrorist();
		}
		else if (terror2.getErradicated() >= 300 && terror2.getErradicated() < 600){
			g.setColor(Color.white);
			g.fillRect(0, 0, 1500, 1000);
			lvl2.draw(g, xMouse, yMouse);
			virus2 = lvl2.getVirus();
			terror2 = lvl2.getTerrorist();
		}
	    else if (terror3.getErradicated() >= 600 && terror3.getErradicated() < 1000) {
	    	g.setColor(Color.white);
			g.fillRect(0, 0, 1500, 1000);
			lvl3.draw(g, xMouse, yMouse);
			virus3 = lvl3.getVirus();
			terror3 = lvl3.getTerrorist();
	    }
	    else if (terror4.getErradicated() >= 1000 && terror4.getErradicated() < 1500) {
	    	g.setColor(Color.white);
			g.fillRect(0, 0, 1500, 1000);
	    	lvl4.draw(g, xMouse, yMouse);
	    	virus4 = lvl4.getVirus();
	    	terror4 = lvl4.getTerrorist();
	    }
	    else if (terror5.getErradicated() >= 1500) {
	    	g.setColor(Color.white);
			g.fillRect(0, 0, 1500, 1000);
	    	lvl5.draw(g, xMouse, yMouse);
	    	virus5 = lvl5.getVirus();
	    	terror5 = lvl5.getTerrorist();
	    }
	}
	
	
	
	public boolean collision(Player player){			//player collisions with the viruses. 
		for (int i = 0; i < getVirus().size(); i++){
			if (player.getX() + player.getWidth() >= getVirus().get(i).getX()){
				if (player.getX() <= getVirus().get(i).getX())
					if (player.getY() >= getVirus().get(i).getY())
						if (player.getY() < getVirus().get(i).getY() + getVirus().get(i).getHeight())
							return true;
			}
			if (player.getX() <= getVirus().get(i).getX() + getVirus().get(i).getWidth()){
				if (player.getX() >= getVirus().get(i).getX())
					if (player.getY() >= getVirus().get(i).getY())
						if (player.getY() < getVirus().get(i).getY() + getVirus().get(i).getHeight())
							return true;
			}
			if (player.getY() <= getVirus().get(i).getY())
				if (player.getY() + player.getHeight() >= getVirus().get(i).getY())
					if (player.getX() >= getVirus().get(i).getX())
						if (player.getX() <= getVirus().get(i).getX() + getVirus().get(i).getWidth())
							return true;
		}
		return false;
	}
	
	
	public ArrayList<Virus> getVirus() {
		if (terror1.getErradicated() < 300){
			
			return virus1;
		}
		else if (terror2.getErradicated() >= 300 && terror2.getErradicated() < 600){
			
			return virus2;
		}
	    else if (terror3.getErradicated() >= 600 && terror3.getErradicated() < 1000) {
	    	
	    	return virus3;
	    }
	    else if (terror4.getErradicated() >= 1000 && terror4.getErradicated() < 1500) {
	    	
	    	return virus4;
	    }
	    else if (terror5.getErradicated() >= 1500) {
	    	
	    	return virus5;
	    }
		return virus1;
	}
	
	public Terrorist getTerrorist() {
		if (terror1.getErradicated() < 300){
			
			return terror1;
		}
		else if (terror2.getErradicated() >= 300 && terror2.getErradicated() < 600){
			
			return terror2;
		}
	    else if (terror3.getErradicated() >= 600 && terror3.getErradicated() < 1000) {
	    	
	    	return terror3;
	    }
	    else if (terror4.getErradicated() >= 1000 && terror4.getErradicated() < 1500) {
	    	
	    	return terror4;
	    }
	    else if (terror5.getErradicated() >= 1500) {
	    	
	    	return terror5;
	    }
		return terror1;
	}
	
	
	
}

