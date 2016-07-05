import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class KeyListenerIntro extends Applet implements KeyListener {

	private Rectangle rect;
	
	private ArrayList<Integer> keysPressed;
	
	public void init() {
		this.addKeyListener(this);
		rect = new Rectangle(0, 0, 50, 50);
		keysPressed = new ArrayList<Integer>();
	}
	
	public void paint(Graphics g) {
		this.setSize(new Dimension(500,500));
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(rect);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (!keysPressed.contains(e)) 
			keysPressed.add(new Integer(e.getKeyCode()));
		moveRect();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keysPressed.remove(new Integer(e.getKeyCode()));
	}
	
	public void moveRect() {
		int x = rect.x;
		int y = rect.y;
		
		if (keysPressed.contains(KeyEvent.VK_RIGHT)) {
			x += 2;
		}
		if (keysPressed.contains(KeyEvent.VK_LEFT)) {
			x -= 2;
		}
		if (keysPressed.contains(KeyEvent.VK_UP)) {
			y -= 2;
		}
		if (keysPressed.contains(KeyEvent.VK_DOWN)) {
			y += 2;
		}
		
		rect.setLocation(x, y);
		repaint();
	}
	
	
	
}
