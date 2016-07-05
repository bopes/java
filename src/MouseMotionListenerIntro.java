import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;

public class MouseMotionListenerIntro 
extends Applet 
implements MouseMotionListener {
	
	private Graphics globalGraphics;
	
	public void init() {
		this.addMouseMotionListener(this);
	}
	
	public void paint(Graphics g) {
		this.setSize(new Dimension(500,500));
		globalGraphics = g.create();
	}
	
	public void drawCircle(int x, int y, int width, int height){
		globalGraphics.setColor(getColor());
		globalGraphics.fillOval(x, y, width, height);
	}
	
	public Color getColor(){
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		return new Color(r,g,b);
	}
	
	public void trackMouse(MouseEvent e, int size){
		int mouseX = e.getX();
		int mouseY = e.getY();
		drawCircle(mouseX, mouseY, size, size);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		trackMouse(e, 20);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		trackMouse(e, 10);
	}

	
	
}
