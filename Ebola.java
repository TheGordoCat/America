import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Image;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class Ebola extends Canvas implements KeyListener, MouseListener, Runnable{
	
	private boolean[] keys;			//instantiates the objects
	private boolean isRunning;
	private int xMouse;
	private int yMouse;
	private BufferedImage back;
	private Player merica;
	private Terrorist terror;
	private LevelHub hub;
	Image mericapic;
	Image terrorist;
	Image ebola;
	Image background;

	public Ebola(){
		//instantiate the images upon the field
		ImageIcon i1 = new ImageIcon("C:/Users/Sean/workspace/Americans/src/eagle.gif");
		mericapic = i1.getImage();
		
		ImageIcon i2 = new ImageIcon("C:/Users/Sean/workspace/Americans/src/terrorism.gif");
		terrorist = i2.getImage();
		
		ImageIcon i3 = new ImageIcon("C:/Users/Sean/workspace/Americans/src/ebola.gif");
		ebola = i3.getImage();
		
		ImageIcon i4 = new ImageIcon("C:/Users/Sean/workspace/Americans/src/mapflag.gif");
		background = i4.getImage();
		
		
		//game properties
		setVisible(true);
		setBackground(Color.white);
		keys = new boolean[4];
		isRunning = true;
		new Thread(this).start();
		addKeyListener(this);
		addMouseListener(this);
		
	
		merica = new Player();
		terror = new Terrorist();
		
		hub = new LevelHub();
		
		
	}	
	
	public void update(Graphics g) {
		paint(g);
	}
	
	//graphics
	public void paint(Graphics w){
		
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)w;

		//take a snap shop of the current screen and save it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
			back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics g = back.createGraphics();				
	
		g.drawImage(background, 0, 0, AmericansGame.WIDTH, AmericansGame.HEIGHT, this);
		
		
		//Game state. If the player has not collided with a virus, the game continues.
		if (hub.collision(merica) == true)
			isRunning = false;
		
		if (isRunning)
			hub.function(g, xMouse, yMouse);
		else
			g.drawString("" + terror.getErradicated() + ". Ebola has got to you!", 750, 500);
		
		
		if (terror.getErradicated() >= 2000){																	//is Game won
			isRunning = false;
			g.drawString("" + terror.getErradicated() + ". \nYou beat ISIS!", 750, 500);
		}
		
		//draw the objects with their respective images
		g.drawImage(mericapic, merica.getX(), merica.getY(), merica.getWidth(), merica.getHeight(), this);
		merica.interact();
		
		for (int i = 0; i < hub.getVirus().size(); i++)
			g.drawImage(ebola, hub.getVirus().get(i).getX(), hub.getVirus().get(i).getY(), this);
		
		g.drawImage(terrorist, hub.getTerrorist().getX(), hub.getTerrorist().getY(), hub.getTerrorist().getWidth(), hub.getTerrorist().getHeight(), this);
		
		
		
		
		
		g.setColor(Color.white);							//score display
		g.fillRect(1400, 15, 50, 15);
		g.setColor(Color.black);
		g.drawString("" + terror.getErradicated(), 1400, 25);

		
		//player movements
		if (keys[0] == true) {
			merica.moveLeft();
		}
		
		if (keys[1] == true) {
			merica.moveRight();
		}
		
		if (keys[2] == true) {
			merica.moveUp();
		}
		
		if (keys[3] == true) {
			merica.moveDown();
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	
	//The keys that are pressed for each action.
	public void keyPressed(KeyEvent e){
		
		switch((e.getKeyChar())){
			case 'a' : keys[0]=true; break;
			case 'd' : keys[1]=true; break;
			case 'w' : keys[2]=true; break;
			case 's' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e){
		
		switch((e.getKeyChar())){
			case 'a' : keys[0]=false; break;
			case 'd' : keys[1]=false; break;
			case 'w' : keys[2]=false; break;
			case 's' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){
		
	}
	
	//run the file with a refresh rate of 30ms.
   public void run(){
   	  try{
   		while(true){
   		   Thread.currentThread();
   		   Thread.sleep(30);
            repaint();
         }
      }
   	  catch(Exception e){
   	
      }
   }

   public void mouseClicked(MouseEvent e) {
	
   }

   public void mouseEntered(MouseEvent e) {
	   
   }

   public void mouseExited(MouseEvent e) {

   }

   //mouse commands upon the field.
   public void mousePressed(MouseEvent e) {
	   xMouse = e.getX();
	   yMouse = e.getY();
	   System.out.println(xMouse + " " + yMouse);
   }

   public void mouseReleased(MouseEvent e) {
	 
   }
}

