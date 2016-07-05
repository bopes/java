import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;

public class MouseMotionListenerIntro 
extends Applet 
implements MouseMotionListener, MouseListener {
	
	private Graphics globalGraphics;
	private int mouseButton;
	
	public void init() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	public void paint(Graphics g) {
		this.setSize(new Dimension(500,500));
		globalGraphics = g.create();
	}
	
	public void drawCircle(int x, int y, int width, int height) {
		globalGraphics.setColor(getColor());
		globalGraphics.fillOval(x, y, width, height);
	}
	
	public void drawSquare(int x, int y, int width, int height) {
		globalGraphics.setColor(getColor());
		globalGraphics.fillRect(x, y, width, height);
	}
	
	public Color getColor(){
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		return new Color(r,g,b);
	}
	
	public void mouseAction(MouseEvent e, int size){
		int mouseX = e.getX();
		int mouseY = e.getY();
		if (mouseButton == MouseEvent.BUTTON3)
			drawSquare(mouseX, mouseY, size, size);
		else
			drawCircle(mouseX, mouseY, size, size);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		mouseAction(e, 10);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		mouseButton = e.getButton();
		mouseAction(e, 20);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
