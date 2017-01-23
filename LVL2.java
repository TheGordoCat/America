import java.awt.Graphics;
import java.util.ArrayList;


public class LVL2 {
	
	private Terrorist terror;
	private ArrayList<Virus> virus;
	
	public LVL2(){
		
		terror = new Terrorist();
		virus = new ArrayList<Virus>();
		virus.add(new Virus());
		virus.add(new Virus());
		
		for (int i = 0; i < virus.size(); i++){
			virus.get(i).setXSpeed((int)(Math.random()* 10) + 6);
			virus.get(i).setYSpeed((int)(Math.random()* 10) + 6);
		}
		terror.setXSpeed((int)(Math.random()* 10) + 6);
		terror.setYSpeed((int)(Math.random()* 10) + 6);
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