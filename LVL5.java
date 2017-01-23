import java.awt.Graphics;
import java.util.ArrayList;


public class LVL5 {
	
	private Terrorist terror;
	private ArrayList<Virus> virus;
	
	public LVL5(){
		
		terror = new Terrorist();
		virus = new ArrayList<Virus>();
		virus.add(new Virus());
		virus.add(new Virus());
		virus.add(new Virus());
		virus.add(new Virus());
		virus.add(new Virus());
		
		for (int i = 0; i < virus.size(); i++){
			virus.get(i).setXSpeed((int)(Math.random()* 15) + 12);
			virus.get(i).setYSpeed((int)(Math.random()* 15) + 12);
		}
		terror.setXSpeed((int)(Math.random()* 15) + 12);
		terror.setYSpeed((int)(Math.random()* 15) + 12);
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