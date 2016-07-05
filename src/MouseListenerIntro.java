import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

public class MouseListenerIntro 
extends Applet
implements MouseListener {
	
	private Graphics globalGraphics = null;
	
	public void init() {
		this.addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		
		this.setSize(new Dimension(400,400));
		
		globalGraphics = g.create();
	}
	
	public void drawDot(int x, int y, int width, int height) {
		
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		
		Color randomColor = new Color(r,g,b);
		globalGraphics.setColor(randomColor);
		globalGraphics.fillRect(x, y, width, height);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		boolean isControl = e.isControlDown();
		int mouseX = e.getX();
		int mouseY = e.getY();
		
		if (isControl) {
			drawDot(mouseX, mouseY, 20, 20);
		} else if (e.getButton() == 3) {
			drawDot(mouseX, mouseY, 40, 40);
		} else {
			drawDot(mouseX, mouseY, 10, 10);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("Mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("Mouse released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse enters");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse leaves");
	}

}
