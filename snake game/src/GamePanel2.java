import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel2 extends JPanel implements ActionListener {

	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 25;
	static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
	static final int DELAY = 150;
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];
	int bodyParts = 6;
	int applesEaten;
	int appleX;
	int appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
    
	
	GamePanel2(){
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setFocusable(true);
		//this.addKeyListener(new MyKeyAdapter());
		startGame();
	}
	public void startGame() {
		newApple();
		running = true;
		timer = new Timer (DELAY,this);
		timer.restart();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	public void draw(Graphics g) {
	    if(running) {
		     g.setColor(Color.red);
		     g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
		
		     for(int i = 0; i< bodyParts;i++) {
			     if(i == 0) {
				      g.setColor(Color.GRAY);
			     g.fillOval(x[0],  y[0],  UNIT_SIZE, UNIT_SIZE);
			     }
			    else {
				      g.setColor((Color.BLACK));
				     g.fillRect(x[i],  y[i],  UNIT_SIZE, UNIT_SIZE);
			    }
		     }
	    }
	}
		     public void newApple() {
		 		appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		 		appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
		 	}
		 //	public void move() {
		 	//	for(int i = bodyParts;i>0;i--) {
		 		//	x[i] = x[i-1];
		 		//	y[i] = y[i-1];
		 		//}		
		 	//S	y[0] = y[0] + UNIT_SIZE;
		 	//}
		 	
		 	public void actionPerformed(ActionEvent e) {
				
				if(running) {
					//move();
					x[0] = x[0] + UNIT_SIZE;
					if((x[0] == appleX) && (y[0] == appleY)) {
						bodyParts++;
						newApple();
					}
				
				}
				repaint();
			}
			
			/* public class MyKeyAdapter extends KeyAdapter{
				
				@Override
				public void keyPressed(KeyEvent e) {
					switch(e.getKeyCode()) {
					case KeyEvent.VK_LEFT:
						if(direction != 'R') {
							direction = 'L';
						}
						break;
					case KeyEvent.VK_RIGHT:
						if(direction != 'L') {
							direction = 'R';
						}
						break;
					case KeyEvent.VK_UP:
						if(direction != 'D') {
							direction = 'U';
						}
						break;
					case KeyEvent.VK_DOWN:
						if(direction != 'U') {
							direction = 'D';
						}
						break;	
					}
				}*/
			

		}
 	
		
