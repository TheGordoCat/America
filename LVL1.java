//First level of the game. Places the required amount of objects in the
//frame for the game. All subsequent levels are the same configuration 
//except with more viruses and faster animations.
import java.awt.Graphics;
import java.util.ArrayList;

public class LVL1 {
	
	
	private Terrorist terror;
	private ArrayList<Virus> virus;
	
	public LVL1() {
		terror = new Terrorist();						//instantiates the objects in the field
		virus = new ArrayList<Virus>();
		virus.add(new Virus());
		
	}
	
	public void draw(Graphics g, int xMouse, int yMouse){	//draws said objects
		
		for (int i = 0; i < virus.size(); i++)
			virus.get(i).moveAndDraw(g);
		terror.moveAndDraw(g, xMouse, yMouse);
	}
	
	public ArrayList<Virus> getVirus() {
		return virus;
	}
	
	public Terrorist getTerrorist(){
		return terror;
	}
}
