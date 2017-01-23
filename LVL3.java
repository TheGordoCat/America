import java.awt.Graphics;
import java.util.ArrayList;


public class LVL3 {
	
	private Terrorist terror;
	private ArrayList<Virus> virus;
	
	public LVL3(){
		
		terror = new Terrorist();
		virus = new ArrayList<Virus>();
		virus.add(new Virus());
		virus.add(new Virus());
		virus.add(new Virus());
		
		for (int i = 0; i < virus.size(); i++){
			virus.get(i).setXSpeed((int)(Math.random()* 12) + 8);
			virus.get(i).setYSpeed((int)(Math.random()* 12) + 8);
		}
		terror.setXSpeed((int)(Math.random()* 12) + 8);
		terror.setYSpeed((int)(Math.random()* 12) + 8);
	}
	
	public void draw(Graphics g, int xMouse, int yMouse){
		
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