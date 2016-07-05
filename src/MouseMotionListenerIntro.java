import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class MouseMotionListenerIntro extends Applet {
	
	private Graphics globalGraphics;
	
	public void paint(Graphics g) {
		this.setSize(new Dimension(500, 500));
		globalGraphics = g;
	}
	
	public void drawCircle(int x, int y, int width, int height) {
		globalGraphics.setColor(getRandomColor());
		Ellipse2D circle = new Ellipse2D.Double((double)x, (double)y, (double)width, (double)height);
		Graphics2D g2 = (Graphics2D) globalGraphics;
		g2.fill(circle);
	}
	
	public Color getRandomColor() {
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		
		return new Color(r,g,b);
	}
	
	

}
